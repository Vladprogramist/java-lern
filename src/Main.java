import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//       // int x = 2;
//       // int y = 3;
//       // x = y + x;
//        y = x - y;
//        x = x - y;
//        System.out.println(x);
//        System.out.println(y);
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum = x-y;
        System.out.println("Різниця чисел:" +sum);


    }
}