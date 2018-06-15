import javax.swing.JFrame;
public class ExemploJFrame01{

public static void main (String[]args){
	//cria uma tela
	JFrame tela = new JFrame();
		
		// define o tamanho da tela
		tela.setSize(500,500);

		// diz que o layout e nulo
		tela.setLayout(null);
		
		// passando nulo ele centraliza a janela
		tela.setLocationRelativeTo(null);

		//diz que quando o usuário fechar a aplicação irá encerrar o app
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tela.show();
}

}