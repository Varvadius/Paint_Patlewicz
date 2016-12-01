
package paint;

import java.awt.Graphics;


public class Oval implements Figura{
    private int x,y;
    
    public Oval(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    
    @Override
    public void paint(Graphics g) {
        if (x != -1 && y != -1) {
            g.drawOval(x - 25, y - 25, 50, 50);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
