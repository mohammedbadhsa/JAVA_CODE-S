
package pkgswitch;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
       Scanner sr = new Scanner(System.in);
       
        int numbers;
        System.out.print("Enter the value of Numbers :");
        numbers =sr.nextInt();
        String result;
        
        switch(numbers){
            
            case 80 :
                System.out.println("Your CGPA IS  : A+");
                break;
                
            case 70 :
                System.out.println("Your CGPA IS : A");
                break;
            case 60 :
               System.out.println("Your CGPA IS : A_");
                break;
            case 50 :
                System.out.println("Your CGPA IS : B-");
                break;
            
            case 40 :
                System.out.println("Your CGPA IS : C");
                break;
            default:
                System.out.println("Result is :Your are fall bro try Next time okey");
                break;
                
            
     
          
        
        
    }
    
}
