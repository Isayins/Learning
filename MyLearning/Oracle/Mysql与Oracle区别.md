- 1、MySQL有自增型主键，创建表的时候可以通过指定auto_increment实现主键自增。Oracle没有自增型主键，一般通过序列实现。

- 2、MySQL默认的事务隔离级别是可重复读，而Oracle默认是读已提交。

- 3、MySQL在存储引擎是MyISAM的时候是不支持事务的，存储引擎是InnoDB的时候才支持事务，而Oracle都支持事务。

- 4、MySQL的字符串是用双引号包着，而Oracle用的是单引号。

- 5、MySQL和Oracle都用group by进行分组，而Oracle使用group by 的时候，select查询的字段必须包含group by 使用到的字段，不然就会报错。

- 6、MySQL使用limit进行分页，而Oracle没有limit，需要用rownum和嵌套查询实现分页。

- 7、MySQL中有null值和空字符串，而Oracle中只有null值，没有空字符串。

- 8、MySQL日期格式转换是用Date_format( ,'%Y-%m-%d')，而Oracle用to_char( ,'yyyy-mm-dd')或者to_date