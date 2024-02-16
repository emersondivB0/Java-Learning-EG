import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Javero extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 630;
	private static final int ALTO = 380;
	private static final String NOMBRE = "Javeros Locos";

	private static JButton btnNuevo;
	private JFileChooser selecionandoArchivo;

	public Javero() {
		setName(NOMBRE);
		setSize(ANCHO, ALTO);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		selecionandoArchivo = new JFileChooser();
		btnNuevo = new JButton();
		btnNuevo.setText("Nuevo Proyecto de Java");
		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int seleccion = selecionandoArchivo.showSaveDialog(btnNuevo);
				File archivo = selecionandoArchivo.getSelectedFile();
				String nombreDelArchivo = archivo.getName().substring(0, archivo.getName().length() - 5);

				if (seleccion == 0) {
					System.out.print(nombreDelArchivo);
					PrintWriter escritor = null;
					try {
						escritor = new PrintWriter(archivo);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
					escritor.print("public class " + nombreDelArchivo
							+ " {\n\tpublic static void main(String[] args) { \n\t}\n}");
					escritor.close();
				}
			}

		});

		add(btnNuevo);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javero main = new Javero();
		main.show();
	}
}

