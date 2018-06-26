
import java.awt.EventQueue;


/**
 * @author Michelle de Jesus Rogério
 */
public class ExemploTudoPrincipal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new ExemploTudo();
            }
        });
    }
}
