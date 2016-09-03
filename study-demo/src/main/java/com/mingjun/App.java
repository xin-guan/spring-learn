package com.mingjun;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
    private static int data = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName() + " put data: " + data);
                    new A().print();
                    new B().print();
                }
            }).start();
        }
    }

    static class A {
        public void print() {
            System.out.println("A from " + Thread.currentThread().getName() + " get Data " + data);
        }
    }


    static class B {
        public void print() {
            System.out.println("A from " + Thread.currentThread().getName() + " get Data " + data);
        }
    }
}
/*
    感觉这个idea编辑器在高分辨率下显示还是非常漂亮的，但是在720P的屏幕显示字体有点模糊，而且edit界面显示的东西较少，
    优势：界面扁平化，非常美观
         代码提示非常只能
    缺点：很多快捷键有点反人类设计
         定制化程度不高，没有eclipse那种可以随心所欲折腾
         输入法在输入中文时候选框不跟随光标
    不过调整字体之后显示还行，其实这两款ide，用久了其中一款都会产生审美疲劳，会觉得另外一款非常不错

    工欲善其事，必先利其器
 */
