import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Nombre y Apellido: Franco Barrera
// Programación IV
// UNLaR - Sede Chamical
public class App { 
    public static void main(String[] args) {
        
        // Modificación 1: cambio del título de la ventana
        JFrame ventana = new JFrame("Programación IV - UNLaR");
        
        // Modificación 2: cambio del tamaño de la ventana
        ventana.setSize(500, 220);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        // Modificación 3: nuevo JLabel con información del estudiante
        JLabel alumno = new JLabel("Alumno: Franco Barrera");

        JLabel etiqueta = new JLabel("Tu nombre:");
        JTextField cajaTexto = new JTextField(15);
        JButton boton = new JButton("Saludar");

        boton.addActionListener(e -> {
            String texto = cajaTexto.getText();
            JOptionPane.showMessageDialog(ventana, "¡Hola, " + texto + "!");
        });

        panel.add(alumno);
        panel.add(etiqueta);
        panel.add(cajaTexto);
        panel.add(boton);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}