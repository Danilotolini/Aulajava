package exercicio5_JFrame;
import java.awt.*;import java.awt.event.*;import javax.swing.*;  
public class ExJRadioButton extends JFrame{
private JRadioButton normal, negrito, italico, itaNeg;
   private ButtonGroup radioGrupo;
   private JTextField texto;//cria��o do objeto tipo JTextField
   private Font normalF , negritoF, italicoF, itaNegF;

   private Container c ; //cria��o do objeto tipo Container
   private RadioButtonTratar tratarRB ; 
   public ExJRadioButton()//cria��o do m�todo construtor da classe
   {
	super( "RadioButton Exemplo" );
      c = getContentPane();
texto = new JTextField( "Clique nos bot�es para ver o resultado ....", 30 ); 
      c.setLayout( new FlowLayout() ); 	c.add( texto ); 
	tratarRB = new RadioButtonTratar();//instancia��o do objeto
      radioGrupo = new ButtonGroup();//instancia��o do objeto
   // cria��o dos JRadioButtons
      normal  = adicRadio( "Normal", true);
      negrito = adicRadio( "Negrito",false); 
    italico = adicRadio( "It�lico",false);
    itaNeg  = adicRadio( "Negrito+It�lico",false);

    normalF  = new Font( "Arial", Font.PLAIN, 14 ); 
          negritoF = new Font( "Arial", Font.BOLD, 14 );
      italicoF = new Font( "Arial", Font.ITALIC, 14 );
      itaNegF  = new Font( "Arial", Font.BOLD + Font.ITALIC, 14 );

      texto.setFont( normalF );
    setSize( 350, 100 );
      setVisible(true);
          setLocationRelativeTo(null);
          setDefaultCloseOperation(EXIT_ON_CLOSE);   
          }
    public static void main( String args[] )       {
    	new ExJRadioButton();	      
    	}

       
    private JRadioButton adicRadio( String nome, boolean b)
    {JRadioButton radioBot = new JRadioButton (nome, b);
    radioBot.addItemListener( tratarRB );
    c.add(radioBot);//adiciona o botao criado ao conteiner 
    radioGrupo.add( radioBot );//adiciona o botao criado ao grupo RadioGrupo
    return radioBot;   }//retorna o foco para o objeto radioBot
        private class RadioButtonTratar implements ItemListener { 
          public void itemStateChanged( ItemEvent e )
          {if ( e.getSource() == normal )
                texto.setFont( normalF );//formate o texto como normal
             else if ( e.getSource() == negrito )
                texto.setFont( negritoF );
             else if ( e.getSource() == italico )
                texto.setFont( italicoF );
             else if ( e.getSource() == itaNeg )
                texto.setFont( itaNegF ); 
          }   
          }
        }
