---
typora-root-url: img
---

# 第一章 Linux的概述

## 1.1、Linux的概述

Unix是一个强大的多用户、多任务操作系统，于1969年在AT&T的贝尔实验室开发，UNIX的商标权由国际开放标准组织（The Open Group）所拥有。UNIX操作系统是商业版，需要收费，价格比Microsoft Windows正版要贵一些。Linux是基于Unix开发的，Linux是一种自由和开放源码的操作系统，存在着许多不同的Linux版本，但它们都使用了Linux内核。Linux可安装在各种计算机硬件设备中，比如手机、平板电脑、路由器、台式计算机。Linux诞生于1991年10月5日，是由芬兰赫尔辛基大学学生Linus Torvalds和后来加入的众多爱好者共同开发完成。

## 1.2、Linux的历史

Linux最初是由芬兰赫尔辛基大学学生Linus Torvalds由于自己不满意教学中使用的MINIX操作系统，所以在1990年底由于个人爱好设计出了Linux系统核心。后来发布于芬兰最大的ftp服务器上，用户可以免费下载，所以它的周边的程序越来越多，Linux本身也逐渐发展壮大起来，之后Linux在不到三年的时间里成为了一个功能完善，稳定可靠的操作系统。

## 1.3、Linux的版本

Linux的版本分为两种：内核版本和发行版本，内核版本是指在Linus领导下的内核小组开发维护的系统内核的版本号 。

## 1.4、Linux的产品

![](/Linux.png)

## 第二章 Linux的安装

### 2.1、安装虚拟机

下载地址：[打开链接](https://download3.vmware.com/software/wkst/file/VMware-workstation-full-15.5.6-16341506.exe)

备用下载：[打开链接](https://www.jb51.net/softs/638376.html?tdsourcetag=s_pcqq_aiomsg)

## 第三章 文件管理

### 3.1、目录结构

![](/目录结构.png)

### 3.2、切换目录

- 切换到指定目录中：cd 目录名
- 切换到上一级目录：cd …
- 切换到系统根目录：cd /
- 切换到用户主目录：cd ~
- 切换到上一个目录：cd -
- 显示当前目录路径：pwd

### 3.3、创建目录

- 创建单级目录：mkdir 目录名
- 创建多级目录：mkdir -p 目录名1/目录名2/…

### 3.4、查看目录

- 查看当前目录下的文件列表（普通格式）：ls
- 查看当前目录下的文件列表（详细格式）：ll

### 3.5、复制目录

- 复制目录：cp -r 源目录 目标目录

### 3.6、剪切目录

- 剪切/重命名目录：mv 源目录 目标目录

### 3.7、删除目录

- 删除目录：rm -rf 目标目录

### 3.8、创建文件

- 创建文件：touch 文件

### 3.9、查看文件

- cat 命令，用于显示行数较少文件的内容，不能进行上下翻页，格式：cat 文件
- more命令，用于显示行数较多文件的内容，只能进行往下翻页，格式：more 文件
  - 查看的时候使用q键退出，空格显示下一页数据，回车显示下一行数据
- less 命令，用于显示行数较多文件的内容，可以进行上下翻页，格式：less -m 文件
  - 查看的时候使用q键退出，空格显示下一页数据，回车显示下一行数据
  - PageUp显示上一页数据，PageDown显示下一页数据
- tail 命令，用于显示文件最后几行的数据，实际使用的非常多，格式：tail 文件
  - 指定行数：tail -n 文件
  - 动态查看：tail -f 文件

### 3.10、剪切文件

- 复制/重命名文件：mv 源文件 目标文件

### 3.11、删除文件

- 删除文件：rm 文件

### 3.12、查找文件

- 查找文件名称是以ins开头的文件（普通格式）：find / -name “ins*”
- 查找文件名称是以ins开头的文件（详细格式）：find / -name “ins*” –ls
- 查找用户itcast的文件（普通格式）：find / –user itcast
- 查找用户itcast的文件（详细格式）：find / –user itcast –ls

### 3.13、压缩解压

- 压缩：tar –zcvf xxx.tar.gz ./*
- 解压：tar -zxvf xxx.tar.gz [-C 目标目录]

### 3.14、Vi编辑器

**《三种模式》：命令模式、插入模式、底行模式**

- 切换到命令模式：按esc键

- 切换到插入模式：在命令行模式按i、o、a键

  - i 在当前位置前插入
  - I 在当前行首插入
  - a 在当前位置后插入

  - A 在当前行尾插入

  - o 在当前行之后插入一行

  - O 在当前行之前插入一行

- 切换到底行模式：在命令行模式按 : (冒号)键配合相应代码使用

  - 查看后退出：:q

  - 保存并退出：:wq

  - 不保存退出：:q!

**《常见快捷键》：在命令行模式下进行**

- dd ：删除当前行
- yy ：复制当前行
- nyy：从当前行向后复制几行
- p ：粘贴
- R ：替换

## 第四章 用户管理

### 4.1、添加用户

- 添加用户：useradd 新用户名
- 添加用户：useradd 新用户名 -d 指定用户HOME目录
- 添加用户：useradd 新用户名 -g 指定的组名

### 4.2、修改密码

- 修改密码：passwd 用户名

### 4.3、切换用户

- 切换用户：su 用户名

### 4.4、删除用户

- 删除用户不会删除HOME目录：userdel 用户名
- 删除用户并且删除HOME目录：userdel -r 用户名

### 4.5、添加组

- 添加组：groupadd 用户名

### 4.6、删除组

- 删除组：groupdel 用户名

注意：如果该组有用户成员，必须先删除用户才能删除组

### 4.7、重要文件

- 【用户文件】：/etc/passwd
- 【密码文件】：/etc/shadow
- 【组文件】 ：/etc/group

## 第五章 权限管理

### 5.1、文件权限

![](/文件权限.gif)

![](/文件权限2.png)

- r ：对文件是指可读取文件内容、对目录是指可ls查看这个目录
- w：对文件是指可修改文件内容，对目录是指可以在其中创建或删除子节点（目录或文件）
- x ：对文件是指是否可以被运行，对目录是指是否可以cd进入这个目录

### 5.2、文件类型

- 普通文件（-）： 包括文本文件、数据文件、可执行的二进制文件等
- 目录文件（d）： Linux系统把目录看成是一种特殊的文件，利用它构成文件系统的树型结构
- 设备文件（s）： Linux系统把每一个设备都看成是一个文件

### 5.3、权限管理

- chmod：变更文件或目录的权限
  - chmod 755 a.txt
  - chmod u=rwx,g=rw,o=r a.txt
- chown：变更文件或目录的所属用户和所属组
  - chown 用户:组名 文件名
  - chown 用户:组名 目录名
  - chown -R 用户:组名 目录名

## 第六章 软件安装

### 6.1、rpm包安装方式

- 安装：rpm –ivh 软件包名
- 升级：rpm -Uvh 软件包名
- 卸载：rpm -e 软件名
- 查找：rpm -qa | grep 软件名

### 6.2、yum源安装方式

- 安装：yum install 软件名
- 更新：yum update 软件名
- 卸载：yum remove 软件名
- 查找：yum search 软件名

### 6.3、常用软件

- yum -y install wget
- yum -y install gcc
- yum -y install gcc-c++
- yum -y install vim
- yum -y install lrzsz

### 6.4、上传下载

- 安装：yum -y install lrzsz
- 上传：rz
- 下载：sz filename1 filename2 filename3

## 第七章 网络配置

### 7.1、主机名设置

- 查看主机名：hostname
- 临时修改：hostname 新主机名
- 永久修改：vi /etc/sysconfig/network

### 7.2、IP地址设置

- 查看IP地址：ifconfig
- 临时修改：ifconfig eth0 新IP地址
- 永久修改：vi /etc/sysconfig/network-scripts/ifcfg-eth0

### 7.3、域名映射设置

- 域名映射：vi /etc/hosts

### 7.4、网络服务设置

- 查看指定服务：service 服务名 status
- 启动指定服务：service 服务名 start
- 停止指定服务：service 服务名 stop

- 重启指定服务：service 服务名 restart

### 7.5、防火墙设置

- 查看防火墙：service iptables status

临时设置：

- 启动防火墙：service iptables start

- 关闭防火墙：service iptables stop
- 重启防火墙：service iptables restart

永久设置：

- 允许防火墙：chkconfig iptables on
- 禁止防火墙：chkconfig iptables off

单独添加：

- /sbin/iptables -I INPUT -p tcp --dport 80 -j ACCEPT

- /sbin/iptables -I INPUT -p tcp --dport 22 -j ACCEPT
- /sbin/iptables -I INPUT -p tcp --dport 3306 -j ACCEPT
- /sbin/iptables -I INPUT -p tcp --dport 8080 -j ACCEPT

- 保存：/etc/rc.d/init.d/iptables save
- 查看：/etc/init.d/iptables status

单独禁止：

- /sbin/iptables -I INPUT -p tcp --dport 80 -j DROP

- /sbin/iptables -I INPUT -p tcp --dport 22 -j DROP
- /sbin/iptables -I INPUT -p tcp --dport 3306 -j DROP
- /sbin/iptables -I INPUT -p tcp --dport 8080 -j DROP
- 保存：/etc/rc.d/init.d/iptables save
- 查看：/etc/init.d/iptables status

## 7.6、自启动管理

自启动的软件或服务应该存放在/etc/init.d/下

- 查看所有：chkconfig --list
- 添加启动：chkconfig --add name
- 删除启动：chkconfig --del name

# 第八章 常用软件

## 8.1、安装JDK

注意：当前Linux为CentOS-6.10-x86_64-minimal.iso

界面：没有图形界面

内存：1GB

硬盘：20GB

连接：SecureCRT，上传文件（rz命令）需要安装：yum -y install lrzsz

**步骤一：下载**

![](/下载.png)

打开下载页面
**步骤二：上传后解压**

![](/上传后解压.png)

**步骤三：配置环境变量**

1. 编辑文件：vi /etc/profile
2. 添加代码：

````java
#set java environment
JAVA_HOME=/usr/local/jdk/jdk1.8.0_261
CLASSPATH=.:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib/dt.jar
PATH=$JAVA_HOME/bin:$PATH
export JAVA_HOME CLASSPATH PATH
````

1. 保存退出：:wq
2. 生效配置：source /etc/profile

**步骤四：检查是否成功**

- java -version