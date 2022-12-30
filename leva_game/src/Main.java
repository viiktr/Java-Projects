import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ще успееш ли да направиш точно 1 лев? ");
        System.out.println("Колко броя по 1 стотинка? ");
        int stotinka1 = scanner.nextInt();
        System.out.println("Колко броя по 2 стотинки? ");
        int stotinki2 = scanner.nextInt();
        System.out.println("Колко броя по 5 стотинки? ");
        int stotinki5 = scanner.nextInt();
        System.out.println("Колко броя по 10 стотинки? ");
        int stotinki10 = scanner.nextInt();
        System.out.println("Колко броя по 20 стотинки? ");
        int stotinki20 = scanner.nextInt();
        System.out.println("Колко броя по 50 стотинки? ");
        int stotinki50 = scanner.nextInt();
        scanner.close();

        int stotinka1new = stotinka1 * 1;
        int stotinka2new = stotinki2 * 2;
        int stotinka5new = stotinki5 * 5;
        int stotinka10new = stotinki10 * 10;
        int stotinka20new = stotinki20 * 20;
        int stotinka50new = stotinki50 * 50;
        int levche = 100;

        int calc = (stotinka1new + stotinka2new + stotinka5new + stotinka10new + stotinka20new + stotinka50new);

        if (calc == levche){
            System.out.println("Супер, това прави левче! ");}
        else{
            System.out.println("Това не прави левче, имаш разлика от " + (levche - calc) + " стотинки. ");}
    }
}
