package ro.ase.cts;

public class ParentalControl extends URLCheck{
    public void check(String url) {
        System.out.println("Checking parental control...");
        super.check(url);
    }
}
