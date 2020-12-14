import java.util.Arrays;

public class StringDemoInternMethod {


    public static void main(String[] args) {
        StringDemoInternMethod claz = new StringDemoInternMethod();
        String result = claz.convert(2);
        System.out.println(result);
        String ten = "10";
        System.out.println(claz.convert(ten));

    }

    public String convert (int a) {
        return a + "";
    }

    public int convert (String a) {
        return Integer.parseInt(a);
    }
}
