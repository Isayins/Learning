package cn.ctt.myeasyexcel.Read;

import cn.ctt.myeasyexcel.entity.DemoData;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

public class TestReadExcel1 {
    public static void main(String[] args) {
        // 读取的Excel文件路径
        String fileName = "D:\\study\\user12.xlsx";
        // 读取Excel
        EasyExcel.read(fileName, DemoData.class, new AnalysisEventListener() {
            // 每解析一行数据,该方法会被调用一次
            @Override
            public void invoke(Object demoData, AnalysisContext analysisContext) {
                System.out.println("解析数据为: "+ demoData.toString());
            }

            // 全部解析完成被调用
            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析完成...");
                // 可以将解析的数据保存到数据库
            }
        }).sheet().doRead();
    }

}
