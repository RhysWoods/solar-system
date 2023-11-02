public class SolarSystem {

	
	public static void main(String[] args) {
		SolarSystemGraphics ssg = new SolarSystemGraphics(1300, 1300);
		double distanceMultiplier =5;

		// Sun
		Sun sun = new Sun("Sun", 100, "YELLOW");

		// Planets
		Planet mercury = new Planet("Mercury", 20, 0, 10, "GRAY", 47.87);
		Planet venus = new Planet("Venus", 26, 0, 20, "ORANGE", 35.02);
		Planet earth = new Planet("Earth", 35, 0, 30, "BLUE", 29.78);
		Planet mars = new Planet("Mars", 45, 0, 15, "RED", 24.13);
		Planet jupiter = new Planet("Jupiter", 60, 0, 100, "ORANGE", 13.07);
		Planet saturn = new Planet("Saturn", 85, 0, 95, "YELLOW", 9.69);
		Planet uranus = new Planet("Uranus", 100, 0, 40, "CYAN", 6.81);
		Planet neptune = new Planet("Neptune", 110, 0, 35, "BLUE", 5.43);
		Planet pluto = new Planet("Pluto", 120, 0, 5, "GRAY", 4.74);

		// Add to solar system
		ssg.drawSolarObject(0, 1, sun.getDiameter(), sun.getColour());

		ssg.drawSolarObject(earth.getDistance() * distanceMultiplier, earth.getAngle(), earth.getDiameter(), earth.getCol());
		ssg.drawSolarObject(mars.getDistance() * distanceMultiplier, mars.getAngle(), mars.getDiameter(), mars.getCol());
		ssg.drawSolarObject(jupiter.getDistance() * distanceMultiplier, jupiter.getAngle(), jupiter.getDiameter(), jupiter.getCol());
		ssg.drawSolarObject(saturn.getDistance() * distanceMultiplier, saturn.getAngle(), saturn.getDiameter(), saturn.getCol());
		ssg.drawSolarObject(uranus.getDistance() * distanceMultiplier, uranus.getAngle(), uranus.getDiameter(), uranus.getCol());
		ssg.drawSolarObject(neptune.getDistance() * distanceMultiplier, neptune.getAngle(), neptune.getDiameter(), neptune.getCol());
		ssg.drawSolarObject(pluto.getDistance() * distanceMultiplier, pluto.getAngle(), pluto.getDiameter(), pluto.getCol());
		ssg.drawSolarObject(mercury.getDistance() * distanceMultiplier, mercury.getAngle(), mercury.getDiameter(), mercury.getCol());
		ssg.drawSolarObject(venus.getDistance() * distanceMultiplier, venus.getAngle(), venus.getDiameter(), venus.getCol());
		
	}
	
}