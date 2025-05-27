package ro.ase.cts;

public class CompressedRendering implements RenderingStrategy {

    @Override
    public void render(String url) {
        System.out.println("Rendering in compressed mode: " + url);
    }
}
