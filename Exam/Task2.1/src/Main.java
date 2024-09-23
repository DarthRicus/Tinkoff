import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allIntervals = scanner.nextLine();
        String[] intervals = allIntervals.split(",");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i].contains("-")){
                String[] numbers = intervals[i].split("-");
                int startOfInterval = Integer.parseInt(numbers[0]);
                int endOfInterval = Integer.parseInt(numbers[1]);
                for (int j = startOfInterval; j <= endOfInterval; j++) {
                    answer.append(" ").append(j);
                }
            }else{
                answer.append(" ").append(intervals[i]);
            }
        }
        System.out.println(answer.toString().trim());
    }
}