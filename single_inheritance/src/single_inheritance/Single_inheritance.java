
package single_inheritance;

class A{
    public void add(){
    System.out.println("Name : Mohammed Badsha\n Roll : 483017 \n");
    }
}

class B extends A{
    public void add(int roll,String Name){
        roll = roll;
        Name = Name;
}
}

public class Single_inheritance {

public static void main(String[] args) {
        A ob1 = new A();
        ob1.add();
        
        B ob2 = new B();
        ob2.add(483017,"Mohammed Badsha");
        ob2.add();
    
    }
    
}
