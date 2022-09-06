

class A{
   String name;
   int roll;
   
   void add(){
        System.out.println("Students Name :"+name);
        System.out.println("Students Roll : "+roll);
   }   
}

class B extends A{
    int salary;
    void add(){
    System.out.println("Students Name :"+name);
    System.out.println("Students Roll : "+roll);
    System.out.println("Student Salary :"+salary);
    }
}


