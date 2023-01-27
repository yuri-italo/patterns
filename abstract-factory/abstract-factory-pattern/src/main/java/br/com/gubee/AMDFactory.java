package br.com.gubee;

public class AMDFactory implements GPUFactory {
    @Override
    public GPU createGPU() {
        return new AMDGPU();
    }
}
