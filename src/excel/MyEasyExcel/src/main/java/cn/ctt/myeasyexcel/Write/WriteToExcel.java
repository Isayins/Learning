package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.Title;
import com.alibaba.excel.EasyExcel;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 简单的写方式1(会自动关闭流)
 */
public class WriteToExcel {
    public static void main(String[] args) {
        System.out.println("开始创建Excel文件.....");
        String fileName = "title1.xlsx";
        String pathName = "D:\\";
        File file = new File(pathName + fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("创建Excel文件成功");
        System.out.println("开始写入Excel.......");

        List<Title> titleData = new GenerateData().getTitleData();
        for (int i = 0; i < titleData.size(); i++) {
            System.out.println(titleData.get(i));

        }
        EasyExcel.write(pathName + fileName, Title.class)
                .sheet("标题")
                .doWrite(titleData);
        System.out.println("Excel文件写入完成");
    }
}
