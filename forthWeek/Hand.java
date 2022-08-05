package forthWeek;

import javax.lang.model.util.ElementScanner14;

public enum Hand {

    // Rock Paper Scissors
    ROCK(0), SCISSORS(1), PAPER(2);

    public int value;

    private Hand(int value) {
        this.value = value;
    }

    // -1 0 1
    public int fight(Hand h) {

        if (this.value == h.value) {
            return 0;
        } else if ((this.value + 1) % 3 == h.value) {
            return 1;
        } else {
            return -1;
        }
    }
}
