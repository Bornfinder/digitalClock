
import java.awt.BorderLayout;
import static java.awt.BorderLayout.NORTH;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 */


class MyWindow1 extends JFrame
{
    
    private JLabel heading;
    Font font=new Font("", Font.BOLD, 30);
    
    private JLabel mainPanel;  
    private JLabel nameLabel,passwordLable;
    private JTextField      nameTextField;
    private JPasswordField      passwordField;
    private JButton            button1,button2;      
    
    
    // constructor
    public MyWindow1()
    {
//        System.out.println("this is a constructor.....");
        super.setTitle("My First Form ");
        super.setSize(600,600);
        super.setLocation(300, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();// give access in frame
        
        
        
        super.setVisible(true);// to make visible make it at last 
        
    }
    
    public void createGUI()
    {
        // in this method we will create GUI
        this.setLayout(new BorderLayout());
        heading=new JLabel(" name the heading");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        
        this.add(heading,BorderLayout.NORTH);
        
        /////////working with jpanel
        mainPanel=new JLabel();
        mainPanel.setLayout(new GridLayout(3,2));
        
        nameLabel=new JLabel( "enter the name");
        nameLabel.setFont(font);
        
        passwordLable=new JLabel("enter the password");
        passwordLable.setFont(font);
        nameTextField=new JTextField(); 
        nameTextField.setFont(font);
        
        passwordField=new JPasswordField();
        passwordField.setFont(font);
        
        button1=new JButton( "submit");
        button1.setFont(font);
        
        button2=new JButton(" reset");
        button2.setFont(font);
                
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLable);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);
        this.add(mainPanel,BorderLayout.CENTER);
        
        
        
    
    }
    
}
