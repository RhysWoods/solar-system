public class Planet {

    private String name;
    private double diameter;
    private double distanceFromSun;
    private double angle;
    private String col;
    private double centreOfRotationAngle;
    private double centreOfRotationDistance;

    public Planet(String name, double diameter, double distanceFromSun, long orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.angle = angle;
        this.col = col;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.centreOfRotationDistance = centreOfRotationDistance;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setCentreOfRotationAngle(double centreOfRotationAngle) {
        this.centreOfRotationAngle = centreOfRotationAngle;
    }

    public void setCentreOfRotationDistance(double centreOfRotationDistance) {
        this.centreOfRotationDistance = centreOfRotationDistance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getAngle() {
        return angle;
    }

    public String getCol() {
        return col;
    }

    public double getCentreOfRotationAngle() {
        return centreOfRotationAngle;
    }

    public double getCentreOfRotationDistance() {
        return centreOfRotationDistance;
    }
}