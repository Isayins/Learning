package cn.ctt.myeasyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@HeadRowHeight(value = 30) // 头部行高
@ContentRowHeight(value = 25)  // 内容行高
@ColumnWidth(value = 20) // 列宽
// 头背景设置成红色 IndexedColors.RED.getIndex()
@HeadStyle(fillPatternType = FillPatternType.SOLID_FOREGROUND,fillForegroundColor = 10)
@HeadFontStyle(fontName = "宋体",fontHeightInPoints = 20)
// 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
@ContentStyle(fillPatternType = FillPatternType.SOLID_FOREGROUND,fillForegroundColor = 17)
// 内容字体设置成20,字体默认宋体
@ContentFontStyle(fontName = "宋体",fontHeightInPoints = 20)
public class DemoStyleData {
    // 字符串的头背景设置成粉红色 IndexedColors.PINK.getIndex()
    @HeadStyle(fillPatternType = FillPatternType.SOLID_FOREGROUND,fillForegroundColor = 14)
    // 字符串的头字体设置成20
    @HeadFontStyle(fontHeightInPoints = 30)
    // 字符串的内容背景设置成天蓝IndexedColors.SKY_BLUE.getIndex()
    @ContentStyle(fillPatternType = FillPatternType.SOLID_FOREGROUND,fillForegroundColor = 40)
    // 字符串的内容字体设置成20,默认宋体
    @ContentFontStyle(fontName = "宋体",fontHeightInPoints = 20)
    @ExcelProperty(value = "字符串标题")
    private String string;
    @ExcelProperty(value = "日期标题")
    private Date date;
    @ExcelProperty(value = "数字标题")
    @ColumnWidth(value = 25)
    private Double doubleData;
}
