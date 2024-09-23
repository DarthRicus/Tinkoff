import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] daysOfMonth = new int[28];
        for (int i = 0; i < 28; i++) {
            daysOfMonth[i] = i + 1;
        }
        String week1 = scanner.nextLine();
        String week2 = scanner.nextLine();
        String week3 = scanner.nextLine();
        String week4 = scanner.nextLine();
        checkBusyDays(daysOfMonth, week1, 0);
        checkBusyDays(daysOfMonth,week2,1);
        checkBusyDays(daysOfMonth,week3,2);
        checkBusyDays(daysOfMonth,week4,3);
        int start = 0;
        int end = 0;
        int tempStart = -1;
        int maxFreeDays = 0;
        int currentFreeDays = 0;
        boolean isThereBusyDay = false;

        for (int i = 0; i < daysOfMonth.length; i++) {
            if(daysOfMonth[i] != 0){
                if(currentFreeDays == 0)
                    tempStart = i +1;
                currentFreeDays++;
                if(currentFreeDays > maxFreeDays){
                    maxFreeDays = currentFreeDays;
                    start = tempStart;
                    end = i +1;
                }
            }else{
                isThereBusyDay = true;
                currentFreeDays = 0;
            }
        }
        if(!isThereBusyDay){
            System.out.println("1 28");
        }else{
            System.out.println(start + " " + end);
        }
    }
    public static void checkBusyDays(int[] daysOfMonth, String week, int multiplier){
        if(week.isEmpty())
            return;
        String[] daysOfWeek = week.split(" ");
        for (int i = 0; i < daysOfWeek.length; i++) {
            switch (daysOfWeek[i]){
                case "MON":
                    daysOfMonth[1 + 7 * multiplier - 1] = 0;
                    break;
                case "TUE":
                    daysOfMonth[2 + 7 * multiplier - 1] = 0;
                    break;
                case "WED":
                    daysOfMonth[3 + 7 * multiplier - 1] = 0;
                    break;
                case "THU":
                    daysOfMonth[4 + 7 * multiplier - 1] = 0;
                    break;
                case "FRI":
                    daysOfMonth[5 + 7 * multiplier - 1] = 0;
                    break;
                case "SAT":
                    daysOfMonth[6 + 7 * multiplier - 1] = 0;
                    break;
                case "SUN":
                    daysOfMonth[7 + 7 * multiplier - 1] = 0;
                    break;
            }
        }
    }
}