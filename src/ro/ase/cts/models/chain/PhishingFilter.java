package ro.ase.cts.models.chain;

public class PhishingFilter extends URLCheck {
    public void check(String url) {
        System.out.println("Checking phishing...");
        super.check(url);
    }
}
