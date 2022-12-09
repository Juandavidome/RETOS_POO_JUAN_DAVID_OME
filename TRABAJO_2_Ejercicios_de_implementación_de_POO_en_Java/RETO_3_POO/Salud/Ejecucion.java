package Salud;

public class Ejecucion 
{
    public static void main(String[] args) 
    {
        Empleado empleado= new Empleado(null, 0, null, 0, 0, 0, null, 0, null, null, 0, 0, 0, null);
        empleado.pedirDatos();
        empleado.mostrarPersona();
        empleado.calcularHonorarios();
    }
}
