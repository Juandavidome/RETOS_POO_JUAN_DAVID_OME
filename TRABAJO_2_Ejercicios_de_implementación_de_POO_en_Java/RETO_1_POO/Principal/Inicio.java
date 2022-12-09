package Principal;
import Salud.*;
public class Inicio 
{
    public static void main(String[] args) 
    {
        Persona persona = new Persona(null, 0, null, 0, 0, 0, null, 0);
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }
    
}
