import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int amountOfSocksInEvenness = 0;
        for (int i = 0; i < n; i++) {
            long amountOfSocksInCloset = scanner.nextLong();
            amountOfSocksInEvenness += (int) (amountOfSocksInCloset % 2);
        }
        if(amountOfSocksInEvenness % 2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}