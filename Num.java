public class Num {

    private int value;

    public Num(int value) {
        this.value = value;
    }

    public int getValue() {
        return.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public boolean equals(Num otherNum) {
        return this.value == otherNum.value;
    }
}