

class A{
   String name;
   int roll;
   
   void add(){
        System.out.println(name);
        System.out.println(roll);
   }   
}

class B extends A{
    int salary;
    void add(){
    System.out.println(name);
    System.out.println(roll);
    System.out.println(salary);
    }
}

