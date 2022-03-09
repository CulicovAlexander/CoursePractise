package lesson.homework18;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("one", "unu");
        dictionary.put("two", "doi");
        dictionary.put("three", "trei");
        dictionary.put("four", "patru");
        dictionary.put("five", "cinci");
        dictionary.put("six", "sase");
        dictionary.put("seven", "sapte");
        dictionary.put("eight", "opt");
        dictionary.put("nine", "noua");
        dictionary.put("ten", "zece");


        System.out.print("Please enter the term - ");
        System.out.println(dictionary.get(input.next()));
    }
}
