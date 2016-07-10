/**
   Interfaz que describe el funcionamiento de una radio.
   @author Seccion 30. Algoritmos y Estructuras de Datos, Universidad del Valle de Guatemala.
   @version 2.1.3 Julio 9, 2016
 */
public interface Radio {

    /**
        Metodo de encendido
        @param estado, define el estado de apagado/encendido
        True -> encendido
        False -> apagado
     */
    void setEncendido(boolean estado);

    /**
        Metodo de cambio de frecuencia
        @param frecuencia, define el estado de AM/FM
        True -> FM
        False -> AM
     */

    void setFrecuencia(boolean frecuencia);

    /**
        Metodo de emisora
        @param emisora, define la emisora que se esta "escuchando"
     */

    void setEmisora(double emisora);

    /**
        Metodo de guardar emisora en un boton
        @param btn, contiene el ID del boton
     */

    void saveEmisora(int btn, double emisora);

    /**
        Metodo de seleccionar emisora
        @param btn, contiene el ID del boton
     */

    double selectEmisora(int btn);

    /**
        Metodo para obtener el estado actual de la radio
        @ return Estado de la radio
        True -> Encendido
        False -> Apagado
     */

    boolean getEncendido();

    /**
        Metodo para obtener la frecuencia actual
        @return frecuencia actual
        True -> FM
        False -> AM
     */

    boolean getFrecuencia();

    /**
        Metodo para obtener la emisora
        @return emisora que se esta "escuchando"
     */
    
    double getEmisora();
}
