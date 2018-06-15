import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ExemploTextField01{
	
	public static void main (String[]args){

	JFrame tela = new JFrame("Meu primeiro campo");
	tela.setSize(500,500);

	tela.setLayout(null);
	tela.setLocationRelativeTo(null);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel labelNome = new JLabel("Nome");
	labelNome.setSize(70,20);
	labelNome.setLocation(10,10);
	tela.add(labelNome);

	JTextField campoNome = new JTextField();
	campoNome.setSize(200,20);
	campoNome.setLocation(10,35);
	tela.add(campoNome);

	JLabel labelIdade = new JLabel("Idade");
	labelIdade.setSize(200,20);
	labelIdade.setLocation(10,60);
	tela.add(labelIdade);

	JTextField campoIdade = new JTextField();
	campoIdade.setSize(200,20);
	campoIdade.setLocation(10,85);
	tela.add(campoIdade);

	JLabel labelAltura = new JLabel("Altura");
	labelAltura.setSize(70,20);
	labelAltura.setLocation(220,60);
	tela.add(labelAltura);

	JTextField campoAltura = new JTextField();
	campoAltura.setSize(200,20);
	campoAltura.setLocation(220,85);
	tela.add(campoAltura);

	JLabel labelPeso = new JLabel("Peso");
	labelPeso.setSize(70,20);
	labelPeso.setLocation(220,10);
	tela.add(labelPeso);

	JTextField campoPeso = new JTextField();
	campoPeso.setSize(200,20);
	campoPeso.setLocation(220,35);
	tela.add(campoPeso);

	JButton botaoCalcular = new JButton("Calcular");
	botaoCalcular.setSize(100,50);
	botaoCalcular.setLocation(150,150);
	botaoCalcular.setFont(
		new Font("Magneto Negrito",0,26));
	//cor de fundo do botão
	botaoCalcular.setBackground(
		Color.decode("#f4424e"));
	botaoCalcular.setForeground(
		Color.decode("#f4e841"));
	tela.add(botaoCalcular);

	public void actionPerformed(ActionEvent e){

	String nome = campoNome.getText();
	byte idade = Byte.parseByte(
		campoIdade.getText());
	float altura = Float.parseFloat(
		campoAltura.getText());
	float peso = Float.parseFloat(
		campoPeso.getText());

	float imc = peso / (altura * altura);
	JOptionPane.showMessageDialog(null,
		"Nome: "+nome
		+"\nIdade: "+idade
		+"\nAltura: "+altura
		+"\nPeso: "+peso
		+"\nIMC: "+imc);

	tela.setVisible(true);
	}
}