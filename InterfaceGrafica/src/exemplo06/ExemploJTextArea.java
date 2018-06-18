package exemplo06;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Michelle de Jesus Rogério
 */
public class ExemploJTextArea {

    public JFrame jFrame;
    public JTextArea jTextArea;
    public JLabel jLabelDescricao;
    public JScrollPane jScrollPane;
    
    public ExemploJTextArea(){
    gerarTela();
    instanciarComponentes();
    gerarDimensoes();
    gerarLocalizacoes();
    adicionarComponentes();
    jFrame.setVisible(true);
}

    public void gerarTela() {
        jFrame = new JFrame("Exemplo JTextArea");
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void instanciarComponentes() {
        jScrollPane = new JScrollPane();
        jTextArea = new JTextArea();
        jLabelDescricao = new JLabel("Descricao");
        jScrollPane.setViewportView(jTextArea);
    }

    public void gerarDimensoes(){
        jLabelDescricao.setSize(70,20);
        jScrollPane.setSize(450,420);
    }
    
    public void gerarLocalizacoes() {
        jLabelDescricao.setLocation(10,10);
        jScrollPane.setLocation(10,35);
    }

    public void adicionarComponentes() {
        jFrame.add(jLabelDescricao);
        jFrame.add(jScrollPane);
    }

}
