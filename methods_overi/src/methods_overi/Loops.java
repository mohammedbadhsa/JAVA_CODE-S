
package methods_overi;


import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int x,n,i,sum;
        System.out.print("Enter The Value of n :");
        n = sr.nextInt();
        
        sum = 1;
        for(i=1;i<=n;i = i + 1){
            sum += i;
        System.out.println("The Result is :"+i);
        }
        System.out.println("The 1 to 100 sum is :"+sum);
        
        
        
    
    }
    
}
