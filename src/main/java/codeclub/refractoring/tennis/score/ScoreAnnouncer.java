package codeclub.refractoring.tennis.score;

import codeclub.refractoring.tennis.beans.Player;

public interface ScoreAnnouncer {

    String announceScore(Player player1, Player player2);

}
