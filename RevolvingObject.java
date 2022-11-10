/**
 * This class defines objects that are capable of revolving around another object
 * @author Yudai Yamase
 */
public class RevolvingObject extends Sun{

    double centreOfRotationDistance;
    double centreOfRotationAngle;

    /**
	 * It defines the placement of an object
	 *
	 * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
	 * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
	 * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
	 */
    public RevolvingObject(double distance, double angle, double diamiter, String col, double centreOfRotationDistance, double centreOfRotationAngle) {
        super(distance, angle, diamiter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
    }

    /**
     * Revolve an object around the sun based on the speed
     * @param speed defines how fast an object revolves
     * @return returns speed of an object
     */
    public double revolve(double speed){
        this.angle += speed;
        return speed;
    }

    /**
     * Revolve an object around another object which is also revolving
     * @param speed defines how fast an object revolves
     * @param angleOfParent angle of its parent object 
     */
    public void revolve_around_object(double speed, double angleOfParent){
        this.angle += speed;
        this.centreOfRotationAngle = angleOfParent;
    }    

}
