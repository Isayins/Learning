package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.User;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;

import java.io.File;
import java.util.List;

/**
 * 简单的写方式2(要手动关闭流)
 */
public class WriteToExcel2 {
    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "title2.xlsx";
        List<User> userData = new GenerateData().getUserData();
        File file = new File(pathName+fileName);
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < userData.size(); i++) {
            System.out.println(userData.get(i));

        }
        // 创建ExcelWrite对象
        ExcelWriter excelWriter = EasyExcel.write(pathName + fileName, User.class).build();
        // 创建Sheet对象
        WriteSheet writeSheet = EasyExcel.writerSheet("人员").build();
        // 向Excel中写入数据
        excelWriter.write(userData,writeSheet);
        // 关闭流
        excelWriter.finish();

    }

}
