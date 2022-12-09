package Salud;
import java.util.Scanner;

public class Empleado extends Persona
{
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private double valorTotal;
    private String departamento;
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public Empleado(String tipoDoc, int documento, String apellido, double peso, double estatura, int edad, String sexo,
            double imc, Scanner leer, String cargo, double valorHora, double horasTrabajadas, double valorTotal,
            String departamento) {
        super(tipoDoc, documento, apellido, peso, estatura, edad, sexo, imc, leer);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.valorTotal = valorTotal;
        this.departamento = departamento;
    }
    public void calcularHonorarios()
    {
        System.out.println("Buen dia");
        System.out.println("Seleccione su cargo:");
        setCargo(leer.next());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Seleccione su departamento:");
        setDepartamento(leer.next());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Por favor ingrese el valor por hora de trabajo:");
        setValorHora(leer.nextDouble());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Por favor ingrese las horas trabajadas:");
        setHorasTrabajadas(leer.nextDouble());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        setValorTotal(valorHora*horasTrabajadas-0.966);
        System.out.println("El total a pagar es de: "+getValorTotal()+"");
    }
}
