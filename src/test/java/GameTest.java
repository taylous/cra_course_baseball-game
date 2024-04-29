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
        assertIllegalArgument(null);
    }

    @Test
    void throwExceptionWhenInputLengthIsUnmatched() {
        assertIllegalArgument("12");
    }

    private void assertIllegalArgument(String guessNumber) {
        try {
            this.game.guess(guessNumber);
        } catch (IllegalArgumentException e) {

        }
    }
}