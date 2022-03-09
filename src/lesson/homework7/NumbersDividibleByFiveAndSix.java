package lesson.homework7;
import java.util.ArrayList;

public class NumbersDividibleByFiveAndSix {
    public static void main(String[] args) {

        ArrayList<String> dividibleNumbers = new ArrayList<>();

        for (int num = 100; num < 1000; num++) {
            if (num % 5 == 0) {
                if (num % 6 == 0) {

                    String tran = String.valueOf(num);
                    dividibleNumbers.add(tran);

                    }
                }
            }

        for (int i = 0; i < dividibleNumbers.size(); i++) {

            if (i % 10 == 0){
                System.out.print("\n" + dividibleNumbers.get(i) + " ");
                i++;
            } else {
                System.out.print(dividibleNumbers.get(i) + " ");
            }
        }
    }
}