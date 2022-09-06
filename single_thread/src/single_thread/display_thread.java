
package single_thread;

public class display_thread extends Thread {
    
      public void run(){
    int i,sum=0;    
    for(i=1;i<=100;i++){
        sum =+ i;
        System.out.print(i);
    }
    
    }
      
    public static void main(String[] args) {
        Single_thread t1 = new Single_thread();
        t1.start();
        display_thread t2 = new display_thread();
        t2.start();
    }
}
