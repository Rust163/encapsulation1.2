public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза","красный", "Голландия", 159.99, 6);
        Flower chrysanthemum = new Flower("Хризантема","желтый", "Нидерланды", 59.30, 10);
        Flower pion = new Flower("Пион","оранжевый", "Англия", 215.00, 4);
        Flower gypsophila = new Flower("Гипсофилум","синий", "Турция", 109.50, 4);

        Flower[] Flowers = new Flower[4];
        Flowers[0] = new Flower("Роза","красный", "Голландия", 159.99, 6);
        Flowers[1] = new Flower("Хризантема","желтый", "Нидерланды", 59.30, 10);
        Flowers[2] = new Flower("Пион","оранжевый", "Англия", 215.00, 4);
        Flowers[3] = new Flower("Гипсофилум","синий", "Турция", 109.50, 2);

        rose.info();
        chrysanthemum.info();
        pion.info();
        gypsophila.info();



        FlowerBouquet.theCostOfTheBouquet(Flowers);
    }




}