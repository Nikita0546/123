package ru;

public class NestVar {
    public static void main(String[] args) {
        int count=1;
        System.out.println("count = " + count);
        {
         int c=2;
         System.out.println("Первый независимый блок: c =" + c);
         int n =3;
         System.out.println("Первый независимый блок: n = " + n);
        }
        {
            int n=5;
            System.out.println("Второй  независимый блок: n = " + n);
        }
    }
}
