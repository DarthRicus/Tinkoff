import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] numbersToConvert = numbers.split(" ");
        BigInteger n = new BigInteger(numbersToConvert[0]);
        int k = Integer.parseInt(numbersToConvert[1]);
        long a = Long.parseLong(numbersToConvert[2]);
        long m = Long.parseLong(numbersToConvert[3]);
        if(n.compareTo(new BigInteger("3").multiply(BigInteger.TEN.pow(17))) != 1){
            long nn = n.longValue();
            long costOfWantedCandies = 0;
            if(nn < k){
                costOfWantedCandies = k * 3L;
            }else{
                costOfWantedCandies = nn * 3L;
            }
            int seed = 0;
            int coin = 0;
            int amountOfCoins = 0;
            while(true){
                seed = lcg(a,m,seed);
                coin = (Math.abs(seed % 3 - 1) * 5 + Math.abs(seed % 3) * 2) % 8;
                costOfWantedCandies -= coin;
                amountOfCoins++;
                if(costOfWantedCandies <= 0){
                    System.out.println(amountOfCoins);
                    break;
                }
            }
        }else{
            BigInteger costOfWantedCoins = n.multiply(BigInteger.valueOf(3));
            int seed = 0;
            int coin = 0;
            long amountOfCoins = 0;
            while(true){
                seed = lcg(a,m,seed);
                coin = (Math.abs(seed % 3 - 1) * 5 + Math.abs(seed % 3) * 2) % 8;
                costOfWantedCoins = costOfWantedCoins.subtract(BigInteger.valueOf(coin));
                amountOfCoins++;
                if(costOfWantedCoins.compareTo(BigInteger.valueOf(0)) != 1){
                    System.out.println(amountOfCoins);
                    break;
                }
            }
        }
    }
    public static int lcg(long a, long m, int e){
        return (int) ((a * e + 11) % m);
    }
}