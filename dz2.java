

public class dz2 {

    public static void main(String[] args) {

        String s = "cba";
        int[] index = new int[] { 3, 2, 1 };
        String result = shuffle(s, index);
        System.out.println(result); 
    }

    public static String shuffle(final String s, final int[] index) {
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[index[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }
    
}


