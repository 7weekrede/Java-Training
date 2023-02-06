package DayTwo;
public class Invitation {
    void invite(){
        System.out.println("Hey, I'd love to see you at the Party!");
    }
    void inviteByName(String name) {System.out.println("Hey" + name + "Welcome to the Party"); }
    public static String invitation(){ return "You're invited to the Party!"; }
    public String invitationWithName(String name) {
        return "Hello" + name + " Join the Party";
    }
}
class Main{
    public static void main(String[] args) {
        Invitation invitation = new Invitation();
        invitation.invite();
        invitation.inviteByName("Mahi");
        System.out.println(Invitation.invitation());
        System.out.println(invitation.invitationWithName("Randy"));
    }
}
