import java.awt.EventQueue;
/**
Clase driver para ejecutar el programa
 * 	@author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 * 	@version 2.2.0 Julio 10, 2016
*/
public class MainIPOD {
	/**
	 * Ejecutar aplicacion
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUI_IPOd frame = new GUI_IPOd();
						} catch (Exception e) {
							e.printStackTrace(); 
						}
					}
				});  
	}
}
