package forthWeek;

import java.util.Random;

public class RandomStrategy implements Strategy {

    @Override
    public Hand nextHand() {

        Hand[] hands = { Hand.ROCK, Hand.SCISSORS, Hand.PAPER };

        int index = new Random().nextInt(3);
        return hands[index];
    }

}
