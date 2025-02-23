package com.dmdev.lesson11;

/**
 * Laptop - > Computer-> Object
 */

public  /*final*/ class Laptop  extends Computer { // нет множественного наследования классов
    // final  - константа, ее нельзя переопределить ; для класса - никто не должен наследоваться от Laptop
    // final и abstract одновременно использовать нельзя

    private int weight;
    // вариант инициализации
//    {
//        System.out.println("Laptop init block");
//    }
//    // вариант инициализации
//     static  {
//         System.out.println("Laptop  static init block");
//     }

    public Laptop(Ssd ssd, Ram ram, int weight) {
       // super();
        super(ssd, ram); // конструктор родительского (супер) класса
        this.weight = weight;
        //super.load();
    }

    public Laptop() { // пустой конструктор
        System.out.println("Laptop constructor");
    }

    public void open(){{
        System.out.println("Laptop open");}
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("Laptop load");

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Laptop print");
        System.out.println("Laptop weight = " + weight);
    }

}
// не можем переопределить статические методі т к они относятся к классу, а не к объекту
