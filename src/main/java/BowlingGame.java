import java.util.List;

public class BowlingGame {
    public int score(int[] scores) {
        int result = 0;
        for(int i = 0; i < scores.length - 1; ) {
            if (scores[i] == 10 && i < scores.length - 2) {
                result += 10 + scores[i+1] + scores[i+2];
                if (i == scores.length - 3) { break; }
                i += 1;
            } else if (scores[i] < 10) {
                if (scores[i] + scores[i+1] == 10) {
                    result += 10 + scores[i+2];
                } else {
                    result += scores[i] + scores[i+1];
                }
                i += 2;
            }
        }
        return result;
    }
}
