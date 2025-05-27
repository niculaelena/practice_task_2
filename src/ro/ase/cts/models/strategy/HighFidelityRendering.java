package ro.ase.cts.models.strategy;

import ro.ase.cts.interfaces.RenderingStrategy;

public class HighFidelityRendering implements RenderingStrategy {

    @Override
    public void render(String url) {
        System.out.println("Rendering in high fidelity: " + url);
    }
}
