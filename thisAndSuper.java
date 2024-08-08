class EkClass{
    int a ;

    EkClass(int a){
//        a = a;
        this.a = a;
    }
    public int getA() {
        return a;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor.");
    }
}
public class thisAndSuper {
    public static void main(String[] args) {

//        EkClass ekClass = new EkClass(6);
//        System.out.println(ekClass.getA());

        DoClass doClass = new DoClass(16);
        System.out.println(doClass.getA());

    }
}
