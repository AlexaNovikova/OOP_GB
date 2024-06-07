package ru.novikova.seminar2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Alexandr");
        Human human2 = new Human("Vladimir");
        Human human3 = new Human("John");
        Human human4 = new Human("Kelly");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
    }
}
