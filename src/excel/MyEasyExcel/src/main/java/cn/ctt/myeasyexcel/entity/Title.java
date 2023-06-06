package cn.ctt.myeasyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 *  命名必须规范
 *  如果不规范会出现数据内容无法写入
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Title {

    @ExcelProperty(value = "字符串标题")
    private String stringTitle;
    @ExcelProperty(value = "日期标题")
    private Date dateTitle;
    @ExcelProperty(value = "数字标题")
    private String numTitle;
    @ExcelProperty(value = "英文标题")
    private String EnglishTitle;

}
