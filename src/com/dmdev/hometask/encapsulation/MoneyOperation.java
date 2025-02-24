package com.dmdev.hometask.encapsulation;

public class MoneyOperation {



    private final int denomination50 = 50;
    private final int denomination20 = 20;
    private final int denomination10 = 10;

    private final CashMachine cashMachine;

    public MoneyOperation(CashMachine cashMachine) {
        this.cashMachine = cashMachine;
    }

    //Сделать методы для добавления денег в банкомат.
    public void putMoney(int banknote10Amount, int banknote20Amount, int banknote50Amount) {
        cashMachine.setBanknote10Amount(banknote10Amount);
        cashMachine.setBanknote20Amount(banknote20Amount);
        cashMachine.setBanknote50Amount(banknote50Amount);
        int totalAmount = banknote10Amount * denomination10 + banknote20Amount * denomination20 + banknote50Amount * denomination50;
        System.out.println("Внесено денег на счет: " + totalAmount);
    }

    // Сделать метод, снимающий деньги
    // При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
    // Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10
    public boolean isSuccessWithdraw(int amount) {
        //Если сумма не кратна  10- ничего не делаем, не сможем выдать
        if (amount % 10 != 0) {
            System.out.println("Невозможно выдать сумму " + amount + ". Сумма должна быть кратна 10.");
            return false;
        }
        // проверяем 50
        int count50 = getBanknotes(denomination50, amount);
        amount -= count50 * denomination50; // остаток после того как забрали возможное кол-во по 50

        int count20 = getBanknotes(denomination20, amount);
        amount -= count20 * denomination20; // остаток после того как забрали возможное кол-во по 20

        int count10 = getBanknotes(denomination10, amount);
        amount -= count10 * denomination10; // остаток после того как забрали возможное кол-во по 10

        if (amount == 0) {
            System.out.println("Выдано купюр: " +
                    " номиналом 50 -> " + count50 +
                    " номиналом 20 -> " + count20 +
                    " номиналом 10 -> " + count10);

        } return true;
    }

    // сколько купюр номинала помещается в сумму
    private int getBanknotes(int denomination, int amount) {
        int count = amount / denomination;
        if (amount < denomination) return 0;
        return count;
    }


}
