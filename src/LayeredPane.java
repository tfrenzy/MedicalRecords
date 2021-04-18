
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLayeredPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tonye
 */
public class LayeredPane extends JLayeredPane {

int count = 0;
Image top1;

public LayeredPane() {
setBounds(0, 0, 1024, 1280);
top1 = this.getToolkit().getImage("background.jpg");
}

@Override
public void paint(Graphics g) {
g.drawImage(top1, 0, 0, this);
}

}