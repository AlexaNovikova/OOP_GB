package ru.novikova.seminar1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) &&
                        ((HotDrink) product).getVolume() == volume &&
                        ((HotDrink) product).getTemperature() == temperature) {
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s, объемом %d, " +
                "температурой %d не найден.", name, volume, temperature));
    }
}
