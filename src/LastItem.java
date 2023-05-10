import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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
        System.out.println("The last item in the list is: " + words.get(words.size() -1));
    }
}
