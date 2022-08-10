package ss8_clean_code_and_refactoring.exercise;

public class TennisGame {

    public static String getScore(int score1, int score2) {
        String score = "";
        int tempScore;
        int minusResult = score1 - score2;
        if (score1 == score2) {
            switch (score1) {
                case 0:
                    score = "zero-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (score1 >= 4 || score2 >= 4) {
            if (minusResult == 1) return "Advantage player1";
            if (minusResult == -1) return "Advantage player2";
            if (minusResult >= 2) return "Win for player1";
            return "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = score1;
                } else {
                    score = score + "-";
                    tempScore = score2;
                }
                switch (tempScore) {
                    case 0:
                        score = score + "zero";
                        break;
                    case 1:
                        score = score + "Fifteen";
                        break;
                    case 2:
                        score = score + "Thirty";
                        break;
                    case 3:
                        score = score + "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
