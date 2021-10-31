import java.util.Scanner;

public class Sum {
    public static void main(String ... args) {
        var sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        String s1;
        String s2;
        s1 = sc.next();
        s2 = sc.next();
        System.out.println(s1+s2);
    }
}
