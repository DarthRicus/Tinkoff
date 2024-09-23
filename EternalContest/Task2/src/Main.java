import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] floors = new int[n];
        for (int i = 0; i < n; i++) {
            floors[i] = scanner.nextInt();
        }
        int numberOfLeavingFloor = scanner.nextInt();
        int firstFloor = floors[0];
        int lastFloor = floors[n - 1];
        int leavingFloor = floors[numberOfLeavingFloor - 1];
        if(lastFloor - leavingFloor <= t || leavingFloor - firstFloor <= t){
            System.out.println(lastFloor - firstFloor);
            return;
        }
        if(lastFloor - leavingFloor <= leavingFloor - firstFloor){
            System.out.println((lastFloor - leavingFloor) + (lastFloor - firstFloor));
        }else{
            System.out.println((leavingFloor - firstFloor) + (lastFloor - firstFloor));
        }
    }
}