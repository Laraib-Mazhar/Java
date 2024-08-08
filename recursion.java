import java.util.Scanner;

public class recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return  factorial(n - 1)*n;
        }
    }

//    static int fac(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            int product = 1;
//            for (int i = 1; i <= n; i++) {
//                product = product * i;
//            }
//            return product;
//        }
//    }

    static int[] fibonacci(int num ){
        int [] fab = new int[num];
        if(num > 0){
             fab[0] = 0  ;
        }
        if(num > 1){
            fab[1] = 1  ;
        }
        for(int i = 2 ; i<num ; i++){
                fab[i] = fab[i-1] + fab[i-2];
            }
        return fab;
    }

    public static void main(String[] args) {
//        factorial(n) = n*factorial(n-1)  such that n should be greator than or equal to one
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any number to calculate its factorial : ");
//        int num = sc.nextInt();
//        System.out.println("Factorial of given number through recursion : " + factorial(num));
//
//        System.out.println();

//        System.out.println("Factorial of given number through iterative method : " + fac(num));


//        Fibonacci number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to calculate fibonacci series : ");
        int num = sc.nextInt();
        int[] series = fibonacci(num);
        System.out.println("Fibonacci serie of given number is : " );
        for (int element : series) {
            System.out.print(element + " ");
        }
    }
}
