import java.util.regex.*;


public class ExampleTestClass {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5);
        sb.append(sb.delete(1,4));
        System.out.println(sb);
    }
}