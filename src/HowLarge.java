import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while(true){
            String nextWord = scanner.nextLine();
            if (nextWord.equals("")){
                break;
            } else {
                words.add(nextWord);
            }
        }
        System.out.println("The total amount of items in the list is: " + words.size());
    }
}
