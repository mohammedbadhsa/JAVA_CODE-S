
package method_overloading;


public class over {
    
    void add(){
        System.out.println("My Name is : Mohammed Badsha");
    }
    
    void add(int x, int y){
    
    int sum = x + y;
    System.out.println("The Result is : "+sum);
    }
    
    public static void main(String [] args){
        over object = new over();
        object.add();
        object.add(200, 654110);
    
    }
}
