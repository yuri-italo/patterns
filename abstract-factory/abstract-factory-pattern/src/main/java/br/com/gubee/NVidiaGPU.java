package br.com.gubee;

public class NVidiaGPU implements GPU {
    @Override
    public void render() {
        System.out.println("Rendering using NVidia.");
    }
}
