package day23encapsulationabstraction;

public class Student {

    public String name = "Tom Hanks";
    private String stdId = "TH123";
    private double stdGpa = 3.8;
    private String disease = "Heart Disease";

    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }

    public double getStdGpa() {
        return stdGpa;
    }

    public String getDisease() {
        return disease;
    }
    // Note: If the data type is "boolean" get method name starts with "is"
    public boolean isSuccessful() {
        return successful;
    }

    // set()
    // Everytime set() method return type will be "void" because set() method will do just an action. Tt will change the data.

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setStdGpa(double stdGpa) {
        this.stdGpa = stdGpa;
    }

    //Even the data type is "boolean" we use "set" the beginning of the name
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public static void main(String[] args) {







    }
}
