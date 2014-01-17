package ritesh.transparent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Canvas extends JFrame implements MouseListener, MouseMotionListener{
	
	int last_x=-10;
	int last_y=-10;
	int xpos=-10;
	int ypos=-10;

	
	public Canvas(int width, int height) {
        super("");
        setLayout(new GridBagLayout());

        setSize(width,height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void draw() {
        // Set the window to 55% opaque (45% translucent).
        setOpacity(0.55f);

        // Display the window.
        setVisible(true);
    }

    public void mouseDragged(MouseEvent evt)
    {
      xpos=evt.getX();
      ypos=evt.getY();
      Graphics g = getGraphics();
      g.setColor(Color.red);
      g.drawLine(last_x,last_y,xpos,ypos);
      last_x = xpos;
      last_y = ypos;
    }
   
    public void mousePressed(MouseEvent evt)
    {
      last_x = evt.getX();
      last_y = evt.getY();
    }
   
    //following methods need to be included even if not used
    public void mouseMoved(MouseEvent evt) {}
    public void mouseClicked(MouseEvent evt) {}
    public void mouseReleased(MouseEvent evt) {}
    public void mouseEntered(MouseEvent evt) {}
    public void mouseExited(MouseEvent evt) {}
}
