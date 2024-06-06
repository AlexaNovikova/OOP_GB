package ru.novikova.seminar1;

import java.util.Objects;

public abstract class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(getCost(), product.getCost()) == 0 && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCost());
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", cost=" + cost +
               '}';
    }
}
