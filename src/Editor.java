import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor extends JFrame {
    private JPanel contentPane;
    private JTextField bookNameField;
    private JTextField authorNameField;
    private JComboBox<String> genreComboBox;
    private JCheckBox isTakenCheckBox;
    private JButton cancelButton;
    private JButton saveButton;

    public Editor() {
        setTitle("Book Editor");
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Llenar opciones del ComboBox de géneros
        genreComboBox.addItem("Fiction");
        genreComboBox.addItem("Science Fiction");
        genreComboBox.addItem("Fantasy");
        genreComboBox.addItem("History");
        genreComboBox.addItem("Technology");

        // Evento para el botón Save
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveChanges();
            }
        });

        // Evento para el botón Cancel
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelChanges();
            }
        });
    }

    private void saveChanges() {
        String title = bookNameField.getText();
        String author = authorNameField.getText();
        String genre = (String) genreComboBox.getSelectedItem();
        boolean isUnavailable = isTakenCheckBox.isSelected();

        System.out.println("=== LIBRO GUARDADO ===");
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Género: " + genre);
        System.out.println("No disponible: " + isUnavailable);
        System.out.println("======================");

        JOptionPane.showMessageDialog(this, "Libro guardado:\n" + title + " - " + author);
    }

    private void cancelChanges() {
        bookNameField.setText("");
        authorNameField.setText("");
        genreComboBox.setSelectedIndex(0);
        isTakenCheckBox.setSelected(false);
    }
}