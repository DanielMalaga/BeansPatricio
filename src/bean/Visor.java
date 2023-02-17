package bean;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Visor extends JLabel{
	
	File archivo;
	
	public Visor() {
		setBorder(BorderFactory.createEtchedBorder());
	}
	
	public void setEscogeImagen(String ruta) {
		
		try {
			archivo=new File(ruta);
			setIcon(new ImageIcon(ImageIO.read(archivo)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getEscogeImagen(String ruta) {
		
		if(archivo==null)
			return null;
		else
			return archivo.getPath();
	}
	
	public Dimension getPrefferedSize() {
		return new Dimension(600,400);
	}

}
