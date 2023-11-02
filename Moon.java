public class Moon {

    private String name;
    private double distance;
    private double diameter;
    private double angle;
    private double velocity;
    private Planet planetOrbiting;
    private String col;

    public Moon(String name, double distance, double diameter, double angle, double velocity, Planet planetOrbiting, String col) {
        this.name = name;
        this.distance = distance;
        this.diameter = diameter;
        this.angle = angle;
        this.velocity = velocity;
        this.planetOrbiting = planetOrbiting;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getAngle() {
        return angle;
    }

    public double getVelocity() {
        return velocity;
    }

    public Planet getPlanetOrbiting() {
        return planetOrbiting;
    }

    public String getCol() {
        return col;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setPlanetOrbiting(Planet planetOrbiting) {
        this.planetOrbiting = planetOrbiting;
    }

    public void setCol(String col) {
        this.col = col;
    }
}