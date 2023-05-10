import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            int nextNum = scanner.nextInt();
            if (nextNum == 0) {
                break;
            } else {
                nums.add(nextNum);
            }
        }
        int total = 0;
        String phrase = "The items in the list were ";
        for(Integer number: nums){
            total += number;
            if(nums.indexOf(number) < nums.size() -1){
                phrase += number + ", ";
            } else {
                phrase += "and " + number;
            }
        }
        phrase += ". The sum of that list was: " + total;
        System.out.println(phrase);

    }
}
