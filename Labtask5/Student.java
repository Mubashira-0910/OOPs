public class Student {
    int id;
    String name;
    int completedCredits;

    void printSummary() {
        System.out.println(id + " " + name + " " + completedCredits);
    }

    void rename(String name) {
        this.name = name;
    }

    void addCredits(int amount) {
        this.completedCredits += amount;
    }
}