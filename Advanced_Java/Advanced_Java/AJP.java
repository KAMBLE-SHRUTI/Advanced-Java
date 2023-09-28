import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class AJP extends JFrame{

  
    // default constructor
    AJP()
    {
		 // create a new frame to store text field and menuBar
        JFrame f = new JFrame("AJP Project");
	
  
        //create menubaar
		JMenuBar menuBar =new JMenuBar();
		JMenu sizeMenu = new JMenu("FontSize");
		JMenuItem size1 = new JMenuItem("20");
		JMenuItem size2 = new JMenuItem("22");
		JMenuItem size3 = new JMenuItem("25");
		JMenuItem size4 = new JMenuItem("27");
		JMenuItem size5 = new JMenuItem("30");
		 sizeMenu.add(size1);
		 sizeMenu.add(size2);
		 sizeMenu.add(size3);
		 sizeMenu.add(size4);
		 sizeMenu.add(size5);
		 
		JMenu colorMenu=new JMenu("FontColor");
		JMenuItem blueColor = new JMenuItem("Blue");
		JMenuItem redColor = new JMenuItem("red");
		JMenuItem greenColor = new JMenuItem("green");
		JMenuItem yellowColor = new JMenuItem("yellow");
		JMenuItem blackColor = new JMenuItem("black");
		 colorMenu.add(blueColor);
		 colorMenu.add(redColor);
		 colorMenu.add(greenColor);
		 colorMenu.add(yellowColor);
		 colorMenu.add(blackColor);
		 
		JMenu nameMenu=new JMenu("FontName");
		JMenuItem italicMenuItem = new JMenuItem("Italic");
		JMenuItem boldMenuItem = new JMenuItem("Bold");
		 nameMenu.add(italicMenuItem);
		 nameMenu.add(boldMenuItem);
		 
		italicMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Font f = new Font("Serif", Font.ITALIC, 15);
            jt.setFont(f);
					}
				});
		boldMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Font f = new Font("Serif", Font.BOLD, 15);
            jt.setFont(f);
					}
				});	
				
		blueColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
            jt.setForeground(Color.BLUE);
					}
				});	
		redColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
            jt.setForeground(Color.RED);
					}
				});	
		greenColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
            jt.setForeground(Color.GREEN);
					}
				});	
		yellowColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
            jt.setForeground(Color.YELLOW);
					}
				});
		blackColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
            jt.setForeground(Color.BLACK);
					}
				});		

		size1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Font f = new Font("Serif", Font.PLAIN, 20);
            jt.setFont(f);
					}
				});
		size2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Font f = new Font("Serif", Font.PLAIN, 22);
            jt.setFont(f);
					}
				});
		size3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Font f = new Font("Serif", Font.PLAIN, 25);
            jt.setFont(f);
					}
				});	
		size4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Font f = new Font("Serif", Font.PLAIN, 27);
            jt.setFont(f);
					}
				});	
		size5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Font f = new Font("Serif", Font.PLAIN, 30);
            jt.setFont(f);
					}
				});	
		 
		 
		 menuBar.add(sizeMenu);
		 menuBar.add(colorMenu);
		 menuBar.add(nameMenu);
		 
        
  
        // create a object of the text class
        AJP tc = new AJP();
  
        
  
        // create a text area, specifying the rows and columns
        JTextArea jt = new JTextArea("please write something ", 10, 5);
  
        JPanel p = new JPanel();
  
        // add the text area and button to panel
		
		p.add(menuBar);
        p.add(jt);
		
		
        f.add(p);
        // set the size of frame
        f.setSize(350, 350);
        f.show();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
  
    // main class
    public static void main(String[] args)
    {
       new AJP();
    }
     
}