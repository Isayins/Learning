package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.User;
import com.alibaba.excel.EasyExcel;

import java.util.HashSet;
import java.util.Set;

/**
 *  向表格中导出指定属性
 */
public class ExportSpecifiedAttributesToTable {
    public static void main(String[] args) {
        String pathName = "D:\\";
        String fileName = "user4.xlsx";
        // 设置要导出的字段
        Set<String> includeFields = new HashSet<>();
        includeFields.add("userName");
        includeFields.add("hireDate");
        // 写Excel
        EasyExcel.write(pathName+fileName, User.class)
                .includeColumnFiledNames(includeFields)
                .sheet("用户信息")
                .doWrite(new GenerateData().getUserData());
    }
}
