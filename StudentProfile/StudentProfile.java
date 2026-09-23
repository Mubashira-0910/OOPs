public class StudentProfile {

    private String studentId;
    private double gpa;
    private int completedCredits;

    public boolean registerId(String id) {

        if (studentId == null && id != null && !id.trim().isEmpty()) {
            studentId = id;
            return true;
        }

        return false;
    }

    public boolean setGpa(double value) {

        if (value >= 0.0 && value <= 4.0) {
            gpa = value;
            return true;
        }

        return false;
    }

    public boolean addCredits(int amount) {

        if (amount > 0) {
            completedCredits += amount;
            return true;
        }

        return false;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }

    public String summary() {

        return "Student ID: " + studentId
                + ", GPA: " + gpa
                + ", Completed Credits: " + completedCredits;
    }
}