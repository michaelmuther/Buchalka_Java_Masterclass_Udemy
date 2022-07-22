package section_eleven_scope.one;

import java.util.Scanner;

public class X {

    public static void main(String[] args) {
        X x = new X(new Scanner(System.in).nextInt());
        x.x();
    }

    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        for (int x = 0; x < 12; x++) {
            System.out.println(this.x * x);
        }
    }
}

/*
    public static void main(String[] args) {
        X x = new X(new Scanner(System.in).nextInt());
        x.x();
    }

    private int x;
    public X(int x) {
        this.x = x;
    }

    public void x() {
        System.out.println(x);
        System.out.println(x * 2);
        System.out.println(x * 3);
        System.out.println(x * 4);
        System.out.println(x * 5);
        System.out.println(x * 6);
        System.out.println(x * 7);
        System.out.println(x * 8);
        System.out.println(x * 9);
        System.out.println(x * 10);
        System.out.println(x * 11);
        System.out.println(x * 12);
    }
 */
