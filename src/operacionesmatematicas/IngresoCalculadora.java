/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

/**
 *
 * @author Valeria
 */
public class IngresoCalculadora {
    private int nivelMinimo = 3;

    public Calculadora abrirCalcuadora(String tipoUsario, int nivel) {
        //System.out.println("Ingresando a Calculadora "+tipoUsario+" nivel "+nivel);
        if (tipoUsario.equals("Docente")) {
            Calculadora calc = new Calculadora();
             System.out.println("Calculadora para docente");
             return calc;
        } else if (nivel > nivelMinimo) {
            Calculadora calc = new Calculadora();
            System.out.println("Calculadora para alumno de nivel "+nivel);
            return calc;
        }
        return null;
    }

}
