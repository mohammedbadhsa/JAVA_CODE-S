
package constructormethods;

public class Constr {
    
    String Name;
    int Roll;
    
    Constr(String n,int r){
    Name = n;
    Roll = r;  
    }
    
    public static void main(String[]args){
    Constr ob1 = new Constr("Mohammed Badsha",483017);
    ob1.call();
    
    }
    
    void call(){
    
    System.out.println("Student Name :"+Name);
    System.out.println("Student Name :"+Roll);
    }
    
    
}
