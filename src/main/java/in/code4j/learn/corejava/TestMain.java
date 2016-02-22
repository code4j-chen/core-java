package in.code4j.learn.corejava;

/**
 * @author chenlihua
 * @date 2016/2/18
 * @time 14:35
 */
public class TestMain {
    public static strictfp void main(String[] args) {
        double a = 2.0;
        double b = 1.1;
        System.out.println(a - b);

        int c = 8;
        System.out.println((c & 8) / 8);

        double x = 9.789789;
        System.out.println(Math.round(x));
        System.out.println((int)Math.round(x));
        double y = 9.1234234;
        System.out.println(Math.round(y));
        System.out.println((int)Math.round(y));

        String greeting = "Hello";
        System.out.println(greeting.length());
        System.out.println(greeting.codePointCount(0, greeting.length()));
    }
}
