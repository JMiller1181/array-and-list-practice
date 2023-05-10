import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            int nextNum = scanner.nextInt();
            if (nextNum == 0){
                break;
            } else {
                nums.add(nextNum);
            }
        }
        System.out.println("Done adding integers to the list");
        System.out.println("What number are you looking for in the list?");
        int findInt = scanner.nextInt();
        int index = 0;
        for(Integer number: nums){
            if(number == findInt){
                System.out.println(findInt + " is at index " + index);
            }
            index++;
        }
    }
}
