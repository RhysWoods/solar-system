public class SolarSystem {

	public static void main(String[] args) {
		SolarSystemGraphics ssg = new SolarSystemGraphics(1000, 1000);

		// Sun
		Sun sun = new Sun("Sun", 200, "YELLOW");

		// Planets
		Planet earth = new Planet("Earth", 149600000, 0, 30, "BLUE", 29.78);
		Planet mars = new Planet("Mars", 227940000, 0, 15, "RED", 24.13);
		Planet jupiter = new Planet("Jupiter", 778330000, 0, 100, "ORANGE", 13.07);
		Planet saturn = new Planet("Saturn", 1429400000, 0, 95, "YELLOW", 9.69);
		Planet uranus = new Planet("Uranus", 2870990000L, 0, 60, "CYAN", 6.81);
		Planet neptune = new Planet("Neptune", 4504300000L, 0, 55, "BLUE", 5.43);
		Planet pluto = new Planet("Pluto", 5913520000L, 0, 5, "GRAY", 4.74);
		Planet mercury = new Planet("Mercury", 57910000, 0, 10, "GRAY", 47.87);
		Planet venus = new Planet("Venus", 108200000, 0, 20, "ORANGE", 35.02);

		// Add to solar system
		ssg.drawSolarObject(0, 0, sun.getDiameter(), sun.getColour());

		ssg.drawSolarObject(earth.getDistance(), earth.getAngle(), earth.getDiameter(), earth.getCol());
		ssg.drawSolarObject(mars.getDistance(), mars.getAngle(), mars.getDiameter(), mars.getCol());
		ssg.drawSolarObject(jupiter.getDistance(), jupiter.getAngle(), jupiter.getDiameter(), jupiter.getCol());
		ssg.drawSolarObject(saturn.getDistance(), saturn.getAngle(), saturn.getDiameter(), saturn.getCol());
		ssg.drawSolarObject(uranus.getDistance(), uranus.getAngle(), uranus.getDiameter(), uranus.getCol());
		ssg.drawSolarObject(neptune.getDistance(), neptune.getAngle(), neptune.getDiameter(), neptune.getCol());
		ssg.drawSolarObject(pluto.getDistance(), pluto.getAngle(), pluto.getDiameter(), pluto.getCol());
		ssg.drawSolarObject(mercury.getDistance(), mercury.getAngle(), mercury.getDiameter(), mercury.getCol());
		ssg.drawSolarObject(venus.getDistance(), venus.getAngle(), venus.getDiameter(), venus.getCol());
	}

}