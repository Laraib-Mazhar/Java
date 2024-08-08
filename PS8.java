class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellphone{
    public void ring(){
        System.out.println("Cellphone is ringing.....");
    }
    public void vibrate(){
        System.out.println("Cellphone is vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling your friend.....");
    }
}

class Square{
    int side;
    public int area(){
        int area = side*side;
        return  area;
    }
    public int perimeter(){
        int perimeter = 4*side;
        return  perimeter;
    }
}

class Rectangle{
    int length;
    int width;
    public int area(){
        int area = length*width;
        return  area;
    }
    public int perimeter(){
        int perimeter = 2*(length+width);
        return  perimeter;
    }
}


class Civix{
    public void hit(){
        System.out.println("Civix is hitting.....");
    }
    public void run(){
        System.out.println("Civix is runnning.....");
    }
    public void fire(){
        System.out.println("Civix is firing.....");
    }
}


class Circle{
    float π;
    int r;
    public float area(){
        float area = π*(r*r);
        return area;
    }
    public float perimeter(){
        float perimeter = 2*π*r;
        return perimeter;
    }
}

public class PS8 {
    public static void main(String[] args) {
//        Question number 1
//        Create a class Employee with the following properties and methods:
//        Salary (property) (int)
//        getSalary (method returning int)
//        name (property) (String)
//        getName (method returning String)
//        setName (method changing name)


//        Employee1 laraib = new Employee1();
//        laraib.setName("Gull");
//        laraib.salary = 40000;
//        System.out.println(laraib.getName());
//        System.out.println("Salary : " + laraib.salary);


//        System.out.println();
////        Question number 2
////        Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
//        cellphone infinix = new cellphone();
//        infinix.ring();
//        infinix.vibrate();
//        infinix.callFriend();


//        System.out.println();
////        Question number 3
////        Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//        Square  sq = new Square();
//        sq.side = 6;
//        System.out.println("Area of square : " + sq.area());
//        System.out.println("Perimeter of square : " + sq.perimeter());


//        System.out.println();
////        Question number 4
////        Create a class Rectangle & problem 3.
//        Rectangle rectangle = new Rectangle();
//        rectangle.length = 2;
//        rectangle.width = 1;
//        System.out.println("Area of rectangle  having length : " + rectangle.length + " and having width : " + rectangle.width + " = " + rectangle.area());
//        System.out.println("Perimeter of rectangle  having length : " + rectangle.length + " and having width : " + rectangle.width + " = " + rectangle.perimeter());


//        System.out.println();
////        Question number 5
////        Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
//            Civix player1  = new Civix();
//            player1.fire();
//            player1.hit();
//            player1.run();


        System.out.println();
//        Question number 6
//        Repeat problem 4 for a circle.
        Circle circle = new Circle();
        circle.π =  3.14f;
        circle.r = 3;
        System.out.println("Area of circle  having pi : " + circle.π + " and having radius : " + circle.r + " =  " + circle.area());
        System.out.println("Perimeter of circle  having pi : " + circle.π + " and having radius : " + circle.r + " =  " + circle.perimeter());
    }
}
