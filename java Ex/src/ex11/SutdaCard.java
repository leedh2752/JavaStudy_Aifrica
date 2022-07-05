package ex11;

public class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
    public int hashCode() {
        return toString().hashCode();
    }
}
