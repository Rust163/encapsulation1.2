import java.util.Scanner;

public class FlowerBouquet {
    public static void theCostOfTheBouquet(Flower[] arr) {
        int i;
        System.out.println("====================================================================================================");
        System.out.println("Витрина!");
        System.out.println("====================================================================================================");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println("--------------------------------------------------------------------------------------------------");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================================================================");
        System.out.println("Введите количество роз для покупки: ");
        int n1 = sc.nextInt();
        System.out.println("Введено количество роз: " + n1);
        System.out.println("Введите количество хризантем для покупки: ");
        int n2 = sc.nextInt();
        System.out.println("Введено количество хризантем: " + n2);
        System.out.println("Введите количество пионов для покупки: ");
        int n3 = sc.nextInt();
        System.out.println("Введено количество пионов: " + n3);
        System.out.println("Введите количество гипсофил для покупки: ");
        int n4 = sc.nextInt();
        System.out.println("Введено количество гипсофил: " + n4);
        sc.close();
        System.out.println("====================================================================================================");

        int quantityFlowers = n1 + n2 + n3 + n4;
        double sumBouquet = (arr[0].getCost() * n1 + arr[1].getCost() * n2 + arr[2].getCost() * n3 + arr[3].getCost() * n4);
        sumBouquet += sumBouquet * 0.1;

        int min = arr[0].getLifeSpan();
        int durationOfFlowering = 0;
        for (int l = 0; l < arr.length -1; l++) {
            if (min > arr[l].getLifeSpan()) {
                min = arr[l].getLifeSpan();
                durationOfFlowering = l;
                }

        }

        System.out.println("Вы купили букет из " + quantityFlowers + " цветков, стоимостью " + (float)sumBouquet + ", срок стояния букета " + durationOfFlowering);
    }
}
