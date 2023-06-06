package cn.ctt.myeasyexcel.entity;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.util.Objects;

public class GenderConverter implements Converter<Integer> {

    private static final String MALE = "男";
    private static final String FEMALE = "女";
    private static final String NONE = "未知";

    // Java数据类型 integer
    @Override
    public Class supportJavaTypeKey() {
        return null;
    }

    // Excel文件中单元格的数据类型 string
    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return null;
    }

    // 读取Excel文件是将String转换为Integer
    @Override
    public Integer convertToJavaData(CellData cellData, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        String value = cellData.getStringValue();
        if (Objects.equals(FEMALE,value)) {
            return 0; // 0 : 女
        }else if (Objects.equals(MALE,value)){
            return 1; // 1 : 男
        }
        return 2; // 2 : 未知
    }

    // 写入Excel文件时将Integer转换为String
    @Override
    public CellData convertToExcelData(Integer integer, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        if (integer == 1){
            return new CellData(MALE);
        }else if (integer == 0){
            return new CellData(FEMALE);
        }
        return new CellData(NONE); // 不男不女
    }
}
