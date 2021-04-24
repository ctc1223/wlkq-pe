window.onload = function () {
    // 导航栏
    //需求：当鼠标滑过任意的栏目时，下面的小长方形都会滑动跟随
    //1.获取相关元素
    var nav_wrap = document.getElementById("nav_wrap");
    var liArr = nav_wrap.children[0].children;
    var width = liArr[0].offsetWidth;
    var span = nav_wrap.children[1];
    //遍历li元素
    for (var i = 0; i < liArr.length; i++) {
        liArr[i].index = i;
        //当滑过li时，span开始运动
        liArr[i].onmouseover = function () {
            for (var j = 0; j < liArr.length; j++) {
                liArr[j].className = "";
            }
            this.className = "current";
            animate(span, this.index * width);
        }
        //当鼠标离开全部的元素时，回到刚开始的状态
        liArr[i].onmouseout = function () {
            for (var k = 0; k < liArr.length; k++) {
                liArr[k].className = "";
            }
            animate(span, 0);
            liArr[0].className = "current";
        }
    }
    //2.书写事件驱动程序
    function animate(ele, target) {
        clearInterval(ele.timer);
        ele.timer = setInterval(function () {
            var step = (target - ele.offsetLeft) / 10;
            step = step > 0 ? Math.ceil(step) : Math.floor(step);
            ele.style.left = ele.offsetLeft + step + "px";
            var val = target - ele.offsetLeft;
            if (Math.abs(val) < Math.abs(step)) {
                ele.style.left = target + "px";
                clearInterval(ele.timer);
            }
        }, 20)
    }

    // 轮播图
    var wrap = document.getElementById('wrap'),
        pic = document.getElementById('pic'),
        list = document.getElementById('list').getElementsByTagName('li'),
        index = 0,
        timer = null;

    // 若果有在等待的定时器，则清掉
    if (timer) {
        clearInterval(timer);
        timer = null;
    }

    // 自动切换
    timer = setInterval(autoPlay, 5000);

    // 定义并调用自动播放函数
    function autoPlay() {
        index++;
        if (index >= list.length) {
            index = 0;
        }
        changeImg(index);
    }

    // 定义图片切换函数
    function changeImg(curIndex) {
        for (var j = 0; j < list.length; j++) {
            list[j].className = "";
        }
        // 改变当前显示索引
        list[curIndex].className = "on";
        pic.style.marginTop = -535 * curIndex + "px";
        index = curIndex;
    }

    // 鼠标划过整个容器时停止自动播放
    wrap.onmouseover = function () {
        clearInterval(timer);
    }

    // 鼠标离开整个容器时继续播放至下一张
    wrap.onmouseout = function () {
        timer = setInterval(autoPlay, 5000);
    }

    // 遍历所有数字导航实现划过切换至对应的图片
    for (var i = 0; i < list.length; i++) {
        list[i].id = i;
        list[i].onclick = function () {
            clearInterval(timer);
            changeImg(this.id);
        }
    }
}