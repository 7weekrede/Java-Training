package DayOne;

public class Vehicle {
    int numberOfWheels;
    boolean isSUV;
    int topSpeed;
    String modelName;
    boolean isMusicOn;
    public void startMusic(){
        if(isMusicOn) {
            System.out.println("Music is already on");
            return;
        }
        System.out.println("Music Started");
        isMusicOn = true;
    }
    public void stopMusic(){
        if(isMusicOn) {
            System.out.println("Music stopped");
            isMusicOn = false;
            return;
        }
        System.out.println("Music is not turned on");
    }

    public Vehicle(int numberOfWheels, boolean isSUV, int topSpeed, String modelName, boolean isMusicOn) {
        this.numberOfWheels = numberOfWheels;
        this.isSUV = isSUV;
        this.topSpeed = topSpeed;
        this.modelName = modelName;
        this.isMusicOn = isMusicOn;
    }
}
class Helper{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, true, 120, "Honda", false);
        vehicle.startMusic();
        vehicle.stopMusic();
        System.out.println("Number of wheels of the Vehicle: " + vehicle.numberOfWheels);
        System.out.println("Is the Vehicle a SUV? : "+ vehicle.isSUV);
        System.out.println("The Top Speed of the vehicle is: " + vehicle.topSpeed);
        System.out.println("Model name of the Vehicle is: "+vehicle.modelName);
        System.out.println("Is the Music turned On? : " + vehicle.isMusicOn);
    }
}
