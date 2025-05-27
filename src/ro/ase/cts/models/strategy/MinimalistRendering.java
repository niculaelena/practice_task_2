package ro.ase.cts.models.strategy;

import ro.ase.cts.interfaces.RenderingStrategy;

public class MinimalistRendering implements RenderingStrategy {

    @Override
    public void render(String url) {
        System.out.println("Rendering in minimalist (text-only) mode: " + url);
    }
}
