/**
 * This class defines the sun with its distance, angle, diamiter, and color
 * @author Yudai Yamase
 */
public class Sun {
    double distance;
    double angle;
    double diamiter;
    String col;

    /**
     * Allows instanes to define the sun's distance, angle, diamiter, and color.
     * @param distance the distance from the sun to the object.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */
    public Sun(double distance, double angle, double diamiter, String col){
        this.distance = distance;
        this.angle = angle;
        this.diamiter = diamiter;
        this.col = col;
    }
}
