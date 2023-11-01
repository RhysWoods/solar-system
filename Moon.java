public class Moon{

private String name;
private double diameter;
private double rotationPeriod;
private double distanceFromPlanet;
private double orbitPeriod;
private Planet planetOrbiting;

public Moon(String name, double diameter, double rotationPeriod, double distanceFromPlanet, double orbitPeriod, Planet planetOrbiting){
    this.name = name;
    this.diameter = diameter;
    this.rotationPeriod = rotationPeriod;
    this.distanceFromPlanet = distanceFromPlanet;
    this.orbitPeriod = orbitPeriod;
    this.planetOrbiting = planetOrbiting;
}
}