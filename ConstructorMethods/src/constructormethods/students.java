
package constructormethods;

public class students{
    
    public String name;
    public int roll;
    students(String n,int r){
        name = n;
        roll = r;
        
    }
    
    students(students inf){ //---> This is constructor methods !
        name = inf.name;
        roll = inf.roll;
       
    } 
    
    public void display(){    //---> This is copy constructor methods !
    System.out.println("Student Name :"+name);
    System.out.println("Student Roll :"+roll);
    
    }
    
    public static void main(String args []){
        students ob = new students("MOHAMMAD BADSHA",483017);
        students ob2 = new students(ob);
        ob.display();
        ob2.display();  
    }
}
