package br.com.gubee;

public class AMDGPU implements GPU {
    @Override
    public void render() {
        System.out.println("Rendering using AMD.");
    }
}
