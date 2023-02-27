public class CharacterOne extends Character {
    public static String oneDescription = "I am a superhero who carries a mighty hammer.";
    public static String oneWhoAmI = "Thor";
    String oneGreeting = "Greetings human";
    String oneInfo = "I am a mighty Avenger. I come from the realm of Asgard. I carry a mighty hammer with me that aids me in battle. I'm a god of thunder.";
    String oneGoodbye = "Goodbye, little one.";
    public CharacterOne() {
        super(oneDescription,oneWhoAmI);
    }

    @Override
    public String greeting() {
        return oneGreeting;
    }

    @Override
    public String getInformation() {
        return oneInfo;
    }

    @Override
    public String sayGoodbye() {
        return oneGoodbye;
    }
}
