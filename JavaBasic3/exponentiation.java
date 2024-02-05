public class exponentiation {
    public static int modularExpo(int a, int b, int m){
        if(b == 1)
        return a % m;
        return (a % m) * modularExpo(a, b-1, m);
    }
    // Second way to calculate modular exponentiation with reduced time complexity
    public static void main(String[] args) {
        
        System.out.println(modularExpo(6, 128, 2));
    }
    
}
