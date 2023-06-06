package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.FormatUser;
import com.alibaba.excel.EasyExcel;

public class WriteToFormatSheet {
    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user8.xlsx";
        EasyExcel.write(pathName+fileName, FormatUser.class)
                .sheet("用户信息")
                .doWrite(new GenerateData().getFormatUserData());
    }
}
