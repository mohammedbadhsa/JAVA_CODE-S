
package constructormethods;

class student{
    int Roll,Reg;
    String Name,Department;
    
    student(String n,int r){
        Name = n;
        Roll = r;
        System.out.println("Student Name :"+Name);
        System.out.println("Student Roll :"+Roll);
    }
    
    public void display(){
        System.out.println("Student Name : "+Name);
        System.out.println("Student Name : "+Roll);
    }
    
    public static void main(String[]args){
        student ob2 = new student("MOHAMMAD BADSHA",483017);
        ob2.display();
        
        
    
    }
}