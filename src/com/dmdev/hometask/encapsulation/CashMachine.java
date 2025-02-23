package com.dmdev.hometask.encapsulation;

public class CashMachine {
     // свойства банкомата; приватны, нельзя переопределить из других классов
     private int banknote10Amount;
     private int banknote20Amount;
     private int banknote50Amount;


     // всегда есть деньги. Конструктор не может быть пустым
    public CashMachine(int banknote10Amount, int banknote20Amount, int banknote50Amount) {
        this.banknote10Amount = banknote10Amount;
        this.banknote20Amount = banknote20Amount;
        this.banknote50Amount = banknote50Amount;
    }

    public int getBanknote10Amount() {
        return banknote10Amount;
    }

    public void setBanknote10Amount(int banknote10Amount) {
        this.banknote10Amount = banknote10Amount;
    }

    public int getBanknote20Amount() {
        return banknote20Amount;
    }

    public void setBanknote20Amount(int banknote20Amount) {
        this.banknote20Amount = banknote20Amount;
    }

    public int getBanknote50Amount() {
        return banknote50Amount;
    }

    public void setBanknote50Amount(int banknote50Amount) {
        this.banknote50Amount = banknote50Amount;
    }
}
