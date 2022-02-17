package lesson.tenth.homework;

public class DataTypeConverter {
    public static void main(String[] args) {

        String a = "tRue";
        boolean a1 = Boolean.parseBoolean(a);
        System.out.println(a1);

        String b = "120";
        byte b1 = Byte.parseByte(b);
        System.out.println(b1);

        String c = "32000";
        short c1 = Short.parseShort(c);
        System.out.println(c1);

        String d = "147895632";
        int d1 = Integer.parseInt(d);
        System.out.println(d1);

        String e = "987654321987654321";
        long e1 = Long.parseLong(e);
        System.out.println(e1);

        String f = "4444.5d";
        double f1 = Double.parseDouble(f);
        System.out.println(f1);

        String g = "2354.56f";
        float g1 = Float.parseFloat(g);
        System.out.println(g1);
    }
}
