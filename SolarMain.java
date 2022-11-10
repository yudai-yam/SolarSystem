import java.util.ArrayList;
import javax.swing.JFrame;
/**
 * This class is a main class that actually places the sun and objects on window, enabling them to revolve
 * @author Yudai Yamase
 */

public class SolarMain extends JFrame{

    public static void main(String args[]){

        // instantiate
        SolarSystem solar = new SolarSystem(500, 600);

        Sun sun = new Sun(0,0,50,"RED");

        RevolvingObject earth = new RevolvingObject(80, 45, 15, "BLUE", 
        0, 0);

        RevolvingObject mars = new RevolvingObject(120, 0, 25, "CYAN", 
        0, 0);

        RevolvingObject jupiter = new RevolvingObject(200, 0, 30, "GREEN", 
        0, 0); 

        RevolvingObject moon = new RevolvingObject(20, 0, 10, "YELLOW", earth.distance, earth.angle);


        ArrayList<RevolvingObject> asteroids = new ArrayList<RevolvingObject>(); 
		 
		for (double i = 0; i < 400; i+=Math.random() * (4 - 1 + 1) + 1)
		{ 
			RevolvingObject asteroid = new RevolvingObject(150, i, 2, "WHITE",
            0, 0); 
			asteroids.add(asteroid); 
		} 


        while(true){
            // draw objects

            // earth
            solar.drawSolarObjectAbout(earth.distance, earth.angle, earth.diamiter, 
            earth.col, earth.centreOfRotationDistance, earth.centreOfRotationAngle);
            // sun
            solar.drawSolarObject(sun.distance, sun.angle, sun.diamiter, sun.col);
            // jupiter
            solar.drawSolarObjectAbout(jupiter.distance, jupiter.angle, jupiter.diamiter, 
            jupiter.col, jupiter.centreOfRotationDistance, jupiter.centreOfRotationAngle);
            // mars
            solar.drawSolarObjectAbout(mars.distance, mars.angle, mars.diamiter, 
            mars.col, mars.centreOfRotationDistance, mars.centreOfRotationAngle);

            // asteroids
            for (RevolvingObject currentAsteroid : asteroids){
                solar.drawSolarObjectAbout(currentAsteroid.distance, currentAsteroid.angle, currentAsteroid.diamiter, 
                currentAsteroid.col, currentAsteroid.centreOfRotationDistance, currentAsteroid.centreOfRotationAngle);
            }

            // moon
            solar.drawSolarObjectAbout(moon.distance, moon.angle, moon.diamiter, moon.col, 
            moon.centreOfRotationDistance, moon.centreOfRotationAngle);
            
            // keep updating the screen
            solar.finishedDrawing();

            // revolve
            earth.revolve(2);
            mars.revolve(1.3);
            jupiter.revolve(1.5);
            for (RevolvingObject currentAsteroid : asteroids){
                currentAsteroid.revolve(1);
            }

            moon.revolve_around_object(5,earth.angle);
            
        }

    }
}