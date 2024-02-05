import java.util.*;

public class ModularExpo2 {
    // code 1 - O(n)

    public static long modExpo(long a, long p, long m){
        if(p == 0)
        return 1;
        if(p == 1)
        return a % m;

        if(p % 2 == 0){
            return ( modExpo(a, p/2, m)  * modExpo(a, p/2, m) ) % m;
        }else{
            return ( modExpo(a, p/2, m) * modExpo(a, p/2, m) * a) % m;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long b = sc.nextLong();
        long p = sc.nextLong();
        long m = sc.nextLong();

        System.out.println(modExpo(b, p, m));
        System.out.println(531441 % 7);

        sc.close();


    }
}
