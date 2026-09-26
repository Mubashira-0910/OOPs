public class Demo {
    public static void main(String[] args) {

        Student a = new Student();
        a.name = "Ali";

        Student b = a;
        b.name = "Sara";

        Student c = new Student();
        c.name = a.name;

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);

        System.out.println(a == b);
        System.out.println(a == c);

        b = new Student();
        b.name = "Jack";

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
    }
}