public class Demo {

    static void increaseNumber(int n) {
        n += 3;
    }

    static void updateObject(LabProgress p) {
        p.completeOne();
    }

    static void replaceLocal(LabProgress p) {
        p = new LabProgress();
        p.completeOne();
    }

    public static void main(String[] args) {

        int n = 4;
        LabProgress progress = new LabProgress();

        System.out.println("Initially:");
        System.out.println("n = " + n);
        System.out.println("Completed labs = "
                + progress.getCompletedLabs());

        increaseNumber(n);

        System.out.println("After increaseNumber(n):");
        System.out.println("n = " + n);

        updateObject(progress);

        System.out.println("After updateObject(progress):");
        System.out.println("Completed labs = "
                + progress.getCompletedLabs());

        replaceLocal(progress);

        System.out.println("After replaceLocal(progress):");
        System.out.println("Completed labs = "
                + progress.getCompletedLabs());
    }
}