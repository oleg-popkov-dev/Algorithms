import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        swap(1, 2);
        swap(-1, 2);
        swap(-1, -2);
        swap2("Runtime", "Java");
    }

    public static void swap(int a, int b) {
       // int temp = a;
       // a = b;
       // b = temp;

       // a = a + b - (b = a);

        a = a + b;
        b = a - b;
        a = a - b;

        out.println(a + " : " + b);
    }

    public static void swap2(String x, String y) {
        x = x + y;
        y = x.substring(0, (x.length() - y.length()));
        x = x.substring(y.length());

        out.println(x + " : " + y);
    }
}