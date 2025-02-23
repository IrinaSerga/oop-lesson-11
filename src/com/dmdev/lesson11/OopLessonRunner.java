package com.dmdev.lesson11;

import com.dmdev.hometask.encapsulation.MoneyOperation;

public class OopLessonRunner extends Object{ //extends Object - по деыолту наследуемся от класса Object

    public static void main(String[] args) {
//        Ssd ssd = new Ssd(500);
//        Ram ram = new Ram(1024);
////        Computer computer = new Computer(ssd, ram);
////        computer.load();
//        double sin = Math.sin(Math.toRadians(45)); //скрыта сложность реализации
//
//        Laptop laptop = new Laptop(new Ssd(512), new Ram(250), 2);
//        laptop.open();
//        laptop.load();
//
//        //Class<? extends Laptop> aClass = laptop.getClass();


        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2); // Laptop Mobile  являются Computer
        //laptop.load();

       // System.out.println();

        Computer mobile = new Mobile(new Ssd(125), new Ram(512)); // Mobile mobile - тип ссылки , а new Mobile - тип объекта

        Laptop laptop1 = new Laptop(new Ssd(2000), new Ram(20000), 5);
       // mobile.load();
       //loadComputers(laptop, mobile);
       printInformation(new Computer[]{laptop, mobile, laptop1});


    }

    // интерфейс - открытый функционал, у нас это load() с разными реализациями в Mobile и в Laptop
    // наследование ? композиция. Спрашиваем : является ? содержит. Проедпочтительнее композиция, гибче


    public static void loadComputers (Computer... computers) { // позволяет добавлять наследников не меняя прежний код
        for (Computer computer : computers) {
            computer.load();
            if (computer instanceof Laptop) //действительно ли  ссылка computer ведет на объект типа Laptop?
            {
                ((Laptop) computer).open();
            }
            System.out.println();

        }
    }


    public static void printInformation(Computer[] computers){
        for (Computer computer : computers) {
            computer.print();


        }
    }
}
