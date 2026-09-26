public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Ali";
        s1.completedCredits = 20;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Sara";
        s2.completedCredits = 30;

        s1.rename("Ahmed");
        s1.addCredits(5);

        s1.printSummary();
        s2.printSummary();
    }
}