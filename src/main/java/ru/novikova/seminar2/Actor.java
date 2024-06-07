package ru.novikova.seminar2;

public abstract class Actor implements ActorBehaviour {
    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
