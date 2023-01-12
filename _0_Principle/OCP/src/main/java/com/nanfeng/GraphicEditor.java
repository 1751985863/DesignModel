package com.nanfeng;

/**
 * 错误的例子
 * 我们来看看, 这个代码, 初看是符合要求了, 再想想, 要是我增加一种形状呢? 比如增加三角形.
 *  首先, 要增加一个三角形的类, 继承自Shape
 *  第二, 要增加一个画三角形的方法drawTrriage()
 *  第三, 在draw方法中增加一种类型type=3的处理方案.
 */
public class GraphicEditor {

    public void draw(Shape shape) {
        if (shape.m_type == 1) {
            drawRectangle();
        } else if(shape.m_type == 2) {
            drawCircle();
        } else if (shape.m_type == 3) {
            drawTrriage();
        }
    }

    public void drawRectangle() {
        System.out.println("画长方形");
    }

    public void drawCircle() {
        System.out.println("画圆形");
    }
    public void drawTrriage() {
        System.out.println("画三角形");
    }

    class Shape {
        int m_type;
    }

    class Rectangle extends Shape {
        Rectangle() {
            super.m_type=1;
        }
    }

    class Circle extends Shape {
        Circle() {
            super.m_type=2;
        }
    }
    class Triangle extends Shape {
        public Triangle() {
            super.m_type=3;
        }
    }

}