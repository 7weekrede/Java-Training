package DayOne;
// using camelCase notation for classes, variables and methods.
public class Mobile{
    int numberOfSpeakers;
    float screenSize;
    String brand;
    boolean hasLCS;
    float clockSpeed;
    // This method do not return anything, so the return type is "VOID"
    public void playMusic(){
        System.out.println("Playing Music");
    }
    // This method do not return anything, so the return type is "VOID"
    public void makeCall(){
        System.out.println("Making a Call");
    }
    // This method is going to return a Floating Point Value
    public float getScreenSize(){
        return screenSize;
    }

    public Mobile(int numberOfSpeakers, String brand, boolean hasLCS, float clockSpeed, float screenSize) {
        this.numberOfSpeakers = numberOfSpeakers;
        this.brand = brand;
        this.hasLCS = hasLCS;
        this.clockSpeed = clockSpeed;
        this.screenSize = screenSize;
    }
}
class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(2,"SAMSUNG", true, 2.84f, 6.44f);
        mobile.playMusic();
        mobile.makeCall();
        System.out.println("Number of Speakers: " + mobile.numberOfSpeakers);
        System.out.println("Mobile Brand: " + mobile.brand);
        System.out.println("Does it have Liquid Cooling System: " + mobile.hasLCS);
        System.out.println("The Clock Speed of the Mobile Processor is: " + mobile.clockSpeed+ "GHz");
        System.out.println("Screen size of the Mobile is: "+mobile.getScreenSize());
    }
}
