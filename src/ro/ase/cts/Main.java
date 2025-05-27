package ro.ase.cts;

public class Main {
    public static void main(String[] args) {
        // Setup Strategy
        Browser browser = new Browser();
        browser.setRenderingStrategy(new HighFidelityRendering());

        // Setup Chain of Responsibility
        URLCheck checkChain = new SessionRecovery();
        checkChain.linkWith(new AdBlocker())
                .linkWith(new PhishingFilter())
                .linkWith(new ParentalControl())
                .linkWith(new SuspiciousScriptDetector());

        // Simulare URL input
        String url = "http://exemplu.com";
        checkChain.check(url);
        browser.displayPage(url);
    }
}
