package ru.novikova.seminar1;

import java.util.Objects;

public class BottleOfWater extends Product {
    private int volume;


    public BottleOfWater(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
               "name='" + super.getName() + '\'' +
               "volume='" + this.volume + '\'' +
               ", cost=" + super.getCost() +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BottleOfWater that)) return false;
        if (!super.equals(o)) return false;
        return getVolume() == that.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getVolume());
    }
}
