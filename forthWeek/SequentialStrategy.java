package forthWeek;

public class SequentialStrategy implements Strategy {

    private static int count;

    @Override
    public Hand nextHand() {

        Hand[] hands = { Hand.ROCK, Hand.SCISSORS, Hand.PAPER };
        count++;
        int index = count % 3;
        return hands[index];
    }

}
