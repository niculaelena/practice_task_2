package ro.ase.cts;

import ro.ase.cts.models.chain.*;
import ro.ase.cts.models.strategy.Browser;
import ro.ase.cts.models.strategy.HighFidelityRendering;

public class Main {
    public static void main(String[] args) {

        Browser browser = new Browser();
        browser.setRenderingStrategy(new HighFidelityRendering());

        URLCheck checkChain = new SessionRecovery();
        checkChain.linkWith(new AdBlocker())
                .linkWith(new PhishingFilter())
                .linkWith(new ParentalControl())
                .linkWith(new SuspiciousScriptDetector());

        String url = "http://exemplu.com";
        checkChain.check(url);
        browser.displayPage(url);
    }
}
