package cn.ctt.myeasyexcel.Read;


import cn.ctt.myeasyexcel.entity.DemoData;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.metadata.ReadSheet;

/**
 * 读取Excel文件的所有表格(方式二)
 */
public class TestReadExcel4 {
    public static void main(String[] args) {

        // 读取的Excel文件路径
        String fileName = "D:\\study\\user11.xlsx";
        // 读取Excel
        ExcelReader excelReader = EasyExcel.read(fileName, DemoData.class, new AnalysisEventListener<DemoData>() {
            @Override
            public void invoke(DemoData demoData, AnalysisContext analysisContext) {
                System.out.println(demoData.toString());
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析完成...");
            }
        }).build();
        // 创建Sheet对象,并读取Excel的第一个Sheet(下标从0开始),也可以根据Sheet名称获取
        ReadSheet sheet = EasyExcel.readSheet(0).build();
        // 读取Sheet表格数据,参数是可变参数轲读取多个Sheet
        excelReader.readAll(); // 读取多个Sheet
        // 需要自己关闭流操作,在读取文件时会创建临时文件,如果不关闭,会损耗磁盘,严重的磁盘爆掉
        excelReader.finish();

    }
}
