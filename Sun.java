public class Sun {

    private String name;
    private double diameter;
    private String col;

    public Sun(String name, double diameter, String col) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return col;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setColour(String col) {
        this.col = col;
    }
}