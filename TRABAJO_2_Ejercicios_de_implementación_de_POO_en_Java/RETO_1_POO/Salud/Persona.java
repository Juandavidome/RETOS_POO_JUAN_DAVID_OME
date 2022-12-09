package Salud;

import java.util.Scanner;

public class Persona 
{
   public String tipoDoc;
   private int documento;
   private String apellido;
   public double peso;
   public double estatura;
   public int edad;
   public String sexo;
   public double imc;
   Scanner leer = new Scanner(System.in);
   public Persona(String _tipoDoc, int _documento, String _apellido, double _peso, double _estatura, int _edad, String _sexo, double _imc )
   {
      tipoDoc= _tipoDoc;
      documento= _documento;
      apellido= _apellido;
      peso=_peso;
      estatura=_estatura;
      edad=_edad;
      sexo=_sexo;
      imc=_imc;
   }
   public void pedirDatos()
   {
    System.out.println("Por favor ingrese su tipo de documento:");
    tipoDoc=leer.next();
    System.out.println("Por favor ingrese su numero de documento:");
    documento=leer.nextInt();
    System.out.println("Por favor ingrese su apellido:");
    apellido=leer.next();
    System.out.println("Por favor ingrese su peso:");
    peso=leer.nextDouble();
    System.out.println("Por favor ingrese su estatura:");
    estatura=leer.nextDouble();
    System.out.println("Por favor ingrese su edad:");
    edad=leer.nextInt();
    System.out.println("Por favor ingrese su sexo:");
    sexo=leer.next();
   }
   public void mostrarPersona()
   {
      System.out.println("Su tipo de documento es: "+tipoDoc+"");
      System.out.println("Su numero de documento es: "+documento+"");
      System.out.println("Su apellido es: "+apellido+"");
      System.out.println("Su peso es: "+peso+"");
      System.out.println("Su estatura es: "+estatura+"");
      System.out.println("Su edad es: "+edad+"");
      System.out.println("Su sexo es: "+sexo+"");
   }
   public void calcularImc()
   {
      imc= peso/(estatura*estatura);
      System.out.println("Su imc es: "+imc+"");

      if(imc<20)
      {      
         System.out.println("El peso esta por debajo de lo ideal");
      }
      else if(imc>20&&imc<25)
      {
         System.out.println("El peso es ideal");
      }
      else if(imc>25)
      {
         System.out.println("Tiene sobrepeso");
      }
   }
   public void mayorEdad()
   {
      if(edad<18)
      {
         System.out.println("Es menor de edad.");
      }
      else if(edad>18)
      {
         System.out.println("Es mayor de edad.");
      }
   }
}
