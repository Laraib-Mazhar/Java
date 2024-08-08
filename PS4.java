import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {
//        Question number 1
//        int a = 10;
//        //if(a = 11) //Throws an error
//        if(a == 11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }


//        Question number 2
//        System.out.println("Enter your marks ");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Marks in english :");
//        int english = sc.nextInt();
//        System.out.print("Marks in urdu :");
//        int urdu = sc.nextInt();
//        System.out.print("Marks in computer :");
//        int computer = sc.nextInt();
//        int marks = english+urdu+computer;
//        float percentage = marks/3.0f;
//        System.out.println("Percentage = " + percentage + " %");
//        if(percentage >= 40 && english >= 33 && urdu >= 33 && computer >= 33){
//            System.out.println("You are pass");
//        }
//        else {
//            System.out.println("You are fail");
//        }


//        Question number 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your salary :");
//        float salary = sc.nextFloat();
//        if (salary < 2.5f){
//            System.out.println("No tax");
//        }
//        else if (salary >= 2.5f && salary < 5.0f){
//            System.out.println("Tax = 5%");
//        }
//        else if (salary >= 5.0f && salary < 10.0f){
//            System.out.println("Tax = 20%");
//        }
//        else {
//            System.out.println("Tax = 30%");
//        }


//        Question number 4
//        System.out.print("Enter the day of week: ");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1 ->
//                System.out.println("Monday");
//            case 2 ->
//                System.out.println("Tuesday");
//            case 3 ->
//                System.out.println("Wednesday");
//            case 4 ->
//                System.out.println("Thursday");
//            case 5 ->
//                System.out.println("Friday");
//            case 6 ->
//                System.out.println("Saturday");
//            case 7 ->
//                System.out.println("Sunday");
//            default ->
//                System.out.println("You entered a wrong choice");
//        }


//        Question number 5
//        System.out.print("Enter any year to check whether it is a leap year or not : ");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if (year % 4 == 0 ){
//            if (year % 100 == 0){
//                if(year % 400 == 0){
//                    System.out.println("It is a leap year");
//                }
//            }
//            else {
//                System.out.println("It is a leap year");
//            }
//        }
//        else {
//            System.out.println("Not a leap  year");
//        }


//        OR
        System.out.print("Enter any year to check whether it is a leap year or not : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 ==  0 || year % 400 == 0 && year % 100 != 0){
            System.out.println("It is leap year");
        }else {
            System.out.println("Not a leap year");
        }
        
//        Question number 6
//        System.out.print("Enter any website url here :  ");
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if (website.endsWith(".com")){
//            System.out.println("Commercial website");
//        } else if (website.endsWith(".org")) {
//            System.out.println("Organizational website");
//        } else if (website.endsWith("in")) {
//            System.out.println("Indian website");
//        }
//        else {
//            System.out.println("unknown website");
//        }

    }
}
