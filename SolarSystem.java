public class SolarSystem {

	
	public static void main(String[] args) {
		SolarSystemGraphics ssg = new SolarSystemGraphics(1300, 1300);
		double distanceMultiplier =5;
		double velocityMultiplier = 0.05;

		// Sun
		Sun sun = new Sun("Sun", 100, "YELLOW");

		// Planets
		Planet[] planetArray = new Planet[9];
		planetArray[0] = new Planet("Mercury", 20, 0, 10, "GRAY", 47.87);
		planetArray[1] = new Planet("Venus", 26, 0, 20, "ORANGE", 35.02);
		planetArray[2] = new Planet("Earth", 35, 0, 30, "BLUE", 29.78);
		planetArray[3] = new Planet("Mars", 45, 0, 15, "RED", 24.13);
		planetArray[4] = new Planet("Jupiter", 60, 0, 100, "ORANGE", 13.07);
		planetArray[5] = new Planet("Saturn", 85, 0, 95, "YELLOW", 9.69);
		planetArray[6] = new Planet("Uranus", 100, 0, 40, "CYAN", 6.81);
		planetArray[7] = new Planet("Neptune", 110, 0, 35, "BLUE", 5.43);
		planetArray[8] = new Planet("Pluto", 120, 0, 5, "GRAY", 4.74);

		// Moons
		Moon[] moonArray = new Moon[8];
		moonArray[0] = new Moon("Moon", planetArray[2].getDiameter()+10, 10, 5, 1, planetArray[2], "GRAY");
		moonArray[1] = new Moon("Phobos", planetArray[3].getDiameter()+10, 5, 5, 2.13, planetArray[3], "GRAY");
		moonArray[2] = new Moon("Deimos", planetArray[3].getDiameter()+10, 5, 5, 1.35, planetArray[3], "GRAY");
		moonArray[3] = new Moon("Io", planetArray[4].getDiameter()+10, 5, 5, 17.33, planetArray[4], "GRAY");
		moonArray[4] = new Moon("Europa", planetArray[4].getDiameter()+10, 5, 5, 13.74, planetArray[4], "GRAY");
		moonArray[5] = new Moon("Ganymede", planetArray[4].getDiameter()+10, 5, 5, 10.88, planetArray[4], "GRAY");
		moonArray[6] = new Moon("Callisto", planetArray[4].getDiameter()+10, 5, 5, 2.44, planetArray[4], "GRAY");
		moonArray[7] = new Moon("Titan", planetArray[5].getDiameter()+10, 5, 5, 5.57, planetArray[5], "GRAY");


		while (true) {

			ssg.drawSolarObject(0, 0, sun.getDiameter(), sun.getColour());

			for(int i = 0; i < planetArray.length; i++){
				planetArray[i].setAngle(planetArray[i].getAngle() + planetArray[i].getVelocity() * velocityMultiplier);
				ssg.drawSolarObject(planetArray[i].getDistance()*distanceMultiplier, planetArray[i].getAngle(), planetArray[i].getDiameter(), planetArray[i].getCol());
			}

			for(int i = 0; i < moonArray.length; i++){
				moonArray[i].setAngle(moonArray[i].getAngle() + moonArray[i].getVelocity() * velocityMultiplier);
				ssg.drawSolarObjectAbout(moonArray[i].getDistance(), moonArray[i].getAngle(), moonArray[i].getDiameter(), moonArray[i].getCol(),moonArray[i].getPlanetOrbiting().getDistance()*distanceMultiplier, moonArray[i].getPlanetOrbiting().getAngle());
			}

			ssg.finishedDrawing();
			
		}
		
	}
	
}