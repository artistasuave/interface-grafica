
import exemplo07.ExemploJRadioButton01;
import exemplo08.JFrameBaseInterface;
import exemplo10.ExemploHospitalJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.DISPOSE_ON_CLOSE;

/**
 * @author Michelle de Jesus Rogério
 */
public class ExemploTudo implements JFrameBaseInterface {

    public ExemploTudo() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton00();
        jFrame.setVisible(true);
    }

    private JFrame jFrame;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    private JButton jButton10;

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
        jFrame.add(jButton10);
    }

    @Override
    public void instanciarComponentes() {
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
        jButton09 = new JButton("Exemplo 09");
        jButton10 = new JButton("Exemplo 10");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "public void acaoJButton0" + i + "(){");
            System.out.println(
                    "jButton0" + i
                    + ".addActionListener(new ActionListener() {");
            System.out.println("@Override");
            System.out.println(
                    "public void actionPerformed(ActionEvent e) {");
            System.out.println("}");
            System.out.println("});");
            System.out.println("}");
            System.out.println("");
        }
    }

    @Override
    public void gerarLocalizacoes() {
        jButton10.setLocation(230, 230);
    }

    @Override
    public void gerarDimensoes() {
        jButton10.setSize(100, 100);
    }

    public void acaoJButton00() {
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploHospitalJFrame();
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton10() {
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploHospitalJFrame();
            }
        });
    }
}
