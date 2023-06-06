package cn.ctt.myeasyexcel.Read;

import cn.ctt.myeasyexcel.entity.DemoData;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.metadata.ReadSheet;

public class TestReadExcel2 {
    public static void main(String[] args) {
        // 读取的Excel文件路径
        String fileName = "D:\\study\\user12.xlsx";
        // 创建一个数据格式来装读取到的数据
        Class<DemoData> head = DemoData.class;
        // 创建ExcelReader对象
        ExcelReader excelReader = EasyExcel.read(fileName, head, new AnalysisEventListener() {
            // 每解析一行数据,该方法会被调用一次
            @Override
            public void invoke(Object demoData, AnalysisContext analysisContext) {
                System.out.println("解析数据为:" + demoData.toString());
            }

            // 全部解析完成被调用
            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析完成...");
                // 可以将解析的数据保存到数据库
            }
        }).build();
        // 创建Sheet对象,并读取Excel的第一个Sheet(下标从0开始),也可以根据Sheet名称获取
        ReadSheet sheet = EasyExcel.readSheet(0).build();
        // 读取Sheet表格数据,参数是可变参数,可以读取多个Sheet
        excelReader.read(sheet);
        // 需要自己关闭流操作,在读取文件是会创建临时文件,如果不关闭,会损坏磁盘,严重的磁盘爆掉
        excelReader.finish();
    }
}
