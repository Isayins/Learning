package cn.ctt.myeasyexcel.Write;


import cn.ctt.myeasyexcel.entity.WidthAndHeightData;
import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 往不同行高列宽的Excel写入数据
 */
public class WriteToHeadAndWidthExcel {
    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user10.xlsx";

        //构建数据
        List<WidthAndHeightData> dataList = new ArrayList<>();
        WidthAndHeightData data = WidthAndHeightData.builder()
                .string("字符串")
                .date(new Date())
                .doubleData(888.88)
                .build();
        dataList.add(data);
        EasyExcel.write(pathName+fileName,WidthAndHeightData.class)
                .sheet("宽和高")
                .doWrite(dataList);
    }

}
