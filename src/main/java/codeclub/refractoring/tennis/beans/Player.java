package codeclub.refractoring.tennis.beans;

public class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void wonPoint() {
        score++;
    }

    public int getScore() {
        return this.score;
    }
}
