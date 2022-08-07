
package pkgswitch;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number; String result;
        System.out.print("Enter your point : ");
        number =in.nextInt();
        
        switch(number){
            
            case 80 :
                result = "A+";
                break;
                
            case 70 :
                result = "A";
                break;
                
            case 60 :
                result = "A-";
                break;
            case 50 :
                result = "B";
                break;
            case 40 :
                result = "C";
                break;
            case 33 :
                result = "C-";
                break;
            default:
                result = "Fall";
                break;                     
        }
        System.out.println("Your Result is : "+result);
        
    }
    
}
