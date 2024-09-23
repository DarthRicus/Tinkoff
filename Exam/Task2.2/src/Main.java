import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int amountOfNumers = 0;
        for (int i = l; i <= r; i++) {
            if(!isPrime(i)){
                if(isPrime(amountOfDividers(i)))
                    amountOfNumers++;
            }
        }
        System.out.println(amountOfNumers);
    }
    public static int amountOfDividers(int a){
        int i = 1;
        int o = 0;
        while(i * i <= a){
            if(a % i == 0 && i * i != a){
                o += 2;
            } else if (a % i == 0 && i*i == a) {
                o += 1;
            }
            i++;
        }
        return o;
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}