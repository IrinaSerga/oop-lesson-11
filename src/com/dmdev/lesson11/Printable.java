package com.dmdev.lesson11;

import java.util.Random;

public interface Printable { // назвываем как будто бы какое-то действие

    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom(){
        System.out.println(RANDOM.nextInt());
        print();
    }  // метод НЕ абстрактрый

    void print();

    static int generateRandom(){
        return RANDOM.nextInt();
    }

}
