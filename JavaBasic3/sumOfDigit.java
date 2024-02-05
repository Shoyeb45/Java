import java.util.Scanner;

public class sumOfDigit {
    public static int sumDigit(int n){
        if(n <= 1 && n > 0){
        return (n % 10);
    }   
        if(n <= 1 && n < 0){
        return (n % 10);
    }   
        if(n<0){
            n = n * -1;
        return (n % 10)+sumDigit(n/10);
    }


        return (n % 10)+sumDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumDigit(n));
        
        sc.close();
    }
    
}
