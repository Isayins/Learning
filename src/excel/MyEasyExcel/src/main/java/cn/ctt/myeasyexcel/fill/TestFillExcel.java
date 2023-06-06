package cn.ctt.myeasyexcel.fill;


import cn.ctt.myeasyexcel.entity.FillData;
import com.alibaba.excel.EasyExcel;

/**
 * 向Excel模板里填充数据
 */
public class TestFillExcel {


    public static void main(String[] args) {
        // 根据哪个模板进行填充
        String template = "D:\\study\\source\\filltemplate.xlsx";
        // 填充完成之后的excel
        String fillName = "D:\\study\\target\\fill.xlsx";
        // 构建数据
        FillData fillData =FillData.builder()
                .name("华为")
                .number(888.57)
                .build();
        EasyExcel.write(fillName).withTemplate(template).sheet(0).doFill(fillData);
    }
}
