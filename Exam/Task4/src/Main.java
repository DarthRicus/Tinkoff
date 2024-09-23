import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int actions = 0;
        for (int i = 0; i < m - 1; i++) {
            int nextStart = scanner.nextInt();
            int nextEnd = scanner.nextInt();
            if(isBetweenStartAndEnd(start,end,nextStart,nextEnd)){
                start = nextStart;
                end = nextEnd;
                continue;
            }
            if(start > nextEnd){
                actions += (start - nextEnd);
                start = nextStart +(start - nextEnd);
                end = nextEnd + (start - nextEnd);
                continue;
            }
            if(end < nextStart){
                actions += (nextStart - end);
                start = nextStart - (nextStart - end);
                end = nextEnd - (nextStart - end);
            }
        }
        System.out.println(actions);
    }
    public static boolean isBetweenStartAndEnd(int start, int end, int nextStart, int nextEnd){
        if(nextStart >= start && nextStart <= end)
            return true;
        if(nextEnd >= start && nextEnd <= end)
            return true;
        return false;
    }
}