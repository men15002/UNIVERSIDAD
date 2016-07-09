
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
 *   Esta clase se encarga de implementar el radio.Ademas,provee la interfaz grafica la cual simula un IPOD que controla como
 *   si fuera un control remoto, al radio.
 * @author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 * @version 2.1.2 Julio 9, 2016
 *
 */
public class GUI_IPOd implements Radio {

	 /* Atributos */
	private JFrame frmIpod;
	private JButton btnEncender;
	private JButton btnretroceder;
	private JButton btnAvanzar;
	private JButton btnBtnfav;
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
	private JLabel lblEstacion;
	private JLabel lblnumest;
	private JLabel lblfavoritos;
	private JLabel  lblEncendido;
	private JComboBox combo,combo2;
	private int cont;
	private String avisoencendido;
	private boolean frecuencia=true,estado=true,guardar=true,Est=true;
	private double emisora,emisoraa=87.9,emisorab=530;
	private double []fav;
	

	 /**
    Constructor: no recibe parametros. Inicializa la aplicacion, invocando el método initialize().
  */
	public GUI_IPOd() {
		initialize();
		frmIpod.setVisible(true);
	}

	/**
	 * Inicializa los contenidos del Frame.
	 */
	private void initialize() {
		/* Inicializar arreglo de estaciones */
		fav = new double[12];
		/* Elementos del Frame */
		frmIpod = new JFrame();
		frmIpod.setTitle("IPOD");
		frmIpod.setBounds(100, 100, 596, 244);
		frmIpod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIpod.getContentPane().setLayout(null);
		/* Label que indican funciones */
		lblEstacion = new JLabel("Estacion:");
		lblEstacion.setBounds(22, 42, 65, 14);
		
		lblnumest = new JLabel("87.9");
		lblnumest.setBounds(102, 42, 105, 14);
		frmIpod.getContentPane().add(lblnumest);

		lblfavoritos = new JLabel("Favoritos:");
		lblfavoritos.setBounds(22, 111, 105, 14);
		frmIpod.getContentPane().add(lblfavoritos);
		frmIpod.getContentPane().add(lblEstacion);
		
		avisoencendido="La radio esta apagada.";
		lblEncendido = new JLabel(avisoencendido);
		lblEncendido.setBounds(184, 8, 142, 14);
		frmIpod.getContentPane().add(lblEncendido);
		
		/* Botones para cambiar emisora y apagar/encender radio*/
		btnretroceder = new JButton("Retroceder");
		btnretroceder.setBounds(22, 67, 108, 23);
		frmIpod.getContentPane().add(btnretroceder);
		
		btnAvanzar = new JButton("Avanzar");
		btnAvanzar.setBounds(140, 67, 108, 23);
		frmIpod.getContentPane().add(btnAvanzar);
		
		btnEncender = new JButton("Encender/Apagar");
		btnEncender.setBounds(11, 8, 147, 23);
		frmIpod.getContentPane().add(btnEncender);
				
		/* 12 botones de estaciones */
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
		btnFav11.setBounds(462, 130, 96, 28);
		frmIpod.getContentPane().add(btnFav11);

		btnFav12 = new JButton("btnFav12");
		btnFav12.setBounds(463, 169, 95, 28);
		frmIpod.getContentPane().add(btnFav12);

		/* Comboboxes para indicar la frecuencia y si los botones favoritos guardan/despliegan*/
		combo = new JComboBox();
		combo.addItem("F.M.");
        combo.addItem("A.M.");
		combo.setBounds(261, 39, 65, 20);
		frmIpod.getContentPane().add(combo);
		
		combo2 = new JComboBox();
		combo2.addItem("Guardar");
        combo2.addItem("Ingresar");
		combo2.setBounds(336, 39, 73, 20);
		frmIpod.getContentPane().add(combo2);
		
		/*Bloquear botones para dar efecto encendido/apagado*/
		btnretroceder.setEnabled(false);
		combo.setEnabled(false);
		combo2.setEnabled(false);
		btnAvanzar.setEnabled(false);
		btnFav1.setEnabled(false);
		btnFav2.setEnabled(false);
		btnFav3.setEnabled(false);
		btnFav4.setEnabled(false);
		btnFav5.setEnabled(false);
		btnFav6.setEnabled(false);
		btnFav7.setEnabled(false);
		btnFav8.setEnabled(false);
		btnFav9.setEnabled(false);
		btnFav10.setEnabled(false);
		btnFav11.setEnabled(false);
		btnFav12.setEnabled(false);	
		
		/* Agregar listener a los componentes graficos*/
		combo.addActionListener(new ManejadorEventos());
		combo2.addActionListener(new ManejadorEventos());
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
	 * Esta clase interna es la encargada de asignar las funciones que cada componente
	 * desempeñara en el GUI.
	 * 	@author Carlos Calderon, 15219
   	 *	@author Jorge Azmitia,15202
   	 *	@version 2.0.0 Julio 9, 2016
	 */
	private class ManejadorEventos implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnFav1) {
					if (guardar==true){
						saveEmisora(0,Double.parseDouble(lblnumest.getText().replace(',','.')));
					}
					else if(guardar==false){
						if (selectEmisora(0)<400){
							combo.setSelectedItem("F.M.");
							emisoraa=selectEmisora(0);
							lblnumest.setText(""+selectEmisora(0));
						}
						if (selectEmisora(0)>400){
							combo.setSelectedItem("A.M.");

							emisorab=selectEmisora(0);
							lblnumest.setText(""+selectEmisora(0));
							}
					}
			}
			if (e.getSource() == btnFav2) {
				if (guardar==true){
					saveEmisora(1,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(1));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(1));		
						}
				}
			}
			if (e.getSource() == btnFav3) {
				if (guardar==true){
					saveEmisora(2,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(2));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(2));		
						}
				}
			}
			if (e.getSource() == btnFav4) {
				if (guardar==true){
					saveEmisora(3,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(3));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(3));		
						}
					}
			}
			if (e.getSource() == btnFav5) {
				if (guardar==true){
					saveEmisora(4,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(4));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(4));		
						}				
					}
			}
			if (e.getSource() == btnFav6) {
				if (guardar==true){
					saveEmisora(5,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(5));			
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(5));		
						}				
					}
			}
			if (e.getSource() == btnFav7) {
				if (guardar==true){
					saveEmisora(6,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(6));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(6));		
						}
				}
			}
			if (e.getSource() == btnFav8) {
				if (guardar==true){
					saveEmisora(7,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(7));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(7));		
						}					
				}
			}
			if (e.getSource() == btnFav9) {
				if (guardar==true){
					saveEmisora(8,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(8));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(8));		
						}
				}
			}
			if (e.getSource() == btnFav10) {
				if (guardar==true){
					saveEmisora(9,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(9));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(9));		
						}
				}
			}
			if (e.getSource() == btnFav11) {
				if (guardar==true){
					saveEmisora(10,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(10));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(10));		
						}
				}
			}
			if (e.getSource() == btnFav12) {
				if (guardar==true){
					saveEmisora(11,Double.parseDouble(lblnumest.getText().replace(',','.')));
				}
				else if(guardar==false){
					if (selectEmisora(0)<400){
						combo.setSelectedItem("F.M.");
						emisoraa=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(11));
					}
					if (selectEmisora(0)>400){
						combo.setSelectedItem("A.M.");
						emisorab=selectEmisora(0);
						lblnumest.setText(""+selectEmisora(11));		
						}
				}
			}
			if (e.getSource()==combo) {
				 String seleccionado=(String)combo.getSelectedItem(); 
				 if (seleccionado.equals("F.M.")){ 
					 Est=true;
					 setFrecuencia(true);
					 emisoraa=87.9;
					 lblnumest.setText(""+emisoraa);
				 }
				 else if (seleccionado.equals("A.M.")){
					 Est=false;
					 setFrecuencia(false); 
					 lblnumest.setText(""+emisorab);
				 }
			 }
			if (e.getSource()==combo2) {
				 String seleccionado=(String)combo2.getSelectedItem();
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
					if(emisoraa==0.0){
						emisoraa=0.0;

					}
					else if (emisoraa>87.9||emisoraa<=107.9){
						emisoraa=emisoraa-.2;
						DecimalFormat formateador = new DecimalFormat("###0.##"); 
						lblnumest.setText(""+formateador.format(emisoraa));
					}
				}
				else if (getFrecuencia() ==false){
					if(emisorab==0.0){
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
					if(emisoraa==0.0){
						emisoraa=87.9;
						DecimalFormat formateador = new DecimalFormat("###0.##"); 
						lblnumest.setText((""+formateador.format(emisoraa).replace(',','.')));

					}
					else if (emisoraa>=87.9 && emisoraa<107.9){
						emisoraa=emisoraa+.2;
						DecimalFormat formateador = new DecimalFormat("###0.##"); 
						lblnumest.setText((""+formateador.format(emisoraa).replace(',','.')));
					}
				}
				else if (getFrecuencia() ==false){
					if(emisorab==1610){
						emisorab=emisorab;
					}
					
					else if(emisorab>530||emisorab<1610){
						emisorab=emisorab+10;
						lblnumest.setText((""+emisorab).replace(',','.'));
					}
				}	 
			}
		}

	}
	
	/**Metodos implementados de Radio*/
	
	/**
    setEncendido recibe como parametro el estado booleano del radio. True es encendido y false es apagado.
    Luego activa el estado, bloqueando o no los botones.
    @param estado, el estado del radio si es apagado o encendido.
  */
	@Override
	public void setEncendido(boolean estado) {
		this.estado=estado;
			if (this.estado==true){
				avisoencendido= "La radio esta encendida.";
				lblEncendido.setText(avisoencendido);
				btnretroceder.setEnabled(true);
				combo.setEnabled(true);
				combo2.setEnabled(true);
				btnAvanzar.setEnabled(true);
				btnFav1.setEnabled(true);
				btnFav2.setEnabled(true);
				btnFav3.setEnabled(true);
				btnFav4.setEnabled(true);
				btnFav5.setEnabled(true);
				btnFav6.setEnabled(true);
				btnFav7.setEnabled(true);
				btnFav8.setEnabled(true);
				btnFav9.setEnabled(true);
				btnFav10.setEnabled(true);
				btnFav11.setEnabled(true);
				btnFav12.setEnabled(true);	
			}
			else if (this.estado==false){
				avisoencendido= "La radio esta apagada.";
				lblEncendido.setText(avisoencendido);
				btnretroceder.setEnabled(false);
				combo.setEnabled(false);
				combo2.setEnabled(false);
				btnAvanzar.setEnabled(false);
				btnFav1.setEnabled(false);
				btnFav2.setEnabled(false);
				btnFav3.setEnabled(false);
				btnFav4.setEnabled(false);
				btnFav5.setEnabled(false);
				btnFav6.setEnabled(false);
				btnFav7.setEnabled(false);
				btnFav8.setEnabled(false);
				btnFav9.setEnabled(false);
				btnFav10.setEnabled(false);
				btnFav11.setEnabled(false);
				btnFav12.setEnabled(false);	
			}
		}
	/**
    setFrecuencia recibe como parametro booleano la frecuencia a la que se desea funcione el radio.
    True es FM y false es AM.
    @param frecuencia, AM o FM.
  */
	@Override
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia=frecuencia;
	}

	/**
    	setEmisora recibe como parametro tipo double la emisora que se desea sintonizar. Luego la asigna al atributo respectivo.
    	@param emisora, la emisora que se desea sintonizar.
	*/
	@Override
	public void setEmisora(double emisora) {
		this.emisora=emisora;
	}

	/**
    saveEmisora recibe como parametros el numero de boton (1-12) y la emisora respectiva. Asigna la emisora escogida al boton.
    @param btn, tipo int define el numero de boton al que se desea asignar una emisora.
    @param emisora, tipo double define la emisora que se desea guardar en el boton.
  */
	@Override
	public void saveEmisora(int btn, double emisora) {
		this.fav[btn]=emisora;
	}

	/**
    selectEmisora recibe como parametro el numero de boton, y devuelve la emisora guardada en dicho boton.
    @param btn, tipo int define el numero de boton.
    @return fav[btn], arreglo de emisoras que corresponde al respectivo boton,en base a indice..
  */
	@Override
	public double selectEmisora(int btn) {
		return this.fav[btn];
	}

	/**
    @return estado, el valor booleano del estado de encendido del radio.
  */
	@Override
	public boolean getEncendido() {
		return this.estado;
	}

	 /**
    @return frecuencia, el valor booleano de la frecuencia (AM o FM)
	 */
	@Override
	public boolean getFrecuencia() {
		return this.frecuencia;
	}

	/**
    @return emisora, el valor tipo double de la emisora de la radio.
    */
	@Override
	public double getEmisora() {
		return this.emisora;
	}
}