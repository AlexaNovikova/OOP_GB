package ru.novikova.seminar1;

import java.util.Objects;

public class HotDrink extends BottleOfWater{
    private int temperature;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotDrink hotDrink)) return false;
        if (!super.equals(o)) return false;
        return getTemperature() == hotDrink.getTemperature();
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),getTemperature());
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", volume='" + super.getVolume() + '\'' +
                ", cost=" + super.getCost() +
                ", temperature=" + this.temperature +
                '}';
    }
}
