import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Color;

public class ExemploJButton02{
	
	public static void main (String[]args){

	JFrame tela = new JFrame("HOVER");
	tela.setSize(500,500);
	tela.setLayout(null);
	tela.setLocationRelativeTo(null);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JButton botao = new JButton("SALVE GALERA");
	botao.setSize(400,300);
	botao.setLocation(45,140);

	// Remove marcação ao redor do texto
	botao.setFocusPainted(false);
	// Remove marcação ao redor do botão
	botao.setBorderPainted(false);

	botao.addMouseListener(new MouseAdapter(){
		// evento quando o mouse entra no botão
		@Override
		public void mouseEntered(MouseEvent e){
			botao.setBackground(Color.decode("#f774af"));
		}
		// evento quando o mouse sai do botão
		@Override
		public void mouseExited(MouseEvent e){
			botao.setBackground(Color.decode("#fff67a"));
		}
	});

	tela.add(botao);

	tela.setVisible(true);
	}
}