package ro.ase.cts;

public class HighFidelityRendering implements RenderingStrategy {

    @Override
    public void render(String url) {
        System.out.println("Rendering in high fidelity: " + url);
    }
}
