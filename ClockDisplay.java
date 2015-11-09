/**
 Imaginemos que tenemos un amigo programador en Java como nosotros que quiere hacer una aplicación para teléfonos Android consistente en un reloj en 
 formato 24 horas, que muestre las horas y minutos desde las 00:00 hasta las 23:59.

 Como anda muy apurado de tiempo, nos pide que le hagamos parte del trabajo. Concretamente necesita que le programemos una clase llamada ClockDisplay que:

 Permita fijar un momento determinado de tiempo expresado en horas y minutos. Por ejemplo, si yo le indico a un método 23 y 45 como parámetros, 
 el tiempo del reloj debe quedar fijado a 23:45. El nombre del método debe ser setTime.
 permita hacer avanzar un minuto el tiempo fijado. Evidentemente, el usuario podrá invocar este método tantas veces como quiera. 
 El nombre del método debe ser timeTick.
 Devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos. El nombre del método debe ser getTime. Ojo: 
 la cadena siempre debe tener 5 caracteres.
 Vete haciendo commits conforme le añades funcionalidad a tu clase y súbelo a GitHub.
 Es muy posible que no seas capaz de completar la actividad. No te preocupes, el objetivo es intentarlo.
 */
public class ClockDisplay
{
    // Horas para nuestro reloj
    private int horas;
    // Minutos para nuestro reloj
    private int minutos;
   
    /**
     * Creamos un reloj con los valores de las horas y los minutos a 0.
     */
    public ClockDisplay()
    {
        horas = 0;
        minutos = 0;
    }
   
    /**
     * Este método nos permite fijar un momento determinado de tiempo expresado en horas y minutos
     */
    public void setTime(int horaQueEs, int minutosSon)
    {
        if ((horaQueEs >=0 && horaQueEs <24) && (minutosSon >=0 && minutosSon <60))
        {
            horas = horaQueEs;
            minutos = minutosSon;
        }
        else 
        {
            System.out.println("Algún valor introducido no es correcto, para las horas deben estar entre 0 y 23 y para los minutos entre 0 y 59");
        }
    }
    
     /**
     * Este método nos permite adelantar un minuto el reloj
     */
    public void timeTick()
    {
        minutos = minutos + 1;
        if (minutos == 60) 
        {
            minutos = 0;
            horas = horas + 1;
            if (horas == 24)
            {
                horas = 0;
            }
        }
        
        
    }
    
     /**
     * Este método no debuelve la hora con el formato 00:00.
     */
    public String getTime()
    {
        
        String horaReloj = "%02d:%02d";
        String horaActual = String.format(horaReloj, horas, minutos);
        return horaActual;
    
    }
}    
    