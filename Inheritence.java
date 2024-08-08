class Base{
    int x;
    public void setX(int X){
        System.out.println("I am in base and  setting the value of X.");
        this.x = X;
    }
    public int getX(){
        return x;
    }
    public void printMe(){
        System.out.println("I am a constructor.");
    }
}
class Derived extends Base{
   int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    String s;

    public String getS() {
        return s;
    }

    public void setS() {
        System.out.println("It is an animal.");
    }
}
class Dog extends Animal{
    String y;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        System.out.println("It is a dog and it is a " + y + " animal." );
        this.y = y;
    }
}
public class Inheritence {
    public static void main(String[] args) {
////        Creating an object of base class
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());
//
////        Creating an object of derieved class
//        Derived d = new Derived();
//        d.setX(10);
//        System.out.println(d.getX());
//
//        d.setY(100);
//        System.out.println(d.getY());



        Dog dog = new Dog();
        dog.setS();
        dog.setY("pet");

    }
}
