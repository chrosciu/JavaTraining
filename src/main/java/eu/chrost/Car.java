package eu.chrost;

public class Car {
    private static int count = 0;
    private String brand;
    private float price;

    public Car(String brand, float price) {
        this.brand = brand;
        this.price = price;
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
