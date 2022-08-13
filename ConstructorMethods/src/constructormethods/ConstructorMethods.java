
package constructormethods;

class student{
    public void student(String name,int roll){
        
        System.out.println("Studen Name :"+name);
        System.out.println("Studne Roll :"+roll);
    }
}

public class ConstructorMethods {


    public static void main(String[] args) {
       student ob1 = new student();
       ob1.student("Mohammed Badsha",483017);
       
    }
    
}
