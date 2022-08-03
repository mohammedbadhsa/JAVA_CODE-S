
package method_overloading;

public class math_class {
    
    public void add(){
        System.out.println("this is methods over loading ...");
            
    }
    public void add(String Name,int Roll){
        
        String StudentName = Name;
        int StudentRoll = Roll;
        
        System.out.println(StudentName);
        System.out.println(StudentRoll);
    }
    
    public static void main(String [] args){
        math_class myob = new math_class();
        
        myob.add();
    }
}
