import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        this.game = new Game();
    }

    @Test
    void createGame() {
        assertNotNull(game);
    }

    @Test
    void throwExceptionWhenInputIsNull() {
        try {
            this.game.guess(null);
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void throwExceptionWhenInputLengthIsUnmatched() {
        String guessNumber = "12";
        try {
            this.game.guess(guessNumber);
        } catch (IllegalArgumentException e) {

        }
    }
}