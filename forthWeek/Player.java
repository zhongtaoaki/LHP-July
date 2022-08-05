package forthWeek;

public class Player {

    public String name;
    public int score;
    public Strategy strategy;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
}
