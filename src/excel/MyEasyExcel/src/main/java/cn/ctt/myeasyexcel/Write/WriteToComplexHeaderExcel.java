package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.ComplexHeaderUser;
import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 复杂头数据写入
 */
public class WriteToComplexHeaderExcel {


    public static void main(String[] args) {
        String pathName = "D:\\study\\";
        String fileName = "user5.xlsx";
        List<ComplexHeaderUser> users = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ComplexHeaderUser user = ComplexHeaderUser.builder()
                    .userId(i)
                    .userName("大哥" + i)
                    .hireDate(new Date())
                    .build();
            users.add(user);
        }
        EasyExcel.write(pathName+fileName,ComplexHeaderUser.class)
                .sheet("用戶信息")
                .doWrite(users);
    }
}
