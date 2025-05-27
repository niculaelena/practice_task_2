package ro.ase.cts.models.chain;

public class AdBlocker extends URLCheck {
    public void check(String url) {
        System.out.println("Blocking ads...");
        super.check(url);
    }
}
