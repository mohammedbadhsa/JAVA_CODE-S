
package prime_numbers;


public class Prime_numbers {

 
    public static void main(String[] args) {
       int a,c,j,i;
       
       for(i=1;i<=100;i++){
           c=0;
           for(j=1;j<=i;j++){
           if(i%j==0);
           c = c +1;    
           }
           
       }
       if(c ==2){
       System.out.println(""+i+"");
       }
    }
    
    
}
