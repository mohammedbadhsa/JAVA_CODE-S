package LogicalOpearator;
import java.util.Scanner;

public class And_Operator {
    
    public static void main(String[] args) {
        char cha;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a Charactor ..: ");
        cha = in.next().charAt(0);
        
        if(cha>= 'a' && cha<= 'z'){
            
            System.out.println("This is a small letter");
        }
        
        if(cha>= 'A' && cha<= 'Z'){
            
            System.out.println("This is a capital letter");
        }
        
        
        
    }
}
