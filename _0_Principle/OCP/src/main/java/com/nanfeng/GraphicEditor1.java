package com.nanfeng;

/**
 * 各种类型的形状自己规范自己的行为, 而GraphicEditor.draw()只负责画出来. 当增加一种类型三角形. 只需要
 *  第一: 增加一个三角形的类,实现Shape接口
 *  第二, 调用draw方法,划出来就可以了.
 *
 * 整个过程都是在扩展, 而没有修改原来的类. 这个设计是符合开闭原则的.
 */
public class GraphicEditor1 {

    public void draw(Shape shape) {
        shape.draw();
    }



    interface Shape {
        void draw();
    }

    class Rectangle implements Shape {

        @Override
        public void draw() {
            System.out.println("画矩形");
        }
    }

    class Circle implements Shape {

        @Override
        public void draw() {
            System.out.println("画圆形");
        }
    }

    class Triangle implements Shape {

        @Override
        public void draw() {
            System.out.println("画三角形");
        }
    }

}