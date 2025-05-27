package ro.ase.cts;

public class AdBlocker extends URLCheck{
    public void check(String url) {
        System.out.println("Blocking ads...");
        super.check(url);
    }
}
