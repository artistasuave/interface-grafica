package exemplo07;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 * @author Michelle de Jesus Rogério
 */
public class ExemploJRadioButton01 {

    private JFrame jFrame;
    private JLabel jLabelCor;
    private JRadioButton jRadioButtonCorPreto;
    private JRadioButton jRadioButtonCorBranco;
    private JRadioButton jRadioButtonCorFucshia;
    private JRadioButton jRadioButtonCorRose;
    private ButtonGroup ButtonGroup;

    public ExemploJRadioButton01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void instanciarComponentes() {
        jLabelCor = new JLabel("COR");
        jRadioButtonCorBranco = new JRadioButton();
        jRadioButtonCorBranco.setText("Branco");
        jRadioButtonCorFucshia = new JRadioButton();
        jRadioButtonCorFucshia.setText("Fucshia");
        jRadioButtonCorPreto = new JRadioButton();
        jRadioButtonCorPreto.setText("Preto");
        jRadioButtonCorRose = new JRadioButton();
        jRadioButtonCorRose.setText("Rose");
        buttonGroupCor = new ButtonGroup();
        buttonGroupCor.setText("Grupo Cor")
        jButtonSalvar = new jButton();
        jButtonSalvar.setText("Salvar");
        jButtonLimparSelecao = new jButton();
        jButtonLimparSelecao.setText("Limpar Seleção");
    }
    
    private void definirRadioParaButtonGroup(){
        buttonGroupCor.add(jRadioButtonCorRose);
        buttonGroupCor.add(jRadioButtonCorPreto);
        buttonGroupCor.add(jRadioButtonCorBranco);
        buttonGroupCor.add(jRadioButtonCorFucshia);
        jButtonSalvar.add(jButtonSalvar);
        jButtonLimparSelecao.add(jButtonLimparSelecao);
        
    }

    private void gerarDimensoes() {
        jLabelCor.setSize(10,10);
        jRadioButtonCorRose.setSize(10,35);
        jRadioButtonCorPreto.setSize(10,60);
        jRadioButtonCorFucshia.setSize(10,85);
        jRadioButtonCorBranco.setSize(10,110);
        jButtonSalvar.setSize(120,20);
        jButtonLimparSelecao.setSize(120,20);
        
    }

    private void gerarLocalizacoes() {
        jLabelCor.setLocation(10,10);
        jRadioButtonCorRose.setLocation(10,35);
        jRadioButtonCorPreto.setLocation(10,60);
        jRadioButtonCorFucshia.setLocation(10,85);
        jRadioButtonCorBranco.setLocation(10,110);
        jButtonSalvar.setLocation(135,160);
        jButtonLimparSelecao(10,135);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelCor);
        jFrame.add(jRadioButtonCorBranco);
        jFrame.add(jRadioButtonCorFucshia);
        jFrame.add(jRadioButtonCorPreto);
        jFrame.add(jRadioButtonCorRose);
        jFrame.add(jButtonLimparSelecao);
        jFrame.add(jButtonSalvar);
    }
    
    public void adicionarAcao(){
        ButtonLimparSelecao.addActionListener{
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jRadioButtonCorBranco.setSelect(false);
                jRadioButtonCorRose.setSelected(false);
                jRadioButtonCorPreto.setSelected(false);
                
            }
        }
    }
    }
}
