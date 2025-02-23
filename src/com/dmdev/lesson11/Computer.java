package com.dmdev.lesson11;

public abstract class Computer implements Printable { // abstract class обязателен к наследованию. Нельзя создать его инстанс

    private Ssd ssd;  // поля класса, описывающие его свойства
    private Ram ram; // композиция, потому как Computer не является Ssd и Ram, он их содержит

    {
        System.out.println("Computer init block");
    }

    static {
        System.out.println("Computer static init block");
    }

    public Computer(Ssd ssd, Ram ram) {
        super(); // пустой конструктор. Єто можно опустить
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() { // пустой конструктор
        System.out.println("Computer constructor");
    }

    public abstract void load();  // абстрактные функции только в абстракных классах
//     public void load(){
//         System.out.println("Loading computer...");
//     }

    @Override
    public void print() {
        System.out.println("Ssd " + ssd.getValue() + " Ram " + ram.getValue());
    }

    public Ssd getSsd() {
        return ssd;
    }


    public Ram getRam() {
        return ram;
    }
}
