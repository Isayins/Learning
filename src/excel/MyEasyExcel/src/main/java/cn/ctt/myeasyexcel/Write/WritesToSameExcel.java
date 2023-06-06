package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.User;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;

/**
 * 重复写到Excel的同一个Sheet中
 */
public class WritesToSameExcel {
    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user6.xlsx";
        // 创建ExcelWriter对象
        ExcelWriter excelWriter = EasyExcel.write(pathName+fileName, User.class).build();
        // 创建Sheet对象
        WriteSheet writeSheet = EasyExcel.writerSheet("用户信息").build();
        // 向Excel的同一个Sheet重复写入数据
        for (int i = 0; i < 2; i++) {
            excelWriter.write(new GenerateData().getUserData(),writeSheet);
        }
        // 关闭流
        excelWriter.finish();
    }
}
