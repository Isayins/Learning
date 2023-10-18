# jQuery

## 一、工具

### 1.1、$.each方法

方法描述：一个通用的迭代函数，它可以用来无缝迭代对象和数组。数组和类似数组的对象通过一个长度属性（如一个函数的参数对象）来迭代数字索引，从0到length - 1，其他对象通过其属性名进行迭代。

**需求描述：给定一个数组，使用$.each方法进行遍历输出**

````JavaScript
var arr = [10, 90, 20, 80, 30, 70, 40, 60, 50];
$.each(arr, function (index, element) {
    console.log(index, element);
});
````

![](E:\MyLearning\jQuery\img\foreach.png)

**需求描述：给定一个对象，使用$.each方法进行遍历输出**

````JavaScript
var obj = {
    name: 'Tom',
    age: 28,
    speak: function () {}
};
$.each(obj, function (key, value) {
    console.log(key, value);
});
````

![](E:\MyLearning\jQuery\img\输出2.png)

### 1.2、$.trim方法

方法描述：去掉字符串起始和结尾的空格。

**需求描述：给定一个字符串，去掉该字符串的前后空格**

````JavaScript
var str = '    hello    ';
console.log($.trim(str));
````

![](E:\MyLearning\jQuery\img\输出3.png)

### 1.3、$.type方法

方法描述：确定JavaScript 对象的类型。

**需求描述：给定一个对象，输出该对象的类型**

````JavaScript
var str = '    hello    ';
console.log($.type(str));
````

![](E:\MyLearning\jQuery\img\输出4.png)

### 1.4、$.isArray方法

方法描述：用来测试指定对象是否为一个数组。

**需求描述：给定一个对象，输出该对象是不是数组类型**

````JavaScript
var arr = [10, 90, 20, 80, 30, 70, 40, 60, 50];
console.log($.isArray(arr));
````

![](E:\MyLearning\jQuery\img\输出5.png)

### 1.5、$.isFunction方法

方法描述：用来测试指定对象是否为一个函数。

**需求描述：给定一个对象，输出该对象是不是函数类型**

````JavaScript
var fun = function () {
    console.log("hello");
};
console.log($.isFunction(fun));
````

## 二、ajax

### 2.1、$.ajax方法

方法描述：执行一个异步的HTTP的请求。

**需求描述：执行一个异步的HTTP GET请求，从服务器加载数据。**

````JavaScript
$.ajax({
    url: '/user/login',
    type: 'get',
    data: {
        username: 'zhangsan',
        password: '123456'
    },
    dataType: 'text',
    success: function (response) {
        alert(response);
    },
    error: function (response) {
        alert(response);
    }
});
````

**需求描述：执行一个异步的HTTP POST请求，从服务器加载数据。**

````JavaScript
$.ajax({
    url: '/user/login',
    type: 'post',
    data: {
        username: 'zhangsan',
        password: '123456'
    },
    dataType: 'text',
    success: function (response) {
        alert(response);
    },
    error: function (response) {
        alert(response);
    }
});
````

### 2.2、$.get方法

方法描述：使用一个HTTP GET请求从服务器加载数据。

这是一个ajax功能的缩写，这相当于:

````JavaScript
$.ajax({
    url: url,
    data: data,
    success: success,
    dataType: dataType
});
````

````JavaScript
$.get('/user/login', {username: 'zhangsan', password: '123456'}, function (response) {
    alert(response);
});
````

### 2.3、$.post方法

方法描述：使用一个HTTP POST请求从服务器加载数据。

这是一个ajax功能的缩写，这相当于:

````JavaScript
$.ajax({
    url: url,
    data: data,
    success: success,
    dataType: dataType
});
````

````JavaScript
$.post('/user/login', {username: 'zhangsan', password: '123456'}, function (response) {
    alert(response);
});
````

## 三、jQuery核心对象

### 3.1、属性

#### 3.1.1、attr()

方法描述：专门操作属性值为非布尔值的属性，该方法读写一体。

**需求描述：设置p标签的title属性为”我是attr修改后的段落标题“**

````javascript
<p id="content" title="我是段落标题">我是段落</p>
````

````javascript
$('#content').attr('title', '我是attr修改后的段落标题');
````

![](D:\MyLearning\jQuery\img\atr.png)

**需求描述：读取p标签的title属性并输出**

````javascript
<p id="content" title="我是段落标题">我是段落</p>
````

````javascript
console.log($('#content').attr('title'));
````

#### 3.1.2、prop()

方法描述：专门操作属性值为布尔值的属性，该方法读写一体。

**需求描述：设置复选框的状态为选中状态**

````javascript
<input type="checkbox">复选框
````

````javascript
$(':checkbox').prop('checked', 'true');
````

![](D:\MyLearning\jQuery\img\prop.png)

**需求描述：读取复选框的选中状态并输出**

````JavaScript
<input type="checkbox" checked>复选框
````

````javascript
console.log($(':checkbox').prop('checked'));
````

![](D:\MyLearning\jQuery\img\prop2.png)

#### 3.1.3、val()

方法描述：该方法主要用于获取表单元素的值和设置表单元素的值，该方法读写一体。

**需求描述：设置文本框的值为”123456“**

````javascript
<input type="text">
````

````javascript
$(':text').val('123456');
````

![](D:\MyLearning\jQuery\img\val.png)

**需求描述：读取文本框的值并输出**

````javascript
<input type="text" value="123456">
````

````javascript
console.log($(':text').val());
````

![](D:\MyLearning\jQuery\img\val2.png)

### 3.2、样式

#### 3.2.1、css()

方法描述：获取匹配元素集合中的第一个元素的样式属性的计算值或设置每个匹配元素的一个或多个CSS属性。

**需求描述：设置div的背景颜色为红色，字体颜色为白色**

````javascript
<div>我是div</div>
````

````javascript
$('div').css({
    'background': 'red',
    'color': 'white'
});
````

![css](D:\MyLearning\jQuery\img\css.png)

**需求描述：获取div的背景颜色和字体颜色并输出**

````javascript
<div style="background: red;color: white">我是div</div>
````

````javascript
console.log($('div').css('background'));
console.log($('div').css('color'));
````

![](D:\MyLearning\jQuery\img\css2.png)

#### 3.2.2、addClass()

方法描述：为每个匹配的元素添加指定的样式类名。

**需求描述：为所有的li添加样式”beauty“**

````javascript
.beauty {
    font-weight: bold;
    font-size: 18px;
    color: coral;
}
````

````javascript
<ul>
    <li>列表项1</li>
    <li>列表项2</li>
    <li>列表项3</li>
    <li>列表项4</li>
</ul>
````

````javascript
$('li').addClass('beauty');
````

![](D:\MyLearning\jQuery\img\addClass.png)

#### 3.2.3、removeClass()

方法描述：移除集合中每个匹配元素上一个，多个或全部样式。

**需求描述：为所有的li移除样式”beauty“**

````javascript
.beauty {
    font-weight: bold;
    font-size: 18px;
    color: coral;
}
````

````javascript
<ul>
    <li class="beauty">列表项1</li>
    <li class="beauty">列表项2</li>
    <li class="beauty">列表项3</li>
    <li class="beauty">列表项4</li>
</ul>
````

````javascript
$('li').removeClass('beauty');
````

![](D:\MyLearning\jQuery\img\removeClass.png)

#### 3.2.4、hasClass()

方法描述：确定任何一个匹配元素是否有被分配给定的样式类。

**需求描述：判断p标签是否包含”beauty“的样式**

````javascript
![hasClass](D:\MyLearning\jQuery\img\hasClass.png).beauty {
    font-weight: bold;
    font-size: 18px;
    color: coral;
}
````

````javascript
<p class="beauty"></p>
````

````javascript
console.log($('p').hasClass('beauty'));
````

![](D:\MyLearning\jQuery\img\hasClass.png)

#### 3.2.5、toggleClass()

方法描述：为匹配的元素集合中的每个元素上添加或删除一个或多个样式类，取决于这个样式类是否存在。

> 注意：如果存在（不存在）就删除（添加）一个样式类

**需求描述：当单击按钮的时候，隐藏div，再次单击按钮的时候，显示div**

````javascript
.hide {
    width: 100px;
    height: 100px;
    display: none;
}
````

````javascript
<button>按钮</button>
<div>我是div</div>
````

````javascript
$('button').click(function () {
    $('div').toggleClass('hide');
});
````

![](D:\MyLearning\jQuery\img\toggleClass.gif)

### 3.3、尺寸

#### 3.3.1、width()

方法描述：获取内容元素width的值。

#### 3.3.2、height()

方法描述：获取内容元素height的值。

#### 3.3.3、innerWidth()

方法描述：获取内容元素width+padding的值。

#### 3.3.4、innerHeight()

方法描述：获取内容元素height+padding的值。

#### 3.3.5、outerWidth()

方法描述：outerWidth(false/true)，获取内容元素width+padding+border的值，如果是true再加上margin的值。

#### 3.3.6、outerHeight()

方法描述：outerHeight(false/true)，获取内容元素height+padding+border的值，如果是true再加上margin的值。

#### 3.3.7、综合演示

**需求描述：创建按一个div，获取以上六种值**

````javascript
.box {
    margin: 30px;
    padding: 20px;
    border: 10px;
    width: 100px;
    height: 100px;
    background: coral;
}
````

````javascript
<div class="box"></div>
````

````javascript
var $box = $('.box');
console.log($box.width(), $box.height());// 100 100
console.log($box.innerWidth(), $box.innerHeight());// 140 140
console.log($box.outerWidth(), $box.outerHeight());// 160 160
console.log($box.outerWidth(true), $box.outerHeight(true));// 220 220
````

### 3.4、位置

#### 3.4.1、offset()

方法描述：相对页面左上角的坐标。

**需求描述：获取div相对页面左上角的坐标**

````javascript
.box {
    width: 100px;
    height: 100px;
    background: coral;
}
````

````javascript
<div class="box"></div>
````

````javascript
var offset = $('.box').offset();
console.log(offset.left, offset.top);
````

![](D:\MyLearning\jQuery\img\offset.png)

#### 3.4.2、position()

方法描述：相对于父元素左上角的坐标。

**需求描述：获取div相对于父元素左上角的坐标**

````javascript
.box-container {
    width: 300px;
    height: 300px;
    background: pink;
    position: absolute;
    left: 20px;
    top: 20px;
}

.box {
    width: 100px;
    height: 100px;
    background: coral;
    position: absolute;
    left: 20px;
    top: 20px;
}
````

````javascript
<div class="box-container">
    <div class="box"></div>
</div>
````

````javascript
var offset = $('.box').position();
console.log(offset.left, offset.top);
````

![](D:\MyLearning\jQuery\img\position.png)

#### 3.4.3、scrollLeft()

方法描述：读取/设置滚动条的X坐标，该方法读写合一。

读取页面滚动条的Y坐标(兼容chrome和IE)

````javascript
var scrollLeft = $(document.body).scrollLeft()+$(document.documentElement).scrollLeft();
````

设置页面滚动条滚动到指定位置(兼容chrome和IE)

````javascript
$('body,html').scrollLeft(60);
````

**需求描述：设置页面的宽度为2000px，设置滚动条的X轴坐标为300px，要求兼容各种浏览器**

````javascript
$('body').css('width', '2000px');
$('html,body').scrollLeft(300);
````

#### 3.4.4、scrollTop()

方法描述：读取/设置滚动条的Y坐标，该方法读写合一。

读取页面滚动条的Y坐标(兼容chrome和IE)

````javascript
var scrollTop = $(document.body).scrollTop()+$(document.documentElement).scrollTop();
````

设置页面滚动条滚动到指定位置(兼容chrome和IE)

````javascript
$('body,html').scrollTop(60);
````

**需求描述：设置页面的高度为2000px，设置滚动条的Y轴坐标为300px，要求兼容各种浏览器**

````javascript
$('body').css('height', '2000px');
$('html,body').scrollTop(300);
````

## 四、操作

### 4.1、DOM内部插入

#### 4.1.1、text()

方法描述：设置/获取元素的文本内容，该方法读写合一。

**需求描述：设置p段落标签的内容为“我是段落”**

````javascript
<p></p>
````

````javascript
$('p').text('我是段落');
````

![](D:\MyLearning\jQuery\img\text.png)

**需求描述：获取p段落标签的内容并输出**

````javascript
<p>我是段落</p>
````

````javascript
console.log($('p').text());
````

![](D:\MyLearning\jQuery\img\text2.png)

#### 4.1.2、html()

方法描述：设置/获取元素的html内容，该方法读写合一。

**需求描述：设置ul列表标签的li列表项**

````javascript
<ul></ul>
````

````javascript
var li = '<li>我是列表项</li>';
$('ul').html(li);
````

![](D:\MyLearning\jQuery\img\html.png)

**需求描述：获取ul列表中的列表项并输出**

````javascript
<ul><li>我是列表项</li></ul>
````

````javascript
console.log($('ul').html());
````

![](D:\MyLearning\jQuery\img\html2.png)

#### 4.1.3、append()

方法描述：向当前匹配的所有元素内部的最后面插入指定内容。

**需求描述：为当前的ul向后添加一个列表项**

````javascript
![append](D:\MyLearning\jQuery\img\append.png)<ul>
    <li>我是列表项1</li>
    <li>我是列表项2</li>
</ul>
````

````javascript
var last = '<li>我是最后一个列表项</li>';
$('ul').append(last);
````

![](D:\MyLearning\jQuery\img\append.png)

#### 4.1.4、appendTo()

方法描述：将指定的内容追加到当前匹配的所有元素的最后面。

**需求描述：为当前的ul向后添加一个列表项**

````javascript
<ul>
    <li>我是列表项1</li>
    <li>我是列表项2</li>
</ul>
````

````javascript
var last = '<li>我是最后一个列表项</li>';
$(last).appendTo($('ul'));
````

![](D:\MyLearning\jQuery\img\appendTo.png)

#### 4.1.5、prepend()

方法描述：向当前匹配的所有元素内部的最前面插入指定内容。

**需求描述：为当前的ul向前添加一个列表项**

````javascript
<ul>
    <li>我是列表项1</li>
    <li>我是列表项2</li>
</ul>
````

````javascript
var first = '<li>我是第一个列表项</li>';
$('ul').prepend(first);
````

![](D:\MyLearning\jQuery\img\prepend.png)

#### 4.1.6、prependTo()

方法描述：将指定的内容追加到当前匹配的所有元素的最前面。

**需求描述：为当前的ul向前添加一个列表项**

````javascript
<ul>
    <li>我是列表项1</li>
    <li>我是列表项2</li>
</ul>
````

````javascript
var first = '<li>我是第一个列表项</li>';
$(first).prependTo($('ul'));
````

![](D:\MyLearning\jQuery\img\prependTo.png)

### 4.2、DOM外部插入

#### 4.2.1、after()

方法描述：在匹配元素集合中的每个元素后面插入参数所指定的内容，作为其兄弟节点。

**需求描述：在div的后边插入一个段落**

````javascript
<div>我是div</div>
````

````javascript
var after = '<p>我是段落</p>';
$('div').after(after);
````

![](D:\MyLearning\jQuery\img\after.png)

#### 4.2.2、before()

方法描述：在匹配元素集合中的每个元素前边插入参数所指定的内容，作为其兄弟节点。

**需求描述：在div的前边插入一个段落**

````javascript
<div>我是div</div>
````

````javascript
var before = '<p>我是段落</p>';
$('div').before(before);
````

![](D:\MyLearning\jQuery\img\before.png)

#### 4.2.3、insertAfter()

方法描述：.after()和.insertAfter() 实现同样的功能。主要的不同是语法，特别是插入内容和目标的位置。 对于 .after()，选择表达式在函数的前面，参数是将要插入的内容。对于 .insertAfter()，刚好相反，内容在方法前面，它将被放在参数里元素的后面。

**需求描述：在div的后边插入一个段落**

````javascript
<div>我是div</div>
````

````javascript
var content = '<p>我是段落</p>';
$(content).insertAfter($('div'));
````

![](D:\MyLearning\jQuery\img\insertAfter.png)

#### 4.2.4、insertBefore()

方法描述：.before()和.insertBefore()实现同样的功能。主要的不同是语法，特别是插入内容和目标的位置。 对于 .before()，选择表达式在函数前面，参数是将要插入的内容。对于 .insertBefore()，刚好相反，内容在方法前面，它将被放在参数里元素的前面。

**需求描述：在div的前边插入一个段落**

````javascript
<div>我是div</div>
````

````javascript
var content = '<p>我是段落</p>';
$(content).insertBefore($('div'));
````

![](D:\MyLearning\jQuery\img\insertBefore.png)

### 4.3、DOM移除

#### 4.3.1、empty()

方法描述：删除所有匹配元素的子元素。

**需求描述：将ul列表下所有的子节点全部移除**

````javascript
<ul>
    <li>列表项1</li>
    <p>我是段落1</p>
    <li>列表项2</li>
    <p>我是段落2</p>
    <li>列表项3</li>
</ul>
````

````javascript
$('ul').empty();
````

![](D:\MyLearning\jQuery\img\empty.png)

#### 4.3.2、remove()

方法描述：删除所有匹配的元素。

> 注意：同时移除元素上的事件及 jQuery 数据

**需求描述：将ul列表下所有的p子节点全部移除**

````javascript
<ul>
    <li>列表项1</li>
    <p>我是段落1</p>
    <li>列表项2</li>
    <p>我是段落2</p>
    <li>列表项3</li>
</ul>
````

````javascript
$('ul>p').remove();
````

![](D:\MyLearning\jQuery\img\remove.png)

### 4.4、DOM替换

#### 4.4.1、replaceWith()

方法介绍：用提供的内容替换集合中所有匹配的元素并且返回被删除元素的集合。

**需求描述：将ul下的所有li替换为p标签**

````javascript
<ul>
    <li>列表项1</li>
    <li>列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
$('ul>li').replaceWith('<p>我是段落</p>');
````

![](D:\MyLearning\jQuery\img\replaceWith.png)

#### 4.4.2、replaceAll()

方法介绍：`.replaceAll()`和`.replaceWith()`功能类似，但是目标和源相反。

**需求描述：将ul下的所有li替换为p标签**

````javascript
<ul>
    <li>列表项1</li>
    <li>列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
$('<p>我是段落</p>').replaceAll($('ul>li'));
````

![](D:\MyLearning\jQuery\img\replaceAll.png)

### 4.5、DOM拷贝

#### 4.5.1、clone()

方法描述：创建一个匹配的元素集合的深度拷贝副本。如果传入一个true，则表示是否会复制元素上的事件处理函数，从jQuery 1.4开始，元素数据也会被复制。

**需求描述：为ul列表创建一个深克隆并追加到body后**

````javascript
<ul>
    <li>列表项1</li>
    <li>列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
var ul = $('#ul').clone();
$('body').append(ul);
````

![](D:\MyLearning\jQuery\img\clone.png)

### 4.6、DOM遍历

#### 4.6.1、parent()

方法描述：获取集合中每个匹配元素的父元素，可以提供一个可选的选择器来进行筛选。

**需求描述：输出id为two的li的父元素**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
console.log($('#two').parent()[0]);
````

![](D:\MyLearning\jQuery\img\parent.png)

#### 4.6.2、children()

方法描述：获取集合中每个匹配元素的子元素，可以提供一个可选的选择器来进行筛选。

**需求描述：输出ul下的所有子元素**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
var childrens = $('ul').children();
for (var i = 0; i < childrens.length; i++) {
    console.log(childrens[i]);
}
````

![](D:\MyLearning\jQuery\img\children.png)

#### 4.6.3、prev()

方法描述：获取集合中每个匹配元素紧邻的前一个兄弟元素，可以提供一个可选的选择器来进行筛选。

**需求描述：获取id为two元素的前一个兄弟元素并输出**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
console.log($('#two').prev()[0]);
````

![](D:\MyLearning\jQuery\img\prev.png)

#### 4.6.4、prevAll()

方法描述：获得集合中每个匹配元素的所有前面的兄弟元素，可以提供一个可选的选择器来进行筛选。

**需求描述：获取id为two元素的前边所有的兄弟元素并输出**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
var prevs = $('#two').prevAll();
for (var i = 0; i < prevs.length; i++) {
    console.log(prevs[i]);
}
````

![](D:\MyLearning\jQuery\img\prevAll.png)

#### 4.6.5、next()

方法描述：获取集合中每个匹配元素紧邻的后一个兄弟元素，可以提供一个可选的选择器来进行筛选。

**需求描述：获取id为two元素的后一个兄弟元素并输出**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
console.log($('#two').next()[0]);
````

![](D:\MyLearning\jQuery\img\next.png)

#### 4.6.6、nextAll()

方法描述：获得集合中每个匹配元素的所有后面的兄弟元素，可以提供一个可选的选择器来进行筛选。

**需求描述：获取id为two元素的后边所有的兄弟元素并输出**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
var nexts = $('#two').nextAll();
for (var i = 0; i < nexts.length; i++) {
    console.log(nexts[i]);
}
````

![](D:\MyLearning\jQuery\img\nextAll.png)

#### 4.6.7、siblings()

方法描述：获得集合中每个匹配元素的兄弟元素，可以提供一个可选的选择器来进行筛选。

**需求描述：获取id为two元素的所有兄弟元素并输出**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
var siblings = $('#two').siblings();
for (var i = 0; i < siblings.length; i++) {
    console.log(siblings[i]);
}
````

![](D:\MyLearning\jQuery\img\siblings.png)

## 五、遍历

### 5.1、遍历

#### 5.1.1、each()

方法描述：遍历一个jQuery对象，为每个匹配元素执行一个函数。

**需求描述：获取每一个li元素并把每一个li元素的标签及内容输出**

````javascript
<ul>
    <p>我是段落1</p>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
    <p>我是段落2</p>
</ul>
````

````javascript
$('li').each(function (index, element) {
    console.log(index, element);
});
````

![](D:\MyLearning\jQuery\img\each.png)

### 5.2、筛选

#### 5.2.1、first()

方法描述：获取匹配元素集合中第一个元素。

**需求描述：设置ul下第一个li的背景为红色**

````javascript
<ul>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
$('ul>li').first().css('background', 'red');
````

![](D:\MyLearning\jQuery\img\first.png)

#### 5.2.2、last()

方法描述：获取匹配元素集合中最后一个元素。

**需求描述：设置ul下最后一个li的背景为红色**

````javascript
<ul>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
$('ul>li').last().css('background', 'red');
````

![](D:\MyLearning\jQuery\img\last.png)

#### 5.2.3、eq()

方法描述：获取匹配元素集合中指定位置索引的一个元素。

> 注意：索引下标从0开始

**需求描述：设置ul下第二个li的背景为红色**

````javascript
<ul>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
$('ul>li').eq(1).css('background', 'red');
````

![](D:\MyLearning\jQuery\img\eq.png)

#### 5.2.4、not()

方法描述：从匹配的元素集合中移除指定的元素。

**需求描述：设置ul下li标签的背景为红色，排除第二个li**

````javascript
<ul>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
var two = $('ul>li').eq(1);
$('ul>li').not(two).css('background', 'red');
````

![](D:\MyLearning\jQuery\img\not.png)

#### 5.2.5、filter()

方法描述：筛选元素集合中匹配表达式或通过传递函数测试的元素集合。

![](D:\MyLearning\jQuery\img\filter.png)

**需求描述：查找所有id为two的li标签设置其背景为红色**

````javascript
<ul>
    <li>列表项1</li>
    <li id="two">列表项2</li>
    <li>列表项3</li>
</ul>
````

````javascript
$('ul>li').filter('[id=two]').css('background', 'red');
````

![](D:\MyLearning\jQuery\img\filter1.png)

## 六、事件

### 6.1、浏览器事件

#### 6.1.1、resize()

方法描述：为 JavaScript 的 “resize” 事件绑定一个处理函数，或者触发元素上的该事件。

**需求描述：当浏览器窗口的尺寸改变时，控制台输出“浏览器尺寸改变了”**

````javascript
$(window).resize(function () {
    console.log('浏览器尺寸改变了');
});
````

![](D:\MyLearning\jQuery\img\resize.png)

#### 6.1.2、scroll()

方法描述：为 JavaScript 的 “scroll” 事件绑定一个处理函数，或者触发元素上的该事件。

**需求描述：当浏览器窗口的滚动条滚动时，控制台输出“浏览器滚动条改变了”**

````javascript
body {
    height: 2000px;
}
````

````javascript
$(window).scroll(function () {
    console.log('浏览器滚动条改变了');
});
````

![](D:\MyLearning\jQuery\img\scroll.png)

### 6.2、事件绑定

#### 6.2.1、on()

方法描述：在选定的元素上绑定一个或多个事件处理函数。

**需求描述：为按钮添加单击事件，当按钮单击的时候，向控制台输出“按钮被单击了”**

````javascript
<button>按钮</button>
````

````javascript
$('button').on('click',function () {
    console.log('按钮被单击了');
});
````

![](D:\MyLearning\jQuery\img\on.png)

#### 6.2.2、off()

方法描述： 移除一个事件处理函数。

**需求描述：为按钮添加单击事件，然后再解绑，这时候你在点击按钮看看是不是不会输出信息了**

````javascript
<button>按钮</button>
````

````javascript
$('button').on('click',function () {
    console.log('按钮被单击了');
});

$('button').off('click');
````

![](D:\MyLearning\jQuery\img\off.png)

### 6.3、事件委托

#### 6.3.1、delegate()

方法描述：设置事件委托。

**需求描述：为ul下的所有li添加单击事件，要求将该单击事件委托给ul，当单击li时，所对应的li背景变为红色**

````javascript
<ul>
    <li>1111</li>
    <li>2222</li>
    <li>3333</li>
    <li>4444</li>
</ul>
````

````javascript
$('ul').delegate('li', 'click', function () {
    this.style.background = 'red';
});
````

![](D:\MyLearning\jQuery\img\delegate.gif)

#### 6.3.2、undelegate()

方法描述：移除事件委托。

**需求描述：要求移除上一节中设置的事件委托，然后在分别点击li进行验证是否移除事件委托**

````javascript
<ul>
    <li>1111</li>
    <li>2222</li>
    <li>3333</li>
    <li>4444</li>
</ul>
````

````javascript
// 设置事件委托
$('ul').delegate('li', 'click', function () {
    this.style.background = 'red';
});

// 移除事件委托
$('ul').undelegate('click');
````

![](D:\MyLearning\jQuery\img\undelegate.gif)

### 6.4、事件对象

| 对象属性名称            | 对象属性描述           |
| ----------------------- | ---------------------- |
| event.currentTarget     | 当前执行的DOM元素。    |
| event.target            | 触发事件的DOM元素。    |
| event.pageX             | 相对于页面的左上角。   |
| event.pageY             | 相对于页面的顶部。     |
| event.clientX           | 相对于视口的左上角。   |
| event.clientY           | 相对于视口的顶部。     |
| event.offsetX           | 相对于事件元素左上角。 |
| event.offsetY           | 相对于事件元素顶部。   |
| event.key               | 键盘的按键信息。       |
| event.preventDefault()  | 阻止事件默认行为。     |
| event.stopPropagation() | 防止事件向外冒泡。     |

### 6.5、表单事件

#### 6.5.1、focus()

方法描述：当获取焦点时触发所绑定的函数。

**需求描述：当文本框获取焦点时，设置其背景为红色**

````javascript
<input type="text">
````

````javascript
$(':text').focus(function () {
    $(this).css('background', 'red');
});
````

![](D:\MyLearning\jQuery\img\focus.gif)

#### 6.5.2、blur()

方法描述：当失去焦点时触发所绑定的函数。

**需求描述：当文本框获取焦点时，设置其背景为红色，当文本框失去焦点时，设置其背景为绿色**

````javascript
<input type="text">
````

````javascript
$(':text').focus(function () {
    $(this).css('background', 'red');
});
$(':text').blur(function () {
    $(this).css('background', 'green');
});
````

![](D:\MyLearning\jQuery\img\blur.gif)

#### 6.5.3、change()

方法描述：当内容改变时触发所绑定的函数。

**需求描述：当文本框内容改变时，就向控制台输出当前文本框的内容**

````javascript
<input type="text">
````

````javascript
$(':text').change(function () {
    console.log($(this).val());
});
````

![](D:\MyLearning\jQuery\img\change.gif)

**需求描述：当选择框的内容改变时，就向控制台输出当前选中项的内容**

````javascript
<select>
    <option>河北</option>
    <option>河南</option>
    <option>上海</option>
    <option>北京</option>
    <option>广东</option>
</select>
````

````javascript
$('select').change(function () {
    console.log($(this).val());
});
````

![](D:\MyLearning\jQuery\img\change2.gif)

#### 6.5.4、select()

方法描述：当内容选择时触发所绑定的函数。

**需求描述：当文本框的内容被选择时，就向控制台输出当前文本框的内容**

````javascript
<input type="text" value="123456">
````

````javascript
$('input').select(function () {
    console.log($(this).val());
});
````

![](D:\MyLearning\jQuery\img\select.gif)

#### 6.5.5、submit()

方法描述：当表单提交时触发所绑定的函数。

**需求描述：当表单提交的时候，弹出对话框“表单提交了”**

````javascript
<form action="#">
    <input type="submit">
</form>
````

````javascript
$('form').submit(function () {
    alert('表单提交了');
});
````

![](D:\MyLearning\jQuery\img\submit.gif)

### 6.6、鼠标事件

#### 6.6.1、click()

方法描述：当鼠标单击时调用所绑定的函数。

**需求描述：为按钮绑定一个单击函数，然后点击按钮，在控制台输出“按钮被单击了”**

````javascript
<button>按钮</button>
````

````javascript
$('button').click(function () {
    console.log('按钮被单击了');
});
````

![](D:\MyLearning\jQuery\img\click.gif)

#### 6.6.2、dblclick()

方法描述：当鼠标双击时调用所绑定的函数。

**需求描述：为按钮绑定一个双击函数，然后双击按钮，在控制台输出“按钮被单击了”**

````javascript
<button>按钮</button>
````

````javascript
$('button').dblclick(function () {
    console.log('按钮被双击了');
});
````

![](D:\MyLearning\jQuery\img\dblclick.gif)

#### 6.6.3、mousedown()

方法描述：当鼠标左键按下的时候调用所绑定的函数。

**需求描述：当鼠标左键按下的时候，控制台输出“鼠标左键按下”**

````javascript
<button>按钮</button>
````

````javascript
$('button').mousedown(function () {
    console.log('鼠标左键按下');
});
````

![](D:\MyLearning\jQuery\img\mousedown.gif)

#### 6.6.4、mouseup()

方法描述：当鼠标左键松开的时候调用所绑定的函数。

**需求描述：当鼠标左键松开的时候，控制台输出“鼠标左键松开”**

````javascript
<button>按钮</button>
````

````javascript
$('button').mouseup(function () {
    console.log('鼠标左键松开');
});
````

![](D:\MyLearning\jQuery\img\mouseup.gif)

#### 6.6.5、mouseenter()

方法描述：当鼠标进入目标元素的时候调用所绑定的函数。

**需求描述：创建两个div，当鼠标移到外层div的时候，向控制台输出“mouse enter”**

````javascript
.outer {
    width: 200px;
    height: 200px;
    background: coral;
}

.inner {
    width: 100px;
    height: 100px;
    background: pink;
}
````

````javascript
<div class="outer">
    <div class="inner"></div>
</div>
````

````javascript
$('.outer').mouseenter(function () {
    console.log('mouse enter');
});
````

![](D:\MyLearning\jQuery\img\mouseenter.gif)

#### 6.6.6、mouseleave()

方法描述：当鼠标离开目标元素的时候调用所绑定的函数。

**需求描述：创建两个div，当鼠标移出外层div的时候，向控制台输出“mouse leave”**

````javascript
.outer {
    width: 200px;
    height: 200px;
    background: coral;
}

.inner {
    width: 100px;
    height: 100px;
    background: pink;
}
````

````javascript
<div class="outer">
    <div class="inner"></div>
</div>
````

````javascript
$('.outer').mouseleave(function () {
    console.log('mouse leave');
});
````

![](D:\MyLearning\jQuery\img\mouseleave.gif)

#### 6.6.7、mouseover()

方法描述：当鼠标进入目标元素的时候调用所绑定的函数。

> 注意：mouseenter事件和mouseover的不同之处是事件的冒泡的方式。mouseenter 事件只会在绑定它的元素上被调用，而不会在后代节点上被触发。
>

**需求描述：创建两个div，当鼠标移到外层div的时候，向控制台输出“mouse over”，鼠标移到内层div的时候，向控制台输出“mouse over”，当鼠标移到外层div的时候，向控制台输出“mouse over”**

````javascript
.outer {
    width: 200px;
    height: 200px;
    background: coral;
}

.inner {
    width: 100px;
    height: 100px;
    background: pink;
}
````

````javascript
<div class="outer">
    <div class="inner"></div>
</div>
````

````javascript
$('.outer').mouseover(function () {
    console.log('mouse over');
});
````

![](D:\MyLearning\jQuery\img\mouseover.gif)

#### 6.6.8、mouseout()

方法描述：当鼠标离开目标元素的时候调用所绑定的函数。

> 注意：mouseleave事件和mouseout的不同之处是事件的冒泡的方式。mouseleave 事件只会在绑定它的元素上被调用，而不会在后代节点上被触发。
>

**需求描述：创建两个div，当鼠标移出外层div的时候，向控制台输出“mouse out”**

````javascript
.outer {
    width: 200px;
    height: 200px;
    background: coral;
}

.inner {
    width: 100px;
    height: 100px;
    background: pink;
}
````

````javascript
<div class="outer">
    <div class="inner"></div>
</div>
````

````javascript
$('.outer').mouseout(function () {
    console.log('mouse out');
});
````

![](D:\MyLearning\jQuery\img\mouseout.gif)

#### 6.6.9、mousemove()

方法描述：当鼠标指针在元素内移动时，`mousemove`事件就会被触发，任何HTML元素都可以接受此事件。

**需求描述：鼠标在div内移动，获取当前鼠标相对div的位置坐标**

````javascript
.outer {
    width: 200px;
    height: 200px;
    background: black;
    position: absolute;
    left: 20px;
    top: 20px;
}
````

````javascript
<div class="outer"></div>
````

````javascript
$('.outer').mousemove(function (event) {
    console.log(event.offsetX, event.offsetY);
});
````

![](D:\MyLearning\jQuery\img\mousemove.gif)

#### 6.6.10、hover()

方法描述：`.hover()`方法是同时绑定 `mouseenter`和 `mouseleave`事件。

**需求描述：当鼠标进入div设置背景为红色，当鼠标移出div设置背景为绿色，默认背景为黑色**

````javascript
.outer {
    width: 200px;
    height: 200px;
    background: black;
}
````

````javascript
<div class="outer"></div>
````

````javascript
$('.outer').hover(function () {
    $(this).css('background', 'red');
}, function () {
    $(this).css('background', 'green');
});
````

![](D:\MyLearning\jQuery\img\hover.gif)

### 6.7、键盘事件

#### 6.7.1、keydown()

方法描述：当键盘按键按下的时候调用绑定的函数。

**需求描述：当键盘按键按下的时候，输出当前的按键**

````javascript
<input type="text">
````

````javascript
$(':text').keydown(function (event) {
    console.log(event.key);
});
````

![](D:\MyLearning\jQuery\img\keydown.gif)

#### 6.7.2、keyup()

方法描述：当键盘按键松开的时候调用绑定的函数。

**需求描述：当键盘按键松开的时候，输出当前的按键**

````javascript
<input type="text">
````

````javascript
$(':text').keyup(function (event) {
    console.log(event.key);
});
````

![](D:\MyLearning\jQuery\img\keyup.gif)

#### 6.7.3、keypress()

方法描述：keypress与keydown类似，当键盘按键按下的时候调用绑定的函数。

**需求描述：当键盘按键按下的时候，输出当前的按键**

````javascript
<input type="text">
````

````javascript
$(':text').keypress(function (event) {
    console.log(event.key);
});
````



![](D:\MyLearning\jQuery\img\keypress.gif)

## 七、动画

### 7.1、基础

#### 7.1.1、hide()

方法描述：隐藏元素。

**需求描述：创建一个显示div，然后隐藏该元素**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: block;
}
````

````javascript
<div class="box"></div>
````

````javascript
$('.box').hide();
````

![](D:\MyLearning\jQuery\img\hide.png)

#### 7.1.2、show()

方法描述：显示元素。

**需求描述：创建一个隐藏div，然后显示该元素**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: none;
}
````

````javascript
<div class="box"></div>
````

````javascript
$('.box').show();
````

![](D:\MyLearning\jQuery\img\show.png)

#### 7.1.3、toggle()

方法描述：如果隐藏就设置为显示，如果显示就设置为隐藏。

**需求描述：创建一个按钮，控制div显示和隐藏**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: block;
}
````

````javascript
<button>隐藏/显示</button>
<div class="box"></div>
````

````javascript
$('button').click(function () {
    $('.box').toggle();
});
````

![](D:\MyLearning\jQuery\img\toggle.gif)

### 7.2、渐变

#### 7.2.1、fadeIn()

方法描述：通过淡入的方式显示匹配元素。

**需求描述：创建一个按钮，控制div缓慢淡入**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: none;
}
````

````javascript
<button>淡入</button>
<div class="box"></div>
````

````javascript
$('button').click(function () {
    $('.box').fadeIn('slow');
});
````

![](D:\MyLearning\jQuery\img\fadeIn.gif)

#### 7.2.2、fadeOut()

方法描述：通过淡出的方式隐藏匹配元素。

**需求描述：创建一个按钮，控制div缓慢淡出**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: block;
}
````

````javascript
<button>淡出</button>
<div class="box"></div>
````

````javascript
$('button').click(function () {
    $('.box').fadeOut('slow');
});
````

![](D:\MyLearning\jQuery\img\fadeOut.gif)

#### 7.2.3、fadeToggle()

方法描述：用淡入淡出动画显示或隐藏一个匹配元素。

**需求描述：创建一个按钮，控制div淡入和淡出**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: block;
}
````

````javascript
<button>淡出/淡入</button>
<div class="box"></div>
````

````javascript
$('button').click(function () {
    $('.box').fadeToggle('slow');
});
````

![](D:\MyLearning\jQuery\img\fadeToggle.gif)

### 7.3、滑动

#### 7.3.1、slideDown()

方法描述：用滑动动画显示一个匹配元素。

**需求描述：创建一个按钮，控制div滑动显示**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: none;
}
````

````javascript
<button>滑动显示</button>
<div class="box"></div>
````

````javascript
$('button').click(function () {
    $('.box').slideDown();
});
````

![](D:\MyLearning\jQuery\img\slideDown.gif)

#### 7.3.2、slideUp()

方法描述：用滑动动画隐藏一个匹配元素。

**需求描述：创建一个按钮，控制div滑动隐藏**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: block;
}
````

````javascript
<button>滑动隐藏</button>
<div class="box"></div>
````

````javascript
$('button').click(function () {
    $('.box').slideUp();
});
````

![](D:\MyLearning\jQuery\img\slideUp.gif)

#### 7.3.3、slideToggle()

方法描述：用滑动动画显示或隐藏一个匹配元素。

**需求描述：创建一个按钮，控制div滑动显示和滑动隐藏**

````javascript
.box {
    width: 200px;
    height: 200px;
    background: coral;
    display: block;
}
````

````javascript
<button>滑动隐藏/滑动显示</button>
<div class="box"></div>
````

````javascript
$('button').click(function () {
    $('.box').slideToggle();
});
````

![](D:\MyLearning\jQuery\img\slideToggle.gif)

### 7.4、自定义

#### 7.4.1、animate()

方法描述：根据一组 CSS 属性，执行自定义动画，并且支持链式调用。

**需求描述：创建一个div，默认div宽高100px，背景颜色为黑色，先让div宽度变为200px，再让div高度变为200px**

````javascript
.box {
    width: 100px;
    height: 100px;
    background: black;
}
````

````javascript
<button>自定义动画</button>
<div class="box"></div>
````

````javascript
$('.box')
.animate({
    width: '200'
})
.animate({
    height: '200',
});
````

![](D:\MyLearning\jQuery\img\animate.gif)

#### 7.4.2、stop()

方法描述：停止匹配元素当前正在运行的动画。

## 八、 jQuery插件介绍

### 8.1、扩展jQuery工具

给 **jQuery工具** 添加4个工具方法：

````javascript
min(a, b) : 返回较小的值
max(c, d) : 返回较大的值
leftTrim()  : 去掉字符串左边的空格
rightTrim() : 去掉字符串右边的空格
````

如何实现呢？请参考以下代码：

````javascript
// 扩展jQuery工具的方法
$.extend({
    min: function (a, b) {
        return a < b ? a : b
    },
    max: function (a, b) {
        return a > b ? a : b
    },
    leftTrim: function (str) {
        return str.replace(/^\s+/, '')
    },
    rightTrim: function (str) {
        return str.replace(/\s+$/, '')
    }
});
````

````javascript
// 测试扩展jQuery工具的方法
console.log($.min(3, 5));
console.log($.max(3, 5));
console.log('-----' + $.leftTrim('     hello     ') + '-----');
console.log('-----' + $.rightTrim('     hello     ') + '-----');
````

![]()![扩展jQuery](D:\MyLearning\jQuery\img\扩展jQuery.png)

### 8.2、扩展jQuery对象

给 **jQuery对象** 添加3个功能方法：

````javascript
checkAll()     : 全选
unCheckAll()   : 全不选
reverseCheck() : 全反选
````

如何实现呢？请参考以下代码：

````javascript
// 扩展jQuery对象的方法
$.fn.extend({
    checkAll: function () {
        this.prop('checked', true);
    },
    unCheckAll: function () {
        this.prop('checked', false);
    },
    reverseCheck: function () {
        this.each(function () {
            this.checked = !this.checked;
        });
    }
});
````

````javascript
<input type="checkbox" name="items" value="足球"/>足球
<input type="checkbox" name="items" value="篮球"/>篮球
<input type="checkbox" name="items" value="羽毛球"/>羽毛球
<input type="checkbox" name="items" value="乒乓球"/>乒乓球
<br/>
<input type="button" id="checkedAllBtn" value="全 选"/>
<input type="button" id="checkedNoBtn" value="全不选"/>
<input type="button" id="reverseCheckedBtn" value="全反选"/>
````

````javascript
// 测试扩展jQuery对象的方法
var $items = $(':checkbox[name=items]');
$('#checkedAllBtn').click(function () {
    $items.checkAll();
});
$('#checkedNoBtn').click(function () {
    $items.unCheckAll();
});
$('#reverseCheckedBtn').click(function () {
    $items.reverseCheck();
});
````

![](D:\MyLearning\jQuery\img\扩展jQuery对象.gif)