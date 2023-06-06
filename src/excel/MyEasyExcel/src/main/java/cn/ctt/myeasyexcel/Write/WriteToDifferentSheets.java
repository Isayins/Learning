package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.User;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;

/**
 * 写到Excel的不同Sheet中
 */
public class WriteToDifferentSheets {

    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user7.xlsx";
        // 创建ExcelWriter对象
        ExcelWriter excelWriter = EasyExcel.write(pathName + fileName, User.class).build();
        // 向不同Sheet写入数据
        for (int i = 0; i < 2; i++) {
            WriteSheet writeSheet = EasyExcel.writerSheet("用户信息" + i).build();
            excelWriter.write(new GenerateData().getUserData(),writeSheet);
        }
        excelWriter.finish();

    }

}
