package ru.stqa.ptf.sanbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world!");

    int x = 5;
    System.out.println("Площадь квадрата со стороной " + x + " = " + area(x));

    int a = 4;
    int b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и "+ b +" = " + area(a, b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody);
  }

  public static int area(int l){
    return l*l;
  }

  public static int area (int a, int b){
    return a*b;
  }
}