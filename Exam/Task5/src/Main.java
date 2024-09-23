import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Integer> soldiers = new ArrayList<>();
        soldiers.add(a);
        soldiers.add(b);
        for (int i = 0; i < m - 1; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(!soldiers.contains(a) && !soldiers.contains(b)){
                soldiers.add(a);
                soldiers.add(b);
                continue;
            }
            if(soldiers.contains(a)){
                if(isThisSoldierLeft(soldiers,b,a)){
                    System.out.println("No");
                    return;
                }
                if(!isThisSoldierRight(soldiers,a,b)){
                    soldiers.add(soldiers.indexOf(a) + 1, b);
                }
                continue;
            }
            if(soldiers.contains(b)){
                if(isThisSoldierRight(soldiers,b,a)){
                    System.out.println("No");
                    return;
                }
                if(!isThisSoldierLeft(soldiers,a,b))
                    soldiers.add(soldiers.indexOf(b), a);

            }
        }
        System.out.println("Yes");
        for (int i = 0; i < soldiers.size(); i++) {
            if(i == soldiers.size() - 1){
                System.out.print(soldiers.get(i));
                break;
            }
                System.out.print(soldiers.get(i) + " ");
        }
    }
    public static boolean isThisSoldierLeft(ArrayList<Integer> soldiers, int a, int b){
        int index = soldiers.indexOf(b);
        for (int i = index - 1; i >= 0 ; i--) {
            if(soldiers.get(i) == a)
                return true;
        }
        return false;
    }
    public static boolean isThisSoldierRight(ArrayList<Integer> soldiers, int a, int b){
        int index = soldiers.indexOf(a);
        for (int i = index + 1; i < soldiers.size() ; i++) {
            if(soldiers.get(i) == b)
                return true;
        }
        return false;
    }
}