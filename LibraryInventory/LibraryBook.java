public class LibraryBook {

    private int totalCopies;
    private int borrowedCopies;
    private boolean configured;

    public boolean configure(int total) {

        if (!configured && total > 0) {
            totalCopies = total;
            borrowedCopies = 0;
            configured = true;
            return true;
        }

        return false;
    }

    public boolean borrow() {
        return borrow(1);
    }

    public boolean borrow(int n) {

        int available = totalCopies - borrowedCopies;

        if (n > 0 && n <= available) {
            borrowedCopies += n;
            return true;
        }

        return false;
    }

    public boolean returnCopies(int n) {

        if (n > 0 && n <= borrowedCopies) {
            borrowedCopies -= n;
            return true;
        }

        return false;
    }

    public int getAvailable() {
        return totalCopies - borrowedCopies;
    }

    public int getBorrowed() {
        return borrowedCopies;
    }
}