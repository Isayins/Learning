package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.ImageData;
import com.alibaba.excel.EasyExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;


/**
 * 往Excel表中写入图片
 */
public class WriteImageToExcel {
    public static void main(String[] args) throws IOException {
        // 存放位置
        String pathName = "D:\\study\\";
        // Excel位置
        String fileName = "user9.xlsx";
        // 图片位置
        String imageName = "1.png";
        // 网络图片
        URL url = new URL("https://img-blog.csdnimg.cn/img_convert/411f8bab4962ba672af323b33f4d40cd.png");
        // 将图片读取到二进制数据中
        byte[] bytes = new byte[(int) new File(pathName+imageName).length()];
        InputStream inputStream = new FileInputStream(pathName+imageName);
        inputStream.read(bytes,0, bytes.length);
        ArrayList<ImageData> imageDataList = new ArrayList<>();

        // 创建数据末班
        ImageData imageData = ImageData.builder()
                .file(new File(pathName+imageName))
                .inputStream(new FileInputStream(pathName+imageName))
                .str(pathName+imageName)
                .byteArr(bytes)
                .url(url)
                .build();

        // 添加要写入的图片模型
        imageDataList.add(imageData);

        // 写数据
        EasyExcel.write(pathName+fileName,ImageData.class)
                .sheet("图片")
                .doWrite(imageDataList);

    }
}
