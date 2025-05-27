package ro.ase.cts;

public class SuspiciousScriptDetector extends URLCheck{
    public void check(String url) {
        System.out.println("Detecting suspicious scripts...");
        super.check(url);
    }
}
