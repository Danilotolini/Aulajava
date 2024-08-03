package Exmouse;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class ExMouse extends JFrame implements MouseMotionListener, MouseListener{
	JLabel mensagem;
	ExMouse()	{	
		super( "Eventos do Mouse " );
		mensagem = new JLabel();
		mensagem.setFont(new Font("Arial", Font.PLAIN, 30));
		getContentPane().add( mensagem );
		addMouseListener( this );
		addMouseMotionListener( this );
		setSize( 600, 400 );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	public void mouseClicked( MouseEvent e )	{		
		mensagem.setText( "Clicado em "+ coords(e) );	
	}
	public void mousePressed( MouseEvent e ){		
		mensagem.setText( "Pressionado em "+ coords(e) );	
	}
	public void mouseReleased( MouseEvent e )
	{		mensagem.setText( "Liberado em "+ coords(e) );	}
	public void mouseExited( MouseEvent e )
	{		mensagem.setText( "Mouse saiu da janela" );	}
	public void mouseEntered( MouseEvent e )
	{		mensagem.setText( "Mouse entrou na janela" );	}
	public void mouseDragged( MouseEvent e )
	{		mensagem.setText( "Arrastado em "+ coords(e) );	}
	public void mouseMoved( MouseEvent e )
	{		mensagem.setText( "Movido em " + coords(e) );	}
	public String coords(MouseEvent e)	
	{		return e.getX() + ", " + e.getY() ;	}
	public static void main( String args[] ){
		new ExMouse();	
	}
}


