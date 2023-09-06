package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.regular.Decorator;
import ru.geekbrains.lesson1.regular.OtherClass;

/**
 * Класс Main
 */
public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));

//        int n=5; int[] a=new int[n];
//        int[] a = new int[5];
//        int a[]=new int[scan.nextInt()];

//        int[] a=new int[6]{3,5,7,8,9,1};

        int[] a=new int[]{1,2,3};

//        int[] a=new int[10];

//        int a[]={3,5,7};
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}
