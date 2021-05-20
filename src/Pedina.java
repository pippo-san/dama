public class Pedina {
    private char colore;//R=rosso B=blu
    private int x;
    private int y;
    private boolean viva;
    private boolean dama;

    public Pedina(char colore, int x, int y, boolean viva, boolean dama) {
        this.colore = colore;
        this.x = x;
        this.y = y;
        this.viva = viva=true;
        this.dama = dama=false;
    }

    public char getColore() {
        return colore;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isViva() {
        return viva;
    }

    public boolean isDama() {
        return dama;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }

    public void setDama(boolean dama) {
        this.dama = dama;
    }

    @Override
    public String toString() {
        return "Pedina{" + "colore=" + colore + ", viva=" + viva + ", dama=" + dama + '}';
    }
    
}
