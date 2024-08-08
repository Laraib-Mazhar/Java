//public class methodOverloading {
//     static void sum(){
//         System.out.println("ok");
//     }
//    public static void main(String[] args) {
//         sum();
//    }
//}

//public class methodOverloading {
//    static void change(int [] arr){
//        arr[0] = 60;
//    }
//
//    static void arr(int[] numb){
//    numb[0] = 20;
//    }
//
//    public static void main(String[] args) {
//        int[] marks = {1, 3, 4, 5};
//        change(marks);
//        System.out.println(marks[0]);
//
//        System.out.println();
//
//        int [] number = {1,2,3,4,5};
//        arr(number);
//        System.out.println(number[0]);
//
//        System.out.println();
//
//        for (int element : number){
//            System.out.println(element);
//        }
//    }
//}


public class methodOverloading {
    static void foo(){
        System.out.println("hello beautiful!");
    }
    static void foo(int a){
        System.out.println("you have " + a + " rupees");
    }
    static void foo(int a , int b){
        System.out.println("you have " + a + " + " + b + " rupees");
    }

    public static void main(String[] args) {
        foo();
        foo(100);
        foo(500,1000);
    }
}