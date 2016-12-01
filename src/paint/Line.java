package paint;

import java.awt.Graphics;

public class Line implements Figura{
    private int x1,y1,x2,y2;
    public Line(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public void setX1(int x){
        x1=x;
    }
    public void setY1(int x){
        y1=x;
    }
    public void setX2(int x){
        x2=x;
    }
    public void setY2(int x){
        y2=x;
    }
    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }
}
