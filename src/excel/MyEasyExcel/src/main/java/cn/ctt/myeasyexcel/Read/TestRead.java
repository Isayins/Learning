package cn.ctt.myeasyexcel.Read;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;

public class TestRead {
    public static void main(String[] args) {
        String fileName = "D:\\study\\user11.xlsx";
        // 创建ExcelReaderBuilder对象
        ExcelReaderBuilder readerBuilder = EasyExcel.read();
        // 获取文件对象
        readerBuilder.file(fileName);
        // 指定sheet
        readerBuilder.sheet(0);
        // 自动关闭输入流
        readerBuilder.autoCloseStream(true);
        // 设置Excel文件格式
        readerBuilder.excelType(ExcelTypeEnum.XLSX);
        // 注册监听器进行数据的解析
        readerBuilder.registerReadListener(new AnalysisEventListener() {
            // 每解析一行数据,该方法会被调用一次
            @Override
            public void invoke(Object demoData, AnalysisContext analysisContext) {
                // 如果没有指定的数据模板,解析的数据会封装成LinkedHashMap返回
                // demoData instanceof LinkedHashMap 返回 true
                System.out.println("解析数据为:" + demoData.toString());

            }

            // 全部解析完成被调用
            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析完成...");
                // 可以将解析的数据保存到数据库

            }
        });
        readerBuilder.doReadAll();
    }

}
