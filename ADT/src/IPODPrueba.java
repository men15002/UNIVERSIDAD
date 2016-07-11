import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Clase para probar que los metodos implementados funcionen correctamente.
 * 	@author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 * 	@version 2.2.0 Julio 10, 2016
 */ 
public class IPODPrueba {
	/* Atributos */
	  private IPOD ipod = new IPOD ();
	 
	    @Test
	    public void testSetEncendido() throws Exception {
	        ipod.setEncendido(true); 
	        boolean encendido = ipod.getEncendido();
	        assertEquals(true, encendido);
	    }

	    @Test
	    public void testSetFrecuencia() throws Exception {
	        ipod.setFrecuencia(false); 
	        boolean frecuencia = ipod.getFrecuencia();
	        assertEquals(false, frecuencia);
	    }

	    @Test
	    public void testSetEmisora() throws Exception {
	        ipod.setEmisora(87.9);
	        double emisora = ipod.getEmisora();
	        assertEquals(emisora,87.9, 0.00000003);
	    }

	    @Test
	    public void testSaveEmisora() throws Exception {
	    	ipod.saveEmisora(1, 87.9);
	        double emisora = ipod.selectEmisora(1);
	        assertEquals(87.9, emisora,0.00000003); 
	        
	    }

	    @Test
	    public void testSelectEmisora() throws Exception {
	        ipod.saveEmisora(1, 87.9);
	        double emisora = ipod.selectEmisora(1);
	        assertEquals(87.9, emisora, 0.00000003);
	    }

}
