import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void all_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int scores[] = {10,10,10,10,10,10,10,10,10,10,10,10};
        int result = bowlingGame.score(scores);
        assertEquals(300,result);
    }

    @Test
    void all_miss() {
        BowlingGame bowlingGame = new BowlingGame();
        int scores[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int result = bowlingGame.score(scores);
        assertEquals(0,result);
    }
}
