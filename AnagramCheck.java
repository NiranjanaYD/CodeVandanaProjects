import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        char[] s1 = str1.replace("\\s", "").toLowerCase().toCharArray();
        char[] s2 = str2.replace("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("************Enter First String************** ");
        String str1 = scanner.nextLine();
        
       
        System.out.print("*************Enter Second String********** ");
        String str2 = scanner.nextLine();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("Output: True");
        } else {
            System.out.println("Output: False");
        }
        
        scanner.close();
    }
}
