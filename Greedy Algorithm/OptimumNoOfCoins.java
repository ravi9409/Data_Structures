import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptimumNoOfCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        List<Integer> list = noOfCoins(a);
        System.out.println(list);
    }

    public static List<Integer> noOfCoins(int amount) {
        int count = 0;
        List<Integer> change=new ArrayList<>();
        while (amount != 0) {
            if (amount / 25 != 0 && amount >= 25) {
                count =  amount / 25;
                for (int i=0;i<count;i++) {
                    change.add(25);
                }
                amount = amount % 25;
            } else if (amount / 10 != 0 && amount >= 10) {
                count = amount / 10;
                for (int i=0;i<count;i++) {
                    change.add(10);
                }
                amount = amount % 10;
            } else if (amount / 5 != 0 && amount >= 5) {
                count = amount / 5;
                for (int i=0;i<count;i++) {
                    change.add(5);
                }
                amount = amount % 5;
            } else if (amount / 1 != 0 && amount >= 1) {
                count = amount / 1;
                for (int i=0;i<count;i++) {
                    change.add(1);
                }
                amount = amount % 1;
            }
        }
        return change;
    }
}