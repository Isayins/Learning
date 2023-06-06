package cn.ctt.myeasyexcel.Read;

import cn.ctt.myeasyexcel.entity.DemoData;
import cn.ctt.myeasyexcel.entity.User;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

/**
 * 读取Excel文件的所有表格(方式一)
 */
public class TestReadExcel3 {
    public static void main(String[] args) {
        // 读取的Excel文件路径
        String fileName = "D:\\study\\user7.xlsx";
        // 读取Excel
        EasyExcel.read(fileName, User.class, new AnalysisEventListener<User>() {
            @Override
            public void invoke(User demoData, AnalysisContext analysisContext) {
                System.out.println("解析数据为:" + demoData.toString());
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析完成...");
            }
        }).doReadAll();  // 读取全部Sheet

    }

}
