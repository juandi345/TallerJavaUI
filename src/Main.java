import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Editor ventana = new Editor();
                ventana.setVisible(true);
            }
        });
    }
}