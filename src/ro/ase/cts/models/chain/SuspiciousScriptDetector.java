package ro.ase.cts.models.chain;

public class SuspiciousScriptDetector extends URLCheck {
    public void check(String url) {
        System.out.println("Detecting suspicious scripts...");
        super.check(url);
    }
}
