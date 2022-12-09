package Salud;

import java.util.Scanner;

public class Persona 
{
    
   private String tipoDoc;
   private int documento;
   private String apellido;
   private double peso;
   private double estatura;
   private String sexo;
   private double imc;
   private int edad;

   public Persona()
   {

   }
   public Persona(String tipoDoc, int documento, String apellido, double peso, double estatura, int edad, String sexo,
         double imc, Scanner leer) {
      this.tipoDoc = tipoDoc;
      this.documento = documento;
      this.apellido = apellido;
      this.peso = peso;
      this.estatura = estatura;
      this.edad = edad;
      this.sexo = sexo;
      this.imc = imc;
      this.leer = leer;
   }
   
   public void setTipoDoc(String tipoDoc) 
   {
      this.tipoDoc = tipoDoc;
   }
   public String getTipoDoc() 
   {
      return tipoDoc;
   }
   public int getDocumento() 
   {
      return documento;
   }
   public void setDocumento(int documento) 
   {
      this.documento = documento;
   }
   public String getApellido() 
   {
      return apellido;
   }
   public void setApellido(String apellido) 
   {
      this.apellido = apellido;
   }
   public double getPeso() 
   {
      return peso;
   }
   public void setPeso(double peso) 
   {
      this.peso = peso;
   }
   public double getEstatura() 
   {
      return estatura;
   }
   public void setEstatura(double estatura) 
   {
      this.estatura = estatura;
   }
   public int getEdad() 
   {
      return edad;
   }
   public void setEdad(int edad) 
   {
      this.edad = edad;
   }
   public String getSexo() 
   {
      return sexo;
   }
   public void setSexo(String sexo) 
   {
      this.sexo = sexo;
   }
   public double getImc() 
   {
      return imc;
   }
   public void setImc(double imc) 
   {
      this.imc = imc;
   }
   public Scanner getLeer() 
   {
      return leer;
   }
   public void setLeer(Scanner leer) 
   {
      this.leer = leer;
   }
   Scanner leer = new Scanner(System.in);
   public void pedirDatos()
   {
    System.out.println("Por favor ingrese su tipo de documento:");
    tipoDoc=leer.nextLine();
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
