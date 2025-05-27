package ro.ase.cts;

public class MinimalistRendering implements  RenderingStrategy {

    @Override
    public void render(String url) {
        System.out.println("Rendering in minimalist (text-only) mode: " + url);
    }
}
