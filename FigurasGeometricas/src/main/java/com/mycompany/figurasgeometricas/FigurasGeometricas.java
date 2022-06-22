
package com.mycompany.figurasgeometricas;

//import com.mycompany.figurasgeometricas.Figura;
//import com.mycompany.figurasgeometricas.Rectangulo;
//import com.mycompany.figurasgeometricas.Triangulo;

/**
 *
 * @author Mauricio Orellana
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        //Imprimiendo con el metodo dibujar
	Rectangulo r2 = new Rectangulo("Rectangulo 1", 7, 3);
	//System.out.println("Rectangulo 1 area: " + r2.calcularArea());
	//System.out.println("Rectangulo 1 perimetro: " + r2.calcularPerimetro());
        r2.dibujar();
		
	// f es un objeto polimorfico (puede tomar varias formas)
	//Figura f; puedo declarar una variable de tipo Figura
	//Figura f = new Figura(); instaciar no se puede porque es abstracta
		
	//Dentro de f puedo almacenar objetos de diferentes tipos imprimeiendo de otra forma
	Figura f = new Rectangulo("Rectangulo 2", 5, 3);	
	System.out.println("Rectangulo 2 area: " + f.calcularArea());
        System.out.println("Rectangulo 2 perimetro: " + f.calcularPerimetro());
        
		
	f = new Triangulo("Triangulo 1", 2, 2, 3,4,5);
	System.out.println("Triangulo 1 area: " + f.calcularArea());
        System.out.println("Triangulo 1 perimetro: " + f.calcularPerimetro());
        
        
        Figura C1 = new Cuadrado("Cuadrado 1", 2, 2);
        //System.out.println("Cuadrado 1 area: " + C1.calcularArea());
        //System.out.println("Cuadrado 1 perimetro: " + C1.calcularPerimetro());
        C1.dibujar();
		

	//podemos apreciar el polimorfismo porque primero calcula el area
	//como un rectangulo y después como un triangulo
    }
}
