package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.UserModel;
import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteToExcelByConverter {
    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user13.xlsx";
        List<UserModel> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserModel user = UserModel.builder()
                    .userId(i)
                    .userName("admin" + i)
                    .gender(i % 2 == 0 ? 0 : 1) // 性别枚举
                    .salary(i * 1000 + 8.888)
                    .hireDate(new Date())
                    .build();
            users.add(user);
        }
        EasyExcel.write(pathName+fileName,UserModel.class)
                .sheet("转换器表")
                .doWrite(users);

    }
}
