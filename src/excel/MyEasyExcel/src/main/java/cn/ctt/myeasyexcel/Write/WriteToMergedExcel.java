package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.DemoMergeData;
import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteToMergedExcel {
    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user12.xlsx";
        List<DemoMergeData> dataList = new ArrayList<>();
        DemoMergeData data = DemoMergeData.builder()
                .string("字符串标题")
                .date(new Date())
                .doubleData(888.88)
                .build();
        dataList.add(data);

        EasyExcel.write(pathName+fileName,DemoMergeData.class)
                .sheet("合并表")
                .doWrite(dataList);
    }
}
