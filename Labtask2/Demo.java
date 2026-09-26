public class Demo{
       public static void main(String [] args){
          Student s1 = new Student();
          Student s2 = new Student();


         s1.ID = 031;
         s1.name = "Ali";
         s1.completedCredits = 3;

         s2.ID = 041;
         s2.name = "Sara";
         s2.completedCredits = 4;


      System.out.println("Before changes: ");
      s1.printSummary();
      s2.printSummary();

      s1.ID=032;
      s1.name="Fatima";

      System.out.println("After changes: ");
      s1.printSummary();
      s2.printSummary();


     
}
}