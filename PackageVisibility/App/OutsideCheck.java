package app;

import model.AccessBox;

public class OutsideCheck {

    public static void main(String[] args) {

        AccessBox box = new AccessBox();

        box.printInside();

        System.out.println("open = " + box.open);

        // These are not allowed from this unrelated class:
        // System.out.println("family = " + box.family);
        // System.out.println("packageOnly = " + box.packageOnly);
        // System.out.println("secret = " + box.secret);
    }
}