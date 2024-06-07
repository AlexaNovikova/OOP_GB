package ru.novikova.lesson2.Ex004;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp, int mn) {
        super(name, hp, mn);
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0,0);
        System.out.println("Вызван Dwarf()");
    }
   
}