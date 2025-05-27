package ro.ase.cts.models.chain;

public class ParentalControl extends URLCheck {
    public void check(String url) {
        System.out.println("Checking parental control...");
        super.check(url);
    }
}
