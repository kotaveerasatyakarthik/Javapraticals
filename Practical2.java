public class Practical2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // arthmetic operators
        System.out.println("Arithmetic operators");
        System.out.println("Addition=" + (a + b));
        System.out.println("subtraction=" + (a - b));
        System.out.println("multiplication=" + (a * b));
        System.out.println("division=" + (a / b));
        System.out.println("modulus=" + (a % b));

        System.out.println();

        // relational operators
        System.out.println("Relational operators");
        System.out.println("a==b:" + (a == b));
        System.out.println("a!=b:" + (a != b));
        System.out.println("a>b:" + (a > b));
        System.out.println("a<b:" + (a < b));
        System.out.println("a>=b:" + (a >= b));
        System.out.println("a<=b:" + (a <= b));

        System.out.println();

        // logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("logical operators");
        System.out.println("x&&y=" + (x && y));
        System.out.println("x||y=" + (x || y));
        System.out.println("!x=" + (!x));

        System.out.println();

        // unary operators
        int c = 10;
        System.out.println("unary operators");
        System.out.println("original value=" + c);
        System.out.println("unary plus=" + (+c));
        System.out.println("unary minus=" + (-c));
        System.out.println("pre increment=" + (++c));
        System.out.println("post increment=" + (c++));
        System.out.println("after post increment=" + c);
        System.out.println("pre decrement=" + (--c));
        System.out.println("post decrement=" + (c--));
        System.out.println("after post decrement=" + c);

        System.out.println();

        // bitwise opertors
        int p = 5;
        int q = 3;
        System.out.println("bitwise operators");
        System.out.println("p&q=" + (p & q));
        System.out.println("p|q=" + (p | q));
        System.out.println("p^q=" + (p ^ q));
        System.out.println("~p=" + (~p));
        System.out.println("p<<1=" + (p << 1));
        System.out.println("p>>1=" + (p >> 1));
    }
}