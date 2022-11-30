import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
        // que = to count no of digits
//        int no_of_digit = 0;
//        while(num > 0){
//            num = num/10;
//            no_of_digit++;
//        }
//        System.out.println(no_of_digit);


        // que = sum of digits of a given number
//        int num = 12345;
//        int sum = 0;
//
//        while(num>0){
//            sum += num %10;
//
//            num = num /10 ;
//        }
//        System.out.println(sum);


        // que = how to reverse a number
//        int num = 34678;
//        int ans =0;
//
//        while(num>0){
//            ans = (ans*10) + num%10;
//            num /=10;    // num = num/10
//        }
//        System.out.println(ans);


        // que = sum of first n factorial
//        int n = 5;
//        int fac =1;
//
//        for (int i =1; i<=n; i++){
//            fac = fac*i;
//
//        }System.out.println(fac);


        // que = find a raise power b
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int ans =1;
//
//        for(int i =1; i<=b; i++){
//            ans *= a;
//        }
//        System.out.println(ans);



        // printing rectangle
//        int a=3 ;
//        int b=6 ;
//
//        for(int i =1; i<=a ;i++){
//            for(int j=1; j<=b ;j++){
//                System.out.print("*");
//            }System.out.println();
//        }


        // printing hollow rectangle
//        int a =5;
//        int b =8;
//
//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=b; j++){
//                if(i==1 || i==a || j==1 || j==b)
//                    System.out.print("*");
//            else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        // printing triangular pattern
//        int a =5;
//        for(int i=1; i<=a;i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // printing inverted triangle
//        int a =5;
//        for(int i=1; i<=a;i++){
//            for(int j=1; j<=(a+1-i); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        // printing inverted triangle  part 2
//        int a =5;
//
//        for(int i=a ; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // printing a pyramid of stars
//        int a =6;
//        for(int i=1; i<=a; i++){
//            for(int j=1 ; j<=a-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=2*i-1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // print numeric rectangle patter
//        int a=6;
//
//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=a; j++){
//                System.out.print(j);
//            }
//            for(int k=1; k<=i-1;k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }



        // printing rectangle pattern of 1amd 2
        int a = 4;
        int b = 6;

        for (int i=1; i<=a; i++){
            for(int j=1; j<=b; j++ ){
                if((i+j)%2==0){
                    System.out.print(1);
                    }
                else{
                    System.out.print(2);
                }
            }System.out.println();
        }

    }
}
