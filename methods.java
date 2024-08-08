public class methods {

    static int sum(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = x-y;
        }
        return z;
    }

    int sub(int m , int n){
        int o;
        if(m<n){
            o = m+n;
        }
        else {
            o = m-n;
        }
        return o;
    }

    public static void main(String[] args){
//        There are two ways of calling a function
//        1.Through static method
//        2.Calling through object

    int a = 20;
    int b= 30;
    int c;
    int c1;
//    Through method 1
    c = sum(a,b);
        System.out.println(c);


//        Through method 2
        methods met = new methods();
        c1 = met.sub(a,b);
        System.out.println(c1);
    }
}