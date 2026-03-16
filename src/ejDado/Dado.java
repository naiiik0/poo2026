package ejDado;

public class Dado {
    private byte cara = 1;

    public Dado() {
    }

    public byte getCara() {
        return cara;
    }
    public void lanza() {
        cara = (byte)(Math.random() * 6 + 1);
    }
}
