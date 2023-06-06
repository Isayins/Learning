package cn.ctt.myeasyexcel.fill;


import cn.ctt.myeasyexcel.entity.GenerateClass;

/**
 * 向Excel中填充多组数据
 */
public class TestFillExcel2 {

    public static void main(String[] args) {
        // 根据哪个模板进行填充
        String template = "D:\\study\\source\\filltemplate.xlsx";
        // 填充完成之后的excel
        String fillName = "D:\\study\\target\\fill.xlsx";
        GenerateClass generateClass = new GenerateClass();
        generateClass.getDataList();


    }
}
