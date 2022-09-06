
package java_array;


public class array_input {
    int [] my_array = new int [4];
    void array(int x){
        my_array[0] = x;
        System.out.println("Add Successfully in array :"+my_array[0]);
        my_array[1] = x;
        my_array[2] = x;
        my_array[3] = x;
        
        
    }
    
    public static void main(String[] args) {
        array_input ob1 = new array_input();
        ob1.array(20);
        ob1.array(20);
        ob1.array(20);
 
    }
}
