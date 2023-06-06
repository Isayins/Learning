package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.User;
import com.alibaba.excel.EasyExcel;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * 排除模型中的指定字段
 */
public class WriteToExcelExcludeField {
    public static void main(String[] args) {
        String pathName = "D:\\";
        String fileName = "title3.xlsx";
        File file =new File(pathName+fileName);
        // 设置排除的属性,也可以在数据模型的字段上加上@ExcelIgnore注解排除
        Set<String> excludeField = new HashSet<>();
        excludeField.add("hireDate");
        excludeField.add("salary");
        // 写Excel
        EasyExcel.write(pathName+fileName, User.class)
                .excludeColumnFiledNames(excludeField)
                .sheet("用户信息")
                .doWrite(new GenerateData().getUserData());

        EasyExcel.write(pathName+fileName, User.class)
                .sheet("用户信息2")
                .doWrite(new GenerateData().getUserData());
    }
}
