import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double n;
        n = in.nextDouble();
        System.out.println(n >= -3 && n <= 5 || n >= 9 && n <= 15 ? true : false);
    }
}