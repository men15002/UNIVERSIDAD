/*
 *Autores: 
 *	Carlos Calderon,15219
 *	Jorge Azmitia,15202
 *Curso:
 * 	Algoritmos y estructuras de datos
 *Clase:
 * Carro, implementa la interfaz radio  
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

/**
 * @author JorgeAndres
 *
 */
public class GUI_IPOd implements Radio {

	/**
	 * 
	 */
	private JFrame frmIpod;
	private JButton btnEncender;
	private JButton btnretroceder;
	private JButton btnAvanzar;
	private JLabel lblEstacion;
	private JLabel lblnumest;
	private JLabel lblfavoritos;
	private JButton btnFav1;
	private JButton btnFav2;
	private JButton btnFav3;
	private JButton btnFav4;
	private JButton btnFav5;
	private JButton btnFav6;
	private JButton btnFav7;
	private JButton btnFav8;
	private JButton btnFav9;
	private JButton btnFav10;
	private JButton btnFav11;
	private JButton btnFav12;
	private JComboBox combo;
	private JButton btnBtnfav;

	/**
	 * Launch the application.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new GUI_IPOd();

	}

	/**
	 * Create the application.
	 */
	/**
	 * 
	 */
	public GUI_IPOd() {
		initialize();
		frmIpod.setVisible(true);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frmIpod = new JFrame();
		frmIpod.setTitle("IPOD");
		frmIpod.setBounds(100, 100, 575, 244);
		frmIpod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIpod.getContentPane().setLayout(null);

		lblEstacion = new JLabel("estacion:");
		lblEstacion.setBounds(22, 42, 105, 14);
		frmIpod.getContentPane().add(lblEstacion);

		btnretroceder = new JButton("Retroceder");
		btnretroceder.setBounds(22, 67, 108, 23);
		frmIpod.getContentPane().add(btnretroceder);

		btnEncender = new JButton("Encender/Apagar");
		btnEncender.setBounds(224, 12, 117, 23);
		frmIpod.getContentPane().add(btnEncender);

		btnAvanzar = new JButton("Avanzar");
		btnAvanzar.setBounds(140, 67, 108, 23);
		frmIpod.getContentPane().add(btnAvanzar);

		lblnumest = new JLabel("");
		lblnumest.setBounds(102, 42, 105, 14);
		frmIpod.getContentPane().add(lblnumest);

		lblfavoritos = new JLabel("Favoritos:");
		lblfavoritos.setBounds(22, 111, 105, 14);
		frmIpod.getContentPane().add(lblfavoritos);

		btnFav1 = new JButton("btnFav1");
		btnFav1.setBounds(11, 130, 84, 28);
		frmIpod.getContentPane().add(btnFav1);

		btnFav2 = new JButton("btnFav2");
		btnFav2.setBounds(11, 169, 84, 28);
		frmIpod.getContentPane().add(btnFav2);

		btnFav3 = new JButton("btnFav3");
		btnFav3.setBounds(102, 130, 84, 28);
		frmIpod.getContentPane().add(btnFav3);

		btnFav4 = new JButton("btnFav4");
		btnFav4.setBounds(102, 169, 84, 28);
		frmIpod.getContentPane().add(btnFav4);

		btnFav5 = new JButton("btnFav5");
		btnFav5.setBounds(193, 130, 84, 28);
		frmIpod.getContentPane().add(btnFav5);

		btnFav6 = new JButton("btnFav6");
		btnFav6.setBounds(193, 169, 84, 28);
		frmIpod.getContentPane().add(btnFav6);

		btnFav7 = new JButton("btnFav7");
		btnFav7.setBounds(284, 130, 84, 28);
		frmIpod.getContentPane().add(btnFav7);

		btnFav8 = new JButton("btnFav8");
		btnFav8.setBounds(287, 169, 84, 28);
		frmIpod.getContentPane().add(btnFav8);

		btnFav9 = new JButton("btnFav9");
		btnFav9.setBounds(371, 130, 84, 28);
		frmIpod.getContentPane().add(btnFav9);

		btnFav10 = new JButton("btnFav10");
		btnFav10.setBounds(375, 169, 84, 28);
		frmIpod.getContentPane().add(btnFav10);

		btnFav11 = new JButton("btnFav11");
		btnFav11.setBounds(462, 130, 84, 28);
		frmIpod.getContentPane().add(btnFav11);

		btnFav12 = new JButton("btnFav12");
		btnFav12.setBounds(463, 169, 84, 28);
		frmIpod.getContentPane().add(btnFav12);

		combo = new JComboBox();
		combo.addItem("A.M.");
		combo.addItem("F.M.");
		combo.setBounds(261, 39, 65, 20);
		frmIpod.getContentPane().add(combo);

		combo.addActionListener(new ManejadorEventos());
		btnretroceder.addActionListener(new ManejadorEventos());
		btnEncender.addActionListener(new ManejadorEventos());
		btnAvanzar.addActionListener(new ManejadorEventos());
		btnFav1.addActionListener(new ManejadorEventos());
		btnFav2.addActionListener(new ManejadorEventos());
		btnFav3.addActionListener(new ManejadorEventos());
		btnFav4.addActionListener(new ManejadorEventos());
		btnFav5.addActionListener(new ManejadorEventos());
		btnFav6.addActionListener(new ManejadorEventos());
		btnFav7.addActionListener(new ManejadorEventos());
		btnFav8.addActionListener(new ManejadorEventos());
		btnFav9.addActionListener(new ManejadorEventos());
		btnFav10.addActionListener(new ManejadorEventos());
		btnFav11.addActionListener(new ManejadorEventos());
		btnFav12.addActionListener(new ManejadorEventos());

	}

	/**
	 * @author JorgeAndres
	 *
	 */
	private class ManejadorEventos implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnretroceder) {

			}

			if (e.getSource() == combo) {

			}

			if (e.getSource() == btnEncender) {

			}

			if (e.getSource() == btnAvanzar) {

			}

			if (e.getSource() == btnFav1) {

			}
			if (e.getSource() == btnFav2) {

			}

			if (e.getSource() == btnFav3) {

			}
			if (e.getSource() == btnFav4) {

			}
			if (e.getSource() == btnFav5) {

			}
			if (e.getSource() == btnFav6) {

			}
			if (e.getSource() == btnFav7) {

			}
			if (e.getSource() == btnFav8) {

			}
			if (e.getSource() == btnFav9) {

			}
			if (e.getSource() == btnFav10) {

			}
			if (e.getSource() == btnFav11) {

			}
			if (e.getSource() == btnFav12) {

			}

		}
	}

	/**
	 * @param nombreCancion
	 * @return
	 */

	@Override
	public void setEncendido(boolean estado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFrecuencia(boolean frecuencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEmisora(double emisora) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveEmisora(int btn, double emisora) {
		// TODO Auto-generated method stub

	}

	@Override
	public double selectEmisora(int btn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getEncendido() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getFrecuencia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getEmisora() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param pos
	 * @return
	 */

}
