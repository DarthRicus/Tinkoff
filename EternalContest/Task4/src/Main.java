import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        int power =(int) Math.floor(Math.log10(l));
        long numberToCheck;
        int counter = 0;
        int iterator = (int) (l / Math.pow(10, power));
        while (true){
            numberToCheck = iterator * ((long)Math.pow(10,power) - 1) / 9;
            if(numberToCheck >= l && numberToCheck <= r)
                counter++;
            iterator++;
            if(iterator == 10){
                iterator = 1;
                power++;
            }
            if(numberToCheck >= r || power == 19)
                break;
        }
        System.out.println(counter);
    }
}