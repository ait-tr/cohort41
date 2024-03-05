package enumExample;

public enum Level {
    HIGH(3),
    MEDIUM(2),
    EASY(1);

    private int levelCode;

    Level(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }
}
