import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double powerOfTwo = Math.log10(n) / Math.log10(2);
        if(Math.floor(powerOfTwo) == powerOfTwo){
            System.out.println((long) Math.floor(powerOfTwo));
        }else{
            System.out.println((long) Math.floor(powerOfTwo) + 1);
        }

    }
}