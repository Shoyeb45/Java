import java.util.Scanner;

public class vowelCount {
    public static int isVowel(char s){
        if((s == 'a' || s == 'e' || s == 'i' || s == 'i' || s == 'o' || s == 'u'))
        return 1;
        return 0;
    }

    public static int vowelCnt(int i, int n, String s){
        if(i == n)
        return 0;

        return isVowel(s.charAt(i)) + vowelCnt(i+1, n, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(vowelCnt(0, s.length()-1, s));
        sc.close();
    }
    
}
