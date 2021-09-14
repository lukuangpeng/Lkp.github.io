package tankegame03;


public class Tank {
    private int X;
    private int Y;
    private int direct = 0;
    private int speed = 1;
    boolean isLive = true;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUp() {
        Y -= speed;
    }

    public void moveRight() {
        X += speed;
    }

    public void moveDown() {
        Y = Y + speed;
    }

    public void moveLeft() {
        X -= speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

}