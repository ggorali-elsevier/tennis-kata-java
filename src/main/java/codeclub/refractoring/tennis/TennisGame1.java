package codeclub.refractoring.tennis;

import codeclub.refractoring.tennis.beans.Player;
import codeclub.refractoring.tennis.score.ScoreAnnouncer;
import codeclub.refractoring.tennis.score.ScoreAnnouncer2;

public class TennisGame1 implements TennisGame {

    private final Player player1;
    private final Player player2;

    private ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer2(); // DI-able score announcer

    public TennisGame1(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName())) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    public String getScore() {
        return scoreAnnouncer.announceScore(player1, player2);
    }
}
