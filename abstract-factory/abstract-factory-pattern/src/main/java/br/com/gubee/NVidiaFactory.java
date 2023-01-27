package br.com.gubee;

public class NVidiaFactory implements GPUFactory {
    @Override
    public GPU createGPU() {
        return new NVidiaGPU();
    }
}
