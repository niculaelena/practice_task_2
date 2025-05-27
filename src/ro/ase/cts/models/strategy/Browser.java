package ro.ase.cts.models.strategy;

import ro.ase.cts.interfaces.RenderingStrategy;

public class Browser {
    private RenderingStrategy strategy;

    public void setRenderingStrategy(RenderingStrategy strategy) {
        this.strategy = strategy;
    }

    public void displayPage(String url) {
        strategy.render(url);
    }
}
