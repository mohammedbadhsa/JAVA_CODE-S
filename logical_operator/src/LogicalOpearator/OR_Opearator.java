
package LogicalOpearator;
import java.util.Scanner;


public class OR_Opearator {
    
   void or_Opearator(){
      Scanner in = new Scanner(System.in);
      char vaule;
      
      System.out.print("Enter the charactor :");
      vaule = in.next().charAt(0);
      
    if(vaule=='a'||vaule=='o'||vaule=='u'|| vaule=='i'|| vaule=='e'){
        
        System.out.println("This is a Vaoule ");
   
    }
    else{
        System.out.println("This is not a Vaoule");
    }
        
    }    
   
   public static void main(String[]argas){
         
      OR_Opearator ob1 = new OR_Opearator();
      ob1.or_Opearator();
      
   }  
   }

