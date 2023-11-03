package com.org.sample.dinamicarray;
import java.util.Random;
public class DynamicArray {

    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();

        for (int i = 0; i < 100; i++) {
            mal.append(new Random().nextInt(10));
        }

        System.out.println(mal.getIndex());
        System.out.println(mal.getIndex());
        System.out.println(mal);
    }
}

