
package single_thread;


public class Single_thread extends Thread {
    
    @Override
    public void run(){
    int i,sum=0;    
    for(i=1;i<=100;i++){
        sum =+ i;
        System.out.println("The Resutl is :"+sum);
    }
    
    }
}

