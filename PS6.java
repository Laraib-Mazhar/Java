import java.util.Scanner;

public class PS6 {
    public static void main(String[] args) {

//        Write a program to print array elements in reverse order
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = numbers.length-1 ; i >= 0; i--){
//            System.out.println(numbers[i]);
//        }



//        Question number 1
//        Create an array of 5 floats and calculate their sum.
//        float sum = 0;
//        float[] num = new float[5];
//        num[0] = 10.5f;
//        num[1] = 20.5f;
//        num[2] = 30.0f;
//        num[3] = 40.5f;
//        num[4] = 50.0f;
//        for (int i = 0; i<num.length ; i++){
//            sum = sum + num[i];
//        }
//        System.out.println("Sum : " + sum);



//        Question number 2
//        Write a program to find out whether a given integer is present in an array or not.
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.print("Enter any number between 1 to 10 : ");
//        Scanner sc = new Scanner(System.in);
//        boolean isInArray = false;
//        int number = sc.nextInt();
//        for (int elements: arr){
//            if(number == elements) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("Integer is present in array.");
//        }else {
//            System.out.println("Integer is not present in array.");
//        }

//OR
//        String [] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        System.out.print("Enter any alphabet : ");
//        Scanner sc = new Scanner(System.in);
//        String alpha = sc.next();
//        boolean isInArray = false;
//        for (int i = 0 ; i<arr.length ; i++){
//            if (arr[i].equals(alpha)){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("Alphabet is present in array.");
//        }
//        else {
//            System.out.println("Alphabet is not present in array.");
//        }



//        Question number 3
//        Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
//    float[] marks = {60f,65f,70f,75f,80f,85f,90f,95f};
//    float avg = 0;
//    for (float element: marks){
//        avg = avg + element / marks.length;
//    }
//        System.out.println(avg);



//    Question number 4
//        Create a Java program to add two matrices of size 2x3.
//        int[][] matrix1 = {
//                {1,2,3},
//                {4,5,6}
//        };
//        int[][] matrix2 = {
//                {7,8,9},
//                {10,11,12}
//        };
//        int[][] sum = {
//                {0,0,0},
//                {0,0,0}
//        };
//        for (int i = 0 ; i<matrix1.length; i++){//row number of times
//            for (int j = 0 ; j<matrix1[i].length;j++){//column number of times
//                sum[i][j] = matrix1[i][j]+matrix2[i][j];
//                System.out.print(sum[i][j] + "   ");
//            }
//            System.out.println();
//        }



//        Question number 5
//        Write a Java program to reverse an array.
//        String [] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        for (int i = arr.length-1 ; i >= 0 ; i--){
//            System.out.println(arr[i]);
//        }


//        OR

//        int[] arr = {1,2,3,4,5};
//        for (int element : arr){
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        for (int i = arr.length-1; i >=0;i--){
//            System.out.print(arr[i] + " ");
//        }



//        Question number 6
//        Write a Java program to find the maximum element in an array.
//        int[] number = {10,20,80,40,50,60,55,-66,-80,-90};
//        int maximum = 0;
//        for (int i = 0; i<number.length; i++){
//            if(number[i] > maximum){
//                maximum = number[i];
//            }
//        }
//        System.out.println("Maximum number : " + maximum);



//        Question  number 7
//        Write a Java program to find the minimum element in a Java array.
//        int[] number = {10,20,80,40,5,50,60,3,55,-8};
//        int minimum = 0 ;
//        for (int i = 0; i<number.length; i++){
//            if(number[i] < number[0]){
//                minimum = number[i];
//            }
//        }
//        System.out.println("Minimum number : " + minimum);



//        Question number 8
//        Write a Java program to find whether an array is sorted or not.
//        int[] arr = {2,5,7,1,44,8,0};
//        boolean isSorted = true;
//        for (int i =0 ; i<arr.length-1; i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is sorted");
//        }
//        else {
//            System.out.println("The array is not sorted");
//        }

//        OR

//        int[] arr = {2,4,6,8,10};
//        boolean isSorted = true;
//        for (int i =0 ; i<arr.length-1; i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is sorted");
//        }
//        else {
//            System.out.println("The array is not sorted");
//        }
    }
}