
import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {

        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = findJewelsInStones(jewels, stones);
        System.out.println(result);   
    }

public static String findJewelsInStones(String jewels, String stones) {
    StringBuilder sb = new StringBuilder();
    int[] freq = new int[58]; 
    for(char c : stones.toCharArray()) {
    freq[c-'A']++;
    }
    for(char c : jewels.toCharArray()) {
        sb.append(c);
        sb.append(freq[c-'A']);
    }
    return sb.toString();
}
}
