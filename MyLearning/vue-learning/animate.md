# Animate

## 1. 安装Animate.css

```
npm install animate.css --save
```

## 2. 配置 Animate.css

全局引入：写在main.js中

局部引入：写在要使用的 .vue文件中

```javascript
import animate from "animate.css";
// 动画 animate.css
```

## 3. 在指定元素上使用

```javascript
<div class="animate__animated animate__zoomIn animate__delay-2s animate__slower animate__repeat-2">2秒后缓慢放大进入（播放2次）</div>
```

- **animateanimated 指定使用animate.css中的动画效果**
- **animatezoomIn    指定使用animate.css中的放大进入动画效果**
- **animatedelay-2s  设置动画延迟播放时间，此处为2s，还可设置为1s，2s，3s，4s，5s**
- **animateslower      设置动画的速度，此处为最慢的slower，还可以设置为slower，slow，fast，faster**
- **animaterepeat-2   设置动画播放次数，此处为2次，还可以设置为 1, 2, 3 。若想无限循环播放，使用 animateinfinite**

## 4. 在过渡动画中使用

```javascript
<template>
    <div>
        <button @click="changeShow">切换动画效果</button>
        <transition
                enter-active-class="animate__animated animate__zoomIn"
                leave-active-class="animate__animated animate__zoomOut"
        >
            <div v-show="show">当自定义变量show为true时显示（从最小不断变大到原始大小），为false时不断变小直到隐藏</div>
        </transition>
    </div>
</template>
<script>
    export default {
        data() {
            return {
                show: false
            }
        },
        methods: {
            changeShow() {
                this.show = !this.show
            }
        }
    }
</script>
```

1. 使用 <transition></transition>标签包裹需要添加过渡动画的元素
2. 在 enter-active-class 中指定元素显示的动画效果
3. 在 leave-active-class 中指定元素隐藏的动画效果
4. 在元素上添加v-show或v-if指定来绑定自定义的控制显示隐藏的变量
5. 在指定事件中，通过改变变量的值，来控制指定元素的显隐，当元素显隐状态发生改变时，便能看到过渡动画

## 5. animate.css动画效果的类名

效果详见官网 https://animate.style/

常用类名如下：

```
animate__animated animate__{}
```

### 弹跳

- bounceIn
- bounceInDown
- bounceInLeft
- bounceInRight
- bounceInUp
- bounceOut
- bounceOutDown
- bounceOutLeft
- bounceOutRight
- bounceOutUp

### 渐变

- 
  fadeIn

- fadeInDown
- fadeInDownBig
- fadeInLeft
- fadeInLeftBig
- fadeInRight
- fadeInRightBig
- fadeInUp
- fadeInUpBig
- animatefadeInTopLeft
- animatefadeInTopRight
- animatefadeInBottomLeft
- animatefadeInBottomRight
- fadeOut
- fadeOutDown
- fadeOutDownBig
- fadeOutLeft
- fadeOutLeftBig
- fadeOutRight
- fadeOutRightBig
- fadeOutUp
- fadeOutUpBig
- animatefadeOutTopLeft
- animatefadeOutTopRight
- animatefadeOutBottomRight
- animatefadeOutBottomLeft

### 翻转

- animate__flip
- flipInX
- flipInY
- flipOutX
- flipOutY

### 急速

- lightSpeedInRight
- lightSpeedInLeft
- lightSpeedOutRight
- lightSpeedOutLeft

### 旋转

- rotateIn
- rotateInDownLeft
- rotateInDownRight
- rotateInUpLeft
- rotateInUpRight
- rotateOut
- rotateOutDownLeft
- rotateOutDownRight
- rotateOutUpLeft
- rotateOutUpRight

### 缩放

- zoomIn
- zoomInDown
- zoomInLeft
- zoomInRight
- zoomInUp
- zoomOut
- zoomOutDown
- zoomOutLeft
- zoomOutRight
- zoomOutUp

### 滑动

- slideInDown
- slideInLeft
- slideInRight
- slideInUp
- slideOutDown
- slideOutLeft
- slideOutRight
- slideOutUp

### 回退

- animatebackInDown
- animatebackInLeft
- animatebackInRight
- animatebackInUp
- animatebackOutDown
- animatebackOutLeft
- animatebackOutRight
- animatebackOutUp

### 其他

- bounce  弹跳
- flash 闪现
- pulse  放大后缩小
- rubberBand 左右拉扯变扁后回弹
- animateshakeX  左右震动
- animateshakeY  上下震动
- headShake 向左震动后弹回震动
- swing  跷跷板
- tada   扭转后回弹
- wobble  左摆后回弹
- jello  变成平行四边形后回弹
- hinge 一边掉落悬挂
- rollIn 滚入
- rollOut  滚出

## 6.经典范例 —— 页面向下滚动到指定位置时，顶部显示悬浮搜索框![天猫搜索框](E:\MyLearning\vue-learning\img\天猫搜索框.png)

### 核心代码

#### 添加对页面滚动事件的监听

```javascript
    mounted() {
            // 监听页面滚动事件
            window.addEventListener("scroll", this.showSearch)
        },
```

####  当页面滚动到指定位置时，显示搜索框 

```javascript
        showSearch() {
                // 获取当前滚动条向下滚动的距离
                let scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
                // 当页面滚动到高度300px处时，显示搜索框
                if (scrollTop > 300) {
                    this.showFixedSearch = true;
                } else {
                    this.showFixedSearch = false;
                }
            },
```

#### 悬浮搜索框的样式 fixed

```javascript
    .fixedSearch {
        position: fixed;
        width: 100%;
        z-index: 999;
        background: #f6f6f6;
        height: 120px;
        overflow: hidden;
    }
```

### 完整演示代码

为了使悬浮搜索框的显示和隐藏过渡更自然，范例中使用了animate的动画效果


```javascript
<template>
    <div>
        <transition
                enter-active-class="animate__animated animate__fadeIn"
                leave-active-class="animate__animated animate__fadeOut"
        >
            <div class="fixedSearch" v-show="showFixedSearch">
                <img class="searchBox"
                     src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1022330132,1035223511&fm=26&gp=0.jpg"
                     alt="搜索框图片">
            </div>
        </transition>
        <div class="box100">0</div>
        <div class="box100">100</div>
        <div class="box100">200</div>
        <div class="box100">300</div>
        <div class="box100">400</div>
        <div class="box100">500</div>
        <div class="box100">600</div>
        <div class="box100">700</div>
        <div class="box100">800</div>
        <div class="box100">900</div>
        <div class="box100">1000</div>
    </div>
</template>
<script>
    export default {
        data() {
            return {
                showFixedSearch: false
            }
        },
        mounted() {
            // 监听页面滚动事件
            window.addEventListener("scroll", this.showSearch)
        },
        methods: {
            showSearch() {
                // 获取当前滚动条向下滚动的距离
                let scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
                // 当页面滚动到高度300px处时，显示搜索框
                if (scrollTop > 300) {
                    this.showFixedSearch = true;
                } else {
                    this.showFixedSearch = false;
                }
            },
        }
    }
</script>
<style scoped>
    .fixedSearch {
        position: fixed;
        width: 100%;
        z-index: 999;
        background: #f6f6f6;
        height: 120px;
        overflow: hidden;
    }
 
    .searchBox {
        position: absolute;
        top: -100px;
        left: 50%;
        transform: translateX(-50%);
    }
 
    .box100 {
        height: 100px;
        background: #3a8ee6;
        border: 1px solid black;
    }
</style>
 
```

