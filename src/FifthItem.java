import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {
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
        System.out.println("The fifth word in the list is: " + words.get(4));
    }
}
