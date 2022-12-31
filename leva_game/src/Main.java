import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ще успееш ли да направиш точно 1 лев? ");
        System.out.println("Колко броя по 1 стотинка? ");
        int s1 = scanner.nextInt();
        System.out.println("Колко броя по 2 стотинки? ");
        int s2 = scanner.nextInt();
        System.out.println("Колко броя по 5 стотинки? ");
        int s5 = scanner.nextInt();
        System.out.println("Колко броя по 10 стотинки? ");
        int s10 = scanner.nextInt();
        System.out.println("Колко броя по 20 стотинки? ");
        int s20 = scanner.nextInt();
        System.out.println("Колко броя по 50 стотинки? ");
        int s50 = scanner.nextInt();
        scanner.close();

        int s1new = s1 * 1;
        int s2new = s2 * 2;
        int s5new = s5 * 5;
        int s10new = s10 * 10;
        int s20new = s20 * 20;
        int s50new = s50 * 50;
        int levche = 100;

        int calc = (s1new + s2new + s5new + s10new + s20new + s50new);

        if (calc == levche){
            System.out.println("Супер, това прави левче! ");}
        else{
            System.out.println("Това не прави левче, имаш разлика от " + (levche - calc) + " стотинки. ");}
    }
}
