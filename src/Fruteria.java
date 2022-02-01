import java.util.Scanner;

public class Fruteria {
    private static final int Platan = 1;
    private static final int Poma = 2;
    private static final int Taronja = 3;

    private static final int Platan_Price = 50;
    private static final int Poma_price = 35;
    private static final int Taronja_price = 55;

    public static void main(String[] args) {
	     int money = askForMoney();
         int option = askForFruitOption();
         int price = getFruitPrice(option);
         purchaseFuit(money, price);
    }



    private static void purchaseFuit(int money, int price) {
        if (money >= price ){
            System.out.println("Compra realitzada. ");
            System.out.println("Et queden: " + (money - price) + "euros") ;
        }
        else {
            System.out.println("Ho sento no pots comprar-ho.");
        }
    }

    private static int getFruitPrice(int option) {
        if (option == Platan) return Platan_Price;
        if (option == Poma) return Poma_price;
        if (option == Taronja) return Taronja_price;
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int askForFruitOption() {
        System.out.println("Fruita disponible.");
        System.out.println("1. Platan: " + Platan_Price);
        System.out.println("2. Poma: " + Poma_price);
        System.out.println("3. Taronja: " + Taronja_price);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int askForMoney() {
        System.out.println("Quants diners té: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
