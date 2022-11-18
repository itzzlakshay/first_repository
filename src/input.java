import java.util.Scanner;

public class input {
    public static void main(String[] args) {



//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum;
//        sum = a+b;
//        System.out.println("sum of number is " + sum);

        Scanner sc = new Scanner(System.in);

//        String name = sc.nextLine();
//        int roll_no = sc.nextInt();
//        String interest = sc.nextLine();
//
//        System.out.println("Name :" + name);
//        System.out.println("Roll number :" + roll_no);
//        System.out.println("Field of interest :" + interest);


//        String first_name = sc.next();
//        String last_name = sc.next();
//
//        System.out.print(first_name);
//        System.out.print(last_name);

        int a = sc.nextInt();

        for(int i=1; i<=a;i++ ){
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(b+c);
        }


    }
}
