package day24interfaces;

public class Honda implements Ac, Brake, Engine{

    @Override
    public void digital() {
        System.out.println("This is digital AC");
    }


    @Override
    public void ecoEngine() {
        System.out.println("This is ecoEngine");
    }

    @Override
    public void secureBrake() {
        System.out.println("This is secure Brake");

    }

    @Override
    public void price() {
        System.out.println("Price");
    }

    @Override
    public String make() {
        return null;

    }








}



