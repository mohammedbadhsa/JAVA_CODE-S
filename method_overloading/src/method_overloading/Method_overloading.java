
package method_overloading;


public class Method_overloading {
    
    public void add(){
        System.out.println("This is methods overloading ..");
    }
    public void add(int x,int y){
        
        int z = x + y ;
        System.out.println("The sum is :"+z);
    }
    
    public void add(String name,int roll){
        name = name;
        roll = roll;
        System.out.println(name);
        System.out.println(roll);
    }
    
    public static void main(String [] args){
        
        Method_overloading obj1 = new Method_overloading();
        obj1.add();
        obj1.add(2560, 4550);
        obj1.add("Mohammed Badsha", 483017);
        
        System.out.println(obj1);
    }
    
}
