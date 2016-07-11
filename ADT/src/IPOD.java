
/**
 * * Clase que implementa la interfaz radio, es la que contiene las funciones del GUI.
 * 	@author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 * 	@version 2.2.0 Julio 10, 2016
 *
 */
public class IPOD implements Radio {
	 /* Atributos */
	private boolean frecuencia=true,estado=true;
	private double emisora;
	private double []fav;
	
	/**
    Constructor: no recibe parametros. 
    Inicializa el atributo fav de tamaño 12 y tipo double.
  */
	public IPOD() {
		fav = new double[12];
	}
	/**
    setEncendido recibe como parametro el estado booleano del radio. True es encendido y false es apagado.
    @param estado, el estado del radio si es apagado o encendido.
  */
	@Override
	public void setEncendido(boolean estado) {
		this.estado=estado;
		
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
