import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploComboBox01{
	
	public static void main (String[]args){

	JFrame tela = new JFrame("CAMPO PARA SELECIONAR");
	tela.setSize(500,500);
	tela.setLayout(null);
	tela.setLocationRelativeTo(null);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel labelJogo = new JLabel("Jogo");
	labelJogo.setSize(70,20);
	labelJogo.setLocation(10,10);

	JComboBox caixaDeSelecao = new JComboBox();
	caixaDeSelecao.setSize(200,20);
	caixaDeSelecao.setLocation(85,10);

	DefaultComboBoxModel modelo = new DefaultComboBoxModel(
		new Object[]{
			"Bom de Guerra", "Fortnite", "Pokemon"
		}
		);
	caixaDeSelecao.setModel(modelo);
	caixaDeSelecao.setSelectedIndex(-1);

	JButton botao = new JButton("OBTER");
	botao.setSize(150,20);
	botao.setLocation(45,35);
	botao.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(caixaDeSelecao.getSelectedIndex()==-1){
				JOptionPane.showMessageDialog(null,
					"Selecione ao menos um item");
				return;
			}


			String jogoSelecionado = caixaDeSelecao
			.getSelectedItem().toString();
			JOptionPane.showMessageDialog(null,
				"Jogo Selecionado: "+jogoSelecionado);
		}
	});

	tela.add(botao);
	tela.add(labelJogo);
	tela.add(caixaDeSelecao);
	tela.setVisible(true);
	}
}