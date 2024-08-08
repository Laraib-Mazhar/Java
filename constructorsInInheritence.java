class Base1{
    Base1(){
        System.out.println("I am a base class constructor.");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor of base class with value of x as : " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a derived class constructor.");
    }
    Derived1(int  x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived class with value of y as : " + y);
    }
}
class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("I am a child of derived class constructor.");
    }
    ChildOfDerived1(int x , int y, int z){
        super(x,y);
        System.out.println("I am child of an overloaded constructor of derived class with value of z as : " + z);
    }
}
public class constructorsInInheritence {
    public static void main(String[] args) {
//        Base1 base1 = new Base1();
//        Derived1 derived1 = new Derived1();
//        Derived1 derived1 = new Derived1(10,20);
//        ChildOfDerived1 childOfDerived1 = new ChildOfDerived1();
        ChildOfDerived1 childOfDerived1 = new ChildOfDerived1(2,3,7);
    }
}
