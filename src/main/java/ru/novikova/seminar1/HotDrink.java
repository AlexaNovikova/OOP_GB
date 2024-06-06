package ru.novikova.seminar1;

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
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", volume='" + super.getVolume() + '\'' +
                ", cost=" + super.getCost() +
                ", temperature=" + this.temperature +
                '}';
    }
}
