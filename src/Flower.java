public class Flower {
    private final String flower;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flower, String flowerColor, String country, double cost, int lifeSpan) {
        this.flower = flower;

        if (flowerColor.length() != 0 && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }

        if (country.length() != 0 && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }

        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlower() {
        return flower;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    void info() {
        System.out.println("Розы, цвет " + flowerColor + ", страна происхождения - " + country + ", стоимость одного цветка " + cost + " руб., срок стояния " + lifeSpan + " дня(-ей).");
    }

    @Override
    public String toString() {
        return flower + " Цвет: " + flowerColor + ", страна происхождения: " + country + ", стоимость одного цветка: " + cost + " руб., срок стояния " + lifeSpan + " дней.";
    }
}
