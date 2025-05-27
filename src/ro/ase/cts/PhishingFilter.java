package ro.ase.cts;

public class PhishingFilter extends URLCheck{
    public void check(String url) {
        System.out.println("Checking phishing...");
        super.check(url);
    }
}
