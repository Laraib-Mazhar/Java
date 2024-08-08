//public class variableArguments {
//    static int sum(int a ,int b){
//        int sum;
//        sum = a+b;
//        return sum;
//    }
//    static int sum(int a ,int b ,int c){
//        int sum;
//        sum = a+b+c;
//        return sum;
//    }
//    static int sum(int a ,int b ,int c ,int d){
//        int sum;
//        sum = a+b+c+d;
//        return sum;
//    }
//    public static void main(String[] args) {
//        System.out.println("The sum of 1 and 2 : " + sum(1,2));
//        System.out.println("The sum of 1 , 2 , 3 : " + sum(1,2,3));
//        System.out.println("The sum of 1 , 2 , 3 , 4: " + sum(1,2,3,4));
//    }
//}



//public class variableArguments {
//    static int sum(int ...arr){
//        int sum = 0;
//        for (int ele:arr){
//            sum += ele;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The sum no values : " + sum());
//        System.out.println("The sum of 1 and 2 : " + sum(1,2));
//        System.out.println("The sum of 1 , 2 , 3 : " + sum(1,2,3));
//        System.out.println("The sum of 1 , 2 , 3 , 4: " + sum(1,2,3,4));
//        System.out.println("The sum of 1 , 2 , 3 , 4 , 5: " + sum(1,2,3,4,5));
//        System.out.println("The sum of 1 , 2 , 3 , 4 , 5 , 6: " + sum(1,2,3,4,5,6));
//        System.out.println("The sum of 1 , 2 , 3 , 4 , 5 , 6 , 7: " + sum(1,2,3,4,5,6,7));
//    }
//}


public class variableArguments {
    //Atleast one parameter required
    static int sum(int a, int ...arr){
        int sum = a;
        for (int ele:arr){
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println("The sum no values: " + sum());
        System.out.println("The sum of 1: " + sum(1));
        System.out.println("The sum of 1 and 2 : " + sum(1,2));
        System.out.println("The sum of 1 , 2 , 3 : " + sum(1,2,3));
        System.out.println("The sum of 1 , 2 , 3 , 4: " + sum(1,2,3,4));
        System.out.println("The sum of 1 , 2 , 3 , 4 , 5: " + sum(1,2,3,4,5));
        System.out.println("The sum of 1 , 2 , 3 , 4 , 5 , 6: " + sum(1,2,3,4,5,6));
        System.out.println("The sum of 1 , 2 , 3 , 4 , 5 , 6 , 7: " + sum(1,2,3,4,5,6,7));
    }
}