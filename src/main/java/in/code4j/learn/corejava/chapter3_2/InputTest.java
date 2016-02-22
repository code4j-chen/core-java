package in.code4j.learn.corejava.chapter3_2;

import java.util.*;

/**
 * @author chenlihua
 * @date 2016/2/18
 * @time 17:08
 */
public class InputTest {
    public static void main(String[] args) throws InterruptedException {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("what's your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        System.out.printf("Hello, %s, age %s", name, age);*/
        System.out.printf("%,+.2f", 10000.0 / 3.0);
        System.out.println();
        System.out.printf("%,(.2f", 10000.0 / 3.0);
        System.out.println();
        Date date1 = new Date();
        Thread.sleep(500);
        Date date2 = new Date();
        System.out.println(date1.before(date2));
//        Locale.setDefault(Locale.CHINESE);
        GregorianCalendar calendar = new GregorianCalendar(2016, Calendar.NOVEMBER, 1);
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
