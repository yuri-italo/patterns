package br.com.gubee;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(new AMDFactory());
        driver.render();

        driver = new Driver(new NVidiaFactory());
        driver.render();
    }
}