package cn.ctt.myeasyexcel.Write;

import cn.ctt.myeasyexcel.entity.FormatUser;
import cn.ctt.myeasyexcel.entity.Title;
import cn.ctt.myeasyexcel.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 生成数据工具类
 */
public class GenerateData {
    public List<Title> getTitleData() {
        List<Title> titles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Title title = Title.builder()
                    .stringTitle("字符"+i)
                    .dateTitle(new Date())
                    .numTitle("1" + i)
                    .EnglishTitle("Something"+i)
                    .build();
            titles.add(title);
        }
        return titles;
    }

    public List<User> getUserData() {
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            User user = User.builder()
                    .userId(i)
                    .userName("admin" + i)
                    .gender(i % 2 == 0 ? "男" : "女")
                    .salary(i * 1000.00)
                    .hireDate(new Date())
                    .build();
            users.add(user);
        }
        return users;
    }

    public List<FormatUser> getFormatUserData() {
        List<FormatUser> formatUsers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            FormatUser formatUser = FormatUser.builder()
                    .userId(i)
                    .userName("admin" + i)
                    .gender(i % 2 == 0 ? "男" : "女")
                    .salary(i * 1000.12)
                    .hireDate(new Date())
                    .build();
            formatUsers.add(formatUser);
        }
        return formatUsers;
    }
}
