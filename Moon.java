public class Moon{

private String name;
private int diameter;
private int rotationPeriod;
private int distanceFromPlanet;
private int orbitPeriod;
private Planet planetOrbiting;

public Moon(String name, int diameter, int rotationPeriod, int distanceFromPlanet, int orbitPeriod, Planet planetOrbiting){
    this.name = name;
    this.diameter = diameter;
    this.rotationPeriod = rotationPeriod;
    this.distanceFromPlanet = distanceFromPlanet;
    this.orbitPeriod = orbitPeriod;
    this.planetOrbiting = planetOrbiting;
}
}