---
typora-root-url: img
---

# 第一章 Java快速入门

## 1.1、安装开发环境

第一步：打开[下载地址](https://www.oracle.com/cn/java/technologies/javase/javase-jdk8-downloads.html)，下载对应平台的 JDK 安装包

第二步：打开下载软件，全部默认下一步傻瓜式安装

## 1.2、配置[环境变量](https://so.csdn.net/so/search?q=环境变量&spm=1001.2101.3001.7020)

第一步：配置**JAVA_HOME**

![](/JAVA_HOME.png)

第二步：配置**CLASSPATH**

![](/CLASSPATH.png)

````cmd
.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar; 
````

第三步：配置**Path**

![](/Path.png)

````cmd
%JAVA_HOME%\jre\bin
````

## 1.3、开发工具安装

第一步：打开[下载地址](https://www.eclipse.org/downloads/packages/release/oxygen/3a)，下载对应平台的[Eclipse](https://so.csdn.net/so/search?q=Eclipse&spm=1001.2101.3001.7020)安装包

第二步：右键直接解压软件，然后打开eclipse.exe即可

![](/Eclipse.png)

## 1.4、开发工具配置

第一步：设置默认工作空间

![](/设置默认工作空间.png)

第二步：设置开发工具编码

![](/设置开发工具编码1.png)

![](/设置开发工具编码2.png)

第三步：修改文本字体大小

![](/修改文本字体大小.png)

# 第二章 Java基础知识

## 2.1、注释

````java
单行注释 // 注释内容
多行注释 /* 注释内容 */
文档注释 /**注释内容 */
````

## 2.2、关键字

定义：在Java语言中被赋予特殊含义的小写单词

![](/关键字.png)

## 2.3、[标识符](https://so.csdn.net/so/search?q=标识符&spm=1001.2101.3001.7020)

定义：标识符就是给常量、变量、类、方法起名字

注意：

1. 标识符由字母、数字、下划线"_"、美元符号"$"组成
2. 标识符不能以数字开头
3. 标识符不能是关键字
4. 标识符严格区分大小写

格式：

````java
常量的命名法：常量
规则：每个单词都大写，单词与单词之间用下划线分隔
举例：STUDENT_NUMBER
````

````java
大驼峰命名法：类名
规则：每个单词的首字母都大写
举例：StudentInfo
````

## 2.4、常量

定义：在程序运行期间，其值不会发生改变的量，被称为常量

分类：

![](/常量.png)

## 2.5、数据类型

分类：

![数据类型1](/数据类型1.png)

范围：

![](/数据类型2.png)

注意：

````java
int a = 0b11111111;// 二进制
int b = 0377;// 八进制
int c = 255;// 十进制
int d = 0xff;// 十六进制
````

## 2.6、变量

定义：在程序运行期间，其值可以发生改变的量，被称为变量

格式：

````java
变量类型 变量名 = 初始化值;

变量类型 变量名;
变量名 = 初始化值;
````

注意：

1. 同一对大括号内，变量名称不能重复

2. 在变量使用之前，必须要进行初始化
3. long数据后边需要加L、float数据后边需要加F
4. 整数默认是int类型、浮点默认是double类型

## 2.7、类型转换

自动类型转换：把小范围数据类型赋值给大范围数据类型，由于精度并不会丢失，因此这种转换是自动的

如图：

![](/类型转换.png)

强制类型转换：把大范围数据类型赋值给小范围数据类型，由于精度可能会丢失，因此需要进行强制转换

格式：目标数据类型 变量名 = (目标数据类型)(表达式或变量);

## 2.8、运算符和表达式

运算符：对常量或者变量进行操作的符号

表达式：用运算符把常量或者变量连接起来符合Java语法的式子被称为表达式

### 2.8.1、算术运算符

| 符号 | 作用 | 举例 | 说明   |
| ---- | ---- | ---- | ------ |
| +    | 加   | 7+3  | 7+3=10 |
| -    | 减   | 7-3  | 7-3=4  |
| *    | 乘   | 7*3  | 7-3=21 |
| /    | 除   | 7/3  | 7/3=2  |
| %    | 取余 | 7%3  | 7%3=1  |

### 2.8.2、自增和自减

| 符号 | 作用 | 举例             | 说明 |
| ---- | ---- | ---------------- | ---- |
| `++` | 自增 | int i = 10; i++; | i=11 |
| `--` | 自减 | int i = 10; i–;  | i=9  |

注意：

1. 参与操作的时候，如果放在变量的前边，先加在运算
2. 参与操作的时候，如果放在变量的后边，先运算在加

### 2.8.3、赋值运算符

| 符号 | 作用       | 举例 | 说明             |
| ---- | ---------- | ---- | ---------------- |
| =    | 赋值       | a=10 | 将10赋值给变量a  |
| +=   | 加后赋值   | a+=b | 将a+b的值给变量a |
| -=   | 减后赋值   | a-=b | 将a-b的值给变量a |
| *=   | 乘后赋值   | a*=b | 将a*b的值给变量a |
| /=   | 除后赋值   | a/=b | 将a/b的值给变量a |
| %=   | 取余后赋值 | a%=b | 将a%b的值给变量a |

注意：

````java
short s = 10;
s = s + 10;  //此行代码报错，因为运算中s提升为int类型，运算结果int赋值给short可能损失精度

short s = 10;
s += 10;     //此行代码正确，隐含了强制类型转换，相当于 s = (short)(s + 10);
````

### 2.8.4、关系运算符

| 符号 | 作用             | 举例 | 说明                                            |
| ---- | ---------------- | ---- | ----------------------------------------------- |
| ==   | 判断是否相等     | a==b | 判断a和b的值是否相等，成立为true，不成立为false |
| !=   | 判断是否不等     | a!=b | 判断a和b的值是否不等，成立为true，不成立为false |
| >    | 判断是否大于     | a>b  | 判断a是否大于b，成立为true，不成立为false       |
| >=   | 判断是否大于等于 | a>=b | 判断a是否大于等于b，成立为true，不成立为false   |
| <    | 判断是否小于     | a<b  | 判断a是否小于b，成立为true，不成立为false       |
| <=   | 判断是否小于等于 | a<=b | 判断a是否小于等于b，成立为true，不成立为false   |

### 2.8.5、逻辑运算符

| 符号 | 作用     | 说明                                                         |
| ---- | -------- | ------------------------------------------------------------ |
| &    | 逻辑与   | “与”，并且的关系，只要表达式中有一个值为false，结果即为false |
| \|   | 逻辑或   | “或”，或者的关系，只要表达式中有一个值为true，结果即为true   |
| !    | 逻辑非   | true变false、false变true                                     |
| ^    | 逻辑异或 | 相同为false，不同为true                                      |
| &&   | 短路与   | 作用和&相同，但是有短路效果，如果左边为false，右边就不执行了 |
| \|\| | 短路或   | 作用和\|相同，但是有短路效果，如果左边为true，右边就不执行了 |

### 2.8.6、三元运算符

格式：关系表达式 ? 表达式1 : 表达式2;

````java
int a = 10;
int b = 20;
int max = a > b ? a : b;
````

## 2.9、数据输出和输入

数据输出：

````java
输出后换行：System.out.println(常量/变量/方法返回值/对象/表达式);
输出不换行：System.out.print(常量/变量/方法返回值/对象/表达式);
换行：System.out.println();
````

数据输入：

````java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
}
````

## 2.10、分支结构（if、switch）

### 2.10.1、if语句

格式一：

````java
if (关系表达式) {
    语句体;
}
````

流程一：

①首先计算关系表达式的值

②如果关系表达式的值为true就执行语句体

③如果关系表达式的值为false就不执行语句体

④继续执行后面的语句内容

格式二：

````java
if (关系表达式) {
    语句体1;
} else {
    语句体2;
}
````

流程二：

①首先计算关系表达式的值

②如果关系表达式的值为true就执行语句体1

③如果关系表达式的值为false就执行语句体2

④继续执行后面的语句内

格式三：

````java
if (关系表达式1) {
    语句体1;
} else if (关系表达式2) {
    语句体2;
}
...
else {
    语句体n+1;
}
````

流程三：

①首先计算关系表达式1的值

②如果值为true就执行语句体1；如果值为false就计算关系表达式2的值

③如果值为true就执行语句体2；如果值为false就计算关系表达式3的值

④…

⑤如果没有任何关系表达式为true，就执行语句体n+1。

### 2.10.2、switch语句

格式：

````java
switch (关系表达式) {
    case 1:
        语句体1;
        break;
    case 2:
        语句体2;
        break;
    ...
    default:
        语句体n+1;
        [break;]
}
````

流程：首先计算出关系表达式的值，其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉，注意default中的break可以省略。

注意：

1. 关系表达式的取值可以是byte、short、int、char
2. JDK5以后可以是枚举
3. JDK7以后可以是String

## 2.11、循环结构（for、while、do…while）

### 2.11.1、for语句

格式：
````java
for (初始化语句;条件判断语句;条件控制语句) {
    循环体语句;
}
````

流程：

①执行初始化语句

②执行条件判断语句，看其结果是true还是false，如果是false，循环结束，如果是true，继续执行

③执行循环体语句

④执行条件控制语句

⑤回到②继续

### 2.11.2、while语句

格式：

````java
初始化语句;
while (条件判断语句) {
    循环体语句;
    条件控制语句;
}
````

流程：

①执行初始化语句

②执行条件判断语句，看其结果是true还是false，如果是false，循环结束，如果是true，继续执行

③执行循环体语句

④执行条件控制语句

⑤回到②继续

### 2.11.3、do…while语句

格式：

````java
初始化语句;
do {
    循环体语句;
    条件控制语句;
}while(条件判断语句);
````

流程：

① 执行初始化语句

② 执行循环体语句

③ 执行条件控制语句

④ 执行条件判断语句，看其结果是true还是false，如果是false，循环结束，如果是true，继续执行

⑤ 回到②继续

### 2.11.4、死循环语句

````java
第一种：
for(;;){
    
}
第二种：
while(true){
    
}
第三种：
do{
    
}while(true);
````

## 2.12、跳转控制（break、continue）

````java
break：跳出最近循环，循环语句结束
continue：跳过本次循环，继续下次循环
````

## 2.13、数组

定义：数组是用于储存多个相同类型数据的有序集合。组成数组的各个变量称为数组的分量，也称为数组的元素，有时也称为下标变量。用于区分数组的各个元素的数字编号称为下标。

格式：

````java
第一种：数据类型[] 数组名;
第二种：数据类型 数组名[];
````

初始化：

````java
动态初始化
含义：数组动态初始化就是只给定数组的长度，由系统给出默认初始化值
格式：数据类型[] 数组名 = new 数据类型[数组长度];
举例：int[] arr = new int[3];

静态初始化
含义：在创建数组时，直接将元素确定，由系统给出数组长度
格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};
简化：数据类型[] 数组名 = {元素1,元素2,...};
举例：int[] arr = {1, 2, 3};
````

数组遍历：

````java
public class Main {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11, 22, 33, 44, 55};
        //数组遍历 arr.length：代表数组个数
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
````

常见异常：

1. ArrayIndexOutOfBoundsException：数组下标越界异常
2. NullPointerException：空指针异常

## 2.14、内存区域

| 区域名称 | 区域作用                | 区域特点                                                     |
| -------- | ----------------------- | ------------------------------------------------------------ |
| 栈内存   | 储存局部变量            | 1.栈内存的数据用完就释放                                     |
| 堆内存   | 储存 new 出来的东西     | 1.每一个 new 出来的东西都有地址值<br/>2.每个变量都有默认值<br/>（byte, short, int, long 的默认值为 0；）<br/>（float, double 的默认值为 0.0；）<br/>（char 的默认值为 “\u0000”；boolean 的默认值为 false；）<br/>（引用类型为 null）<br/>3.使用完毕就变成垃圾，但是并没有立即回收，垃圾回收器空闲的时候回收。 |
| 方法区   | 存储可以运行的class文件 |                                                              |

## 2.15、方法

定义：是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集

格式：

````java
public static 返回值类型 方法名(参数列表) {
    方法体;
    return 数据;
}
````

注意：

1. 方法不能嵌套定义，但是方法可以嵌套调用
2. 方法必须先定义，后调用，否则程序将报错
3. 方法定义时，多个参数之间使用逗号(,)分隔
4. void表示无返回值，return可省略也可不省

形参实参：

````java
形参：方法定义中的参数
实参：方法调用中的参数
````

方法重载：指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载

1. 多个方法在同一个类中
2. 多个方法具有相同的方法名
3. 多个方法的参数不相同：参数类型或者数量不同

参数传递：

````java
方法参数传递基本类型：基本数据类型的参数，形式参数的改变，不会影响实际参数
方法参数传递引用类型：对于引用类型的参数，形式参数的改变，影响实际参数的值
````

# 第三章 Java面向对象

## 3.1、概述

概述：面向对象是相对面向过程而言，面向对象和面向过程都是一种思想，面向过程强调的是功能行为，面向对象则是将功能封装进对象，强调具备功能的对象，面向对象是基于面向过程的。面向对象的三大特征：封装、继承、多态。

开发：其实就是找对象，建立对象，使用对象，维护对象的关系。

## 3.2、类和对象

简单理解：类是对事物的一种描述，对象则为具体存在的事物

类的定义：
````java
public class 类名 {
    // 成员变量
    变量1的数据类型 变量1；
    变量2的数据类型 变量2;
    …
    // 成员方法
    方法1;
    方法2;
}
````

对象使用：

````java
类名 对象名 = new 类名();
````

成员调用：

````java
对象名.成员变量
对象名.成员方法();
````

特别注意：

![](/类和对象.png)

## 3.3、封装

概述：是面向对象编程语言对客观世界的模拟，客观世界 里成员变量都是隐藏在对象内部的，外界是无法直接操作的

原则：将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问

好处：通过方法来控制成员变量的操作，提高了代码的安全性，把代码用方法进行封装，提高了代码的复用性

### 3.3.1、private关键字

概述：private是一个修饰符，可以用来修饰成员（成员变量，成员方法），被private修饰的成员，只能在本类进行访问

应用：类中的属性通常被私有化，并对外提供公共的访问方法，这样可以避免安全隐患。这个方法一般有两个，规范写法：对于属性 xxx，可以使用setXxx()、getXxx()对其进行操作。

### 3.3.2、this关键字

概述：this代表它所在函数所属对象的引用，哪个对象在调用this所在的函数，this就代表哪个对象

应用：当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象

### 3.3.3、构造方法

概述：构造方法是一种特殊的方法，可以使用带参构造，为成员变量进行初始化

格式：
````java
public class 类名{
    // [参数]可有可无 
    修饰符 类名([参数]) {
        
    }
}
````

注意：

1. 如果没有定义构造方法，系统将给出一个默认的无参数构造方法，如果定义了构造方法，系统将不再提供默认的构造方法
2. 如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法

### 3.3.4、封装案例

````java
class Student {
    // 成员变量
    private String name;
    private int age;

    // 无参构造方法
    public Student() {}

    // 有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
````

## 3.4、继承

概述：继承可以使得子类具有父类的属性和方法，还可以在子类中重新定义，以及追加属性和方法

格式：class 子类 extends 父类 { }

好处：继承可以让类与类之间产生关系，子父类关系，产生子父类后，子类则可以使用父类中非私有的成员

### 3.4.1、super关键字

概述：代表父类存储空间的标识(可以理解为父类对象引用)

应用：子类要访问父类中的同名成员（成员变量和成员方法），用super关键字

### 3.4.2、this和super区别

````java
this和super的概述：
		this：代表本类对象的引用
		super：代表父类对象的引用
    
this和super的使用：
成员变量：
	this.成员变量 - 访问本类成员变量
	super.成员变量 - 访问父类成员变量
    
成员方法：
	this.成员方法 - 访问本类成员方法
	super.成员方法 - 访问父类成员方法
    
构造方法：
	this(…) - 访问本类构造方法
	super(…) - 访问父类构造方法
````

### 3.4.3、继承中的成员访问特点

#### 3.4.3.1、继承中变量使用的访问特点

子类局部范围找
子类成员范围找
父类成员范围找
如果都没有就报错(不考虑父亲的父亲…)

#### 3.4.3.2、继承中成员方法的访问特点

子类成员范围找
父类成员范围找
如果都没有就报错(不考虑父亲的父亲…)

#### 3.4.3.3、继承中构造方法的访问特点

注意：子类中所有的构造方法默认都会访问父类中无参的构造方法，每一个子类构造方法的第一条语句默认都是：super()

问题：如果父类中没有无参构造方法，只有带参构造方法，该怎么办呢？

答案：通过使用super关键字去显示的调用父类的带参构造方法

#### 3.4.4、方法重写

概述：子类出现了和父类中一模一样的方法声明（方法名一样，参数列表也必须一样）

应用：当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法，这样，即沿袭了 父类的功能，又定义了子类特有的内容

注解：Override注解用来检测当前的方法，是否是重写的方法，起到【校验】的作用

注意：

私有方法不能被重写(父类私有成员子类是不能继承的)
子类方法访问权限不能更低(public > 默认 > 私有)

#### 3.4.5、继承的注意事项

类只支持单继承，不支持多继承
类支持多层继承

## 3.5、多态

概述：同一个对象，在不同时刻表现出来的不同形态

前提：要有继承或实现关系、要有方法的重写、要有父类引用指向子类对象

好处：提高程序的扩展性，定义方法时候，使用父类型作为参数，在使用的时候，使用具体的子类型参与操作

### 3.5.1、多态中的成员访问特点

````java
成员变量：编译看父类，运行看父类
成员方法：编译看父类，运行看子类
````

### 3.5.2、多态中的转型

````java
向上转型：父类引用指向子类对象就是向上转型
向下转型：子类型 对象名 = (子类型)父类引用;
````

### 3.5.3、instanceof 运算符

格式：对象 intanceof 类型(类类型 接口类型)

描述：如果运算符左侧变量所指的对象，是操作符右侧类或接口的一个对象，那么结果为真

## 3.6、包和导包

### 3.6.1、package关键字

概述：包就是文件夹，用来管理类文件的

格式：package 包名; (多级包用.分开)

````java
带包编译：javac –d . 类名.java
例如：javac -d . com.caochenlei.demo.HelloWorld.java

带包运行：java 包名+类名
例如：java com.caochenlei.demo.HelloWorld
````

### 3.6.2、 import关键字

概述：使用不同包下的类时，使用的时候要写类的全路径，写起来太麻烦了，为了简化带包的操作，Java就提供了导包的功能

普通格式：import 包名;

静态导入：import static 包名.类名.方法名;

## 3.7、权限修饰符

![](/权限修饰符.png)

## 3.8、final关键字

概述：final关键字是最终的意思，可以修饰成员方法、成员变量、类

特点：

````java
final修饰方法：表示该方法不能被重写
final修饰变量：表示该变量是一个常量，不能再次赋值
fianl修饰类：表示该类不能被继承
````

注意：final修饰局部变量

1. fianl修饰基本数据类型变量：基本类型的数据值不能发生改变
2. final修饰引用数据类型变量：引用类型的地址值不能发生改变，但是地址里面的内容是可以发生改变

## 3.9、static关键字

概述：static关键字是静态的意思，可以修饰成员方法、成员变量

特点：
````java
非静态的成员方法
	能访问静态的成员变量
	能访问非静态的成员变量
	能访问静态的成员方法
	能访问非静态的成员方法 

静态的成员方法
	能访问静态的成员变量
	能访问静态的成员方法
````

注意：静态成员方法只能访问静态成员

## 3.10、抽象类

概述：在做子类共性功能抽取时，有些方法在父类中并没有具体的体现，这个时候就需要抽象类了

格式：public abstract class 类名 {}

语法特点：

1. 抽象类和抽象方法必须使用 abstract 关键字修饰
2. 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
3. 抽象类不能实例化，要想实例化，参照多态的方式，通过子类对象实例化，这叫抽象类多态
4. 抽象类的子类，要么重写抽象类中的所有抽象方法，要么子类也是抽象类

内部特点：
````java
成员变量
	既可以是变量
	也可以是常量
构造方法
	空参构造
	有参构造
成员方法
	抽象方法
	普通方法
````

注意问题：

1. 与abstract不能共存的关键字：final、private、static

````java
final：被final修饰的类不能有子类，而被abstract修饰的类一定是一个父类
private: 抽象类中的私有的抽象方法，不被子类所知，就无法被复写。而抽象方法出现的就是需要被复写
static：如果static可以修饰抽象方法，那么连对象都省了，直接类名调用就可以了。可是抽象方法运行没意义
````

3.2、接口
概述：接口就是一种公共的规范标准，只要符合规范标准，大家都可以通用

格式：public interface 接口名 {}

语法特点：

1. 接口用关键字interface修饰
2. 类实现接口用implements表示
3. 接口不能实例化，要想实例化，参照多态的方式，通过子类对象实例化，这叫接口多态
4. 接口的子类，要么重写接口中的所有抽象方法，要么子类也是抽象类

内部特点：
````java
成员变量
	只能是常量，默认修饰符：public static final
构造方法
	没有，因为接口主要是扩展功能的，而没有具体存在
成员方法
	只能是抽象方法，默认修饰符：public abstract
````

注意问题：

1. 抽象类和接口区别

成员区别：
	抽象类
		变量、常量、构造方法、有抽象方法、也有非抽象方法
	接口
		常量、有抽象方法

关系区别：
	类与类的关系
		继承关系，只能单继承，支持多层继承
	类与接口的关系
		实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
	接口与接口的关系
		继承关系，可以单继承，也可以多继承

设计理念区别
	抽象类
		对类抽象，包括属性、行为
	接口
		对行为抽象，主要是行为

````java
成员区别：
	抽象类
		变量、常量、构造方法、有抽象方法、也有非抽象方法
	接口
		常量、有抽象方法

关系区别：
	类与类的关系
		继承关系，只能单继承，支持多层继承
	类与接口的关系
		实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
	接口与接口的关系
		继承关系，可以单继承，也可以多继承

设计理念区别
	抽象类
		对类抽象，包括属性、行为
	接口
		对行为抽象，主要是行为
````

2.JDK8新特性

- 默认方法

````java
格式：public default 返回值类型 方法名(参数列表) { }
举例：
public interface MyInter {
	public default void show() {
		System.out.println("Hello,World");
	}
}
````

- 静态方法

````java
格式：public static 返回值类型 方法名(参数列表) { }
举例：
public interface MyInter {
	public static void show() {
		System.out.println("Hello,World");
	}
}
````

## 3.11、内部类

概述：在一个类中定义一个类。举例：在一个类A的内部定义一个类B，类B就被称为内部类

格式：

````java
class Outer {
    public class Inner { }
}
````

语法特点：

1. 内部类可以直接访问外部类的成员，包括私有
2. 外部类要访问内部类的成员，必须创建对象

常见分类：

````java
成员内部类：在成员变量位置定义的内部类
外界访问成员内部类：
	格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
	举例：Outer.Inner oi = new Outer().new Inner();

局部内部类：在方法位置定义的内部类
外界访问局部内部类：
    格式：外界是无法直接使用，需要在方法内部创建对象并使用
    注意：局部内部类可以直接访问外部类的成员，也可以访问方法内的局部变量

匿名内部类：匿名内部类其实就是内部类的简写格式，他的前提是继承一个类或者实现接口
    格式：new 类名 ( ) { 重写方法 } 
	     new 接口名 ( ) { 重写方法 }
	本质：是一个继承了该类或者实现了该接口的子类匿名对象
````

## 3.12、方法进阶

### 3.12.1、类作为方法形参和返回值

````java
class Cat {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class CatOperator {
    public void useCat(Cat c) {
        c.eat();
    }

    public Cat getCat() {
        return new Cat();
    }
}

public class Main {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c1 = new Cat();
        co.useCat(c1);
        Cat c2 = co.getCat();
        c2.eat();
    }
}
````

### 3.12.2、抽象类作为方法形参和返回值

````java
abstract class Animal {
    public abstract void eat();
}

class AnimalOperator {
    public void useAnimal(Animal a) {
        a.eat();
    }

    public Animal getAnimal() {
        return new Cat();
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}


public class Main {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a1 = new Cat();
        ao.useAnimal(a1);
        Animal a2 = ao.getAnimal();
        a2.eat();
    }
}
````

### 3.12.3、接口作为方法形参和返回值

````java
interface Jumpping {
    void jump();
}

class JumppingOperator {
    public void useJumpping(Jumpping j) {
        j.jump();
    }

    public Jumpping getJumpping() {
        return new Cat();
    }
}

class Cat implements Jumpping {
    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}

public class Main {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j1 = new Cat();
        jo.useJumpping(j1);
        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
````

### 3.12.4、匿名内部类作为方法实参和返回值

````java
interface Jumpping {
    void jump();
}

class JumppingOperator {
    public void useJumpping(Jumpping j) {
        j.jump();
    }

    public Jumpping getJumpping() {
        return new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        };
    }
}

public class Main {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        jo.useJumpping(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        });
        jo.getJumpping().jump();
    }
}
````

# 第四章 常用API

## 4.1、Object类

描述：该类是所有类的最终根类

| 方法                              | 描述                             |
| --------------------------------- | -------------------------------- |
| public boolean equals(Object obj) | 表示某个其它对象是否“等于”此对象 |
| public final class<?> getClass()  | 返回此Object的运行时类           |
| public int hashCode()             | 返回对象的哈希码值               |
| public String toString()          | 返回对象的字符串表示形式         |

## 4.2、System类

描述：该类包含几个有用的类字段和方法

| 方法                                   | 描述                           |
| -------------------------------------- | ------------------------------ |
| public static long currentTimeMillis() | 以毫秒为单位返回当前时间       |
| public static void exit(int status)    | 终止当前运行的Java虚拟机       |
| public static void gc()                | 运行垃圾收集器                 |
| public static String lineSeparator()   | 返回依赖于系统的行分隔符字符串 |

## 4.3、Arrays类

描述：该类包含用于操作数组的各种方法

| 方法                                                         | 描述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| public static List asList(T… a)                              | 描述：返回由指定数组支持的固定大小的列表<br/> 举例：List stooges = Arrays.asList(“Larry”, “Moe”, “Curly”); |
| public static String toString(int[] a)                       | 描述：返回指定数组的内容的字符串表示形式 <br/>举例： int[] a = { 10, 20, 30, 4, 5, 60, 70, 80 }; String as = Arrays.toString(a); |
| public static void sort(int[] a)                             | 描述：按照数字升序顺序排列指定的数组 举例： int[] a = { 10, 20, 30, 4, 5, 60, 70, 80 }; Arrays.sort(a); |
| public static void sort(int[] a, int fromIndex, int toIndex) | 描述：按照数字升序顺序对数组的指定范围进行排序<br/>举例：<br/>int[] a = { 10, 20, 30, 4, 5, 60, 70, 80 };<br/>Arrays.sort(a, 2, 7); |
| public static int binarySearch(int[] a, int key)             | 描述：使用二分查找算法在指定的int数组中搜索指定的值<br/>举例：<br/>int[] a = { 10, 20, 30, 4, 5, 60, 70, 80 };<br/>Arrays.sort(a);<br/>int index = Arrays.binarySearch(a, 5); |
| public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) | 描述：使用二分查找算法在指定的int数组中的指定范围搜索指定的值<br/>举例：<br/>int[] a = { 10, 20, 30, 4, 5, 60, 70, 80 };<br/>Arrays.sort(a);<br/>int index = Arrays.binarySearch(a, 2, 7, 60); |

## 4.4、Math类

描述：该类包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数

成员变量：

| 变量                          | 描述                                                     |
| ----------------------------- | -------------------------------------------------------- |
| public static final double E  | 比其它任何一个更接近 e ，自然对数的基数                  |
| public static final double PI | 比其它任何一个更接近 pi ，圆周长与其直径的比率|

成员方法：

| 方法                                                         | 描述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| public static int abs(int a)                                 | 返回值为int绝对值                                            |
| public static int max(int a, int b)                          | 返回两个int的较大值                                          |
| public static int min(int a, int b)                          | 返回两个int的较小值                                          |
| public static double floor(double a)                         | 返回小于或等于参数的最大整数                                 |
| public static double ceil(double a)                          | 返回大于或等于参数的最小整数                                 |
| public static long round(double a)                           | 返回四舍五入后的整数值                                       |
| public static double pow(double a, double b)                 | 返回a的b次幂                                                 |
| public static double log(double a)                           | 返回log以e为底的值                                           |
| public static double sqrt(double a)                          | 返回a的正平方根                                              |
| public static double random()	返回一个[0.0 , 1.0)之间的随机数 | public static int getRand(double min, double max) {<br/>return (int) (Math.random() * (max - min + 1) + min);<br/>} |

## 4.6、Date类

描述：该类是一个日期类

构造方法：

| 方法                   | 描述                                  |
| ---------------------- | ------------------------------------- |
| public Date()          | 构造一个 Date对象，它代表当前的毫秒值 |
| public Date(long date) | 使用给定的毫秒时间值构造一个Date对象  |

## 4.7、SimpleDateFormat类

1、将日期格式化为字符串

````java
Date d = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String s = sdf.format(d);
````

2、将字符串格式化为日期

````java
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Date d = sdf.parse("2020-07-15 01:02:03");
````

## 4.8、Calendar类

````java
Calendar c = Calendar.getInstance();
int year = c.get(Calendar.YEAR);
int month = c.get(Calendar.MONTH) + 1;
int day = c.get(Calendar.DATE);
int hour = c.get(Calendar.HOUR);
int minute = c.get(Calendar.MINUTE);
int second = c.get(Calendar.SECOND);
System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
````

## 4.9、String类

描述：该类代表字符串

构造方法：

| 方法                                         | 描述                                                       |
| -------------------------------------------- | ---------------------------------------------------------- |
| public String()                              | 初始化构造一个空白字符串                                   |
| public String(char[] value)                  | 通过字符数组初始化字符串                                   |
| public String(byte[] bytes)                  | 通过使用平台的默认字符集解码指定的字节数组来构造新的String |
| public String(byte[] bytes, Charset charset) | 通过使用自定义的字符集解码指定的字节数组来构造新的String   |
| public String(StringBuffer buffer)           | 字符串缓冲区的内容被复制，重新分配一个新的字符串           |
| public String(StringBuilder builder)         | 字符串构建器的内容被复制，重新分配一个新的字符串           |

成员方法：

| 方法                                                       | 描述                                                         |
| ---------------------------------------------------------- | ------------------------------------------------------------ |
| public int length()                                        | 返回此字符串的长度                                           |
| public int indexOf(int ch)                                 | 返回指定字符第一次出现的字符串内的索引                       |
| public int lastIndexOf(int ch)                             | 返回指定字符的最后一次出现的字符串中的索引                   |
| public int indexOf(String str)                             | 返回指定子字符串第一次出现的字符串内的索引                   |
| public int lastIndexOf(String str)                         | 返回指定子字符串最后一次出现的字符串中的索引                 |
| public char charAt(int index)                              | 返回char指定索引处的值                                       |
| public char[] toCharArray()                                | 将此字符串转换为新的字符数组                                 |
| public static String valueOf(int i)                        | 返回int参数的字符串int形式                                   |
| public String trim()                                       | 返回一个删除前后空格的字符串                                 |
| public String toString()                                   | 返回当前字符串                                               |
| public String concat(String str)                           | 将指定的字符串连接到该字符串的末尾                           |
| public String toLowerCase()                                | 返回一个转换为小写的字符串                                   |
| public String toUpperCase()                                | 返回一个转换为大写的字符串                                   |
| public String substring(int beginIndex)                    | 返回一个以指定索引处的字符开头到该字符串的末尾的子字符串     |
| public String substring(int beginIndex, int endIndex)      | 返回一个以指定索引处的字符开头到指定索引处的字符结尾的子字符串 |
| public String replace(char oldChar, char newChar)          | 返回一个替换所有旧字符后的新字符串                           |
| public String replaceAll(String regex, String replacement) | 返回一个替换所有符合正则表达式字符串后的新字符串             |
| public String[] split(String regex)                        | 根据正则表达式拆分字符串并返回拆分后的字符串数组             |
| public boolean startsWith(String prefix)                   | 判断此字符串是否以指定的前缀开头                             |
| public boolean endsWith(String suffix)                     | 判断此字符串是否以指定的后缀结尾                             |
| public boolean matches(String regex)                       | 根据正则表达式判断当前字符串是否符合要求                     |
| public boolean isEmpty()                                   | 判断当前字符串是否为空字符串                                 |
| public boolean contains(CharSequence s)                    | 判断当前字符串是否包含s字符                                  |
| public boolean equals(Object anObject)                     | 判断当前字符串是否和anObject相等                             |

注意事项：

| StringBuffer                                                 | StringBuilder                                                |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 内容可以变                                                   | 内容可以变                                                   |
| 线程安全                                                     | 线程不安全                                                   |
| 多线程操作字符串                                             | 单线程操作字符串                                             |
| StringBuffer sb = new StringBuffer();<br/>sb.append(“Hello”);<br/>sb.append(" ");<br/>sb.append(“World”);<br/>System.out.println(sb.toString()); | StringBuilder sb = new StringBuilder();<br/>sb.append(“Hello”);<br/>sb.append(" ");<br/>sb.append(“World”);<br/>System.out.println(sb.toString()); |

## 4.10、八种包装类

| 基本类型 | 包装类    |
| -------- | --------- |
| byte     | Byte      |
| short    | Short     |
| int      | Integer   |
| long     | Long      |
| float    | Float     |
| double   | Double    |
| char     | Character |
| boolean  | Boolean   |

````java
自动装箱：把基本数据类型转换为对应的包装类类型
自动拆箱：把包装类类型转换为对应的基本数据类型
````

## 4.11、BigInteger类

````java
BigInteger bi1 = new BigInteger("100");
BigInteger bi2 = new BigInteger("50");

// public BigInteger add(BigInteger val)：加
System.out.println("add:" + bi1.add(bi2));

// public BigInteger subtract(BigInteger val)：减
System.out.println("subtract:" + bi1.subtract(bi2));

// public BigInteger multiply(BigInteger val)：乘
System.out.println("multiply:" + bi1.multiply(bi2));

// public BigInteger divide(BigInteger val)：除
System.out.println("divide:" + bi1.divide(bi2));
````

## 4.12、BigDecimal类

````java
BigDecimal bd1 = new BigDecimal("0.09");
BigDecimal bd2 = new BigDecimal("0.01");
// public BigDecimal add(BigDecimal val)：加
System.out.println("add:" + bd1.add(bd2));

BigDecimal bd3 = new BigDecimal("1.0");
BigDecimal bd4 = new BigDecimal("0.32");
// public BigDecimal subtract(BigDecimal val)：减
System.out.println("subtract:" + bd3.subtract(bd4));

BigDecimal bd5 = new BigDecimal("1.015");
BigDecimal bd6 = new BigDecimal("100");
// public BigDecimal multiply(BigDecimal val)：乘
System.out.println("multiply:" + bd5.multiply(bd6));

BigDecimal bd7 = new BigDecimal("1.301");
BigDecimal bd8 = new BigDecimal("100");
// public BigDecimal divide(BigDecimal val)：除
System.out.println("divide:" + bd7.divide(bd8));
````

## 4.13、异常

概述：异常就是程序出现了不正常的情况

体系：

![]()![异常](/异常.png)

解决：

````java
解决方案一：用try-catch方式处理异常
try {
    可能出现异常的代码;
} catch(异常类名 变量名) {
    异常的处理代码;
}

解决方案二：用throws方式处理异常
public void 方法名() throws 异常类名 {
    
}
````

![](/异常2.png)

````java
// 自定义异常类
class ScoreException extends Exception {
	public ScoreException() {}

	public ScoreException(String message) {
		super(message);
	}
}

class Teacher {
	public void checkScore(int score) throws ScoreException {
		if (score < 0 || score > 100) {
			throw new ScoreException("你给的成绩有误，分数应该在0-100之间");
		} else {
			System.out.println("你给的成绩正常");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			Teacher s = new Teacher();
			s.checkScore(120);
		} catch (ScoreException e) {
			e.printStackTrace();
		}
	}
}
````

# 第五章 泛型&集合

## 5.1、泛型

概述：泛型是是JDK5中引入的特性，它提供了编译时类型安全检测机制，该机制允许在编译时检测到非法的类型，它的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。

泛型类：

````java
// 格式：修饰符 class 类名<类型> { }
class Generic<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Main {
	public static void main(String[] args) {
		Generic<String> g1 = new Generic<String>();
		g1.setT("String");
		System.out.println(g1.getT());
		Generic<Integer> g2 = new Generic<Integer>();
		g2.setT(100);
		System.out.println(g2.getT());
		Generic<Boolean> g3 = new Generic<Boolean>();
		g3.setT(true);
		System.out.println(g3.getT());
	}
}
````

泛型方法：

````java
// 格式：修饰符 <类型> 返回值类型 方法名(类型 变量名) { }
class Generic {
	public <T> void show(T t) {
		System.out.println(t);
	}
}

public class Main {
	public static void main(String[] args) {
		Generic g = new Generic();
		g.show("String");
		g.show(100);
		g.show(true);
	}
}
````

泛型接口：

````java
// 修饰符 interface 接口名<类型> { }
interface Generic<T> {
	void show(T t);
}

class GenericImpl<T> implements Generic<T> {
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}

public class Main {
	public static void main(String[] args) {
		Generic<String> g1 = new GenericImpl<String>();
		g1.show("String");
		Generic<Integer> g2 = new GenericImpl<Integer>();
		g2.show(30);
		Generic<Boolean> g3 = new GenericImpl<Boolean>();
		g3.show(true);
	}
}
````

类型通配符：

````java
类型通配符：<?>
    List<?>：表示元素类型未知的List，它的元素可以匹配任何的类型
    
类型通配符上限：<? extends 类型>
    List<? extends Number>：它表示的类型是Number或者其子类型
    
类型通配符下限：<? super 类型>
    List<? super Number>：它表示的类型是Number或者其父类型 
````

可变参数：

````java
public class Main {
	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10, 20, 30, 40));
		System.out.println(sum(10, 20, 30, 40, 50));
		System.out.println(sum(10, 20, 30, 40, 50, 60));
		System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
		System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80));
		System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80, 90));
		System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
	}

	// 格式：修饰符 返回值类型 方法名(数据类型… 变量名) { }
	public static int sum(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}
````

## 5.2、集合

概述：提供一种可变的存储模型，存储的数据容量可以随时发生改变

体系：

![](/集合.png)

### 5.2.1、Collection接口

子接口特点：

1. List接口：按照顺序存取，元素可以重复，有索引，可使用迭代器、增强for循环、普通for循环遍历
2. Set接口：不按照顺序存取，元素不可以重复，没有索引，可使用迭代器、增强for循环遍历

通用方法：

````java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		// 创建集合
		Collection<String> collection = new ArrayList<String>();

		// 添加元素
		collection.add("张三");
		collection.add("张三");
		collection.add("李四");
		collection.add("李四");
		collection.add("王五");
		collection.add("王五");
		System.out.println(collection.toString());

		// 移除元素
		collection.remove("张三");
		System.out.println(collection.toString());

		// 判断元素
		boolean isContains = collection.contains("李四");
		System.out.println(isContains);

		// 判断集合是否为空
		boolean isEmpty = collection.isEmpty();
		System.out.println(isEmpty);

		// 获取集合元素个数
		int size = collection.size();
		System.out.println(size);

		// 用迭代器遍历集合
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 用增强for循环遍历
		for (String s : collection) {
			System.out.println(s);
		}

		// 添加另外集合元素
		Collection<String> c = new ArrayList<String>();
		c.add("小可爱");
		c.add("大可爱");
		collection.addAll(c);
		System.out.println(collection.toString());

		// 清空集合所有元素
		collection.clear();
		System.out.println(collection.toString());
	}
}
````

### 5.2.2、List接口

子类特点：

1. ArrayList集合：底层是数组结构实现，查询快、增删慢
2. LinkedList集合：底层是链表结构实现，查询慢、增删快

通用方法：

````java
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		// 创建集合
		List<String> list = new ArrayList<String>();

		// 添加元素
		list.add("张三");
		list.add("张三");
		list.add("李四");
		list.add("李四");
		list.add("王五");
		list.add("王五");
		System.out.println(list.toString());

		// List独有方法：E get(int index)
		String s = list.get(0);
		System.out.println(s);

		// List独有方法：E set(int index, E element)
		list.set(2, "xiaoqi");
		System.out.println(list.toString());

		// List独有方法：ListIterator<E> listIterator()
		ListIterator<String> listIterator = list.listIterator();
		// 使用列表迭代器：从前向后迭代
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		// 使用列表迭代器：从后向前迭代
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		// List独有遍历：普通for循环遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
````

注意事项：

LinkedList集合的特有方法：

| 方法                      | 说明                             |
| ------------------------- | -------------------------------- |
| public void addFirst(E e) | 在该列表开头插入指定的元素       |
| public void addLast(E e)  | 在该列表末尾追加指定的元素       |
| public E getFirst()       | 返回此列表中的第一个元素         |
| public E getLast()        | 返回此列表中的最后一个元素       |
| public E removeFirst()    | 从此列表中删除并返回第一个元素   |
| public E removeLast()     | 从此列表中删除并返回最后一个元素 |

### 5.2.3、Set接口

子类特点：

HashSet集合：底层由哈希表支撑，元素存取无序，对象添加需要重写hashCode和equals方法
TreeSet集合：底层由二叉树支撑，元素顺序存取，对象排序需要继承Comparable接口重写compareTo方法、或者使用Comparator初始化
HashSet演示：

````java
import java.util.Collection;
import java.util.HashSet;

class Student {
	private String name;
	private Integer age;

	public Student() {
		super();
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class Main {
	public static void main(String[] args) {
		// 创建集合
		Collection<Student> collection = new HashSet<Student>();

		// 添加元素
		collection.add(new Student("张三", 20));
		collection.add(new Student("张三", 20));
		collection.add(new Student("李四", 21));
		collection.add(new Student("李四", 21));
		collection.add(new Student("王五", 22));
		collection.add(new Student("王五", 22));
		System.out.println(collection.toString());
	}
}
````

TreeSet演示：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

````java
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

class Student {
	private String name;
	private Integer age;

	public Student() {
		super();
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		// 创建集合
		Collection<Student> collection = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// 主要条件
				int sort1 = s1.getAge() - s2.getAge();
				// 次要条件
				int sort2 = sort1 == 0 ? s1.getName().compareTo(s2.getName()) : sort1;
				return sort2;
			}
		});

		// 添加元素
		collection.add(new Student("王五", 22));
		collection.add(new Student("王五", 22));
		collection.add(new Student("张三1", 20));
		collection.add(new Student("张三0", 20));
		collection.add(new Student("李四0", 18));
		collection.add(new Student("李四1", 18));
		System.out.println(collection.toString());
	}
}
````

### 5.2.4、Map接口

接口特点：

1. 键值对映射关系
2. 一个键对应一个值，键不可以重复，值可以重复
3. 凡是对象作为HashMap的键时，对象添加需要重写hashCode和equals方法

通用方法：

````java
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// 创建集合
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素
		map.put("吕布", "貂蝉");
		map.put("项羽", "虞姬");
		map.put("郭靖", "黄蓉");
		map.put("后裔", "嫦娥");
		System.out.println(map.toString());

		// 删除元素
		map.remove("郭靖");
		System.out.println(map.toString());

		// 判断集合是否包含指定键
		boolean containsKey = map.containsKey("吕布");
		System.out.println(containsKey);

		// 判断集合是否包含指定值
		boolean containsValue = map.containsValue("貂蝉");
		System.out.println(containsValue);

		// 判断集合是否为空
		boolean isEmpty = map.isEmpty();
		System.out.println(isEmpty);

		// 获取集合元素个数
		int size = map.size();
		System.out.println(size);

		// 清空集合所有元素
		map.clear();
		System.out.println(map.toString());

		// 添加另外集合元素
		Map<String, String> m = new HashMap<String, String>();
		m.put("张三", "李四");
		m.put("王五", "小六");
		map.putAll(m);
		System.out.println(map.toString());

		// 根据键获取值
		System.out.println(map.get("张三"));

		// 获取所有键的集合
		Set<String> keySet = map.keySet();
		// 迭代器遍历
		Iterator<String> keysIterator = keySet.iterator();
		while (keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		// 增强for遍历
		for (String key : keySet) {
			System.out.println(key);
		}

		// 获取所有值的集合
		Collection<String> values = map.values();
		// 迭代器遍历
		Iterator<String> valuesIterator = values.iterator();
		while (valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
		// 增强for遍历
		for (String value : values) {
			System.out.println(value);
		}

		// 获取所有键值对对象的集合
		Set<Entry<String, String>> entrySet = map.entrySet();
		// 迭代器遍历
		Iterator<Entry<String, String>> entrySetIterator = entrySet.iterator();
		while (entrySetIterator.hasNext()) {
			Entry<String, String> entry = entrySetIterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		// 增强for遍历
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}
}
````

## 5.3、Collections类

描述：是针对集合操作的工具类

成员方法：

| 方法                                  | 描述                               |
| ------------------------------------- | ---------------------------------- |
| public static void sort(List list)    | 将指定的列表按升序排序             |
| public static void reverse(List list) | 反转指定列表中元素的顺序           |
| public static void shuffle(List list) | 使用默认的随机源随机排列指定的列表 |

示例代码：斗地主洗牌

````java
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		// 创建HashMap，键是编号，值是牌面
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// 创建ArrayList，存储编号
		ArrayList<Integer> array = new ArrayList<Integer>();
		// 创建花色数组和点数数组
		String[] colors = { "♦", "♣", "♥", "♠" };
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
		// 从0开始往HashMap里面存储编号并存储对应的牌面，同时往ArrayList里面存储编号
		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				hm.put(index, color + number);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		array.add(index);
		// 洗牌(洗的是编号)
		Collections.shuffle(array);
		// 发牌(发的是编号)
		TreeSet<Integer> playerSet1 = new TreeSet<Integer>();
		TreeSet<Integer> playerSet2 = new TreeSet<Integer>();
		TreeSet<Integer> playerSet3 = new TreeSet<Integer>();
		TreeSet<Integer> dpSet = new TreeSet<Integer>();
		for (int i = 0; i < array.size(); i++) {
			int x = array.get(i);
			if (i >= array.size() - 3) {
				dpSet.add(x);
			} else if (i % 3 == 0) {
				playerSet1.add(x);
			} else if (i % 3 == 1) {
				playerSet2.add(x);
			} else if (i % 3 == 2) {
				playerSet3.add(x);
			}
		}
		// 调用看牌方法
		lookPoker("player1", playerSet1, hm);
		lookPoker("player2", playerSet2, hm);
		lookPoker("player3", playerSet3, hm);
		lookPoker("dp", dpSet, hm);
	}

	/**
	 * 看牌方法
	 * @param name 玩家名称
	 * @param ts   牌面编号
	 * @param hm   牌面集合
	 */
	public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
		System.out.print(name + ": ");
		for (Integer key : ts) {
			String poker = hm.get(key);
			System.out.print(poker + " ");
		}
		System.out.println();
	}
}
````

# 第六章 文件&IO流

## 6.1、File类

描述：该类是文件和目录路径名的抽象表示

构造方法：

| 方法                                     | 描述                                                       |
| ---------------------------------------- | ---------------------------------------------------------- |
| public File(String pathname)             | 通过将给定的路径名字符串转换为抽象路径名来创建新的File实例 |
| public File(String parent, String child) | 从父路径名字符串和子路径名字符串创建新的File实例           |
| public File(File parent, String child)   | 从父抽象路径名和子路径名字符串创建新的File实例             |

成员方法：

创建功能：

| 方法                           | 描述                                                         |
| ------------------------------ | ------------------------------------------------------------ |
| public boolean createNewFile() | 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件 |
| public boolean mkdir()         | 创建由此抽象路径名命名的单级目录                             |
| public boolean mkdirs()        | 创建由此抽象路径名命名的多级目录                             |

判断功能：

| 方法                         | 描述                                 |
| ---------------------------- | ------------------------------------ |
| public boolean isDirectory() | 测试此抽象路径名表示的File是否为目录 |
| public boolean isFile()      | 测试此抽象路径名表示的File是否为文件 |
| public boolean exists()      | 测试此抽象路径名表示的File是否存在   |

获取功能：

| 方法                            | 描述                                                     |
| ------------------------------- | -------------------------------------------------------- |
| public String getAbsolutePath() | 返回此抽象路径名的绝对路径名字符串                       |
| public String getPath()         | 将此抽象路径名转换为路径名字符串                         |
| public String getName()         | 返回由此抽象路径名表示的文件或目录的名称                 |
| public String[] list()          | 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组 |
| public File[] listFiles()       | 返回此抽象路径名表示的目录中的文件和目录的File对象数组   |

删除功能：

| 方法                    | 描述                               |
| ----------------------- | ---------------------------------- |
| public boolean delete() | 删除由此抽象路径名表示的文件或目录 |

## 6.2、IO流

概述：IO流就是用来处理设备间数据传输问题的。常见的应用：文件复制、文件上传、文件下载、文件的读取、文件的写出等等

分类：

````java
按照数据流向来分：
	输入流：读数据
	输出流：写数据
	
按照数据类型来分：
	字节流
		字节输入流
		字节输出流
	字符流
		字符输入流
		字符输出流
````

注意：

1. 如果操作的是纯文本文件，优先使用字符流
2. 如果操作的是图片、视频、音频、应用等二进制文件，优先使用字节流
3. 如果不确定文件类型，优先使用字节流，字节流是万能的流

### 6.2.1、字节流

体系：

![](/字节流.png)

#### 6.2.1.1、字节流写数据的三种方式

| 方法                                          | 描述                     |
| --------------------------------------------- | ------------------------ |
| public void write(int b)                      | 写入一个字节             |
| public void write(byte[] b)                   | 写入一个字节数组         |
| public void write(byte[] b, int off, int len) | 写入一个字节数组的一部分 |

#### 6.2.1.2、字节流读数据的三种方式

| 方法                                        | 描述                     |
| ------------------------------------------- | ------------------------ |
| public abstract int read()                  | 读入一个字节             |
| public int read(byte[] b)                   | 读入一个字节数组         |
| public int read(byte[] b, int off, int len) | 读入一个字节数组的一部分 |

#### 6.2.1.3、字节流复制文件的四种方式

````java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		method1();
		method2();
		method3();
		method4();
	}

	// 基本字节流一次读写一个字节
	public static void method1() throws IOException {
		FileInputStream fis = new FileInputStream("sFolder\\demo.txt");
		FileOutputStream fos = new FileOutputStream("dFolder\\demo.txt");

		int by;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}

	// 基本字节流一次读写一个字节数组
	public static void method2() throws IOException {
		FileInputStream fis = new FileInputStream("sFolder\\demo.txt");
		FileOutputStream fos = new FileOutputStream("dFolder\\demo.txt");

		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// 字节缓冲流一次读写一个字节
	public static void method3() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sFolder\\demo.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("dFolder\\demo.txt"));

		int by;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		bos.close();
		bis.close();
	}

	// 字节缓冲流一次读写一个字节数组
	public static void method4() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sFolder\\demo.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("dFolder\\demo.txt"));

		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
````

### 6.2.2、字符流

体系：

![](/字符流.png)

#### 6.2.2.1、字符流写数据的五种方式

| 方法                                             | 描述                     |
| ------------------------------------------------ | ------------------------ |
| public void write(int c)                         | 写入一个字符             |
| public void write(char[] cbuf)                   | 写入一个字符数组         |
| public void write(char[] cbuf, int off, int len) | 写入一个字符数组的一部分 |
| public void write(String str)                    | 写入一个字符串           |
| public void write(String str, int off, int len)  | 写入一个字符串的一部分   |

#### 6.2.2.2、字符流读数据的四种方式

| 方法                                                 | 描述                     |
| ---------------------------------------------------- | ------------------------ |
| public int read()                                    | 读入一个字符             |
| public int read(char[] cbuf)                         | 读入一个字符数组         |
| public int read(char[] cbuf, int offset, int length) | 读入一个字符数组的一部分 |
| public String readLine()                             | 读入一个字符串           |

#### 6.2.2.3、字符流复制文本的七种方式

````java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		method7();
	}

	// 基本字符流一次读写一个字符
	public static void method1() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("sFolder\\demo.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("dFolder\\demo.txt"));

		int ch;
		while ((ch = isr.read()) != -1) {
			osw.write(ch);
		}

		osw.close();
		isr.close();
	}

	// 基本字符流一次读写一个字符数组
	public static void method2() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("sFolder\\demo.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("dFolder\\demo.txt"));

		char[] chs = new char[1024];
		int len;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
		}

		osw.close();
		isr.close();
	}

	// 文件字符流一次读写一个字符
	public static void method3() throws IOException {
		FileReader fr = new FileReader("sFolder\\demo.txt");
		FileWriter fw = new FileWriter("dFolder\\demo.txt");

		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}

	// 文件字符流一次读写一个字符数组
	public static void method4() throws IOException {
		FileReader fr = new FileReader("sFolder\\demo.txt");
		FileWriter fw = new FileWriter("dFolder\\demo.txt");

		char[] chs = new char[1024];
		int len;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		fw.close();
		fr.close();
	}

	// 字符缓冲流一次读写一个字符
	public static void method5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("sFolder\\demo.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("dFolder\\demo.txt"));

		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}

		bw.close();
		br.close();
	}

	// 字符缓冲流一次读写一个字符数组
	public static void method6() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("sFolder\\demo.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("dFolder\\demo.txt"));

		char[] chs = new char[1024];
		int len;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}

		bw.close();
		br.close();
	}

	// 字符缓冲流特有功能复制文本文件
	public static void method7() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("sFolder\\demo.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("dFolder\\demo.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}

		bw.close();
		br.close();
	}
}
````

## 6.3、文件夹复制

### 6.3.1、复制单级文件夹

````java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File srcFolder = new File("D:\\sFolder");
		File destFolder = new File("D:\\dFolder");
		copyFolder(srcFolder, destFolder);
	}

	/**
	 * 复制单级文件夹
	 * 
	 * @param srcFolder  源文件夹
	 * @param destFolder 目的文件夹
	 * @throws IOException
	 */
	private static void copyFolder(File srcFolder, File destFolder) throws IOException {
		// 判断路径是否存在
		if (!destFolder.exists()) {
			destFolder.mkdirs();
		}
		// 获取目的文件列表
		File[] listFiles = srcFolder.listFiles();
		// 遍历目的文件列表
		for (File file : listFiles) {
			copyFile(file, new File(destFolder, file.getName()));
		}
	}

	/**
	 * 复制文件
	 * 
	 * @param srcFile  源文件
	 * @param destFile 目的文件
	 * @throws IOException
	 */
	private static void copyFile(File srcFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}
}
````

### 6.3.2、复制多级文件夹

````java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File srcFolder = new File("D:\\sFolder");
		File destFolder = new File("D:\\dFolder");
		copyFolder(srcFolder, destFolder);
	}

	/**
	 * 复制多级文件夹
	 * 
	 * @param srcFolder  源文件夹
	 * @param destFolder 目的文件夹
	 * @throws IOException
	 */
	private static void copyFolder(File srcFolder, File destFolder) throws IOException {
		// 判断路径是否存在
		if (!destFolder.exists()) {
			destFolder.mkdirs();
		}
		// 获取目的文件列表
		File[] listFiles = srcFolder.listFiles();
		// 遍历目的文件列表
		for (File file : listFiles) {
			if (file.isDirectory()) {
				copyFolder(file, new File(destFolder, file.getName()));
			} else {
				copyFile(file, new File(destFolder, file.getName()));
			}
		}
	}

	/**
	 * 复制文件
	 * 
	 * @param srcFile  源文件
	 * @param destFile 目的文件
	 * @throws IOException
	 */
	private static void copyFile(File srcFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}
}
````

### 6.3.3、捕获异常新特性

#### 6.3.3.1、JDK7以前做法

````java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		method();
	}

	private static void method() {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("fr.txt");
			fw = new FileWriter("fw.txt");
			char[] chs = new char[1024];
			int len;
			while ((len = fr.read()) != -1) {
				fw.write(chs, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
````

#### 6.3.3.2、JDK7版本改进

````java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		method();
	}

	private static void method() {
		try (FileReader fr = new FileReader("fr.txt"); 
			 FileWriter fw = new FileWriter("fw.txt");) {
			char[] chs = new char[1024];
			int len;
			while ((len = fr.read()) != -1) {
				fw.write(chs, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
````

## 6.4、IO特殊流

### 6.4.1、标准输入流

````java
import java.io.IOException;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;

		int by;
		while ((by = is.read()) != -1) {
			System.out.print((char) by);
		}

		is.close();
	}
}
````

### 6.4.2、标准输出流

````java
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		PrintStream ps = System.out;

		ps.println("Hello,World");
		ps.write("Hello,World".getBytes());

		ps.close();
	}
}
````

### 6.4.3、字节打印流

````java
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("ps.txt");

		ps.println(97);
		ps.write(97);

		ps.close();
	}
}
````

### 6.4.4、字符打印流

````java
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("pw.txt");

		pw.println("hello");
		pw.write("Hello");

		pw.close();
	}
}
````

### 6.4.5、对象序列化流

注意：需要实现Serializable接口，同时需要给出serialVersionUID

````java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 5923003911550370832L;
	private String name;
	private Integer age;

	public Student() {
		super();
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

		Student s = new Student("曹晨磊", 30);
		oos.writeObject(s);

		oos.close();
	}
}
````

### 6.4.6、对象反序列化流

注意：成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程

````java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 5923003911550370832L;
	private String name;
	private Integer age;

	public Student() {
		super();
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));

		Object obj = ois.readObject();
		Student s = (Student) obj;
		System.out.println(s);

		ois.close();
	}
}
````

### 6.4.6、对象反序列化流

transient是短暂的意思。对于transient 修饰的成员变量，在类的实例对象的序列化处理过程中会被忽略。 因此，transient变量不会贯穿对象的序列化和反序列化，生命周期仅存于调用者的内存中而不会写到磁盘里进行持久化。

````java
package file;

import java.io.*;

class Teacher implements Serializable{
    private static final long serialVersionUID = 5923003911550370832L;
    private String name;
    private Integer age;
    transient String username;

    public Teacher(){
        super();
    }
    public Teacher(String name, Integer age, String username) {
        super();
        this.name = name;
        this.age = age;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}

public class MyTransient {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));


        Teacher s = new Teacher("曹晨磊", 30,"123");
        System.out.println("序列化前"+s.toString());
        oos.writeObject(s);
        Teacher o = (Teacher)ois.readObject();
        System.out.println("反序列化后"+o.toString());
    }
}
````

## 6.5、Properties集合

````java
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Properties prop = new Properties();

		// 存储元素
		prop.put("student1", "林青霞");
		prop.put("student2", "张曼玉");

		// 普通遍历
		Set<Object> keySet = prop.keySet();
		for (Object key : keySet) {
			Object value = prop.get(key);
			System.out.println(key + "," + value);
		}

		// 特有方法
		prop.setProperty("student3", "赵云");
		prop.setProperty("student4", "张飞");

		// 特有遍历
		Set<String> names = prop.stringPropertyNames();
		for (String key : names) {
			String value = prop.getProperty(key);
			System.out.println(key + "," + value);
		}
	}
}
````

````java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		// 把集合中的数据保存到文件
		myStore();
		// 把文件中的数据加载到集合
		myLoad();
	}

	private static void myStore() throws IOException {
		Properties prop = new Properties();
		prop.setProperty("student1", "林青霞");
		prop.setProperty("student2", "张曼玉");
		FileWriter fw = new FileWriter("fw.txt");
		prop.store(fw, null);
		fw.close();
	}

	private static void myLoad() throws IOException {
		Properties prop = new Properties();
		FileReader fr = new FileReader("fw.txt");
		prop.load(fr);
		fr.close();
		System.out.println(prop);
	}
}
````

## 7.1、概述

进程：是正在运行的程序

线程：是进程中的单个顺序控制流，是一条执行路径

## 7.2、实现方式

### 7.2.1、方式一

````java
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		my1.setName("线程一");
		my2.setName("线程二");
		my1.start();
		my2.start();
	}
}
````

### 7.2.2、方式二

````java
class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "线程一");
		Thread t2 = new Thread(my, "线程二");
		t1.start();
		t2.start();
	}
}
````

## 7.3、线程优先级

````java
class ThreadPriority extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		// 设置线程的名称
		tp1.setName("高铁");
		tp2.setName("飞机");
		tp3.setName("汽车");
		// 返回线程优先级
		System.out.println(tp1.getPriority());
		System.out.println(tp2.getPriority());
		System.out.println(tp3.getPriority());
		// 设置线程优先级
		tp1.setPriority(5);
		tp2.setPriority(10);
		tp3.setPriority(1);
		// 启动所有的线程
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
````

## 7.4、线程的控制

sleep演示：使当前正在执行的线程停留（暂停执行）指定的毫秒数

````java
class ThreadSleep extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();
		ts1.setName("曹操");
		ts2.setName("刘备");
		ts3.setName("孙权");
		ts1.start();
		ts2.start();
		ts3.start();
	}
}
````

join演示：等待这个线程死亡才能执行其它线程

````java
class ThreadJoin extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		tj1.setName("曹操");
		tj2.setName("刘备");
		tj3.setName("孙权");
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
	}
}
````

Daemon演示：将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出

````java
class ThreadDaemon extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		td1.setName("关羽");
		td2.setName("张飞");
		// 设置主线程为刘备
		Thread.currentThread().setName("刘备");
		// 设置守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);
		// 启动守护线程
		td1.start();
		td2.start();
		// 执行主线程的逻辑
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
````

## 7.5、线程的生命周期

![](/线程的生命周期.png)

## 7.6、解决多线程数据安全问题

### 7.6.1、同步代码块

````java
class SellTicket implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
					tickets--;
				}
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
````

### 7.6.2、普通同步方法

````java
class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			sellTicket();
		}
	}

	private synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
			tickets--;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
````

### 7.6.3、静态同步方法

````java
class SellTicket implements Runnable {
	private static int tickets = 100;

	@Override
	public void run() {
		while (true) {
			sellTicket();
		}
	}

	private static synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
			tickets--;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
````

### 7.6.4、Lock锁

````java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SellTicket implements Runnable {
	private int tickets = 100;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			try {
				// 获得锁
				lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
					tickets--;
				}
			} finally {
				// 释放锁
				lock.unlock();
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
````

## 7.7、生产者和消费者模式

概述：生产者消费者模式是一个十分经典的多线程协作的模式，弄懂生产者消费者问题能够让我们对多线程编程的理解更加深刻。

演示：

````java
class Box {
	// 定义一个成员变量，表示第几瓶牛奶
	private int milk;
	// 定义一个成员变量，表示奶箱的状态
	private boolean state = false;

	// 存储牛奶
	public synchronized void put(int milk) {
		// 如果有牛奶，等待消费
		if (state) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 如果没有牛奶，就生产牛奶
		this.milk = milk;
		System.out.println("送奶工送第" + this.milk + "瓶奶");
		// 生产完毕之后，修改奶箱状态
		state = true;
		// 唤醒其它等待的线程
		notifyAll();
	}
    

	// 获取牛奶
	public synchronized void get() {
		// 如果没有牛奶，等待生产
		if (!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 如果有牛奶，就消费牛奶
		System.out.println("用户拿到第" + this.milk + "瓶奶");
		// 消费完毕之后，修改奶箱状态
		state = false;
		// 唤醒其它等待的线程
		notifyAll();
	}
}

// 生产者
class Producer implements Runnable {
	private Box b;

	public Producer(Box b) {
		this.b = b;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			b.put(i);
		}
	}
}

// 消费者
class Customer implements Runnable {
	private Box b;

	public Customer(Box b) {
		this.b = b;
	}

	@Override
	public void run() {
		while (true) {
			b.get();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Box b = new Box();
		Producer p = new Producer(b);
		Customer c = new Customer(b);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
````

# 第八章 网络编程

## 8.1、概述

计算机网络：是指将地理位置不同的具有独立功能的多台计算机及其外部设备，通过通信线路连接起来，在网络操作系
统、网络管理软件及网络通信协议的管理和协调下，实现资源共享和信息传递的计算机系统

网络编程：在网络通信协议下，实现网络互连的不同计算机上运行的程序间可以进行数据交换

## 8.2、三要素

IP地址：是网络中设备的唯一标识，一般分两类：IPV4、IPV6

端口：设备上应用程序的唯一标识，常见的端口：8080、3306

协议：计算机网络中，连接和通信的规则被称为网络通信协议，常见的协议：UDP协议、TCP协议

## 8.3、UDP编程

UDP协议：用户数据报协议(User Datagram Protocol)，无连接通讯协议，但不能保证传输数据完整性，常用于音频、视频、普通数据传输等

### 8.3.1、发送数据

````java
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 1.创建发送端套接字对象
		DatagramSocket ds = new DatagramSocket();
		// 2.创建数据并把数据打包
		byte[] bys = "Hello,World!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.0.1"), 10086);
		// 3.从此套接字发送数据包
		ds.send(dp);
		// 4.关闭此数据包的套接字
		ds.close();
	}
}
````

### 8.3.2、接收数据

````java
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// 1.创建接收端套接字对象
		DatagramSocket ds = new DatagramSocket(10086);
		// 2.创建数据包用于接收数据
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		// 3.解析数据包并把数据输出
		System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
		// 4.关闭此数据包的套接字
		ds.close();
	}
}
````

### 8.3.3、练习

- 案例需求：

UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据才结束

UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收

- 代码实现：

````java
// 发送端代码：
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.0.1"), 10086);
			ds.send(dp);
		}
		ds.close();
	}
}

// 接收端代码：
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);
		while (true) {
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			ds.receive(dp);
			System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
		}
	}
}
````

## 8.4、TCP编程

TCP协议：传输控制协议 (Transmission Control Protocol)，面向连接通讯协议、且可以保证传输数据完整性，常用于文件上传、文件下载、浏览网页等

### 8.4.1、发送数据

````java
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 1.创建客户端的Socket对象
		Socket s = new Socket("127.0.0.1", 10086);
		// 2.获取输出流对象，写数据
		OutputStream os = s.getOutputStream();
		os.write("Hello,World!".getBytes());
		// 3.释放资源
		s.close();
	}
}
````

### 8.4.2、接收数据

````java
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 1.创建服务端的ServerSocket对象
		ServerSocket ss = new ServerSocket(10086);
		// 2.侦听要连接到此套接字并接受它
		Socket s = ss.accept();
		// 3.获取输入流对象，读数据
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String data = new String(bys, 0, len);
		System.out.println("数据是：" + data);
		// 4.释放资源
		s.close();
		ss.close();
	}
}
````

### 8.4.3、练习

- 案例需求

客户端：数据来自于键盘录入，直到输入的数据是886，发送数据才结束

服务端：因为接收端不知道发送端什么时候停止发送，故采用死循环接收

- 代码实现：

````java
// 客户端
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 10086);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		s.close();
	}
}

// 服务端
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		ss.close();
	}
}
````

## 8.5、文件上传

### 8.5.1、单线程文件上传

客户端代码：

````java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("127.0.0.1", 10086);
		// 封装文本文件的数据
		BufferedReader br = new BufferedReader(new FileReader("src\\ClientDemo.java"));
		// 封装输出流写出数据
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// 告诉服务器上传结束
		s.shutdownOutput();
		// 接收服务器端的反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String data = brClient.readLine();
		System.out.println("服务器反馈：" + data);
		// 释放资源
		br.close();
		s.close();
	}
}
````

服务端代码：

````java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(10086);
		// 监听客户端的连接对象
		Socket s = ss.accept();
		// 获取上传文件随机名称
		String fileName = "src\\" + System.currentTimeMillis() + new Random().nextInt(999999) + ".java";
		// 保存客户端上传的数据
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName));
		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		// 给客户端发出反馈信息
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bwServer.write("文件上传成功");
		bwServer.newLine();
		bwServer.flush();
		// 释放资源
		bos.close();
		ss.close();
	}
}
````

### 8.5.2、多线程文件上传

客户端代码：

````java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("127.0.0.1", 10086);
		// 打开本地文件准备上传
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\ClientDemo.java"));
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		// 告诉服务器上传结束
		s.shutdownOutput();
		// 接收服务器端的反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String data = brClient.readLine();
		System.out.println("服务器反馈：" + data);
		// 释放资源
		bis.close();
		s.close();
	}
}
````

服务端代码：

````java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

class ServerThread implements Runnable {
	private Socket s;

	public ServerThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// 获取上传文件随机名称
			String fileName = "src\\" + System.currentTimeMillis() + new Random().nextInt(999999) + ".java";
			// 保存客户端上传的数据
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName));
			byte[] bys = new byte[1024];
			int len;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
			}
			// 给客户端发出反馈信息
			BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bwServer.write("文件上传成功");
			bwServer.newLine();
			bwServer.flush();
			// 释放资源
			bos.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		while (true) {
			Socket s = ss.accept();
			ServerThread serverThread = new ServerThread(s);
			new Thread(serverThread).start();
		}
	}
}
````

# 第九章 Lambda&方法引用

## 9.1、[Lambda](https://so.csdn.net/so/search?q=Lambda&spm=1001.2101.3001.7020)表达式

### 9.1.1、标准格式

````java
(形式参数) -> {代码块}
````

### 9.1.2、使用前提

有一个接口并且接口中有且仅有一个[抽象方法](https://so.csdn.net/so/search?q=抽象方法&spm=1001.2101.3001.7020)

### 9.1.3、常见应用

#### 9.1.3.1、无参无返回值抽象方法练习

````java
interface MyInter {
	void show();
}

public class Main {
	public static void main(String[] args) {
		myInterShow(() -> System.out.println("Hello,World"));
	}

	public static void myInterShow(MyInter mi) {
		mi.show();
	}
}
````

#### 9.1.3.2、有参无返回值抽象方法练习

````java
interface MyInter {
	void show(String s);
}

public class Main {
	public static void main(String[] args) {
		myInterShow((s) -> System.out.println(s));
	}

	public static void myInterShow(MyInter mi) {
		mi.show("Hello,World");
	}
}
````

#### 9.1.3.3、有参有返回值抽象方法练习

````java
interface MyInter {
	int show(int x, int y);
}

public class Main {
	public static void main(String[] args) {
		myInterShow((x, y) -> x + y);
	}

	public static void myInterShow(MyInter mi) {
		int show = mi.show(10, 20);
		System.out.println(show);
	}
}
````

### 9.1.4、省略模式

1. 参数类型可以省略。但是有多个参数的情况下，不能只省略一个
2. 如果参数有且仅有一个，那么小括号可以省略
3. 如果代码块的语句只有一条，可以省略大括号和分号和return关键字

### 9.1.5、注意事项

1. 使用Lambda必须要有接口并且要求接口中有且仅有一个抽象方法
2. 必须有上下文环境，才能推导出Lambda对应的接口


- 根据局部变量的赋值得知Lambda对应的接口

  ````java
  Runnable r = () -> System.out.println("Hello,World");
  ````

- 根据调用方法的参数得知Lambda对应的接口

  ````java
  new Thread(() -> System.out.println("Hello,World")).start();	
  ````

### 9.1.6、Lambda表达式和匿名内部类的区别

1. 所需类型不同
   - 匿名内部类：可以是接口，也可以是抽象类，还可以是具体类
   - Lambda表达式：只能是接口
2. 使用限制不同
   - 如果接口中有且仅有一个抽象方法，可以使用Lambda表达式，也可以使用匿名内部类
   - 如果接口中多于一个抽象方法，只能使用匿名内部类，而不能使用Lambda表达式
3. 实现原理不同
   - 匿名内部类：编译之后，产生一个单独的.class字节码文件
   - Lambda表达式：编译之后，没有一个单独的.class字节码文件，对应的字节码会在运行的时候动态生成

### 9.2、方法引用

### 9.2.1、概述

在使用Lambda表达式的时候，我们实际上传递进去的代码就是一种解决方案，拿参数做操作，如果我们在Lambda中所指定的操作方案，已经有地方存在相同方案，那是否还有必要再写重复逻辑呢？肯定是没必要，那我们又是如何使用已经存在的方案的呢？我们是通过方法引用来使用已经存在的方案

### 9.2.2、方法引用符

````java
::  该符号为引用运算符，而它所在的表达式被称为方法引用
````

### 9.2.3、省略模式

方法引用可以根据上下文进行推导，方法引用是Lambda的孪生兄弟

### 9.2.4、常见应用

#### 9.2.4.1、引用类方法

使用说明：Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数

````java
interface Converter {
	int convert(String s);
}

public class Main {
	public static void main(String[] args) {
		// Lambda写法
		useConverter(s -> Integer.parseInt(s));
		// 引用的方法
		useConverter(Integer::parseInt);
	}

	private static void useConverter(Converter c) {
		int number = c.convert("666");
		System.out.println(number);
	}
}
````

#### 9.2.4.2、引用类的实例方法

使用说明：Lambda表达式被类的实例方法替代的时候，第一个参数作为调用者，后面的参数全部传递给该方法作为参数

````java
interface MyString {
	String mySubString(String s, int x, int y);
}

public class Main {
	public static void main(String[] args) {
		// Lambda写法
		useMyString((s, x, y) -> s.substring(x, y));
		// 引用的方法
		useMyString(String::substring);
	}

	private static void useMyString(MyString my) {
		String s = my.mySubString("HelloWorld", 2, 5);
		System.out.println(s);
	}
}
````

#### 9.2.4.3、引用对象的实例方法

使用说明：Lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数

````java
class PrintString {
	public void printUpper(String s) {
		String result = s.toUpperCase();
		System.out.println(result);
	}
}

interface Printer {
	void printUpperCase(String s);
}

public class Main {
	public static void main(String[] args) {
		// Lambda写法
		usePrinter(s -> System.out.println(s.toUpperCase()));
		// 引用的方法
		PrintString ps = new PrintString();
		usePrinter(ps::printUpper);
	}

	private static void usePrinter(Printer p) {
		p.printUpperCase("HelloWorld");
	}
}
````

#### 9.2.4.4、引用构造器方法

使用说明：Lambda表达式被构造器替代的时候，它的形式参数全部传递给构造器作为参数

````java
class Student {
	private String name;
	private int age;

	public Student() {}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

interface StudentBuilder {
	Student build(String name, int age);
}

public class Main {
	public static void main(String[] args) {
		// Lambda写法
		useStudentBuilder((name, age) -> new Student(name, age));
		// 引用的写法
		useStudentBuilder(Student::new);
	}

	private static void useStudentBuilder(StudentBuilder sb) {
		Student s = sb.build("林青霞", 30);
		System.out.println(s.getName() + "," + s.getAge());
	}
}
````

# 第十章 函数式接口&Stream流

## 10.1、[函数式接口](https://so.csdn.net/so/search?q=函数式接口&spm=1001.2101.3001.7020)

### 10.1.1、概述

有且仅有一个[抽象方法](https://so.csdn.net/so/search?q=抽象方法&spm=1001.2101.3001.7020)的接口，并且可以通过在类上标注@FunctionalInterface注解进行检测，建议自定义的函数式接口都加上这个注解

### 10.1.2、函数式接口作为方法的参数

````java
public class Main {
	public static void main(String[] args) {
		// 匿名内部类的方式
		startThread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "线程启动了");
			}
		});
		// Lambda表达式方式
		startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动了"));
	}

	private static void startThread(Runnable r) {
		new Thread(r).start();
	}
}
````

### 10.1.3、函数式接口作为方法的返回值

````java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("cccc");
		array1.add("aaa");
		array1.add("bb");
		array1.add("d");
		System.out.println("排序前：" + array1);
		Collections.sort(array1, getComparator1());
		System.out.println("排序后：" + array1);

		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("cccc");
		array2.add("aaa");
		array2.add("bb");
		array2.add("d");
		System.out.println("排序前：" + array2);
		Collections.sort(array2, getComparator2());
		System.out.println("排序后：" + array2);
	}

	// 匿名内部类的方式实现
	private static Comparator<String> getComparator1() {
		return new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
	}

	// Lambda表达式方式实现
	private static Comparator<String> getComparator2() {
		return (s1, s2) -> s1.length() - s2.length();
	}
}
````

### 10.1.4、四大内置核心函数式接口

![](/四大内置核心函数式接口.png)

#### 10.1.4.1、Supplier接口

````java
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		String s = getString(() -> "林青霞");
		System.out.println(s);
		Integer i = getInteger(() -> 30);
		System.out.println(i);
	}

	// 定义一个方法，返回一个整数数据
	private static Integer getInteger(Supplier<Integer> sup) {
		return sup.get();
	}

	// 定义一个方法，返回一个字符串数据
	private static String getString(Supplier<String> sup) {
		return sup.get();
	}
}
````

#### 10.1.4.2、Consumer接口

````java
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		operatorString("林青霞", s -> System.out.println(s));
		operatorString("林青霞", s -> System.out.println(new StringBuilder(s).reverse().toString()));
		operatorString("林青霞", 
				s -> System.out.println(s),
				s -> System.out.println(new StringBuilder(s).reverse().toString()));
	}
	
	// 定义一个方法，消费同一个字符串数据两次
	private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
		// con1.accept(name);
		// con2.accept(name);
		con1.andThen(con2).accept(name);
	}

	// 定义一个方法，消费同一个字符串数据一次
	private static void operatorString(String name, Consumer<String> con) {
		con.accept(name);
	}
}
````

#### 10.1.4.3、Predicate接口

````java
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		boolean b1 = checkString("helloworld", s -> s.length() > 8);
		System.out.println(b1);
		boolean b2 = checkStringNot("helloworld", s -> s.length() > 8);
		System.out.println(b2);
		boolean b3 = checkStringAnd("helloworld", s -> s.length() > 8, s -> s.length() < 10);
		System.out.println(b3);
		boolean b4 = checkStringOr("helloworld", s -> s.length() > 8, s -> s.length() < 10);
		System.out.println(b4);
	}

	// 定义一个方法，对给定的参数进行判断
	private static boolean checkString(String s, Predicate<String> pre) {
		return pre.test(s);
	}

	// 定义一个方法，返回一个逻辑的否定，对应逻辑非
	private static boolean checkStringNot(String s, Predicate<String> pre) {
		return pre.negate().test(s);
	}

	// 定义一个方法，返回一个组合判断，对应短路与
	private static boolean checkStringAnd(String s, Predicate<String> pre1, Predicate<String> pre2) {
		return pre1.and(pre2).test(s);
	}

	// 定义一个方法，返回一个组合判断，对应短路或
	private static boolean checkStringOr(String s, Predicate<String> pre1, Predicate<String> pre2) {
		return pre1.or(pre2).test(s);
	}
}
````

#### 10.1.4.4、Function接口

````java
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		convert("100", s -> Integer.parseInt(s));
		convert(100, i -> String.valueOf(i));
		convert("100", s -> Integer.parseInt(s), i -> String.valueOf(i));
	}

	// 定义一个方法，把一个字符串转换为int类型，在控制台输出
	private static void convert(String s, Function<String, Integer> fun) {
		int i = fun.apply(s);
		System.out.println(i);
	}

	// 定义一个方法，把一个int类型转换为字符串，在控制台输出
	private static void convert(int i, Function<Integer, String> fun) {
		String s = fun.apply(i);
		System.out.println(s);
	}

	// 定义一个方法，把一个字符串转换为int类型，把一个int类型转换为字符串，在控制台输出
	private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
		String ss = fun1.andThen(fun2).apply(s);
		System.out.println(ss);
	}
}
````

## 10.2、[Stream](https://so.csdn.net/so/search?q=Stream&spm=1001.2101.3001.7020)流

### 10.2.1、概述

流（Stream）是数据渠道，用于操作数据源（集合、数组等）所生成的元素序列。集合讲的是数据，流讲的是计算

### 10.2.2、操作步骤

1. 获流对象：一个数据源（如：集合、数组），获取一个流（如：串行流、并行流、无限流）

   ````java
   import java.util.ArrayList;
   import java.util.Arrays;
   import java.util.HashMap;
   import java.util.HashSet;
   import java.util.List;
   import java.util.Map;
   import java.util.Map.Entry;
   import java.util.Set;
   import java.util.UUID;
   import java.util.stream.DoubleStream;
   import java.util.stream.IntStream;
   import java.util.stream.LongStream;
   import java.util.stream.Stream;
   
   public class Main {
   	public static void main(String[] args) {
   		// Collection体系的集合直接生成流
   		List<String> list = new ArrayList<String>();
   		Stream<String> listStream = list.stream();// 顺序流
   		Stream<String> parallelListStream = list.parallelStream(); // 并行流
   		Set<String> set = new HashSet<String>();
   		Stream<String> setStream = set.stream();// 顺序流
   		Stream<String> parallelSetStream = set.parallelStream();// 并行流
   
   		// Map体系的集合间接生成流
   		Map<String, Integer> map = new HashMap<String, Integer>();
   		Stream<String> keyStream = map.keySet().stream();// 顺序流
   		Stream<String> parallelKeyStream = map.keySet().parallelStream();// 并行流
   		Stream<Integer> valueStream = map.values().stream();// 顺序流
   		Stream<Integer> parallelValueStream = map.values().parallelStream();// 并行流
   		Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();// 顺序流
   		Stream<Entry<String, Integer>> parallelEntryStreamStream = map.entrySet().parallelStream();// 并行流
   
   		// 数组可以通过Arrays类的静态方法Arrays.stream(T[] array)生成流
   		int[] intArray = { 10, 20, 30 };
   		IntStream intStream = Arrays.stream(intArray);// 顺序流
   		IntStream parallelIntStream = intStream.parallel();// 并行流
   		long[] longArray = { 10L, 20L, 30L };
   		LongStream longStream = Arrays.stream(longArray);// 顺序流
   		LongStream parallelLongStream = longStream.parallel();// 并行流
   		double[] doubleArray = { 10.1, 20.2, 30.3 };
   		DoubleStream doubleStream = Arrays.stream(doubleArray);// 顺序流
   		DoubleStream parallelDoubleStream = doubleStream.parallel();// 并行流
   
   		// 数组可以通过Stream接口的静态方法Stream.of(T... values)生成流
   		Stream<String> strArrayStream = Stream.of("hello", "world", "java");// 顺序流
   		Stream<String> parallelStrArrayStream = strArrayStream.parallel();// 并行流
   		Stream<Integer> intArrayStream = Stream.of(10, 20, 30);// 顺序流
   		Stream<Integer> parallelIntArrayStream = intArrayStream.parallel();// 并行流
   		Stream<Long> longArrayStream = Stream.of(10L, 20L, 30L);// 顺序流
   		Stream<Long> parallelLongArrayStream = longArrayStream.parallel();// 并行流
   		Stream<Double> doubleArrayStream = Stream.of(10.1, 20.2, 30.3);// 顺序流
   		Stream<Double> parallelDoubleArrayStream = doubleArrayStream.parallel();// 并行流
   
   		// 创建无限流
   		Stream<Integer> iterateStream = Stream.iterate(0, i -> i + 2);
   		iterateStream.limit(10).forEach(System.out::println);
   		Stream<UUID> generateStream = Stream.generate(UUID::randomUUID);
   		generateStream.limit(10).forEach(System.out::println);
   	}
   }
   ````

   

2. 中间操作：一个中间操作链，对数据源的数据进行处理

   - filter()
   - limit()
   - skip()
   - distinct()
   - sorted()
   - map()
   - mapToInt()
   - mapToLong()
   - mapToDouble()
   - flatMap()
   - flatMapToInt()
   - flatMapToLong()
   - flatMapToDouble()
   - peek()

3. 终止操作：一个终止操作，执行中间操作链并产生结果

   - forEach()
   - forEachOrdered()
   - count()
   - min()
   - max()
   - reduce()
   - collect()
   - toArray()
   - findFirst()
   - findAny()
   - anyMatch()
   - allMatch()
   - noneMatch()

### 10.2.3、代码演示

**filter代码演示：**

````java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 创建一个集合，存储多个字符串元素
		ArrayList<String> list = new ArrayList<String>();
		list.add("林青霞");
		list.add("张曼玉");
		list.add("王祖贤");
		list.add("柳岩");
		list.add("张敏");
		list.add("张无忌");
		// 需求1：把list集合中以张开头的元素在控制台输出
		list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
		System.out.println("----------");
		// 需求2：把list集合中长度为3的元素在控制台输出
		list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
		System.out.println("----------");
		// 需求3：把list集合中以张开头的且长度为3的元素在控制台输出
		list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
	}
}
````

**limit&skip代码演示：**

````java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 创建一个集合，存储多个字符串元素
		ArrayList<String> list = new ArrayList<String>();
		list.add("林青霞");
		list.add("张曼玉");
		list.add("王祖贤");
		list.add("柳岩");
		list.add("张敏");
		list.add("张无忌");
		// 需求1：取前3个数据在控制台输出
		list.stream().limit(3).forEach(System.out::println);
		System.out.println("----------");
		// 需求2：跳过3个元素，把剩下的元素在控制台输出
		list.stream().skip(3).forEach(System.out::println);
		System.out.println("----------");
		// 需求3：跳过2个元素，把剩下的元素中前2个在控制台输出
		list.stream().skip(2).limit(2).forEach(System.out::println);
	}
}
````

**distinct代码演示：**

````java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 创建一个集合，存储多个字符串元素
		ArrayList<String> list = new ArrayList<String>();
		list.add("林青霞");
		list.add("林青霞");
		list.add("张曼玉");
		list.add("张曼玉");
		list.add("王祖贤");
		list.add("王祖贤");
		list.add("柳岩");
		list.add("柳岩");
		list.add("张敏");
		list.add("张敏");
		list.add("张无忌");
		list.add("张无忌");
		// 需求1：把集合元素在控制台输出，要求字符串元素不能重复
		list.stream().distinct().forEach(System.out::println);
	}
}
````

**sorted代码演示：**

````java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 创建一个集合，存储多个字符串元素
		ArrayList<String> list = new ArrayList<String>();
		list.add("linqingxia");
		list.add("zhangmanyu");
		list.add("wangzuxian");
		list.add("liuyan");
		list.add("zhangmin");
		list.add("zhangwuji");
		// 需求1：按照字母顺序把数据在控制台输出
		list.stream().sorted().forEach(System.out::println);
		System.out.println("----------");
		// 需求2：按照字符串长度把数据在控制台输出
		list.stream().sorted((s1, s2) -> {
			int num1 = s1.length() - s2.length();
			int num2 = num1 == 0 ? s1.compareTo(s2) : num1;
			return num2;
		}).forEach(System.out::println);
	}
}
````

**map&mapToInt&mapToLong&mapToDouble代码演示:**

````java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 创建一个集合，存储多个字符串元素
		ArrayList<String> list = new ArrayList<String>();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		// 需求1：将集合中的字符串数据转换为整数之后在控制台输出
		list.stream().map(Integer::parseInt).forEach(System.out::println);
		System.out.println("----------");
		// 需求2：将集合中的字符串数据转换为Integer之后在控制台输出
		list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
		System.out.println("----------");
		// 需求3：将集合中的字符串数据转换为Long之后在控制台输出
		list.stream().mapToLong(Long::parseLong).forEach(System.out::println);
		System.out.println("----------");
		// 需求4：将集合中的字符串数据转换为Double之后在控制台输出
		list.stream().mapToDouble(Double::parseDouble).forEach(System.out::println);
	}
}
````

**forEach&forEachOrdered&count代码演示：**

````java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 创建一个集合，存储多个字符串元素
		ArrayList<String> list = new ArrayList<String>();
		list.add("林青霞");
		list.add("张曼玉");
		list.add("王祖贤");
		list.add("柳岩");
		list.add("张敏");
		list.add("张无忌");
		// 需求1：把集合中的元素在控制台输出
		list.stream().forEach(System.out::println);
		System.out.println("----------");
		// 需求2：把集合中的元素在控制台输出
		list.stream().forEachOrdered(System.out::println);
		System.out.println("----------");
		// 需求3：统计集合中有几个以张开头的元素，并把统计结果在控制台输出
		long count = list.stream().filter(s -> s.startsWith("张")).count();
		System.out.println(count);
	}
}
````

**max&min代码演示：**

````java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 创建一个集合，存储多个整数元素
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// 需求1：获取集合中的最大值在控制台输出
		Integer max = list.stream().max(Integer::compareTo).get();
		System.out.println(max);
		// 需求2：获取集合中的最小值在控制台输出
		Integer min = list.stream().min(Integer::compareTo).get();
		System.out.println(min);
	}
}
````

# 第十一章 容器类&新日期时间

## 11.1、Optional 容器类

### 11.1.1、概述

Optional 类是一个容器类，代表一个值存在或不存在， 原来用 null 表示一个值不存在，现在 Optional类 可以更好的表达这个概念并且可以避免[空指针异常](https://so.csdn.net/so/search?q=空指针异常&spm=1001.2101.3001.7020)

### 11.1.2、常用方法

````java
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		// 创建一个 Optional 实例
		Optional<String> op1 = Optional.of("Hello,World");

		// 创建一个空的 Optional 实例
		Optional<Object> op2 = Optional.empty();

		// 若参数不为 null，创建 Optional 实例，否则创建空实例
		Optional<Object> op3 = Optional.ofNullable(null);

		// 判断是否包含值
		boolean isPresent = op1.isPresent();
		System.out.println(isPresent);

		// 如果调用对象包含值，返回该值，否则返回参数
		Object orElse = op2.orElse("Hello,World");
		System.out.println(orElse);

		// 如果调用对象包含值，返回该值，否则返回 s 获取的值
		Object orElseGet = op3.orElseGet(() -> 10 + 20);
		System.out.println(orElseGet);

		// 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
		Optional<String> op4 = op1.map((s) -> s.toUpperCase());
		System.out.println(op4.get());
	}
}
````

## 11.2、新日期时间

### 11.2.1、概述

Java 的 java.util.Date 和 java.util.Calendar 类易用性差，不支持时区，而且都不是线程安全的，Java 8的日期和时间类包含 LocalDate、LocalTime、LocalDateTime、Instant、Duration 以及 Period，这些类都包含在 java.time 包中，它们是线程安全的，LocalDate 只会获取年月日，LocalTime 只会获取时分秒，LocalDateTime 获取年月日时分秒，相当于 LocalDate + LocalTime，推荐使用LocalDateTime

### 11.2.2、LocalDate类

描述：本地日期，可以获取年、月、日、星期几
````java
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Main {
	public static void main(String[] args) {
		// 静态方法，获取当前年月日
		LocalDate localDate = LocalDate.now();

		// 静态方法，构造指定年月日
		LocalDate localDate1 = LocalDate.of(2019, 9, 12);

		// 获取年、月、日、星期几
		int year = localDate.getYear();
		Month month = localDate.getMonth();
		int day = localDate.getDayOfMonth();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(dayOfWeek);
		System.out.println("----------");

		// 获取年、月、日、星期几
		int year1 = localDate.get(ChronoField.YEAR);
		int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
		int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
		int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
		System.out.println(year1);
		System.out.println(month1);
		System.out.println(day1);
		System.out.println(dayOfWeek1);
	}
}
````

### 11.2.3、LocalTime类

描述：本地时间，可以获取时、分、秒

````java
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Main {
	public static void main(String[] args) {
		// 静态方法，获取当前时分秒
		LocalTime localTime = LocalTime.now();
		// 静态方法，获取指定时分秒
		LocalTime localTime1 = LocalTime.of(14, 14, 14);

		// 获取时、分、秒
		int hour = localTime.getHour();
		int minute = localTime.getMinute();
		int second = localTime.getSecond();
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println("----------");

		// 获取时、分、秒
		int hour1 = localTime.get(ChronoField.HOUR_OF_DAY);
		int minute1 = localTime.get(ChronoField.MINUTE_OF_HOUR);
		int second1 = localTime.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(hour1);
		System.out.println(minute1);
		System.out.println(second1);
		System.out.println("----------");
	}
}
````

### 11.2.4、LocalDateTime类

描述：本地日期时间，可以获取年、月、日、时、分、秒、纳秒

````java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		// 静态方法，根据当前时间创建对象
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println("----------");

		// 静态方法，根据指定时间创建对象
		LocalDateTime ld2 = LocalDateTime.of(2015, 10, 10, 01, 02, 03);
		System.out.println(ld2);
		System.out.println("----------");

		/**
		 * plusYears plusMonths plusWeeks plusDays
		 */
		LocalDateTime ldt3 = ld2.plusYears(20);
		System.out.println(ldt3);
		System.out.println("----------");

		/**
		 * minusYears minusMonths minusWeeks minusDays
		 */
		LocalDateTime ldt4 = ld2.minusMonths(2);
		System.out.println(ldt4);
		System.out.println("----------");

		System.out.println(ldt.getYear());// 年
		System.out.println(ldt.getMonthValue());// 月
		System.out.println(ldt.getDayOfMonth());// 日
		System.out.println(ldt.getHour());// 时
		System.out.println(ldt.getMinute());// 分
		System.out.println(ldt.getSecond());// 秒
		System.out.println(ldt.getNano());// 纳秒
		System.out.println("----------");

		// 获取LocalDate
		LocalDate localDate = ldt.toLocalDate();
		System.out.println(localDate.now());
		System.out.println("----------");
		
		// 获取LocalTime
		LocalTime localTime = ldt.toLocalTime();
		System.out.println(localTime.now());
		System.out.println("----------");
	}
}
````

### 11.2.5、Instant类

描述：时间戳，可以获取秒、毫秒、纳秒

````java
import java.time.Instant;

public class Main {
	public static void main(String[] args) {
		// 创建Instant对象
		Instant instant = Instant.now();
		
		// 获取秒数
		long currentSecond = instant.getEpochSecond();
		System.out.println(currentSecond);
		
		// 获取毫秒数
		long currentMilli = instant.toEpochMilli();
		System.out.println(currentMilli);
		
		// 获取纳秒数
		int currentNano = instant.getNano();
		System.out.println(currentNano);
	}
}
````

### 11.2.6、Period类

描述：用于计算两个“日期”间隔，可以获取年、月、天、总月

````java
import java.time.LocalDate;
import java.time.Period;

public class Main {
	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2020, 1, 21);

		Period period = Period.between(ld2, ld1);
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		long totalMonths = period.toTotalMonths();

		System.out.println(years);// 年
		System.out.println(months);// 月
		System.out.println(days);// 天
		System.out.println(totalMonths);// 总月
	}
}
````

### 11.2.7、Duration类

描述：用于计算两个“时间”间隔，可以获取天、时、时、分、秒、毫秒、纳秒

````java
import java.time.Duration;
import java.time.Instant;

public class Main {
	public static void main(String[] args) {
		Instant ins1 = Instant.now();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Instant ins2 = Instant.now();

		Duration duration = Duration.between(ins1, ins2);
		long days = duration.toDays();// 天
		long hours = duration.toHours();// 时
		long minutes = duration.toMinutes();// 分
		long seconds = duration.getSeconds();// 秒
		long millis = duration.toMillis();// 毫秒
		long nanos = duration.toNanos();// 纳秒

		System.out.println(days);
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		System.out.println(millis);
		System.out.println(nanos);
	}
}
````

### 11.2.8、时间校正器

描述：TemporalAdjusters 包含许多静态方法，可以直接调用

| 方法名                      | 描述                                                        |
| --------------------------- | ----------------------------------------------------------- |
| dayOfWeekInMonth            | 返回同一个月中每周的第几天                                  |
| firstDayOfMonth             | 返回当月的第一天                                            |
| firstDayOfNextMonth         | 返回下月的第一天                                            |
| firstDayOfNextYear          | 返回下一年的第一天                                          |
| firstDayOfYear              | 返回本年的第一天                                            |
| firstInMonth                | 返回同一个月中第一个星期几                                  |
| lastDayOfMonth              | 返回当月的最后一天                                          |
| lastDayOfNextMonth          | 返回下月的最后一天                                          |
| lastDayOfNextYear           | 返回下一年的最后一天                                        |
| lastDayOfYear               | 返回本年的最后一天                                          |
| lastInMonth                 | 返回同一个月中最后一个星期几                                |
| next / previous             | 返回后一个/前一个给定的星期几                               |
| nextOrSame / previousOrSame | 返回后一个/前一个给定的星期几，如果这个值满足条件，直接返回 |

````java
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Main {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2020, Month.JULY, 21, 12, 30, 32);
		// 增加一年
		localDateTime = localDateTime.plusYears(1);
		localDateTime = localDateTime.plus(1, ChronoUnit.YEARS);
		System.out.println(localDateTime);
		System.out.println("----------");

		// 减少一年
		localDateTime = localDateTime.minusYears(1);
		localDateTime = localDateTime.minus(1, ChronoUnit.YEARS);
		System.out.println(localDateTime);
		System.out.println("----------");

		// 指定年份
		localDateTime = localDateTime.withYear(2020);
		localDateTime = localDateTime.with(ChronoField.YEAR, 2020);
		System.out.println(localDateTime);
		System.out.println("----------");

		// 获取该年的第一天
		localDateTime = localDateTime.with(TemporalAdjusters.firstDayOfYear());
		System.out.println(localDateTime);
		System.out.println("----------");

		// 自定义：下一个工作日
		localDateTime = localDateTime.with((l) -> {
			LocalDateTime ldt = (LocalDateTime) l;
			DayOfWeek dow = ldt.getDayOfWeek();
			if (dow.equals(DayOfWeek.FRIDAY)) {
				return ldt.plusDays(3);
			} else if (dow.equals(DayOfWeek.SATURDAY)) {
				return ldt.plusDays(2);
			} else {
				return ldt.plusDays(1);
			}
		});
		System.out.println(localDateTime);
		System.out.println("----------");
	}
}
````

### 11.2.9、格式化时间

描述：通过localDate.format方法格式化，格式可以是内置的也可以是自定义的

````java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2020, 05, 05);

		// 内置格式
		String s1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(s1);

		// 自定义格式
		String s2 = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(s2);
	}
}
````

### 11.2.10、解析时间

描述：通过LocalDate.parse方法解析，格式可以是内置的也可以是自定义的

````java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		// 内置格式
		LocalDate localDate1 = LocalDate.parse("2019-09-12", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localDate1);

		// 自定义格式
		LocalDate localDate2 = LocalDate.parse("2019-09-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(localDate2);
	}
}
````

### 11.2.11、带时区的日期或时间

描述：ZonedDate、ZonedTime、ZonedDateTime

````java
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
		System.out.println(zdt);
	}
}
````

# 第十二章 类加载器&反射

## 12.1、类加载器

### 12.1.1、类加载

当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过类的加载、类的连接、类的初始化这三个步骤来对类进行初始化。如果不出现意外情况，JVM将会连续完成这三个步骤，所以有时也把这三个步骤统称为类加载或者类初始化

### 12.1.2、类初始化过程

类的加载
就是指将class文件读入内存，并为之创建一个java.lang.Class对象
任何类被使用时，系统都会为之建立一个java.lang.Class对象
类的连接
验证阶段：用于检验被加载的类是否有正确的内部结构并和其它类协调一致
准备阶段：负责为类的类变量分配内存并设置默认初始化值
解析阶段：将类的二进制数据中的符号引用替换为直接引用
类的初始化：在该阶段，主要就是对类变量进行初始化
假如类还未被加载和连接，则程序先加载并连接该类
假如该类的直接父类还未被初始化，则先初始化其直接父类
假如类中有初始化语句，则系统依次执行这些初始化语句
注意：在执行第2个步骤的时候，系统对直接父类的初始化步骤也遵循初始化步骤1-3

### 12.1.3、类初始化时机

1. 创建类的实例
2. 调用类的方法
3. 访问类、接口的变量或者为该类变量赋值
4. 使用反射方式来强制创建某个类或接口对应的java.lang.Class对象
5. 初始化某个类的子类
6. 直接使用java.exe命令来运行某个主类

### 12.1.4、类加载器

概述：负责将.class文件加载到内存中并为之生成对应的 java.lang.Class 对象

- Bootstrap class loader：它是虚拟机的内置类加载器，通常表示为null 并且没有父加载器

- Platform class loader：它是平台类加载器，它可以看到所有平台类 ：包括由平台类加载器或其祖先定义的Java SE平台API，其实现类和JDK特定的运行时类

- System class loader：它是系统类加载器也被称为应用程序类加载器 ，与平台类加载器不同。 它通常用于定义应用程序类路径和JDK特定工具上的类


注意：类加载器的继承关系：System的父加载器为Platform，而Platform的父加载器为Bootstrap

### 12.1.5、类加载机制

- 全盘负责：当一个类加载器负责加载某个Class时，该Class所依赖的和引用的其他Class也将由该类加载器负责载入，除非显示使用另外一个类加载器来载入
- 父类委托：当一个类加载器负责加载某个Class时，先让父类加载器试图加载该Class，只有在父类加载器无法加载该类时才尝试从自己的类路径中加载该类

- 缓存机制：保证所有加载过的Class都会被缓存，当程序需要使用某个Class对象时，类加载器先从缓存区中搜索该Class，只有当缓存区中不存在该Class对象时，系统才会读取该类对应的二进制数据并将其转换成 Class对象存储到缓存区


### 12.1.6、ClassLoader类

````java
public class Demo {
	public static void main(String[] args) {
		ClassLoader c = ClassLoader.getSystemClassLoader();
		System.out.println(c); // AppClassLoader
		ClassLoader c2 = c.getParent();
		System.out.println(c2); // PlatformClassLoader
		ClassLoader c3 = c2.getParent();
		System.out.println(c3); // null
	}
}
````

## 12.2、反射

### 12.2.1、概述

反射是指在运行时去获取一个类的变量和方法信息，然后通过获取到的信息来创建对象，调用方法的一种机制。 由于这种动态性，可以极大的增强程序的灵活性，程序不用在编译期就完成确定，在运行期仍然可以扩展

### 12.2.2、获取Class类对象

````java
class Student {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		// 方法1：使用类的class属性来获取该类对应的Class对象
		Class<Student> c1 = Student.class;
		System.out.println(c1);
		// 方法2：调用对象的getClass()方法，返回该对象所属类对应的Class对象
		Class<? extends Student> c2 = new Student().getClass();
		System.out.println(c2);
		// 方法3：使用Class类中的静态方法forName(String className)
		Class<?> c3 = Class.forName("Student");
		System.out.println(c3);
	}
}
````

### 12.2.3、反射获取构造方法

方法描述：

| 方法                                                        | 描述                                              |
| ----------------------------------------------------------- | ------------------------------------------------- |
| public Constructor<?>[] getConstructors()                   | 返回一个包含Constructor对象的数组，不包含私有构造 |
| public Constructor getConstructor(Class<?>… parameterTypes) | 返回一个指定的Constructor对象，不包含私有构造     |
| public Constructor<?>[] getDeclaredConstructors()           | 返回一个包含Constructor对象的数组，包含私有构造   |
| public Constructor getConstructor(Class<?>… parameterTypes) | 返回一个指定的Constructor对象，包含私有构造       |

方法演示：

````java
import java.lang.reflect.Constructor;

class Student {
	// 成员变量：一个私有，一个默认，一个公共
	private String name;
	int age;
	public String address;

	// 构造方法：一个私有，一个默认，两个公共
	private Student(String name) {
		this.name = name;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 成员方法：两个私有，两个默认，两个公共
	private String getName() {
		System.out.println("getName");
		return name;
	}

	private void setName(String name) {
		System.out.println("setName:" + name);
		this.name = name;
	}

	int getAge() {
		System.out.println("getAge");
		return age;
	}

	void setAge(int age) {
		System.out.println("setAge:" + age);
		this.age = age;
	}

	public String getAddress() {
		System.out.println("getAddress");
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setAddress:" + address);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		// 获取所有公开的构造方法
		Constructor<?>[] constructors = c.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("--------------------");

		// 获取指定参数且公开的构造方法
		Constructor<Student> constructor = c.getConstructor(String.class, int.class, String.class);
		System.out.println(constructor);
		System.out.println("--------------------");

		// 获取所有权限的构造方法
		Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
		for (Constructor<?> declaredConstructor : declaredConstructors) {
			System.out.println(declaredConstructor);
		}
		System.out.println("--------------------");

		// 获取指定参数且不限的构造方法
		Constructor<Student> declaredConstructor = c.getDeclaredConstructor(String.class);
		System.out.println(declaredConstructor);
	}
}
````

### 12.2.4、反射获取成员变量

方法描述

| 方法                                       | 描述                                        |
| ------------------------------------------ | ------------------------------------------- |
| public Field[] getFields()                 | 返回一个包含Field对象的数组，不包含私有变量 |
| public Field getField(String name)         | 返回一个指定的Field对象，不包含私有变量     |
| public Field[] getDeclaredFields()         | 返回一个包含Field对象的数组，包含私有变量   |
| public Field getDeclaredField(String name) | 返回一个指定的Field对象，包含私有变量       |

方法演示：

````java
import java.lang.reflect.Field;

class Student {
	// 成员变量：一个私有，一个默认，一个公共
	private String name;
	int age;
	public String address;

	// 构造方法：一个私有，一个默认，两个公共
	private Student(String name) {
		this.name = name;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 成员方法：两个私有，两个默认，两个公共
	private String getName() {
		System.out.println("getName");
		return name;
	}

	private void setName(String name) {
		System.out.println("setName:" + name);
		this.name = name;
	}

	int getAge() {
		System.out.println("getAge");
		return age;
	}

	void setAge(int age) {
		System.out.println("setAge:" + age);
		this.age = age;
	}

	public String getAddress() {
		System.out.println("getAddress");
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setAddress:" + address);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		// 获取所有公开的成员变量
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("--------------------");

		// 获取指定名称且公开的成员变量
		Field field = c.getField("address");
		System.out.println(field);
		System.out.println("--------------------");

		// 获取所有权限的成员变量
		Field[] declaredFields = c.getDeclaredFields();
		for (Field declaredField : declaredFields) {
			System.out.println(declaredField);
		}
		System.out.println("--------------------");

		// 获取指定名称且不限的成员变量
		Field declaredField = c.getDeclaredField("name");
		System.out.println(declaredField);
	}
}
````

### 12.2.5、反射获取成员方法

方法概述：

| 方法                                                         | 描述                                             |
| ------------------------------------------------------------ | ------------------------------------------------ |
| public Method[] getMethods()                                 | 返回一个包含Method对象的数组，不包含私有成员方法 |
| public Method getMethod(String name, Class<?>… parameterTypes) | 返回一个指定的Method对象，不包含私有成员方法     |
| public Method[] getDeclaredMethods()                         | 返回一个包含Method对象的数组，包含私有成员方法   |
| public Method getDeclaredMethod(String name, Class<?>… parameterTypes) | 返回一个指定的Method对象，包含私有成员方法       |

方法演示：

````java
import java.lang.reflect.Method;

class Student {
	// 成员变量：一个私有，一个默认，一个公共
	private String name;
	int age;
	public String address;

	// 构造方法：一个私有，一个默认，两个公共
	private Student(String name) {
		this.name = name;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 成员方法：两个私有，两个默认，两个公共
	private String getName() {
		System.out.println("getName");
		return name;
	}

	private void setName(String name) {
		System.out.println("setName:" + name);
		this.name = name;
	}

	int getAge() {
		System.out.println("getAge");
		return age;
	}

	void setAge(int age) {
		System.out.println("setAge:" + age);
		this.age = age;
	}

	public String getAddress() {
		System.out.println("getAddress");
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setAddress:" + address);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		// 获取所有公开的成员方法，它反映此类或接口或从超类和超级接口继承的类的声明方法
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("--------------------");

		// 获取指定参数且公开的成员方法，它反映此类或接口或从超类和超级接口继承的类的声明方法
		Method method = c.getMethod("setAddress", String.class);
		System.out.println(method);
		System.out.println("--------------------");

		// 获取所有权限的成员方法，它反映此类或接口的声明方法
		Method[] declaredMethods = c.getDeclaredMethods();
		for (Method declaredMethod : declaredMethods) {
			System.out.println(declaredMethod);
		}
		System.out.println("--------------------");

		// 获取指定参数且不限的成员方法，它反映此类或接口的声明方法
		Method declaredMethod = c.getDeclaredMethod("setName", String.class);
		System.out.println(declaredMethod);
	}
}
````

### 12.2.6、综合案例

````java
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
	// 成员变量：一个私有，一个默认，一个公共
	private String name;
	int age;
	public String address;

	// 构造方法：一个私有，一个默认，两个公共
	private Student(String name) {
		this.name = name;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 成员方法：两个私有，两个默认，两个公共
	private String getName() {
		System.out.println("getName");
		return name;
	}

	private void setName(String name) {
		System.out.println("setName:" + name);
		this.name = name;
	}

	int getAge() {
		System.out.println("getAge");
		return age;
	}

	void setAge(int age) {
		System.out.println("setAge:" + age);
		this.age = age;
	}

	public String getAddress() {
		System.out.println("getAddress");
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setAddress:" + address);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		// 获取学生类类对象
		Class<Student> c = Student.class;
		// 通过无参构造创建
		Constructor<Student> constructor = c.getConstructor();
		Student newStudent = constructor.newInstance();
		System.out.println(newStudent);
		System.out.println("--------------------");

		// 反射设置成员变量
		Field name = c.getDeclaredField("name");
		name.setAccessible(true);
		name.set(newStudent, "张三丰");
		Field age = c.getDeclaredField("age");
		age.setAccessible(true);
		age.set(newStudent, 55);
		Field address = c.getDeclaredField("address");
		address.setAccessible(true);
		address.set(newStudent, "武当山");
		System.out.println(newStudent);
		System.out.println("--------------------");

		// 反射执行成员方法
		Method getName = c.getDeclaredMethod("getName");
		getName.setAccessible(true);
		getName.invoke(newStudent);
		Method setAge = c.getDeclaredMethod("setAge", int.class);
		setAge.setAccessible(true);
		setAge.invoke(newStudent, 60);
		System.out.println(newStudent);
	}
}
````

### 12.2.7、动态代理

````java
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface UserDao {
	public abstract void add();

	public abstract void delete();

	public abstract void update();

	public abstract void find();
}

class UserDaoImpl implements UserDao {
	@Override
	public void add() {
		System.out.println("添加功能");
	}

	@Override
	public void delete() {
		System.out.println("删除功能");
	}

	@Override
	public void update() {
		System.out.println("修改功能");
	}

	@Override
	public void find() {
		System.out.println("查找功能");
	}
}

class MyInvocationHandler implements InvocationHandler {
	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("权限校验");
		Object result = method.invoke(target, args);
		System.out.println("日志记录");
		System.out.println();
		return result;
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		UserDao ud1 = new UserDaoImpl();
		ud1.add();
		ud1.delete();
		ud1.update();
		ud1.find();
		System.out.println("----------");

		UserDao ud2 = new UserDaoImpl();
		MyInvocationHandler handler = new MyInvocationHandler(ud2);
		UserDao ud2Proxy = (UserDao) Proxy.newProxyInstance(ud2.getClass().getClassLoader(), ud2.getClass().getInterfaces(), handler);
		ud2Proxy.add();
		ud2Proxy.delete();
		ud2Proxy.update();
		ud2Proxy.find();
	}
}
````

# 第十三章 枚举类和注解

## 13.1、[枚举](https://so.csdn.net/so/search?q=枚举&spm=1001.2101.3001.7020)类

### 13.1.1、概述

概述：枚举是指将变量的值一一列出来，变量的值只限于列举出来的值的范围内。举例：一周只有7天，一年只有12个月等

格式：public [enum](https://so.csdn.net/so/search?q=enum&spm=1001.2101.3001.7020) 枚举名称 {}

### 13.1.2、自定义枚举类

#### 13.1.2.1、第一版

````java
public class Direction1 {
	// 创建几个实例
	public static final Direction1 FRONT = new Direction1();
	public static final Direction1 BEHIND = new Direction1();
	public static final Direction1 LEFT = new Direction1();
	public static final Direction1 RIGHT = new Direction1();

	// 私有构造方法
	private Direction1() {}
}
````

#### 13.1.2.2、第二版

````java
public class Direction2 {
	// 创建几个实例
	public static final Direction2 FRONT = new Direction2("前");
	public static final Direction2 BEHIND = new Direction2("后");
	public static final Direction2 LEFT = new Direction2("左");
	public static final Direction2 RIGHT = new Direction2("右");

	// 私有构造方法
	private Direction2(String name) {
		this.name = name;
	}

	// 加入成员变量
	private String name;

	public String getName() {
		return name;
	}
}
````

#### 13.1.2.3、第三版

````java
public abstract class Direction3 {
	// 创建几个实例
	public static final Direction3 FRONT = new Direction3("前") {
		@Override
		public void show() {
			System.out.println("前");
		}

	};
	public static final Direction3 BEHIND = new Direction3("后") {
		@Override
		public void show() {
			System.out.println("后");
		}

	};
	public static final Direction3 LEFT = new Direction3("左") {
		@Override
		public void show() {
			System.out.println("左");
		}

	};
	public static final Direction3 RIGHT = new Direction3("右") {
		@Override
		public void show() {
			System.out.println("右");
		}

	};

	// 加入成员变量
	private String name;

	// 私有构造方法
	private Direction3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 加入抽象方法
	public abstract void show();
}
````

#### 13.1.2.4、测试方法

````java
public class DirectionDemo {
	public static void main(String[] args) {
		Direction1 d1 = Direction1.FRONT;
		System.out.println(d1);
		System.out.println("----------");

		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("----------");

		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
	}
}
````

### 13.1.3、系统的枚举类

#### 13.1.3.1、第一版

````java
public enum Direction1 {
	FRONT, BEHIND, LEFT, RIGHT;
}
````

#### 13.1.3.2、第二版

````java
public enum Direction2 {
	FRONT("前"), BEHIND("后"), LEFT("左"), RIGHT("右");

	// 添加成员变量
	private String name;

	// 私有构造方法
	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
````

#### 13.1.3.3、第三版

````java
public enum Direction3 {
	FRONT("前") {
		@Override
		public void show() {
			System.out.println("前");
		}
	},
	BEHIND("后") {
		@Override
		public void show() {
			System.out.println("后");
		}
	},
	LEFT("左") {
		@Override
		public void show() {
			System.out.println("左");
		}
	},
	RIGHT("右") {
		@Override
		public void show() {
			System.out.println("右");
		}
	};

	// 添加成员变量
	private String name;

	// 私有构造方法
	private Direction3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 添加抽象方法
	public abstract void show();
}
````

#### 13.1.3.4、测试方法

````java
public class DirectionDemo {
	public static void main(String[] args) {
		Direction1 d1 = Direction1.FRONT;
		System.out.println(d1);
		System.out.println("-------------");

		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("-------------");

		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		System.out.println("--------------");

		Direction3 dd = Direction3.FRONT;
		switch (dd) {
		case FRONT:
			System.out.println("你选择了前");
			break;
		case BEHIND:
			System.out.println("你选择了后");
			break;
		case LEFT:
			System.out.println("你选择了左");
			break;
		case RIGHT:
			System.out.println("你选择了右");
			break;
		}
	}
}
````

### 13.1.4、常见方法

````java
public class EnumMethodDemo {
	public static void main(String[] args) {
		// int compareTo(E o)
		Direction2 d21 = Direction2.FRONT;
		Direction2 d22 = Direction2.BEHIND;
		Direction2 d23 = Direction2.LEFT;
		Direction2 d24 = Direction2.RIGHT;
		System.out.println(d21.compareTo(d24));
		System.out.println(d22.compareTo(d23));
		System.out.println(d23.compareTo(d22));
		System.out.println(d24.compareTo(d21));
		System.out.println("---------------");
		// String name()
		System.out.println(d21.name());
		System.out.println(d22.name());
		System.out.println(d23.name());
		System.out.println(d24.name());
		System.out.println("--------------");
		// int ordinal()
		System.out.println(d21.ordinal());
		System.out.println(d22.ordinal());
		System.out.println(d23.ordinal());
		System.out.println(d24.ordinal());
		System.out.println("--------------");
		// String toString()
		System.out.println(d21.toString());
		System.out.println(d22.toString());
		System.out.println(d23.toString());
		System.out.println(d24.toString());
		System.out.println("--------------");
		// <T> T valueOf(Class<T> type,String name)
		Direction2 d = Enum.valueOf(Direction2.class, "FRONT");
		System.out.println(d.getName());
		System.out.println("----------------");
		// values()
		Direction2[] directions = Direction2.values();
		for (Direction2 direction : directions) {
			System.out.println(direction + ":" + direction.getName());
		}
	}
}
````

### 13.1.5、注意事项

定义枚举类要用关键字enum
所有枚举类都是Enum的子类
枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，但是如果枚举类有其它的东西，这个分号就不能省略，建议不要省略
枚举类可以有构造器，但必须是private的，它默认的也是private的。枚举项的用法比较特殊：枚举(“”);
枚举类也可以有抽象方法，但是枚举项必须重写该方法
枚举在switch语句中的使用

## 13.2、注解

### 13.2.1、概述

Java 注解（Annotation）又称 Java 标注，是 JDK5.0 引入的一种注释机制。Java 语言中的类、方法、变量、参数和包等都可以被注解。和 Javadoc 不同，Java 注解可以通过反射获取注解内容。在编译器生成类文件时，注解可以被嵌入到字节码中。Java 虚拟机可以保留注解内容，在运行时可以获取到注解内容 。 当然它也支持自定义 Java 注解。

格式：public @interface 注解名称 {}

### 13.2.2、元注解

#### 13.2.2.1、@interface注解

使用 @interface 定义注解时，意味着它实现了 java.lang.annotation.Annotation 接口，即该注解就是一个Annotation，定义 Annotation 时，@interface 是必须的，通过 @interface 定义注解后，该注解不能继承其它的注解或接口

#### 13.2.2.2、@Inherited注解

表示允许子类继承父类中的注解

#### 13.2.2.3、@Document注解

表示将此注解包含在 javadoc 中

#### 13.2.2.4、@Target注解

表示该注解目标

- ElemenetType.CONSTRUCTOR 构造器声明
- ElemenetType.FIELD 域声明
- ElemenetType.LOCAL_VARIABLE 局部变量声明
- ElemenetType.METHOD 方法声明
- ElemenetType.PACKAGE 包声明
- ElemenetType.PARAMETER 参数声明
- ElemenetType.TYPE 类、接口、枚举、注解声明

#### 13.2.2.5、@Retention注解

表示该注解的生命周期

- RetentionPolicy.SOURCE 源码期间有效
- RetentionPolicy.CLASS 编译期间有效
- RetentionPolicy.RUNTIME 运行期间有效

### 13.2.3、参数成员

1. 参数成员只能用public或默认(default)这两个访问权修饰
2. 参数成员只能用八种基本数据类型(byte,short,int,long,float,double,char,boolean)和String、Enum、Class、Annotations等类型以及这些类型的一维数组

### 13.2.4、常见注解

````java
@Inherited 只能被用来标注“Annotation类型”，它所标注的Annotation具有继承性。
@Documented 所标注内容，可以出现在javadoc中。
@Target 只能被用来标注“Annotation类型”，而且它被用来指定Annotation的ElementType属性。
@Retention 只能被用来标注“Annotation类型”，而且它被用来指定Annotation的RetentionPolicy属性。
@Deprecated 所标注内容，不再被建议使用。
@Override 只能标注方法，表示该方法覆盖父类中的方法。
@SuppressWarnings 所标注内容产生的警告，编译器会对这些警告保持静默。
@FunctionalInterface 所标注接口代表是一个函数式接口。
````

### 13.2.5、综合案例

第一步：创建自定义注解，MyTest.java

````java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTest {
	public long timeout() default -1;
}
````

第二步：创建待测试模块，UserDao.java

````java
public class UserDao {
	static {
		System.out.println("静态代码块执行了");
	}

	@MyTest
	public void addUser() {
		System.out.println("增加用户");
	}

	@MyTest
	public void delUser() {
		System.out.println("删除用户");
	}

	@MyTest
	public void uptUser() {
		System.out.println("更新用户");
	}

	@MyTest
	public void getUser() {
		System.out.println("获取用户");
	}
}
````

第三步：反射执行方法，MyJunit.java

````java
import java.lang.reflect.Method;

public class MyJunit {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件
		Class<UserDao> clazz = UserDao.class;

		// 获取所有的方法
		Method[] mds = clazz.getMethods();

		// 遍历所有的方法
		for (Method md : mds) {
			if (md.isAnnotationPresent(MyTest.class)) {
				md.invoke(new UserDao());
			}
		}
	}
}
````

# 第十四章 JDK新特性回顾

## 14.1、JDK5新特性回顾

1. 自动装箱、拆箱
2. 静态导入
3. 增强for循环
4. 可变参数
5. 枚举
6. 泛型
7. 元数据

## 14.2、JDK7新特性回顾

1. 对Java集合（Collections）的增强支持
2. 在switch中可用String
3. 数值可加下划线
4. 支持二进制文字
5. 泛型简化
6. 异常的多个catch合并
7. 自动资源管理

## 14.3、JDK8新特性回顾

1. Lambda表达式
2. 函数式接口
3. 方法引用与构造器引用
4. Stream API
5. Optional容器类
6. 接口中的默认方法与静态方法
7. 新时间日期 API
8. 重复注解

