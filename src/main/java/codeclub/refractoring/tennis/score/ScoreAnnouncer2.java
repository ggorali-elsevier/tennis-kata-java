package codeclub.refractoring.tennis.score;

import codeclub.refractoring.tennis.beans.Player;
import codeclub.refractoring.tennis.announcements.AdvantageOrWin;
import codeclub.refractoring.tennis.announcements.Equality;
import codeclub.refractoring.tennis.announcements.RegularScore;

public class ScoreAnnouncer2 implements ScoreAnnouncer {

    @Override
    public String announceScore(Player player1, Player player2) {
        String announcement = "";
        int player1Score = player1.getScore();
        int player2Score = player2.getScore();

        if (player1Score == player2Score) {
            announcement = Equality.of(player1Score).toString();
        } else if (advantageOrWin(player1Score, player2Score)) {

            int scoreDifference = player1Score - player2Score;

            if (scoreDifference == 1) {
                announcement = announceAdvantage(player1.getName());
            } else if (scoreDifference == -1) {
                announcement = announceAdvantage(player2.getName());
            } else if (scoreDifference >= 2) {
                announcement = announceWin(player1.getName());
            } else {
                announcement = announceWin(player2.getName());
            }

        } else if (player1Score < 4 && player2Score < 4) {
            announcement = announceCurrentScore(player1Score, player2Score);
        }

        return announcement;
    }

    private boolean advantageOrWin(int player1Score, int player2Score) {
        return player1Score >= 4 || player2Score >= 4;
    }

    private String announceCurrentScore(int player1Score, int player2Score) {
        return String.format("%s-%s", RegularScore.of(player1Score), RegularScore.of(player2Score));
    }

    private String announceAdvantage(String playerName) {
        return String.format("%s %s", AdvantageOrWin.ADVANTAGE, playerName);
    }

    private String announceWin(String playerName) {
        return String.format("%s %s", AdvantageOrWin.WIN, playerName);
    }

}
