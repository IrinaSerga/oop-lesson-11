package com.dmdev.lesson11;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        // Laptop() -> Computer() -> Object()
        // Laptop() <- Computer() <- Object()
        new Laptop(); // сначала  Computer constructor , а затем   Laptop constructor
        System.out.println("Hello World!");
        new Laptop();
        /*Computer static init block
        Laptop  static init block
        Computer init block
        Computer constructor
        Laptop init block
        Laptop constructor
        Hello World!
                Computer init block
        Computer constructor
        Laptop init block
        Laptop constructor*/

        // статика загрузится при первой инициализации класса (дальше хранится в стеке)
        // потом загрузятся блоки инициализации и только потом конструкторы классов


    }
}
