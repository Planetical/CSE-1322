public class CharacterThree extends Character{
    public static String threeDescription = "I'm the main character in my show. I have a big family, which includes my wife, Lois. You could say I'm a big family guy.";
    public static String threeWhoAmI = "Peter Griffin";
    String threeGreeting = "Hey, how are ya?";
    String threeInfo = "I have a big family. My wife is Lois, and I have three kids, Meg, Chris, and Stewie. I also have a dog named Brian. My show is extremely popular, and it has been continuing for over a decade. I'm a little fat and I have an oddly shaped chin.";
    String threeGoodbye = "See ya later!";
    public CharacterThree() {
        super(threeDescription,threeWhoAmI);
    }

    @Override
    public String greeting() {
        return threeGreeting;
    }

    @Override
    public String getInformation() {
        return threeInfo;
    }

    @Override
    public String sayGoodbye() {
        return threeGoodbye;
    }
}
