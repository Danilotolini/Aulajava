package menu;
import javax.swing.*;
public class UsandoMenus extends JFrame {
	JMenuBar barra = new JMenuBar();
	JMenu arquivo = new JMenu("Arquivo");
	JMenu editar = new JMenu("Editar");
	
	JMenuItem novo = new JMenuItem("Novo");
	JMenuItem salvar = new JMenuItem("Salvar");
	JMenuItem sair = new JMenuItem("Sair");	
	
	public UsandoMenus(){
		setTitle("Usando Menus");
		setSize(350,200);
		
		arquivo.add(novo);
		arquivo.add(salvar);
		arquivo.add(sair);
		barra.add(arquivo);
		barra.add(editar);
		setJMenuBar(barra);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	public static void main(String[] args) {
	new UsandoMenus();
}
}
