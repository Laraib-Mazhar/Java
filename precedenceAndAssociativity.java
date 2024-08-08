public class precedenceAndAssociativity {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int exp1 = x-y/2;
        System.out.println("exp1 = " + exp1);

        int b = 2;
        int a = 1;
        int c = 5;
        int exp2 = b*b-(4*a*c)/(2*a);
        System.out.println("exp2 = " + exp2);

        int v = 2;
        int u = 3;
        int exp3 = (v*v)-(u*u);
        System.out.println("exp3 = " + exp3);

        int a1 = 33;
        int b1 = 44;
        int d1 = 55;
        int exp4 = a1*b1-d1;
        System.out.println("exp4 = " + exp4);
    }
}
