public class thread_program extends Thread {  //extends thread program on thread_program class okey!!
    
  public static void main(String[] args) {    // main method on this program !!
    thread_program thread = new thread_program();  // creatin object on main class !!
    thread.start();  // cell the thread.start() cell object instance !!
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}