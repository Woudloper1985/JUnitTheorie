package be.vdab;

public class Jaar {
    private final int jaar;

    public Jaar(int jaar) {
        this.jaar = jaar;
    }

    boolean isSchrikkeljaar() {
        if (jaar % 400 == 0) {
            return true;
        }
        if (jaar % 100 == 0) {
            return false;
        }
        return jaar % 4 == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(jaar);
    }
}
