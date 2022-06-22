
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Mauricio Orellana
 */
public class Cuadrado extends Figura{
    
    public Cuadrado(String nombre, double base, double altura) {
	super(nombre, base, altura);
        //con super invocamos al constructor de la clase Figura(superclase)
    }

    @Override
    public double calcularArea() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public double calcularPerimetro() {
       return 4 * this.getAltura();
    }
    
     @Override
    public void dibujar(){
        super.dibujar();
        System.out.println("DIBUJO: ");
        for (int i=0; i<this.getAltura(); i++)
        {
            for(int j=0; j<this.getBase(); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
}
