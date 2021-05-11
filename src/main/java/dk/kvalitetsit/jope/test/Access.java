package dk.kvalitetsit.jope.test;

import dk.kvalitetsit.jope.test.more.NoAccess;

public class Access {
    private final NoAccess noAccess;

    public Access() {
        noAccess = new NoAccess();
    }

    public void test() {
        System.out.println("Hej fra test");
        noAccess.test();
    }
}
