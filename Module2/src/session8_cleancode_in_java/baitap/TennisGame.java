package session8_cleancode_in_java.baitap;

public class TennisGame {

    public static String getScoreMatch(String player1Name, String player2Name, int pointPlayer1, int pointPlayer2) {
        String score = "";
        int tempScore = 0;
        if (pointPlayer1 == pointPlayer2) {
            score = pointEqualize(pointPlayer1);
        } else if (pointPlayer1 >= 4 || pointPlayer2 >= 4) {
            score = getRateResult(pointPlayer1, pointPlayer2);
        } else {
            score = getTemporaryPoint(pointPlayer1, pointPlayer2, score);
        }
        return score;
    }



    public static String getTemporaryPoint(int pointPlayer1, int pointPlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = pointPlayer1;
            else {
                score += "-";

                tempScore = pointPlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }


    public static String getRateResult(int pointPlayer1, int pointPlayer2) {
        String score;
        int PointDifference = pointPlayer1 - pointPlayer2;
        if (PointDifference == 1) {
            score = "Advantage player1";
        } else if (PointDifference == -1) {
            score = "Advantage player2";
        } else if (PointDifference >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }



    public static String pointEqualize(int pointPlayer1) {
        String score;
        switch (pointPlayer1) {
            case 0:
                score = "Love-All";
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
        return score;
    }
}
