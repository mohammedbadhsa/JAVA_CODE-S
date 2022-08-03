
package ax.bx.c.pkg0;
import java.util.Scanner;

public class AxBxC0 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, x, x1, x2, d;
        
        System.out.print("Enter the value of a :");
        a = input.nextDouble();
        System.out.print("Enter the value of b :");
        b = input.nextDouble();
        System.out.print("Enter the value of c :");
        c = input.nextDouble();
        
        d = b*b-4*a*c;
        
        if(d==0){
        x=-b/2*a;
        System.out.print(x);
        }
        else if(d>0){
        x1 =(-b+Math.sqrt(d))/2*a;
        x2 =(-b-Math.sqrt(d))/2*a;
        System.out.println(x1);
        System.out.println(x2);
        }
        else{
        System.out.println("The Roots Are Imegenary");
        }
        
    }
    
}
