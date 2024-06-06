package ru.novikova.seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotDrink latte = new HotDrink("Латте", 150.0, 250, 80);
        HotDrink cappuccino = new HotDrink("Капучино", 180.0, 200, 85);
        HotDrink blackTea = new HotDrink("Черный чай", 120, 200, 70);
        HotDrink greenTea = new HotDrink("Зеленый чай", 150, 200, 75);
        HotDrink cacao = new HotDrink("Какао", 180, 250, 80);
        List<Product> products = new ArrayList<>();
        products.add(latte);
        products.add(cappuccino);
        products.add(blackTea);
        products.add(greenTea);
        products.add(cacao);
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);

        HotDrink cacaoFromMachine = hotDrinkVendingMachine.getProduct("Какао", 250, 80);
        System.out.println(cacaoFromMachine);

        HotDrink greenTeaFromMachine = hotDrinkVendingMachine.getProduct("Зеленый чай", 200, 75);
        System.out.println(greenTeaFromMachine);

        // исключение
        HotDrink tea = hotDrinkVendingMachine.getProduct("Чай", 250, 80);
        System.out.println(tea);
    }
}
