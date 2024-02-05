import java.util.Scanner;

public class reversingString {
    public static void reverse(StringBuilder s, int len, int n){
        if(n == len/2 - 1  &&  len % 2 == 0)
        return;
        if(n == len/2   &&  len % 2 != 0)
        return;
        reverse(s, len, n+1);
        char temp = s.charAt(n+len-1);
        s.setCharAt(n, s.charAt(n+len-1));
        s.setCharAt(n, temp);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder a = new StringBuilder(s);
        reverse(a, a.length(), 0);
        System.out.println(a);
        sc.close();
    }
    
}
