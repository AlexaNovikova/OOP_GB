package ru.novikova.lesson3.Ex004;

import ru.novikova.lesson3.Ex004.ExBeverage.*;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (Ingredient ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
