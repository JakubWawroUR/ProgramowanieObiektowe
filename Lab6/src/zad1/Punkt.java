package zad1;

public class Punkt {
    public double x,y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punkt(){
        x = 0.0;
        y = 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void zeruj(){
        x = 0.0;
        y = 0.0;
    }
    public void opis(){
        System.out.println("Punkt o wspólrzednych x = " + x + "y = " + y);
    }
    public void przesun(int x_,int y_){
        x+=x_;
        y+=y_;
    }
}
