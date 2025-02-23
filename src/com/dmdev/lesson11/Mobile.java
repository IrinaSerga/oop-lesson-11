package com.dmdev.lesson11;

// наследование - доп инструмент для реализации полиморфизма

public class Mobile extends Computer {

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override // аннотация для переопределенного метода
    public void load() {
        System.out.println("Loading mobile");

    }
}
