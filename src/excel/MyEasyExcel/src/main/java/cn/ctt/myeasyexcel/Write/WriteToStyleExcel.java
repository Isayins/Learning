package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.DemoStyleData;
import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Excel样式设置
 */
public class WriteToStyleExcel {
    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user11.xlsx";

        //构建数据
        List<DemoStyleData> dataList = new ArrayList<>();
        DemoStyleData data = DemoStyleData.builder()
                .string("字符串")
                .date(new Date())
                .doubleData(888.88)
                .build();
        dataList.add(data);
        EasyExcel.write(pathName+fileName,DemoStyleData.class)
                .sheet("宽和高")
                .doWrite(dataList);
    }
}
