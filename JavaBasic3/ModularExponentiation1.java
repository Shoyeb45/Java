public class ModularExponentiation1 {
    public static int modularExpo(int a, int b, int m){
        if(b == 1)
        return a % m;
        return ((a % m) * modularExpo(a, b-1, m)) % m;
    }
    public static void main(String[] args) {
        
        System.out.println(modularExpo(43, 8, 7));
    }
    
}
