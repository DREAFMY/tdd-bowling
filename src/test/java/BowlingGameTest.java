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

    @Test
    void normal_scores() {
        BowlingGame bowlingGame = new BowlingGame();
        int scores1[] = {2,3,0,5,7,1,2,2,0,0,0,4,1,3,4,1,7,1,2,2};
        int scores2[] = {10,1,5,7,1,10,4,4,0,4,7,3,4,1,7,1,10,2,4};
        int scores3[] = {2,3,0,5,7,1,2,2,1,0,10,4,1,3,4,1,7,3,7,8};
        int result1 = bowlingGame.score(scores1);
        int result2 = bowlingGame.score(scores2);
        int result3 = bowlingGame.score(scores3);
        assertEquals(47,result1);
        assertEquals(103,result2);
        assertEquals(76,result3);
    }
}
