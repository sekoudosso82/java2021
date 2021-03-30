package classPakacge;

public class Robot {
    private int maxSpeed;
    // constructor

    public Robot(){
        this.maxSpeed = 1;
    }

    public Robot(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    //getter method
    public int getMaxSpeed() {
        return maxSpeed;
    }
    //setter method
    public void setMaxSpeed(int maxSpeed){
        if (maxSpeed >= 0 )
            this.maxSpeed = maxSpeed;
        else
            this.maxSpeed = 0 ;
    }
    //instance method
    public void travel(){
        System.out.println("The robot moves a distance of " + maxSpeed + " units.");
    }
}
