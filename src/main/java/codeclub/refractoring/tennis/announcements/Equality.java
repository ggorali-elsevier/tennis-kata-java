package codeclub.refractoring.tennis.announcements;

public enum Equality {

    LOVE_ALL(0, "Love-All"),
    FIFTEEN_ALL(1, "Fifteen-All"),
    THIRTY_ALL(2, "Thirty-All"),
    DEUCE(3, "Deuce");

    private final int score;
    private final String message;

    Equality(int score, String message) {
        this.score = score;
        this.message = message;
    }

    public static Equality of(int score) {

        for (Equality message : values()) {
            if (message.score == score) {
                return message;
            }
        }
        return DEUCE;
    }

    @Override
    public String toString() {
        return message;
    }
}
