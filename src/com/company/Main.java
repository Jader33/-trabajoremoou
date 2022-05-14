package com.company;

public class Main {

    public static void main(String[] args) {
       Cliente cliente= new Cliente();
       cliente.elNombre ="JHON";
       cliente.elTelefono = 321.3245;
       cliente.laEdad = 37;
       cliente.credito = "rotativo";
       System.out.println(cliente.getLaEdad());
        System.out.println(cliente.getElNombre());
        System.out.println(cliente.getElTelefono());
        System.out.println(cliente.getCredito());
System.out.println("Clase trabajador inicia aqui");
        Trabajador trabajador =  new  Trabajador();
        trabajador.salario = 1.3455555;
        trabajador.elNombre ="JHON";
        trabajador.elTelefono = 321.3245;
        trabajador.laEdad = 37;
        trabajador.credito = "rotativo";
        System.out.println(trabajador.getLaEdad());
        System.out.println(trabajador.getElNombre());
        System.out.println(trabajador.getElTelefono());
        System.out.println(trabajador.getCredito());
        System.out.println(trabajador.getSalario());


}




}
     class Persona {
     int laEdad;
     String elNombre;
     double elTelefono;
    }

    class Cliente extends Persona {
    String credito;

    public void setLaEdad(int laEdad ){
        this.laEdad =laEdad;
    }
    public int getLaEdad(){
        return  this.laEdad;
}

        public void setElNombre(String elNombre ){
            this.elNombre = elNombre;
        }
        public String getElNombre(){
            return  this.elNombre;
        }

        public void setElTelefono(double elTelefono ){
            this.elTelefono = elTelefono;
        }
        public double getElTelefono(){
            return  this.elTelefono;



        }

        public void setCredito(String credito ){
            this.credito = credito;
        }
        public String getCredito(){
            return  this.credito;



        }

}


     class Trabajador extends Cliente{
       double salario;

public  void  setSalario(double salario){
    this.salario = salario;
}
public  double getSalario(){
    return this.salario;
}
}

