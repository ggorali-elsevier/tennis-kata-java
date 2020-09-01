package codeclub.refractoring.tennis.announcements;

public enum RegularScore {

    LOVE(0, "Love"),
    FIFTEEN(1, "Fifteen"),
    THIRTY(2, "Thirty"),
    FORTY(3, "Forty");

    private final int score;
    private final String message;

    RegularScore(int score, String message) {
        this.score = score;
        this.message = message;
    }

    public static RegularScore of(int score) {

        for (RegularScore tennisScore : values()) {
            if (tennisScore.score == score) {
                return tennisScore;
            }
        }

        throw new IllegalArgumentException();

    }

    @Override
    public String toString() {
        return message;
    }
}
