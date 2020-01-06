public class Constuctor {
    String name;
    
    public Constuctor() {
         System.out.println("Constructor method called.");
    }
     
      public Constuctor(String t) {
          name = t;
      }
      
      public Constuctor(String t, int index) {
          name = t;
      }
     
      public static void main(String[] args) {
          Constuctor cpp  = new Constuctor();
          Constuctor java = new Constuctor("Java");
          Constuctor cpp2 = new Constuctor("C++", 1);
          
          java.getName();
          cpp.getName();
          cpp2.getName(); 
      }
      
      public void getName() {
          System.out.println("Language name: " + name);
      }
}