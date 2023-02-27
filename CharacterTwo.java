public class CharacterTwo extends Character{
    public static String twoDescription = "I'm a cartoon mouse. I'm very popular with young children. Wanna come inside my clubhouse?";
    public static String twoWhoAmI = "Mickey Mouse";
    String twoGreeting = "Oh hello there!";
    String twoInfo = "I'm a popular cartoon mouse. I've been in so many Disney projects that I would even consider myself the mascot of disney. My first appearance was in a cartoon called Steamboat Willy, but you might know me from my clubhouse show.";
    String twoGoodbye = "Toodles!";
    public CharacterTwo() {
        super(twoDescription,twoWhoAmI);
    }

    @Override
    public String greeting() {
        return twoGreeting;
    }

    @Override
    public String getInformation() {
        return twoInfo;
    }

    @Override
    public String sayGoodbye() {
        return twoGoodbye;
    }
}

