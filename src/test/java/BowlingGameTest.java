import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void all_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        String str = "10,10,10,10,10,10,10,10,10,10,10,10";
        int result = bowlingGame.score(str);
        assertEquals(300,result);
    }
}
