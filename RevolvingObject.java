public class RevolvingObject extends Sun{

    double centreOfRotationDistance;
    double centreOfRotationAngle;

    public RevolvingObject(double distance, double angle, double diamiter, String col, double centreOfRotationDistance, double centreOfRotationAngle) {
        super(distance, angle, diamiter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
    }

    public double revolve(double speed){
        this.angle += speed;
        return speed;
    }

    public void revolve_around_object(double speed, double angleOfParent){
        this.angle += speed;
        this.centreOfRotationAngle = angleOfParent;
    }
    

}
