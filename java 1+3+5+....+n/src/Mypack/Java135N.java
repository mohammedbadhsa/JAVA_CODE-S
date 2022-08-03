
package Mypack;
import java.util.Scanner;
public class Java135N {

    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);
        int n,i,sum=0;
        System.out.print("Enter the value of  n:");
        n =in.nextInt();
        
        for(i=1;i<=n;i=i+2){
            sum += i;
        }
        System.out.print(sum);
        
    }
    
}
