package ro.ase.cts.models.chain;

public class SessionRecovery extends URLCheck {
    public void check(String url) {
        System.out.println("Checking session recovery...");
        super.check(url);
    }
}
