import java.util.Scanner;
public class conditionals {
    public static void main(String[] args){
        System.out.println("Conditionals");
        System.out.println("There are two ways of writing conditionals in java " +
                "1. if else conditional " +
                "2. switch case conditional");

//        System.out.print("Enter yours marks : ");
//        Scanner sc = new Scanner(System.in);
//        int marks = sc.nextInt();
//        if (marks >= 90 || marks >= 100){
//            System.out.println("Grade A++");
//        }
//        else if (marks >= 80 && marks < 89) {
//            System.out.println("Grade A");
//        }
//        else if (marks >= 70 && marks < 79) {
//            System.out.println("Grade B++");
//        }
//        else if (marks >= 65 && marks <= 69) {
//            System.out.println("Grade B");
//        }
//        else {
//            System.out.println("Grade C");
//        }


        System.out.println("SWITCH CASE CONDITIONAL");
        System.out.print("Enter the color name : ");
        Scanner s = new Scanner(System.in);
        String color = s.next();
        switch (color){
            case "red":{
                System.out.println("color is red");
                break;
            }
            case "orange":{
                System.out.println("color is orange");
                break;
            }
            case "blue":{
                System.out.println("color is blue");
                break;
            }
            case "black":{
                System.out.println("color is black");
                break;
            }
            default:{
                System.out.println("undefined color");
            }
        }
    }
}
