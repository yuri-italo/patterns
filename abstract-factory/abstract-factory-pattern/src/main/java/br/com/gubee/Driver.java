package br.com.gubee;

public class Driver {
    private final GPUFactory factory;

    public Driver(GPUFactory factory) {
        this.factory = factory;
    }

    public void render() {
        GPU gpu = factory.createGPU();
        gpu.render();
    }
}
