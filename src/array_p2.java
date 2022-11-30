import java.util.Scanner;
public class array_p2 {

    static void printArray (int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray (int[] arr){
        int n = arr.length;
//        int [] pref = new int [n];
//        pref[0] = arr[0];
        for(int i =1; i<n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    static int findArraySum (int[] arr){
        int totalSum =0;
        for(int i =0;i<arr.length;i++){
            totalSum += arr[i];
        }return totalSum;
    }

    static boolean equalSumPartition (int [] arr){
        int totalsum = findArraySum(arr);
        int prefSum =0;
        for(int i=0; i<=arr.length;i++){
            prefSum += arr[i];
            int suffixSum = totalsum-prefSum;
            if(prefSum==suffixSum)
                return true ;
        }return false;
    }

    static void printMatrix (int [][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void add (int[][] a, int r1, int c1 , int [][] b, int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("addition can't take place");
        }
        int add [][] =new int [r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1;j++){
                add[i][j] =a[i][j] + b[i][j];
            }
        }
        printMatrix(add);


    }

    static void mul (int [][] a, int r1, int c1, int [][] b, int r2 , int c2 ){
        if(c1 != r2){
            System.out.println("multiplication not take place");
            return;
        }
        int mul [][] = new int [r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2;j++){
                for(int k=0; k<c1; k++){
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("multiplication of two matrix");
        printMatrix(mul);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        System.out.println("enter seize of an array");
//        int n = sc.nextInt();
//        int arr[] =new int[n];
//
//        System.out.println("enter " + n + " elements of an array");
//        for(int i=0; i<n; i++){
//            arr[i] =sc.nextInt();
//        }
//        printArray(arr);
//
//        int [] pref = makePrefixSumArray(arr);
//        printArray(pref);
//
//        // sun of numbers given in a particular range
//        int l = sc.nextInt();
//        int r = sc.nextInt();
//        int ans = pref[r] - pref[l];
//        System.out.println(ans);

    // taking input of 2-D array and printing it

//        System.out.println("enter no of rows and column");
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        System.out.println("enter element of array");
//        int [][] array = new int [row][col];
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col;j++){
//                array[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col;j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


        System.out.println("enter rows and column of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter element of array");
        int a [][] = new int [r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("enter rows and column of matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("enter element of array");
        int b [][] = new int [r1][c1];
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }

        printMatrix(a);
        printMatrix(b);
//        add(a,r1,c1,b,r1,c1);
        mul(a,r1,c1,b,r2,c2);

    }
}
