import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // que 1
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a==b)
//            System.out.println("it is a square");
//        else
//            System.out.println("not a square");


        // que 2
//        int a = sc.nextInt();
//        if(a<0){
//            System.out.println(a*-1);
//        }
//        else
//            System.out.println(a);


        // que 3
//        int cp = sc.nextInt();
//        int sp = sc.nextInt();
//
//        if(sp>cp){
//            System.out.println("profit = " + (sp-cp));
//        }
//        else{
//            System.out.println("loss = " + (cp-sp));
//        }

        // que 4
//        float a = sc.nextInt();
//        float b = sc.nextInt();
//        String symbol = sc.next();
//
//        switch (symbol) {
//            case "+" -> System.out.println(a + b);
//            case "-" -> System.out.println(a - b);
//            case "*" -> System.out.println(a * b);
//            case "/" -> System.out.println(a / b);


        int x=0;
        int y=0;
        char move = sc.next().charAt(0);

        switch (move){
            case 'l':
                x--;
            case 'r':
                x++;
            case 'u':
                y++;
            case 'd':
                y++;
            default:
                System.out.println("invalid");
    }

    }
}
