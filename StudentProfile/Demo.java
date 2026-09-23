public class Demo {

    public static void main(String[] args) {

        StudentProfile student = new StudentProfile();

        System.out.println("Register ID: "
                + student.registerId("SP26-BCS-047"));

        System.out.println("Register another ID: "
                + student.registerId("NEW-ID"));

        System.out.println("Set GPA 3.40: "
                + student.setGpa(3.40));

        System.out.println("Set GPA 4.50: "
                + student.setGpa(4.50));

        System.out.println("Add 15 credits: "
                + student.addCredits(15));

        System.out.println("Add -2 credits: "
                + student.addCredits(-2));

        System.out.println("Add 3 credits: "
                + student.addCredits(3));

        System.out.println("\n" + student.summary());
    }
}