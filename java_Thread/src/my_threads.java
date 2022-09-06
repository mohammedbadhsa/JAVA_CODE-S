
import java.util.Scanner;


public class my_threads extends Thread{
    @Override
    public void run(){
        int i,sum=0,n;
        Scanner sr = new Scanner (System.in);
        System.out.print("Enter The Value of n :");
        n =sr.nextInt();
        
        for (i=1;i<=n;i++){
            sum += i;
            
        }
        System.out.println("The Result is : "+sum);
        
    }
    
    public void run(String n,int r){
        String Name;
        int Roll;
        
        Name = n;
        Roll = r;
        System.out.println("Student Name"+Name);
        System.out.println("Student Roll"+Roll);
    }
    
    public static void main(String[]args){
    my_threads ob3 = new my_threads();
    ob3.start();
    
    }
    
}