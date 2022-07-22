package section_ten_generics;

public class MainGenerics {

    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        SoccerPlayer pat = new SoccerPlayer("Pat");
        BaseBallPlayer beckham = new BaseBallPlayer("Beckham");

        Team<FootBallPlayer> cardinals = new Team("St. Louis Cardinals");
        cardinals.addPlayer(joe);
//        cardinals.addPlayer(pat);
//        cardinals.addPlayer(beckham);

        System.out.println(cardinals.numPlayers());

        Team<BaseBallPlayer> cubs = new Team<>("Cubs");
        cubs.addPlayer(beckham);
        System.out.println();
    }
}

