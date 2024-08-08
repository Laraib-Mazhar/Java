import java.util.Scanner;

public class PS7 {
//    static int[] fabonacci(int num){
//        int[] fabonacci = new int[num];
//        if ( num > 0){
//            fabonacci[0] = 0;
//        }
//        if (num > 1 ){
//            fabonacci[1] =1;
//        }
//        for (int i=2 ;  i<num; i++){
//            fabonacci[i] = fabonacci[i-1] + fabonacci[i-2];
//        }
//        return fabonacci;
//    }


////  Used in question number 1
//    static  int ques1(int num){
//        for (int i =1 ; i<=10 ; i++){
//            System.out.println(num + " X " + i + " = " + num*i);
//        }
//        return num;
//    }


////  Used in question number 2
//    static void pattern(int num) {
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


////    Used in question number 3
////    sum(n) = 1+2+3+4+......+n
////    sum(n) = 1+2+3+......+n-1+n
////    sum(n) = sum(n-1)+n
//
//    static int sum(int n){
////  Base condition
//        if (n==1){
//            return 1;
//        }
//        return  sum(n-1)+n;
//    }


////    Used in question number 4
//    static void pattern1(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


////    Used in question number 5
////    With index
//    static int fabonacci1(int num) {
//        //Base condition
//        if (num == 0) {
//            return 0;
//        //Base condition
//        } else if (num == 1) {
//            return 1;
//        } else {
//            return fabonacci1(num-1)+fabonacci1(num-2);
//        }
//    }
////    without index
//    static int fabonacci1(int num) {
//        //Base condition
//        if (num == 1) {
//            return 0;
//            //Base condition
//        } else if (num == 2) {
//            return 1;
//        } else {
//            return fabonacci1(num-1)+fabonacci1(num-2);
//        }
//    }


////    Used in question number 6
//    static double average(int... arr) {
//        int sum = 0;
//        for (int element : arr) {
//            sum += element;
//        }
//        return (double) sum / arr.length;
//    }


////    Used in question number 7
//    static void pattern2(int n) {
//        if(n > 0){
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            pattern2(n-1);
//        }
//    }


////        Used in question number 8
//        static void pattern3(int n) {
//            if (n > 0) {
//                pattern3(n - 1);
//                for (int j = 0; j < n; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }


////    Used in question number 9
//    static double temperature(double temp){
//
//        double faren =  ( temp * 9/5 ) +32;
//        return faren;
//    }


////    Used in question number 10
//    static int sum(int n){
//        int sum = 0;
//    for (int i = 1 ; i <= n ; i++){
//        sum = sum +i;
//        }
//    return sum;
//    }



        public static void main(String[] args) {
//        Fabonacci number series
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any number to print its fibonacci series : ");
//        int num = sc.nextInt();
//        int[] series = fabonacci(num);
//        System.out.println("Fabonacci serie of given number : ");
//        for (int  element : series){
//            System.out.print(element + " ");
//        }


////        Question number 1
////        Write a java method to print multiplication table of a number n
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any number to print its multiplication table : ");
//        int num = sc.nextInt();
//        ques1(num);




////        Question number 2
////        Write a program using functions to print the following patterns
////        *
////        **
////        ***
////        ****
//
//        pattern(9);



////        Question number 3
////        Write a recursive function to calculate sum of first 10  natural numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int num = sc.nextInt();
//        System.out.println("Sum of first 10 natural numbers : " + sum(num));



////      Question number 4
////      Write a program to print the following pattern
////      ****
////      ***
////      **
////      *
//
//      pattern1(13);



////      Question number 5
////      Write a function to print the nth term of the Fibonacci series using recursion.
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter the number : ");
//      int num1 = sc.nextInt();
//      System.out.println("nth number of fabonacci series : " +  fabonacci1(num1));



////      Question number 6
////      Write a function to find the average of a set of numbers passed as arguments.
////      Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements to calculate their average: ");
//        int n = sc.nextInt();
//        int[] num1 = new int[n];
//        System.out.println("Enter the numbers:");
//            for (int i = 0; i < n; i++) {
//                num1[i] = sc.nextInt();
//            }
//        System.out.println("Average: " + average(num1));



////        Question number 7
////        Write a function to print the following pattern: using Recursion.
////        ****
////        ***
////        **
////        *
//
//        pattern2(6);



////        Question number 8
////        Write a program using functions to print the following pattern:
////        *
////        **
////        ***
////        ****
//
//        pattern3(9);



////      Question number 9
////      Write a function to convert Celsius temperature into Fahrenheit.
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter temperature in celsius  : ");
//      int temp = sc.nextInt();
//      System.out.println("Temperature " +  temp + "°C" + " in fahrenheit is : " + temperature(temp) + "°F");



////        Question number 10
////        Write a function to calculate the sum of first n natural numbers using iterative approach.
//        System.out.println("Sum of n natural numbers is: " + sum(7));

    }
}