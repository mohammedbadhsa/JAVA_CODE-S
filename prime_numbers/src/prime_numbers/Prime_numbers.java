
package prime_numbers;


public class Prime_numbers {

 
    public static void main(String[] args) {
       int a,count=0,j,i;
       
       for(i=1;i<=100;i++){
           count = 0;
           for(j=1;j<=i;j++){
                if(i%j==0){
                    count+= 1;    
           
                }
           }
       }
       if(count==2){
       System.out.println(i);
       }
    }    
}
