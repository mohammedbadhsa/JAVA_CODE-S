
package triangle;
import java.util.Scanner;
public class Triangle {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, s, Area;
        System.out.print("Enter the value of a :");
        a = in.nextInt();
        System.out.print("Enter the value of b :");
        b = in.nextInt();
        System.out.print("Enter the value of c :");
        c = in.nextInt();
        
        if(a+b>c && b+c >a && c+a >b){
        s = (a+b+c)/2;
        Area =(s*(s-a)*(s-b)*(s-c));
        System.out.println("The Area is :"+Area);
        }
    }
    
}
