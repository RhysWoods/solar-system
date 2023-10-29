public class Planet {

    private String name;
    private int diameter;
    private int distanceFromSun;
    private int orbitalPeriod;
    private int rotationPeriod;
    private int numberOfMoons;

    public Planet(String name, int diameter, int distanceFromSun, int orbitalPeriod, int rotationPeriod, int numberOfMoons) {
        this.name = name;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
        this.numberOfMoons = numberOfMoons;
    }

}