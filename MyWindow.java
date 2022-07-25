
import javax.swing.JFrame;

/**
 * @author abdul wajid qureshi
 * main class startWithJFrame1 
 to call JFrame from swing package 
  inharitence 
   to make child class
 */


class MyWindow extends JFrame
{
    // constructor
    public MyWindow()
    {
//        System.out.println("this is a constructor.....");
        super.setTitle("My First Form ");
        super.setSize(400,400);
        super.setLocation(100, 100);
        super.setVisible(true);
        
        
        
        
        
        
    }
}
