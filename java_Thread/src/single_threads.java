
public class single_threads extends Thread {
    
    public void run(){
        int i,sum=0;
        for(i=1;i<=100;i++){
            sum += i;
            System.out.println("Here is the Number :"+i);
        }
        System.out.println("The Sum Of The 1 to 100 Number :"+sum);
        
    }
    
    public static void main(String[] args) {
        single_threads ob1 = new single_threads ();
        ob1.start();
        
    }
    
}
