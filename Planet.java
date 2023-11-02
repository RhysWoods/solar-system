public class Planet {

    private String name;
    private double distance;
    private double angle;
    private double diameter;
    private String col;
    private double velocity;

    public Planet(String name, double distance, double angle, double diameter, String col, double velocity) {
        this.name = name;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public double getVelocity() {
        return velocity;
    }
}