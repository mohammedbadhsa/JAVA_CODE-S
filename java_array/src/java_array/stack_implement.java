
package java_array;
import java.util.Scanner;


public class stack_implement {
    public static void main(String args []){
        Scanner sr = new Scanner(System.in);
        int n,val,i;

        int[] my_arr = new int[5];
        //System.out.println("Enter the Number What you Went to add :");
        
        
        for(i=0;i<my_arr.length;i++){
            System.out.print("Enter the value :");
            my_arr[i] = sr.nextInt();
            
        }
        System.out.println(my_arr);
        

    
    }
    
    
    
}
