//printing the sum of first n natural numbers
import java.util.*;
public class loopsQuestion {
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
System.out.println("This programme will give you sum of first n natural number");
            System.out.print("Enter any natural number:");    int n = sc.nextInt();  
       sc.close();
         int sum=0;
for(int i=1;i<=n;i=i+1){
    sum=sum+i;
    
}    
    System.out.println(sum);

    //another way to produce same output(if you know little maths)

    int mult = n*(n+1); int div=mult/2;

    System.out.println(div);
    }
    }
}
