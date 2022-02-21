package lesson.homework12;

public class PrimeNumbers {
    public static void main(String[] args) {

        for(int i = 1; i <= 10000; i++) {
            int numOfDividers = 0;
            int j = 1;
            while(j <= i) {
                if(i % j == 0) {
                    numOfDividers++;
                }
                j++;
            }
            if (numOfDividers == 2)
            {
                System.out.println(i);
            }
        }
    }
}

