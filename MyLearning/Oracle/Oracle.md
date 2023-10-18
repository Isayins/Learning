---
typora-root-url: img
---

# 第一章 数据库概述

## 1.1、数据库的好处

1. 将数据持久化到本地
2. 提供结构化查询功能

## 1.2、数据库的常见概念

1. DB：数据库，存储数据的仓库
2. DBMS：数据库管理系统，又称为数据库软件或者数据库产品，用于创建和管理数据库，常见的有MySQL、Oracle、SQL Server
3. DBS：数据库系统，数据库系统是一个通称，包括数据库、数据库管理系统、数据库管理人员等，是最大的范畴
4. SQL：结构化查询语言，用于和数据库通信的语言，不是某个数据库软件特有的，而是几乎所有的主流数据库软件通用的语言

## 1.3、数据库的存储特点

1. 数据存放到表中，然后表再放到库中
2. 一个库中可以有多张表，每张表具有唯一的表名用来标识自己
3. 表中有一个或多个列，列又称为“字段”，相当于Java中“属性”
4. 表中的每一行数据，相当于Java中“对象”

## 1.4、数据库的常见分类

1. 关系型数据库：MySQL、Oracle、DB2、SQL Server

2. 非关系型数据库：

   - 键值存储数据库：Redis、Memcached、MemcacheDB

   - 列存储数据库：HBase、Cassandra

   - 面向文档的数据库：MongDB、CouchDB

   - 图形数据库：Neo4J

## 1.5、SQL语言的分类

1. DQL：数据查询语言：select、from、where
2. DCL：数据控制语言：grant、revoke
3. DDL：数据定义语言：create、alter、drop、truncate
4. DML：数据操作语言：insert、update、delete
5. TCL：事务控制语言：commit、rollback

# 第二章 Oracle概述

## 2.1、Oracle的概述

Oracle Database，又名Oracle RDBMS，或简称Oracle。是甲骨文公司的一款关系数据库管理系统。它是在数据库领域一直处于领先地位的产品。可以说Oracle数据库系统是目前世界上流行的关系数据库管理系统，系统可移植性好、使用方便、功能强，适用于各类大、中、小、微机环境。它是一种高效率、可靠性好的、适应高吞吐量的数据库方案

## 2.2、Oracle的下载

课程使用：Windows 10

官网地址：[Oracle 11gR2](https://www.oracle.com/cn/database/technologies/oracle-database-software-downloads.html--11g)

![](D:\MyLearning\CentOS\img\Oracle1.png)

![](D:\MyLearning\CentOS\img\Oracle2.png)

![](D:\MyLearning\CentOS\img\Oracle3.png)

## 2.3、Oracle的安装

![](D:\MyLearning\CentOS\img\Oracle4.png)

![](D:\MyLearning\CentOS\img\Oracle5.png)

![](D:\MyLearning\CentOS\img\Oracle7.png)

![](D:\MyLearning\CentOS\img\Oracle8.png)

![](D:\MyLearning\CentOS\img\Oracle9.png)

![](D:\MyLearning\CentOS\img\Oracle10.png)

![](D:\MyLearning\CentOS\img\Oracle11.png)

![](D:\MyLearning\CentOS\img\Oracle12.png)

![](D:\MyLearning\CentOS\img\Oracle13.png)

![]()![Oracle14](D:\MyLearning\CentOS\img\Oracle14.png)

![](D:\MyLearning\CentOS\img\Oracle15.png)

![](D:\MyLearning\CentOS\img\Oracle16.png)

![](D:\MyLearning\CentOS\img\Oracle17.png)

![](D:\MyLearning\CentOS\img\Oracle18.png)

## 2.4、Oracle的目录

1. admin目录
   描述：记录Oracle实例的配置，运行日志等文件，每一个实例一个目录，SID：SystemIDentifier的缩写，是Oracle实例的唯一标记，在Oracle中一个实例只能操作一个数据库，如果安装多个库那么就会有多个实例，我们可以通过实例SID来区分。

2. cfgtoollogs目录
   描述：下面子目录分别存放当运行dbca，emca，netca等图形化配置程序时的log。

3. checkpoints目录
   描述：存放检查点文件。

4. diag目录
   描述：Oracle11g添加的一个重组目录，其中的子目录，基本上Oracle每个组件都有了自己的单独目录，在Oracle10g中我们诟病的log文件散放在四处的问题终于得到解决，无论是asm还是crs还是rdbms，所有组件需要被用来诊断的log文件都存放在这个新的目录下。

5. flash_recovery_area(闪回区)目录
   描述：分配一个特定的目录位置来存放一些特定的恢复文件，用于集中和简化管理数据库恢复工作。闪回区可存储完全的数据文件备份，增量备份、数据文件副本、当前控制文件、备份的控制文件、spfile文件、快照控制文件、联机日志文件、归档日志、块跟踪文件、闪回日志。

6. oradata目录

   描述：存放数据文件。

   - CONTROL01.CTL

     描述：Oracle数据库的控制文件

   - EXAMPLE01.DBF

     描述：Oracle数据库表空间文件

   - REDO01.LOG

     描述：Oracle数据库的重做日志文件，此文件有三个

   - SYSAUX01.DBF

     描述：11g新增加的表空间，主要存储除数据字典以外的其他数据对象，由系统内部自动维护

   - SYSTEM01.DBF

     描述：用于存放Oracle系统内部表和数据字典的数据。比如：表名、列名、用户名等

   - TEMP01.DBF

     描述：临时表空间文件

   - UNDOTBS01.DBF

     描述：撤销表空间文件，用来保存回滚数据

   - USERS01.DBF

     描述：用户表空间

   - product目录

     描述：数据库实例存放文件。

## 2.5、Oracle的配置

前方高能：如果你是把Oracle 11gR2直接安装到本地电脑上的，这一章，你就直接跳过吧！

注意事项：如果你是把Oracle 11gR2安装到了服务器中，那么你要想客户端远程访问，接下来的这些步骤，请你仔细阅读！

客户端为了和服务器连接，必须先和服务器上的监听进程联络。ORACLE通过tnsnames.ora文件中的连接描述符来说明连接信息。一般tnsnames.ora 是建立在客户端上的。如果是客户端/服务器结构，整个网络上只有一台机器安装了ORACLE数据库服务器，那么只需在每个要访问ORACLE服务器的客户端上定义该文件，在服务器上无需定义。也就是说，如果客户端想连接到服务器上的Oracle数据库实例，客户端就必须有tnsnames.ora这个文件。一般在Oracle数据库安装的时候，它就会生成一个listener.ora（监听器配置文件）、tnsnames.ora（网络服务名配置文件），因为我们现在已经将Oracle安装到本地了，并没有安装到服务器上，为了能够测试连接服务器是否需要tnsnames.ora文件，我们假设D:\Oracle是服务器上的一个目录，D:\Oracle以外都是客户端的目录。

第一步：打开文件夹（假设当前电脑是服务器）：D:\Oracle\product\11.2.0\dbhome_1\NETWORK\ADMIN

![](D:\MyLearning\CentOS\img\Oracle的配置1.png)

第二步：获取服务器IP地址（假设当前电脑是服务器）：192.168.1.3

![](D:\MyLearning\CentOS\img\Oracle的配置2.png)

第三步：修改listener.ora文件（假设当前电脑是服务器）：

![](D:\MyLearning\CentOS\img\Oracle的配置3.png)

第四步：修改tnsnames.ora文件（假设当前电脑是服务器）：

![](D:\MyLearning\CentOS\img\Oracle的配置4.png)

第五步：重启服务器Oracle的服务（假设当前电脑是服务器）：

![](D:\MyLearning\CentOS\img\Oracle的配置5.png)

![](D:\MyLearning\CentOS\img\Oracle的配置5.2.png)

第六步：复制tnsnames.ora文件到客户端（假设当前电脑是客户端）：D:\Config

![](D:\MyLearning\CentOS\img\Oracle的配置6.png)

第七步：配置tnsnames.ora文件到环境变量（假设当前电脑是客户端）：TNS_ADMIN = D:\Config

![](D:\MyLearning\CentOS\img\Oracle的配置7.png)

## 2.6、Oracle的命令行连接

Oracle数据库的连接不像MySQL那样可以直接使用CMD窗口就能连接，它需要一些辅助软件，也就是下边的sqlplus。

![](D:\MyLearning\CentOS\img\Oracle的命令行连接1.png)

![](D:\MyLearning\CentOS\img\Oracle的命令行连接2.png)

![](D:\MyLearning\CentOS\img\Oracle的命令行连接3.png)

![](D:\MyLearning\CentOS\img\Oracle的命令行连接4.png)

## 2.7、Oracle的窗口化连接

既然是使用窗口化连接，那我们就需要一个窗口化连接的工具，这里我们使用的是代码补全提示比较好的PLSQL Developer。

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接1.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接2.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接3.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接4.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接5.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接6.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接7.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接8.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接9.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接10.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接11.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接12.png)

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接13.png)

但是，如果你使用带有中文的别名查询会乱码，这是因为PLSQL Developer的字符集编码和Oracle不一样，那如何设置呢？首先查询Oracle数据库的字符集编码：select userenv(‘language’) from dual;

![](D:\MyLearning\CentOS\img\Oracle的窗口化连接14.png)

## 2.8、Oracle的体系结构

- 数据库：Oracle是一种关系型的数据库管理系统
- 数据库实例：数据库实例其实就是用来访问和使用数据库的一块进程，它只存在于内存中，就像Java中new出来的实例对象一样
- 表空间：Oracle数据库是通过表空间来存储物理表的，一个数据库实例可以有N个表空间，一个表空间下可以有N张表
- 用户：Oracle数据库建好后，要想在数据库里建表，必须先为数据库建立用户，并为用户指定表空间

![](D:\MyLearning\CentOS\img\Oracle的体系结构.png)

## 2.9、Oracle的测试用户

scott测试用户下的表：

![](D:\MyLearning\CentOS\img\Oracle的测试用户1.png)

hr测试用户下的表：

![](D:\MyLearning\CentOS\img\Oracle的测试用户2.png)

# 第三章 DQL语言

## 3.1、完整语法

**一、语法**

````sql
select [TOP|DISTINCT] [选择列表]|[*]
from 数据源
[where 查询条件]
[group by 分组条件]
[having 过滤条件]
[order by 排序条件 asc|desc nulls first|last];
````

**二、执行顺序**

````sql
（5）select [（5-3）TOP|（5-2）DISTINCT] （5-1）[选择列表]|[*]
（1）from 数据源
（2）[where 查询条件]
（3）[group by 分组条件]
（4）[having 过滤条件]
（6）[order by asc|desc nulls first|last];

````

## 3.2、简单查询

````sql
--查询所有员工的信息
select * from emp;
````

## 3.3、别名查询

````sql
--查询所有员工的姓名
select e.ename from emp e;
````

## 3.4、去重查询

````sql
--查询所有部门的编号
select distinct e.deptno from emp e;
````

## 3.5、条件查询

**一、运算符**

1. 条件运算符：>、>=、<、<=、=、<=>、!=、<>
2. 逻辑运算符：and、or、not
3. 模糊运算符：
   - like：%任意多个字符、_任意单个字符、如果有特殊字符，需要使用escape转义
   - between and
   - not between and
   - in
   - is null
   - is not null

**二、演示**

````sql
--查询工资>3000的员工信息
select * from emp where sal > 3000;
````

## 3.6、分组查询

````sql
--统计每个部门有多少个人
select deptno as "部门",count(*) as "人数" from emp group by deptno;
````

## 3.7、分组过滤

````sql
--统计部门人数>5人的部门的编号
select deptno as "部门", count(*) as "人数"
from emp
group by deptno
having count(*) > 5;
````

## 3.8、排序查询

````sql
--按照员工主管编号由高到低进行排序，NULL值放到最后边
select * from emp order by mgr desc nulls last;
````

## 3.9、分页查询

````sql
--查询前10条员工的信息
--注意：Oracle中不支持limit，需要在原始表加上一列：行号，然后使用子查询来实现分页
select * 
from (select rownum hanghao,e.* from emp e) t
where t.hanghao >=1 and t.hanghao <= 10;
````

## 3.10、多表查询

- 内连接
  - 隐式内连接：select * from emp e1, dept d1 where e1.deptno = d1.deptno;
  - 显示内连接：select * from emp e1 inner join dept d1 on e1.deptno = d1.deptno;
- 外连接
  - 左外连接
    - 隐式左外连接：select * from emp e1,dept d1 where e1.deptno = d1.deptno(+);
    - 显示左外连接：select * from emp e1 left outer join dept d1 on e1.deptno = d1.deptno;
  - 右外连接
    - 隐式右外连接：select * from emp e1,dept d1 where e1.deptno(+) = d1.deptno;
    - 显示右外连接：select * from emp e1 right outer join dept d1 on e1.deptno = d1.deptno;
  - 全外连接：select * from emp e1 full outer join dept d1 on e1.deptno = d1.deptno;
- 交叉连接
  - 隐式交叉连接：select * from emp, dept;
  - 显示交叉连接：select * from emp e1 cross join dept d1;

## 3.11、联合查询

- 并集运算：将两个查询结果进行合并

````sql
/*
	union 		: 它会去除重复的，并且排序
	union all 	: 不会去除重复的，不会排序
*/

--工资大于1500或者20号部门下的员工
select * from emp where sal > 1500
union
select * from emp where deptno = 20;

--工资大于1500或者20号部门下的员工
select * from emp where sal > 1500
union all
select * from emp where deptno = 20;
````

- 交集运算：找两个查询结果的交集

````sql
--工资大于1500并且20号部门下的员工
select * from emp where sal > 1500
intersect
select * from emp where deptno = 20;
````

- 差集运算：找两个查询结果的差集

````sql
--1981年入职员工(不包括总裁和经理)
select * from emp where to_char(hiredate,'yyyy') = '1981'
minus
select * from emp where job = 'PRESIDENT' or job = 'MANAGER';
````

- 注意事项：

1. 列的类型要一致
2. 列的顺序要一致
3. 列的数量要一致，如果不够，可以使用null填充

## 3.12、子查询

- 单行子查询：>、>=、<、<=、!=、<>、=、<=>
- 多行子查询：in、not in、any、some、all、exits

1、in的使用

````sql
--查询所有经理的信息
select * from emp where empno in (select mgr from emp where mgr is not null);
````

2、not in的使用

````sql
--查询不是经理的信息
select * from emp where empno not in (select mgr from emp where mgr is not null);
````

3、any的使用

````sql
--查询出比10号部门任意一个员工薪资高的员工信息
select * from emp where sal > any (select sal from emp where deptno = 10);
````

4、some的使用

````sql
--查询出比10号部门任意一个员工薪资高的员工信息
select * from emp where sal > some (select sal from emp where deptno = 10);
````

5、all的使用

````sql
--查询出比20号部门所有员工薪资高的员工信息
select * from emp where sal > all (select sal from emp where deptno = 20);
````

6、exits的使用

````sql
--查询有员工的部门的信息
select * from dept d1 where exists (select * from emp e1 where e1.deptno = d1.deptno);
````

# 第四章 函数大全

具体用法，请参考资料中的Oracle函数大全.chm

## 4.1、数值型函数

![](D:\MyLearning\CentOS\img\数值型函数.png)

### 4.2、字符型函数

![](D:\MyLearning\CentOS\img\字符型函数.png)

### 4.3、日期函数

![](D:\MyLearning\CentOS\img\4.3、日期函数.png)

### 4.4、转换函数

![](D:\MyLearning\CentOS\img\转换函数.png)

### 4.5、聚组函数

![](D:\MyLearning\CentOS\img\聚组函数.png)

### 4.6、分析函数

![](D:\MyLearning\CentOS\img\分析函数.png)

### 4.7、其它函数

![](D:\MyLearning\CentOS\img\其它函数.png)

## 第五章 DCL语言

### 5.1、创建表空间

**一、语法**

````sql
create tablespace 表空间的名称
datafile '文件的路径'
size 初始化大小
autoextend on
next 每次扩展的大小;
````

**二、演示**

````sql
create tablespace mytest
datafile 'd:/OracleStore/mytest.dbf'
size 100m
autoextend on
next 10m;
````

### 5.2、删除表空间

**一、语法**

````sql
drop tablespace 表空间的名称;
````

**二、演示**

````sql
drop tablespace mytest;
````

### 5.3、创建用户

**一、语法**

````sql
create user 用户名(当oracle版本大于oracle12时需要为 c##用户名)
identified by 密码
default tablespace 表空间的名称;
````

**二、演示**

````sql
create user zhangsan
identified by 123456
default tablespace mytest;
````

### 5.4、删除用户

### 5.5、授权用户

**一、语法**

````sql
grant 系统权限列表 to 用户名;
或者
grant 实体权限列表 on 表名称 to 用户名;
````

**二、权限列表**

系统权限分类：（系统权限只能由DBA用户授出）

DBA：拥有全部特权，是系统最高权限，只有DBA才可以创建数据库结构。
RESOURCE：拥有Resource权限的用户只可以创建实体，不可以创建数据库结构。
CONNECT：拥有Connect权限的用户只可以登录Oracle，不可以创建实体，不可以创建数据库结构。
实体权限分类：select、update、insert、alter、index、delete、all

**三、演示**

````sql
grant CONNECT to zhangsan;
或者
grant CONNECT,RESOURCE to zhangsan;
或者
grant CONNECT,RESOURCE,DBA to zhangsan;
或者
grant DBA to zhangsan;
或者
grant all on emp to zhangsan;
````

### 5.6、取消授权

**一、语法**

````sql
revoke 系统权限列表 from 用户名;
或者
revoke 实体权限列表 on 表名称 from 用户名;
````

**二、注意事项**

系统权限只能由DBA用户回收

**二、演示**

````sql
revoke CONNECT from zhangsan;
或者
revoke CONNECT,RESOURCE from zhangsan;
或者
revoke CONNECT,RESOURCE,DBA from zhangsan;
或者
revoke DBA from zhangsan;
或者
revoke all on emp from zhangsan;
````

### 5.7、修改密码

**一、语法**

````sql
alter user 用户名 identified by "密码";
````

**二、演示**

````sql
alter user zhangsan identified by "123456";
````

# 第六章 DDL语言

## 6.1、数据类型

注意：这里整理的都是常用的并没有全部整理出所有类型

- **字符串类型**
  - CHAR：定长字符串，它会用空格填充来达到其最大长度，最多可以存储2000字节的信息
  - NCHAR：这是一个包含UNICODE格式数据的定长字符串，最多可以存储2000字节的信息
  - VARCHAR2：变长字符串，它不会用空格填充来达到其最大长度，最多可以存储4000字节的信息
  - NVARCHAR2：这是一个包含UNICODE格式数据的变长字符串，最多可以存储4000字节的信息
- **数值类型**
  - NUMBER：NUMBER(p,s)是最常见的数字类型，关于NUMBER的有效位§和精确位(s)遵循以下规则：
  - p：是有效数据总位数，取值范围为【1-38】，默认值是38
  - s：表示精确到多少位，取值范围为【-84-127】，默认值是0
  - INTEGER：INTEGER是NUMBER的子类型，它等同于NUMBER(38,0)，用来存储整数
  - FLOAT：Float(n)是NUMBER的子类型，数 n 指示位的精度，n值的范围可以从1到126
- **日期类型**
  - DATE：DATE是最常用的日期数据类型，它可以存储日期和时间信息，虽然可以用字符或数字类型表示日期和时间信息，但是日期数据类型具有特殊关联的属性。Oracle 为每个日期值存储以下信息： 世纪、 年、 月、 日期、 小时、 分钟和秒，一般占用7个字节的存储空间
  - TIMESTAMP：这是一个7字节或12字节的定宽日期/时间数据类型。它与DATE数据类型不同，因为TIMESTAMP可以包含小数秒，带小数秒的TIMESTAMP在小数点右边最多可以保留9位

## 6.2、创建表

**一、语法**

````sql
create table 表名(
     列名 列的类型 [列的约束],
     列名 列的类型 [列的约束]  
);
````

**二、演示**

````sql
create table users(
     id number,
     username varchar2(20),
     password varchar2(20)
);
````

## 6.3、复制表 

**一、语法**

````sql
create table 表名 as 查询语句;
````

**二、演示**

````sql
create table emp_copy as 
     select * from emp
;
````

## 6.4、删除表

**一、语法**

````sql
方式一：drop table 表名;
方式二：truncate table 表名;
````

**二、演示**

````sql
方式一：drop table emp_copy;
方式二：truncate table emp_copy;
````

## 6.5、修改表

1、添加一列

````sql
格式：alter table 表名 add 列名 列的类型;
演示：alter table users add phone varchar2(11);
````

2、修改列名

````sql
格式：alter table 表名 rename column 旧列名 to 新列名;
演示：alter table users rename column phone to mobile;
````

3、修改类型

````sql
格式：alter table 表名 modify 列名 列的类型;
演示：alter table users modify mobile char(11);
````

4、删除一列

````sql
格式：alter table 表名 drop column 列名;
演示：alter table users drop column mobile;
````

5、修改表名

````sql
格式：rename 旧表名 to 新表名;
演示：rename users to myusers;
````

## 6.6、表约束

**一、语法**

````sql
CREATE TABLE 表名(
        列名 列的类型 primary key,--主键约束
        列名 列的类型 not null,--非空约束
        列名 列的类型 unique,--唯一约束
    	列名 列的类型 check(列名 in (检查列表)),--检查约束
        constraint 约束名 foreign key(字段名) references 主表(被引用列)--外键约束
) ;
````

**二、演示**

````sql
--商品分类表
create table category(
       cid number primary key,
       cname varchar2(20) 
);

--商品详情表
create table product(
       pid number primary key,--主键约束
       pname varchar2(50) not null,--非空约束
       pimg varchar2(50) unique,--唯一约束
       pflag varchar2(10) check(pflag in ('上架','下架')),--检查约束
       cid number,
       constraint FK_CATEGORY_ID foreign key(cid) references category(cid)--外键约束
);
````

**三、修改**

1、主键约束

````sql
添加
alter table product add constraint PK_PRODUCT_PID primary key(pid);
删除
alter table product drop constraint PK_PRODUCT_PID;
或者
alter table product drop primary key;
````

2、非空约束

````sql
添加
alter table product modify pname not null;
删除
alter table product modify pname null;
````

3、唯一约束

````sql
添加
alter table product add constraint UK_PRODUCT_PIMG unique(pimg);
删除
alter table product drop constraint UK_PRODUCT_PIMG;
或者
alter table product drop unique(pimg);
````

4、检查约束

````sql
添加
alter table product add constraint CK_PRODUCT_PFLAG check(pflag in ('上架','下架'));
删除
alter table product drop constraint CK_PRODUCT_PFLAG;
````

5、外键约束

````sql
添加
alter table product add constraint FK_PRODUCT_ID foreign key(cid) references category(cid);
删除
alter table product drop constraint FK_PRODUCT_ID;
````

## 第七章 DML语言

### 7.1、插入语句

````sql
格式：insert into 表名(列名1,列名2,...) values(值1,值2,...);
演示：insert into category(cid,cname) values(1,'电视');
注意：commit;
````

### 7.2、修改语句

````sql
格式：update 表名 set 列名1=值1,列名2=值2,... where 查询条件;
演示：update category set cname='汽车' where cid = 1;
注意：commit;
````

### 7.3、删除语句

````sql
格式：delete from 表名 where 查询条件;
演示：delete from category where cid = 1;
注意：commit;
````

# 第八章 TCL语言

## 8.1、事务

**一、含义**

一条或多条sql语句组成一个执行单位，一组sql语句要么都执行要么都不执行

**二、特点（ACID）**

1. 原子性：一个事务是不可再分割的整体，要么都执行要么都不执行
2. 一致性：一个事务的执行不能破坏数据库数据的完整性和一致性
3. 隔离性：一个事务不受其它事务的干扰，多个事务是互相隔离的
4. 持久性：一个事务一旦提交了，则永久的持久化到本地

**三、分类**

````sql
1、开启事务
Oracle 11g中事务是隐式自动开始的，它不需要用户显示的执行开始事务语句

2、编写一组逻辑sql语句
注意：sql语句支持的是insert、update、delete

【设置回滚点】
savepoint 回滚点名;

3、结束事务
提交：commit;
回滚：rollback;
回滚到指定的地方： rollback to 回滚点名;
````

## 8.2、事务并发（读问题）

**一、事物的并发问题如何发生？**

多个事务同时操作同一个数据库的相同数据时

**二、事务的并发问题都有哪些？**

1. 脏读：一个事务读到了另一个事务还未提交的update数据，导致多次查询的结果不一样（Oracle中不会产生）

2. 不可重复读：一个事务读到了另一个事务已经提交的update数据，导致多次查询结果不一致
3. 幻读：一个事务读到了另一个事务已经提交的insert数据，导致多次查询的结果不一样

**三、事物的并发问题如何解决？**

通过设置隔离级别来解决并发问题

**四、隔离级别**

Oracle中只支持READ COMMITTED、SERIALIZABLE、READ ONLY、READ WRITE，这些语句是互斥的，不能同时设置两个或两个以上的选项，一般默认即可。

## 8.3、丢失更新（写问题）

**一、定义**

在事务的隔离级别内容中，能够了解到两个不同的事务在并发的时候可能会发生数据的影响。细心的话可以发现事务隔离级别章节中，脏读、不可重复读、幻读三个问题都是由事务A对数据进行修改、增加，事务B总是在做读操作。如果两事务都在对数据进行修改则会导致另外的问题：丢失更新。

**二、解决**

1. 悲观锁：认为两个事务更新操作一定会发生丢失更新

   - 解决：通过在语句后边添加for update来实现行级上锁，所以又称为“行级锁”，例如：select * from t_account t wheret.id=‘1’ for update;
2. 乐观锁：认为事务不一定会产生丢失更新，让事务进行并发修改，不对事务进行锁定
   - 解决：由程序员自己解决，可以通过给数据表添加自增的version字段或时间戳timestamp，进行数据修改时，数据库会检测version字段或者时间戳是否与原来的一致，若不一致，抛出异常或者重新查询

**三、注意**

对于账户交易建议直接使用悲观锁，数据库的性能很高，并发度不是很高的场景两者性能没有太大差别。如果是交易减库存的操作可以考虑乐观锁，保证并发度。

# 第九章 高级部分

## 9.1、序列

一、含义

序列是Oracle数据库中特有的，使用序列可以生成类似于 auto_increment 这种ID自动增长 1,2,3,4,5… 的效果

二、语法
````sql
create sequence 序列名称
start with 从几开始
increment by 每次增长多少
[maxvalue 最大值] | nomaxvalue
[minvalue 最小值] | nominvalue
cycle | nocycle --是否自动循环
[cache 缓存数量] | nocache;
````

**三、演示**

````sql
--创建序列
create sequence auto_increment_seq
start with 1
increment by 1
nomaxvalue
minvalue 1
nocycle
cache 10000;

--调用序列
select auto_increment_seq.nextval from dual;
select auto_increment_seq.currval from dual;
````

## 9.2、PLSQL编程

### 9.2.1、格式

````sql
declare
  --声明变量
          
begin
  --业务逻辑

end;
````

### 9.2.2、变量

````sql
declare
  --声明变量
  -- 格式一：变量名 变量类型;
  -- 格式二：变量名 变量类型 := 初始值;
  -- 格式三：变量名 变量类型 := &文本框名;
  -- 格式四：变量名 表名.字段名%type;
  -- 格式五：变量名 表名%rowtype;
  vnum number;
  vage number := 28;
  vabc number := &abc;--输入一个数值，从一个文本框输入
  vsal emp.sal%type;  --引用型的变量，代表emp.sal的类型
  vrow emp%rowtype;   --记录型的变量，代表emp一行的类型          
begin
  --业务逻辑
  dbms_output.put_line(vnum);                       --输出一个未赋值的变量
  dbms_output.put_line(vage);                       --输出一个已赋值的变量
  dbms_output.put_line(vabc);                       --输出一个文本框输入的变量
  select sal into vsal from emp where empno = 7654; --将查询到的sal内容存入vsal并输出
  dbms_output.put_line(vsal);
  select * into vrow from emp where empno = 7654;   --将查询到的一行内容存入vrow并输出  
  dbms_output.put_line(vrow.sal);
  dbms_output.put_line(123);                        --输出一个整数
  dbms_output.put_line(123.456);                    --输出一个小数  
  dbms_output.put_line('Hello,World');              --输出一个字符串
  dbms_output.put_line('Hello'||',World');          --输出一个拼接的字符串，||拼接符Oracle特有
  dbms_output.put_line(concat('Hello',',World'));   --输出一个拼接的字符串，concat函数比较通用
end;
````

### 9.2.3、if判断

**一、语法**

````sql
if 条件1 then
     
elsif 条件2 then
       
else 
     
end if;
````

**二、演示**

````sql
declare
  age number := &age;
begin
  if age < 18 then
    dbms_output.put_line('小屁孩');
  elsif age >= 18 and age <= 24 then
    dbms_output.put_line('年轻人');
  elsif age > 24 and age < 40 then
    dbms_output.put_line('老司机');
  else
    dbms_output.put_line('老年人');
  end if;
end;
````

### 9.2.4、while循环

**一、语法**

````sql
while 条件 loop
        
end loop;
````

**二、演示**

````sql
--输出1~10
declare
  i number := 1;
begin
  while i <= 10 loop
    dbms_output.put_line(i);
    i := i + 1;
  end loop;
end;
````

### 9.2.5、for循环

**一、语法**

````sql
for 变量  in [reverse] 起始值..结束值 loop
        
end loop;
````

**二、演示**

````sql
--输出1~10
declare

begin
  for i in reverse 1 .. 10 loop
    dbms_output.put_line(i);
  end loop;
end;
````

### 9.2.6、loop循环

**一、语法**

````sql
loop
  
  exit when 条件
  
end loop;
````

**二、演示**

````sql
--输出1~10
declare
  i number := 1;
begin
  loop
    exit when i > 10;
    dbms_output.put_line(i);
    i := i + 1;
  end loop;
end;
````

### 9.2.7、意外

**一、含义**

意外是程序运行的过程发生的异常，相当于是Java中的异常

**二、语法**

````sql
declare
   --声明变量
begin
   --业务逻辑
exception
   --处理异常
   when 异常1 then
     ...
   when 异常2 then
     ...
   when others then
     ...处理其它异常
end;
````

**三、分类**

- 系统异常
  - zero_divide ：除数为零异常
  - value_error ：类型转换异常
  - no_data_found : 没有找到数据
  - too_many_rows : 查询出多行记录，但是赋值给了%rowtype一行数据变量
- 自定义异常

````sql
declare
   --声明变量
   异常名称 exception;
begin
   --业务逻辑
   if 触发条件 then
      raise 异常名称; --抛出自定义的异常
exception
   --处理异常
   when 异常名称 then
     dbms_output.put_line('输出了自定义异常');  
   when others then
     dbms_output.put_line('输出了其它的异常');  
end;
````

**四、演示**

1、内置系统异常

````sql
  vi   number;
  vrow emp%rowtype;
begin
  --以下四行对应四个异常，测试请依次放开
  vi := 8/0;  
  --vi := 'aaa';
  --select * into vrow from emp where empno = 1234567;
  --select * into vrow from emp;
exception
  when zero_divide then
    dbms_output.put_line('发生除数为零异常');
  when value_error then
    dbms_output.put_line('发生类型转换异常');
  when no_data_found then
    dbms_output.put_line('没有找到数据异常');
  when too_many_rows then
    dbms_output.put_line('查询出多行记录，但是赋值给了%rowtype一行数据变量');
  when others then
    dbms_output.put_line('发生了其它的异常' || sqlerrm);
end;
````

2、抛出系统异常

````sql
--查询指定编号的员工，如果没有找到，则抛出系统异常
declare
  --1.声明一个变量 %rowtype
  vrow emp%rowtype;
begin
  --查询员工信息，保存起来
  select * into vrow from emp where empno = 8000;
  --判断是否触发异常的条件
  if vrow.sal is null then
    --抛出系统异常
     raise_application_error(-20001,'员工工资为空');
  end if;
exception
  when others then
    dbms_output.put_line('输出了其它的异常' || sqlerrm);
end;
````

3、抛出自定义异常

````sql
--查询指定编号的员工，如果没有找到，则抛出自定义异常
declare
  --1.声明一个变量 %rowtype
  vrow emp%rowtype;
  --2.声明一个自定义的异常
  no_emp exception;
begin
  --查询员工信息，保存起来
  select * into vrow from emp where empno = 8000;
  --判断是否触发异常的条件
  if vrow.sal is null then
    raise no_emp; --抛出自定义的异常
  end if;
exception
  when no_emp then
    dbms_output.put_line('输出了自定义异常');
  when others then
    dbms_output.put_line('输出了其它的异常' || sqlerrm);
end;
````

## 9.3、索引

**一、含义**

索引相当于是一本书的目录，能够提高我们的查询效率

**二、语法**

1、创建索引

````sql
create [UNIQUE]|[BITMAP] index 索引名 on 表名(列名1,列名2,...);
````

2、修改索引

````sql
--重命名索引
alter index 索引名称 rename to 新的名称;

--合并索引
alter index 索引名称 coalesce;

--重建索引
alter index 索引名称 rebuild;

--修改某列
先删除，在创建
````

3、删除索引

````sql
drop index 索引名称;
````

**三、演示**

1、创建索引

````sql
create index INX_CATEGORY_CNAME on category(cname);
````

2、修改索引

````sql
--重命名索引
alter index INX_CATEGORY_CNAME rename to INX_CATEGORY_CNAME_NEW;

--合并索引
alter index INX_CATEGORY_CNAME_NEW coalesce;

--重建索引
alter index INX_CATEGORY_CNAME_NEW rebuild;

--修改某列
先删除，在创建
````

3、删除索引

````sql
drop index INX_CATEGORY_CNAME;
````

## 9.4、视图

**一、含义**

视图是对查询结果的一个封装，视图里面所有的数据，都是来自于它查询的那张表，视图本身不存储任何数据，但是可以修改原数据，但是不建议这样使用

**二、语法**

1、创建视图

````sql
create view 视图名称
as 查询语句
[with read only];
````

2、修改视图

````sql
create or replace view 视图名称
as 查询语句
[with read only];
````

3、删除视图

````sql
drop view 视图名称;
````

**三、演示**

1、创建视图

````sql
create view view_emp as
select ename,job,mgr from emp;
````

2、修改视图

````sql
create or replace view view_emp as
select ename,job,mgr,deptno from emp;
````

3、删除视图

````sql
drop view view_emp;
````

## 9.5、同义词

**一、含义**

同义词就是别名的意思和视图的功能类似，就是一种映射关系

**二、语法**

1、创建同义词

````sql
create [public] synonym 同义词名称 for 对象的名称;
````

2、修改同义词

````sql
create or replace [public] synonym 同义词名称 for 对象的名称;
````

3、删除同义词

````sql
drop [public] synonym 同义词名称;
````

**三、演示**

1、创建同义词

````sql
--创建
create synonym syno_emp for emp;
--调用
select * from syno_emp;
````

2、修改同义词

````sql
--创建
create or replace synonym syno_emp_update for emp;
--调用
select * from syno_emp_update;
````

3、删除同义词

````sql
drop synonym syno_emp_update;
````

## 9.6、游标

**一、含义**

游标是用来操作查询结果集，相当于是JDBC中ResultSet，它可以对查询的结果一行一行的获取

**二、语法**

````sql
--第一步：定义游标
    --第一种：普通游标
    cursor 游标名[(参数 参数类型)] is 查询语句;
    --第二种：系统引用游标
    游标名 sys_refcursor;

--第二步：打开游标
    --第一种：普通游标
    open 游标名[(参数 参数类型)];
    --第二种：系统引用游标
    open 游标名 for 查询语句;

--第三步：获取一行
	fetch 游标名 into 变量;

--第四步：关闭游标
	close 游标名;
````

**三、演示**

1、普通游标使用

````sql
--输出指定部门下的员工姓名和工资
declare
  --1.声明游标
  cursor vrows(dno number) is select * from emp where deptno = dno;
  --声明变量
  vrow emp%rowtype;
begin
  --2.打开游标 
  open vrows(10);
  --3.循环遍历
  loop
    fetch vrows into vrow;
    exit when vrows%notfound;
    dbms_output.put_line('姓名:' || vrow.ename || ' 工资: ' || vrow.sal);
  end loop;
  --4.关闭游标
  close vrows;
end;
````

2、系统引用游标使用

````sql
--输出员工表中所有的员工姓名和工资
declare
  --1.声明系统引用游标
  vrows sys_refcursor;
  --声明变量
  vrow emp%rowtype;
begin
  --2.打开游标
  open vrows for select * from emp;
  --3.循环遍历
  loop
    fetch vrows into vrow;
    exit when vrows%notfound;
    dbms_output.put_line('姓名:' || vrow.ename || ' 工资: ' || vrow.sal);
  end loop;
  --4.关闭游标
  close vrows;
end;
````

3、使用for循环输出

````sql
--输出员工表中所有的员工姓名和工资
declare
  cursor vrows is select * from emp;
begin
  --自动定义变量vrow，自动打开游标，自动关闭游标
  for vrow in vrows loop
    dbms_output.put_line('姓名:' || vrow.ename || ' 工资: ' || vrow.sal || '工作:' || vrow.job);
  end loop;
end;
````

## 9.7、存储过程

**一、含义**

存储过程实际上是封装在服务器上一段PLSQL代码片断，它已经编译好了，如果客户端调用存储过程，执行效率就会非常高效

**二、语法**

1、创建存储过程

````sql
create procedure 存储过程名称(参数名 in|out 参数类型,参数名 in|out 参数类型,...)
is|as
 --声明部分
begin
 --业务逻辑 
end;
````

2、修改存储过程

````sql
create [or replace] procedure 存储过程名称(参数名 in|out 参数类型,参数名 in|out 参数类型,...)
is|as
 --声明部分
begin
 --业务逻辑 
end;
````

3、删除存储过程

````sql
drop procedure 存储过程名称;
````

4、调用存储过程

````sql
--方式一：
call 存储过程名称(...);

--方式二：
declare

begin
  存储过程名称(...);
end;
````

**三、演示**

1、创建存储过程

````sql
--给指定员工涨薪并打印涨薪前和涨薪后的工资
create procedure proc_update_sal(vempno in number,vnum in number)
is
  --声明变量
  vsal number;
begin
  --查询当前的工资
  select sal into vsal from emp where empno = vempno;
  --输出涨薪前的工资
  dbms_output.put_line('涨薪前:' || vsal);
  --更新工资
  update emp set sal = vsal + vnum where empno = vempno;
  --输出涨薪后的工资
  dbms_output.put_line('涨薪后:' || (vsal + vnum));
  --提交事物
  commit;
end;

--给员工编号为7521的员工涨工资10元
call proc_update_sal(7521, 10);
````

2、修改存储过程

````sql
--给指定员工涨薪并打印涨薪前和涨薪后的工资
create or replace procedure proc_update_sal(vempno in number,vnum in number)
is
  --声明变量
  vsal number;
begin
  --查询当前的工资
  select sal into vsal from emp where empno = vempno;
  --输出涨薪前的工资
  dbms_output.put_line('涨薪前:' || vsal);
  --更新工资
  update emp set sal = vsal + vnum where empno = vempno;
  --输出涨薪后的工资
  dbms_output.put_line('涨薪后:' || (vsal + vnum));
  --提交事物
  commit;
end;

--给员工编号为7521的员工涨工资10元
call proc_update_sal(7521, 10);
````

3、删除存储过程

````sql
drop procedure proc_update_sal;
````

## 9.8、函数

**一、含义**

函数实际上是封装在服务器上一段PLSQL代码片断，它已经编译好了，如果客户端调用存储过程，执行效率就会非常高效，它跟存储过程没有什么本质区别，存储过程能做的函数也能做，只不过函数有返回值

**二、语法**

1、创建函数

````sql
create function 函数名称(参数名 in|out 参数类型,参数名 in|out 参数类型,...) return 返回的参数类型
is|as
 --声明部分
begin
 --业务逻辑 
end;
````

2、修改函数

````sql
create [or replace] function 函数名称(参数名 in|out 参数类型,参数名 in|out 参数类型,...) return 返回的参数类型
is|as
 --声明部分
begin
 --业务逻辑 
end;
````

3、删除函数

````sql
drop function 函数名称;
````

4、调用函数

````sql
--方式一：
select 函数名称(...) from dual;

--方式二：
declare
  变量名 变量类型;
begin
  变量名 = 函数名称(...);
end;
````

**三、演示**

1、创建函数

````sql
--查询指定员工的年薪
/*
    参数 : 员工的编号
    返回 : 员工的年薪          
*/
create function func_getsal(vempno number) return number
is
  vtotalsal number;
begin
  select sal * 12 + nvl(comm, 0) into vtotalsal from emp where empno = vempno;
  return vtotalsal;
end;

--查询员工编号为7788的年薪
declare
  vsal number;
begin
  vsal := func_getsal(7788);
  dbms_output.put_line(vsal);
end;
````

2、修改函数

````sql
--查询指定员工的年薪
/*
    参数 : 员工的编号
    返回 : 员工的年薪          
*/
create or replace function func_getsal(vempno number) return number
is
  vtotalsal number;
begin
  select sal * 12 + nvl(comm, 0) into vtotalsal from emp where empno = vempno;
  return vtotalsal;
end;

--查询员工编号为7788的年薪
declare
  vsal number;
begin
  vsal := func_getsal(7788);
  dbms_output.put_line(vsal);
end;
````

3、删除函数

````sql
drop function func_getsal;
````

## 9.9、触发器

**一、含义**

当用户执行了 insert | update | delete 这些操作之后，可以触发一系列其它的动作、业务逻辑，使用触发器可以协助应用在数据库端确保数据的完整性、日志记录 、数据校验等操作。使用别名 OLD 和 NEW 来引用触发器中发生变化的记录内容，这与其他的数据库是相似的。现在Oracle触发器不仅支持行级触发，还支持语句级触发

**二、分类**

| 触发器类型      | NEW 和 OLD的使用                                        |
| --------------- | ------------------------------------------------------- |
| INSERT 型触发器 | NEW 表示将要或者已经新增的数据                          |
| UPDATE 型触发器 | OLD 表示修改之前的数据 , NEW 表示将要或已经修改后的数据 |
| DELETE 型触发器 | OLD 表示将要或者已经删除的数据                          |

**三、语法**

1、创建触发器

````sql
create trigger 触发器名称
before|after
insert|update|delete 
on 表名称
[for each row]--行级触发器
declare
 --声明部分
begin
 --业务逻辑 
end;
````

2、修改触发器

````sql
create [or replace] trigger 触发器名称
before|after
insert|update|delete 
on 表名称
[for each row]--行级触发器
declare
 --声明部分
begin
 --业务逻辑 
end;
````

3、删除触发器

````sql
drop trigger 触发器名称;
````

**四、演示**

1、INSERT 型触发器

````sql
--新员工入职之后，输出一句话: 欢迎加入我们
create or replace trigger tri_emp_insert
after
insert
on emp
declare

begin
  dbms_output.put_line('欢迎加入我们');
end;

--插入数据就可以自动触发触发器
insert into emp(empno, ename) values(9527, '马哈哈');
````

2、UPDATE 型触发器

````sql
--判断员工涨工资后的工资一定要大于涨工资前的工资
create or replace trigger tri_emp_update_sal
before
update
on emp
for each row
declare

begin
  if :old.sal > :new.sal then
    raise_application_error(-20002,'旧的工资不能大于新的工资');
  end if;
end;

--更新数据就可以自动触发触发器（无异常）
update emp set sal = sal + 10;
select * from emp;

--更新数据就可以自动触发触发器（有异常）
update emp set sal = sal - 100;
select * from emp;
````

3、DELETE 型触发器

````sql
--老员工离职之后，输出一句话: 有员工离职了
create or replace trigger tri_emp_delete
after
delete
on emp
declare

begin
  dbms_output.put_line('有员工离职了');
end;

--删除数据就可以自动触发触发器
delete from emp where empno = 9527;
````

4、删除触发器

````sql
drop trigger tri_emp_insert;
drop trigger tri_emp_update_sal;
drop trigger tri_emp_delete;
````

# 第十章 数据备份与恢复

## 10.1、全部导出

````sql
--注意：以下操作为cmd命令行操作
全部导出: exp 管理员帐号/密码 file='d:\beifen.dmp' full=y
````

## 10.2、全部导入

````sql
--注意：以下操作为cmd命令行操作
全部导入: imp 管理员帐号/密码 file='d:\beifen.dmp' full=y
````

## 10.3、按用户导出

````sql
--注意：以下操作为cmd命令行操作
按用户导出: exp 管理员帐号/密码 file='d:\beifen.dmp' owner=帐号
````

## 10.4、按用户导入

````sql
--注意：以下操作为cmd命令行操作
按用户导入: imp 管理员帐号/密码 file='d:\beifen.dmp' fromuser=帐号
````

# 第十一章 安装Oracle单实例

## 11.1、环境准备

注意：当前Linux为CentOS-6.10-x86_64-bin-DVD1.iso

界面：使用图形界面

内存：4GB

硬盘：20GB

连接：SecureCRT，上传文件（rz命令）需要安装：yum -y install lrzsz

## 11.2、下载程序

32位需要下载（需要登录账号）：

http://download.oracle.com/otn/linux/oracle11g/R2/linux_11gR2_database_1of2.zip

http://download.oracle.com/otn/linux/oracle11g/R2/linux_11gR2_database_2of2.zip

64位需要下载（需要登录账号）：

http://download.oracle.com/otn/linux/oracle11g/R2/linux.x64_11gR2_database_1of2.zip

http://download.oracle.com/otn/linux/oracle11g/R2/linux.x64_11gR2_database_2of2.zip
![](D:\MyLearning\CentOS\img\下载程序.png)

## 11.3、解压程序

- **上传**

![](/上传.png)

- **解压**
  - unzip linux.x64_11gR2_database_1of2.zip
  - unzip linux.x64_11gR2_database_2of2.zip

![](/解压.png)

- 注意：unzip可能会提示没有这个命令，那就需要我们安装一下了
  - yum -y install zip
  - yum -y install unzip

## 11.4、移动软件

````linux
[root@caochenlei ~]# mkdir -p /usr/local/oracle
[root@caochenlei ~]# mv database/ /usr/local/oracle
````

## 11.5、域名映射

查看当前系统主机名：

````linux
[root@caochenlei ~]# hostname
caochenlei
````

查看当前系统的IP地址：

````linux
[root@caochenlei ~]# ifconfig
````

修改系统的映射文件：

````linux
[root@caochenlei ~]# vi /etc/hosts
````

在末尾添加以下内容：

````linux
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

192.168.112.129 caochenlei
````

## 11.6、关闭selinux

````Linux
[root@caochenlei ~]# vi /etc/selinux/config
````

设置SELINUX=disabled

![](/关闭selinux.png)

临时关闭一下selinux：

````linux
[root@caochenlei ~]# setenforce 0
````

## 11.7、关闭防火墙

````Linux
[root@caochenlei ~]# service iptables stop
[root@caochenlei ~]# chkconfig iptables off

````

## 11.8、安装依赖包

````Linux
[root@caochenlei ~]# yum install -y binutils compat-libcap1 compat-libstdc++-33 gcc gcc-c++ glibc glibc-devel ksh libgcc libstdc++ libstdc++-devel libaio libaio-devel make sysstat unixODBC-devel pdksh java-1.8.0-openjdk*
````

## 11.9、添加新用户

````Linux
[root@caochenlei ~]# groupadd oinstall
[root@caochenlei ~]# groupadd dba
[root@caochenlei ~]# useradd -g oinstall -G dba oracle
[root@caochenlei ~]# passwd oracle
````

## 11.10、修改内核文件

````Linux
[root@caochenlei ~]# vi /etc/sysctl.conf
````

在末尾添加以下内容：

````Linux
fs.aio-max-nr = 1048576
fs.file-max = 6815744
kernel.shmall = 2097152
kernel.shmmax = 536870912
kernel.shmmni = 4096
kernel.sem = 250 32000 100 128
net.ipv4.ip_local_port_range = 9000 65500
net.core.rmem_default = 262144
net.core.rmem_max = 4194304
net.core.wmem_default = 262144
net.core.wmem_max = 1048576
````

更新一下文件以生效：

````Linux
[root@caochenlei ~]# sysctl -p
````

## 11.11、修改用户限制

````Linux
[root@caochenlei ~]# vi /etc/security/limits.conf
````

在末尾添加以下内容：

````Linux
oracle            soft    nproc           4096
oracle            hard    nproc           65536
oracle            soft    nofile          4096
oracle            hard    nofile          65536
````

修改完成后重启服务器：

````Linux
[root@caochenlei ~]# reboot
````

## 11.12、创建安装目录

````Linux
[root@caochenlei ~]# mkdir -p /data/oracle/product/11.2.0
[root@caochenlei ~]# mkdir -p /data/oracle/oradata
[root@caochenlei ~]# mkdir -p /data/oracle/inventory
[root@caochenlei ~]# chown -R oracle:oinstall /data/oracle
[root@caochenlei ~]# chmod -R 775 /data/oracle
````

## 11.13、设置环境变量

切换到oracle用户下：

````Linux
[root@caochenlei ~]# su - oracle
[oracle@caochenlei ~]$ vi .bash_profile
````

在末尾添加以下内容：

````linux
ORACLE_BASE=/data/oracle
ORACLE_HOME=$ORACLE_BASE/product/11.2.0
ORACLE_SID=orcl
PATH=$PATH:$ORACLE_HOME/bin
export ORACLE_BASE ORACLE_HOME ORACLE_SID PATH
````

更新一下文件以生效：

````linux
[oracle@caochenlei ~]$ source .bash_profile
````

## 11.14、安装应用程序

这一步需要在虚拟机里进行，因为会弹出窗体程序

````linux
[oracle@caochenlei response]$ cd /usr/local/oracle/database/
[oracle@caochenlei database]$ LANG=en_US ./runInstaller
````

用户安装截图：

![](/用户安装1.png)

![](/用户安装2.png)

![](/用户安装3.png)![](/用户安装4.png)![](/用户安装5.png)![](/用户安装6.png)![](/用户安装7.png)![](/用户安装8.png)![](/用户安装9.png)![](/用户安装10.png)![](/用户安装11.png)![](/用户安装12.png)![](/用户安装13.png)![](/用户安装14.png)![](/用户安装15.png)![](/用户安装16.png)![](/用户安装17.png)![](/用户安装18.png)![](/用户安装19.png)![](/用户安装20.png)![](/用户安装21.png)![](/用户安装1.png)![](/用户安装22.png)![](/用户安装23.png)![](/用户安装24.png)![](/用户安装25.png)

然后提示要执行两个脚本，使用root执行，可以使用SecureCRT重新新建一个连接进行

````linux
[root@caochenlei ~]# sh /data/oracle/inventory/orainstRoot.sh
Changing permissions of /data/oracle/inventory.
Adding read,write permissions for group.
Removing read,write,execute permissions for world.

Changing groupname of /data/oracle/inventory to oinstall.
The execution of the script is complete.
[root@caochenlei ~]# sh /data/oracle/product/11.2.0/dbhome_1/root.sh
Running Oracle 11g root.sh script...

The following environment variables are set as:
    ORACLE_OWNER= oracle
    ORACLE_HOME=  /data/oracle/product/11.2.0/dbhome_1

Enter the full pathname of the local bin directory: [/usr/local/bin]: 
   Copying dbhome to /usr/local/bin ...
   Copying oraenv to /usr/local/bin ...
   Copying coraenv to /usr/local/bin ...


Creating /etc/oratab file...
Entries will be added to the /etc/oratab file as needed by
Database Configuration Assistant when a database is created
Finished running generic part of root.sh script.
Now product-specific root actions will be performed.
Finished product-specific root actions.
````

执行完成，点ok，安装成功

![](/用户安装26.png)

![](/用户安装27.png)![](/用户安装28.png)![](/用户安装29.png)![](/用户安装30.png)![](/用户安装31.png)![](/用户安装32.png)![](/用户安装33.png)

![](/用户安装34.png)![](/用户安装35.png)

![](/用户安装36.png)

![](/用户安装37.png)