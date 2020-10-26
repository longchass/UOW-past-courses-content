package assignment3;
import javax.swing.JFrame;

/**
 *
 * @author ngbla
 */
public class Test {
    public static void main(String[] args){
        
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(400,150);
        loginFrame.setResizable(false);
    }
}
