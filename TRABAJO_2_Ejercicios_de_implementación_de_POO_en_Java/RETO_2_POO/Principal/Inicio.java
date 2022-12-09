package Principal;

import Salud.*;
public class Inicio 
{
    public static void main(String[] args) 
    {
        double resultado;
        Persona persona = new Persona(null, 0, null, 0, 0, 0, null, 0);
        System.out.println("BIENVENIDO");
        System.out.println("-------------------------------------------------------------------------------------------------------- ");
        persona.pedirDatos();
        System.out.println("-------------------------------------------------------------------------------------------------------- ");
        persona.mostrarPersona();
        System.out.println("-------------------------------------------------------------------------------------------------------- ");
        resultado=persona.calcularImc();
        if(resultado<20)
        {      
         System.out.println("El peso esta por debajo de lo ideal");
        }
        else if(resultado>20&&resultado<25)
        {
         System.out.println("El peso es ideal");
        }
        else if(resultado>25)
        {
         System.out.println("Tiene sobrepeso");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------- ");
        persona.mayorEdad();
    }
    
}
