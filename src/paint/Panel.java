package paint;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class Panel extends JPanel implements MouseListener,MouseMotionListener,KeyListener {

    private int x1 = -1;
    private int y1 = -1;
    private int x2 = -1;
    private int y2 = -1;
    private boolean flag = false;
    ArrayList<Figura> list = new ArrayList();
    
    public Panel() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        repaint();
        
    }

    public void mouseReleased(MouseEvent e) {
        Line line = new Line(x1,y1,x2,y2);
        list.add(line);
    }
    
    public void mouseMoved(MouseEvent e) {
    }
    
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    public void mouseClicked(MouseEvent e) {
        //JOptionPane.showMessageDialog(null,e.getPoint().toString());
        flag=!flag;
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, getSize().width, getSize().height);
        if(!list.isEmpty()){
            for(int i=0;i<list.size();i++){
                list.get(i).paint(g);
            }
        }
        /*g.setColor(Color.RED);
        if (x != -1 && y != -1) {
            g.drawOval(x - 25, y - 25, 50, 50);
        }*/
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
