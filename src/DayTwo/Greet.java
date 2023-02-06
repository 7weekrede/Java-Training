package DayTwo;
public class Greet {
    public void greet(){
        System.out.println("Greeting Message");
    }
    public void greetWithName(String name) {System.out.println("Hello "+name);}
    public String getMessage() {
        return "Hello";
    }
    public String getGreetingMessage(String name) {
        return "Hello " + name + "\nGood Morning";
    }
}
class Helper{
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.greet();
        greet.greetWithName("Mahi");
        System.out.println(greet.getMessage());
        System.out.println(greet.getGreetingMessage("Viper"));
    }
}
