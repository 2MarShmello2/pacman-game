package Pacman;
import java.io.File;
import java.io.FileReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Object;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.lang.Object;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;





public class map extends JFrame{
	BufferedImage map;
	BufferedImage pacman;
	public final double latup=32.10555556;
	public final double latdn=32.10166667;
	public final double longup=35.21222222;
	public final double longdn=32.10166667;


	public map() {
		try
		{
			map = ImageIO.read(new File("C:\\Users\\OmerHadida\\Desktop\\Ex3\\ariel1.png"));
			pacman = ImageIO.read(new File("C:\\Users\\OmerHadida\\Desktop\\Chain-Chomp-icon.png"));

		}
		catch (IOException e)
		{
			String workingDir = System.getProperty("user.dir");
			System.out.println("Current working directory : " + workingDir);
			e.printStackTrace();
		}


		JFrame frame = new JFrame();  
		frame.setIconImage(pacman);
		frame.setTitle("Pacman Game!!!");

		JLabel lblimage = new JLabel(new ImageIcon(map));
		frame.getContentPane().add(lblimage, BorderLayout.CENTER);
		frame.setSize(1500,900);
		frame.setVisible(true);
	}
	public void paint(Graphics g ) {
		g.drawImage(pacman,10,10, 10,10, null)	;	
	}
	//    public Double[] ptc(Point3D a) {
	//    	
	//    	
	//    }

	public static void main(String[] args) throws IOException {
		z r= new z();
	} 
}
