package codeclub.refractoring.tennis.announcements;

public enum AdvantageOrWin {

    ADVANTAGE("Advantage"),
    WIN("Win for");

    private final String name;

    AdvantageOrWin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
