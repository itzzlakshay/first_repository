import java.util.*;

public class array {
    public static void main(String[] args) {



        //  one dimension array
        int [] ages = new int[5];
        float [] weight = new float[3];

        ages[0]=10;
        ages[1]=20;
        ages[2]=30;
        ages[3]=40;
        ages[4]=50;

        for(int i=0; i<ages.length;i++){
            System.out.println(ages[i]);
        }


        // multi- dimension array
//        int [][] array = new int[5][3];  // method 1
//
//        array [0][0]=14;
//        array [0][1]=67;
//        array [0][2]=90;
//        System.out.println(array[0][2]);


//        int [][] array1 = {{3,5,6}, {3,9,8}, {34,65,5}};  // method 2

//        System.out.println(array1[0][0]);
//        System.out.println(array1[0][1]);
//        System.out.println(array1[0][2]);
//
//        System.out.println(array1[1][0]);
//        System.out.println(array1[1][1]);
//        System.out.println(array1[1][2]);
//
//        System.out.println(array1[2][0]);
//        System.out.println(array1[2][1]);
//        System.out.println(array1[2][2]);


//        int [] ages = new int[3];
//
//        ages[0]=10;
//        ages[1]=20;
//        ages[2]=30;

        // syntax for printing array by for loop
//        for(int age :ages){
//            System.out.println(age);
//        }


//        for(int i=0; i<ages.length;i++){
//            System.out.println(ages[i]);
//        }

//        int i=0;
//        while( i<ages.length){
//            System.out.println(ages[i]);
//            i++;


        // printing multi dimension array by for loop
//        for(int i=0; i<array.length; i++){
//            for(int j=0;i<3; j++){
//                System.out.println(array[i][j]);
//            }
//        }

        // calculate sum of all elements in array
//        int [] array =  {2,3,65,78,54 };
//        int sum=0;
//        for(int i=0; i<array.length;i++){
//            sum += array[i];
//        }
//        System.out.println(sum);


        // calculating maximum value of an array
//        int [] array = {43,5,54,67,1,90};
//        int ans =0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]>ans){
//                ans =array[i];
//            }
//        }System.out.println(ans);


        // finding position of a particular element in an array
//        int array [] = {12,45,65,3,76,88};
//        int a= 76;
//        for(int i=0;i<array.length;i++){
//            if(a==array[i]){
//                System.out.println(i);
//            }
//        }


//        int [] array = {2,6,-5,-1,0,4,-9};
//        for(int i=0; i<array.length;i++){
//            if(array[i] >=0){
//                System.out.println(array[i]);
//            }
//        }


//        String [] array = {"ab","bc","cd","de","ef","fg","gh"};
//        for(int i=0; i<array.length;i++){
//            if(i%2 != 0){
//                System.out.println(array[i]);
//            }
//        }


//       int array []= {1,1,3,4,2,3,5,7,0};
//        for(int i=1; i<array.length;i++){
//            if(array[i-1]<array[i] && array[i]>array[i+1]){
//                System.out.println(array[i]);
//                break;
//            }
//        }



        //  taking input of an array
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int array [] =new int [a];
//        for(int i=0; i<array.length;i++){
//            array[i] = sc.nextInt();
//        }
//        for(int i=0; i<array.length;i++){
//            System.out.print(array[i]);
//        }




//        int [] array = {3,5,6,7,1,9};
//        System.out.println("orignal array");
//        for(int i=1; i<array.length;i++){
//            System.out.println(array[i]);
//        }
//                                // copying an array  (there we can't update value in new array)
//        int [] array_2 =array;
//        System.out.println("new array");
//        for(int i=1; i<array.length;i++){
//            System.out.println(array[i]);
//        }



        // clone of an array
//        int [] array = {3,5,6,7,1,9};
//        System.out.println("orignal array");
//        for(int i=0; i<array.length;i++){
//            System.out.println(array[i]);
//        }
//
//        int [] array_2 =array.clone();
//        System.out.println("new array");
//        array_2[2] =54;
//        for(int i=0; i<array.length;i++){
//            System.out.println(array_2[i]);
//        }


        // copy of an array (here we can copy the array according to our will
//        int [] array = {3,5,6,7,1,9};
//        System.out.println("orignal array");
//        for(int i=0; i<array.length;i++){
//            System.out.println(array[i]);
//        }
//        // copying an array  (there we can't update value in new array)
//        int [] array_2 = array.copyOf               // error
//        System.out.println("new array");
//        array_2[2] =54;
//        for(int i=0; i<array.length;i++){
//            System.out.println(array_2[i]);
//        }

            // count no of occurrence of an element in an arrau
//        int [] array = {3,5,6,7,6,9};
//        int a =6;
//        int count =0;
//        for(int i=0; i<array.length;i++){
//            if(array[i] == a){
//                count++;
//            }
//
//        }System.out.println(count);


        // count no of element strictly greater than a given number
//        int [] array = {3,5,6,7,6,9};
//        int a =3;
//        int count =0;
//        for(int i=0; i<array.length;i++){
//            if(array[i] > a){
//                count++;
//            }
//        } System.out.println(count);


        // check weather the array is sorted or not
//        int [] array = {1,2,3,4,5};
//
//        for(int i=1; i<array.length;i++){
//            if( array[i-1] <array[i] && array[i] <array[i+1] ){
//                System.out.println("array is sorted");
//            }
//            else
//                System.out.println("not sorted");
//        }

    }
}
