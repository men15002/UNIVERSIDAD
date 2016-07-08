
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 * @author JorgeAndres
 *
 */
public class GUI_IPOd implements Radio {

	/**
	 * 
	 */
	private JFrame frmIpod;
	private JButton[] favoritos;
	private JButton btnEncender;
	private JButton btnretroceder;
	private JButton btnAvanzar;
	private JButton btnBtnfav;
	private JLabel lblEstacion;
	private JLabel lblnumest;
	private JLabel lblfavoritos;
	private JLabel  lblEncendido;
	private JComboBox combo,combo2;
	private int cont;
	private String avisoencendido;
	private boolean frecuencia=true,estado=true,guardar=true;
	private double emisora,emisoraa=87.9,emisorab=530;
	private double []fav;
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

		lblEstacion = new JLabel("Estacion:");
		lblEstacion.setBounds(22, 42, 65, 14);
		frmIpod.getContentPane().add(lblEstacion);

		btnretroceder = new JButton("Retroceder");
		btnretroceder.setBounds(22, 67, 108, 23);
		frmIpod.getContentPane().add(btnretroceder);

		btnEncender = new JButton("Encender/Apagar");
		btnEncender.setBounds(11, 8, 147, 23);
		frmIpod.getContentPane().add(btnEncender);

		btnAvanzar = new JButton("Avanzar");
		btnAvanzar.setBounds(140, 67, 108, 23);
		frmIpod.getContentPane().add(btnAvanzar);

		lblnumest = new JLabel("87.9");
		lblnumest.setBounds(102, 42, 105, 14);
		frmIpod.getContentPane().add(lblnumest);

		lblfavoritos = new JLabel("Favoritos:");
		lblfavoritos.setBounds(22, 111, 105, 14);
		frmIpod.getContentPane().add(lblfavoritos);
		
		favoritos = new JButton[12];
		fav = new double[12];
		
		favoritos[0] = new JButton("btnFav1");
		favoritos[0].setBounds(11, 130, 84, 28);
		frmIpod.getContentPane().add(favoritos[0]);

		favoritos[1] = new JButton("btnFav2");
		favoritos[1].setBounds(11, 169, 84, 28);
		frmIpod.getContentPane().add(favoritos[1]);

		favoritos[2] = new JButton("btnFav3");
		favoritos[2].setBounds(102, 130, 84, 28);
		frmIpod.getContentPane().add(favoritos[2]);

		favoritos[3] = new JButton("btnFav4");
		favoritos[3].setBounds(102, 169, 84, 28);
		frmIpod.getContentPane().add(favoritos[3]);

		favoritos[4] = new JButton("btnFav5");
		favoritos[4].setBounds(193, 130, 84, 28);
		frmIpod.getContentPane().add(favoritos[4]);

		favoritos[5] = new JButton("btnFav6");
		favoritos[5].setBounds(193, 169, 84, 28);
		frmIpod.getContentPane().add(favoritos[5]);

		favoritos[6] = new JButton("btnFav7");
		favoritos[6].setBounds(284, 130, 84, 28);
		frmIpod.getContentPane().add(favoritos[6]);

		favoritos[7] = new JButton("btnFav8");
		favoritos[7].setBounds(287, 169, 84, 28);
		frmIpod.getContentPane().add(favoritos[7]);

		favoritos[8] = new JButton("btnFav9");
		favoritos[8].setBounds(371, 130, 84, 28);
		frmIpod.getContentPane().add(favoritos[8]);

		favoritos[9] = new JButton("btnFav10");
		favoritos[9].setBounds(375, 169, 84, 28);
		frmIpod.getContentPane().add(favoritos[9]);

		favoritos[10] = new JButton("btnFav11");
		favoritos[10].setBounds(462, 130, 84, 28);
		frmIpod.getContentPane().add(favoritos[10]);

		favoritos[11] = new JButton("btnFav12");
		favoritos[11].setBounds(463, 169, 84, 28);
		frmIpod.getContentPane().add(favoritos[11]);

		combo = new JComboBox();
		combo.addItem("F.M.");
        combo.addItem("A.M.");
		combo.setBounds(261, 39, 65, 20);
		frmIpod.getContentPane().add(combo);
		lblEncendido = new JLabel(avisoencendido);
		lblEncendido.setBounds(184, 8, 142, 14);
		frmIpod.getContentPane().add(lblEncendido);
		
		combo2 = new JComboBox();
		combo2.addItem("Guardar");
        combo2.addItem("Ingresar");
		combo2.setBounds(336, 39, 73, 20);
		frmIpod.getContentPane().add(combo2);
		
		

		combo.addActionListener(new ManejadorEventos());
		combo2.addActionListener(new ManejadorEventos());
		btnretroceder.addActionListener(new ManejadorEventos());
		btnEncender.addActionListener(new ManejadorEventos());
		btnAvanzar.addActionListener(new ManejadorEventos());
		favoritos[0].addActionListener(new ManejadorEventos());
		favoritos[1].addActionListener(new ManejadorEventos());
		favoritos[2].addActionListener(new ManejadorEventos());
		favoritos[3].addActionListener(new ManejadorEventos());
		favoritos[4].addActionListener(new ManejadorEventos());
		favoritos[5].addActionListener(new ManejadorEventos());
		favoritos[6].addActionListener(new ManejadorEventos());
		favoritos[7].addActionListener(new ManejadorEventos());
		favoritos[8].addActionListener(new ManejadorEventos());
		favoritos[9].addActionListener(new ManejadorEventos());
		favoritos[10].addActionListener(new ManejadorEventos());
		favoritos[11].addActionListener(new ManejadorEventos());

	}

	/**
	 * @author JorgeAndres
	 *
	 */
	private class ManejadorEventos implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource()==combo) {
				 
				 String seleccionado=(String)combo.getSelectedItem();
				 System.out.println(seleccionado);  
				 if (seleccionado.equals("F.M.")){ 
					 setFrecuencia(true);
					 emisoraa=87.9;
					 lblnumest.setText(""+emisoraa);
				 }
				 else if (seleccionado.equals("A.M.")){
					 setFrecuencia(false); 
					 lblnumest.setText(""+emisorab);
				 }
			 }
			if (e.getSource()==combo2) {
				 String seleccionado=(String)combo2.getSelectedItem();
				 System.out.println(seleccionado);  
				 if (seleccionado.equals("Guardar")){ 
					 guardar=true;
				 }
				 else if(seleccionado.equals("Ingresar")){
					guardar=false;
				 }
			}
			if (e.getSource() == btnEncender) {
				cont++;
				if (cont%2!=0){
					setEncendido(true);
				}
				else if(cont%2==0) {
					setEncendido(false);
					
				}
				
			}
			if (e.getSource() == btnretroceder) {
				
				if (getFrecuencia() ==true){
					if(emisoraa==87.9){
						emisoraa=87.9;
						
					}
					else if (emisoraa>87.9||emisoraa<=107.9){
						emisoraa=emisoraa-.2;
						DecimalFormat formateador = new DecimalFormat("###0.##"); 
						lblnumest.setText(""+formateador.format(emisoraa));
					}
				}
				else if (getFrecuencia() ==false){
					if(emisorab==530){
						emisorab=emisorab;
					}
					else if(emisorab>530||emisorab<=1610){
						emisorab=emisorab-10;
						lblnumest.setText(""+emisorab);
					}
				}
			}
			if (e.getSource() == btnAvanzar) {
				if (getFrecuencia()==true){
					if(emisoraa==107.9){
						emisoraa=107.9;
					}
					else if (emisoraa>=87.9||emisoraa<107.9){
						emisoraa=emisoraa+.2;
						DecimalFormat formateador = new DecimalFormat("###0.##"); 
						lblnumest.setText(""+formateador.format(emisoraa));
					}
				}
				else if (getFrecuencia() ==false){
					if(emisorab==1610){
						emisorab=emisorab;
					}
					else if(emisorab>=530||emisorab<1610){
						emisorab=emisorab+10;
						lblnumest.setText(""+emisorab);
					}
			}
			

			if (e.getSource() == favoritos[0]) {
				System.out.println("hola");
					if (guardar=true){
						saveEmisora(0,Double.parseDouble(lblnumest.getText()));
						System.out.println(lblnumest.getText());
					}
					else if(guardar=false){
						lblnumest.setText(""+selectEmisora(0));
						System.out.println(selectEmisora(0));
					}
				
			}
			if (e.getSource() == favoritos[1]) {
				if (guardar=true){
					saveEmisora(1,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(1));
				}
			}

			if (e.getSource() == favoritos[2]) {
				if (guardar=true){
					saveEmisora(2,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(2));
				}
			}
			if (e.getSource() == favoritos[3]) {
				if (guardar=true){
					saveEmisora(3,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(3));
				}
			}
			if (e.getSource() == favoritos[4]) {
				if (guardar=true){
					saveEmisora(4,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(4));
				}
			}
			if (e.getSource() == favoritos[5]) {
				if (guardar=true){
					saveEmisora(5,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(5));
				}
			}
			if (e.getSource() == favoritos[6]) {
				if (guardar=true){
					saveEmisora(6,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(6));
				}
			}
			if (e.getSource() == favoritos[7]) {
				if (guardar=true){
					saveEmisora(7,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(7));
				}
			}
			if (e.getSource() == favoritos[8]) {
				if (guardar=true){
					saveEmisora(8,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(8));
				}
			}
			if (e.getSource() == favoritos[9]) {
				if (guardar=true){
					saveEmisora(9,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(9));
				}
			}
			if (e.getSource() == favoritos[10]) {
				if (guardar=true){
					saveEmisora(10,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(10));
				}
			}
			if (e.getSource() == favoritos[11]) {
				if (guardar=true){
					saveEmisora(11,Double.parseDouble(lblnumest.getText()));
				}
				else if(guardar=false){
					lblnumest.setText(""+selectEmisora(11));
				}
			}
			 
		}
	}

}

	@Override
	public void setEncendido(boolean estado) {
		this.estado=estado;
		if (this.estado==true){
			avisoencendido= "La radio esta encendida.";
			lblEncendido.setText(avisoencendido);
			
		}
		else if (this.estado==false){
			avisoencendido= "La radio esta apagada.";
			lblEncendido.setText(avisoencendido);
		}
		
		
	}

	@Override
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia=frecuencia;
		
	}

	@Override
	public void setEmisora(double emisora) {
		this.emisora=emisora;
		
	}

	@Override
	public void saveEmisora(int btn, double emisora) {
		fav[btn]=emisora;
		
	}

	@Override
	public double selectEmisora(int btn) {
		return fav[btn];
	}

	@Override
	public boolean getEncendido() {
		return this.estado;
	}

	@Override
	public boolean getFrecuencia() {
		return this.frecuencia;
	}

	@Override
	public double getEmisora() {
		return this.emisora;
	}
}