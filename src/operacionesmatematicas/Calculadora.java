package operacionesmatematicas;

/**
 *
 * @author DiegoB
 */
public class Calculadora {

    public int Sumar(int sumando1, int sumando2) {
        int resultadoSuma = sumando1 + sumando2;
        return resultadoSuma;
    }
    
    public int Restar(int restando1, int restando2){
        int resultadoResta = restando1 - restando2;
        return resultadoResta;
    }
    
    public int Dividir(int dividendo, int divisor) throws Exception{
        if (divisor == 0)
            throw new Exception("Error division por cero");
        if (dividendo % divisor == 0){
            int resultadoDividir = dividendo / divisor;
            return resultadoDividir = dividendo / divisor;
        }
        else{
            throw new Exception("Error resultado no entero");
        }
    }
    
    public int Multiplicar(int multiplicando1, int multiplicando2){
        int resultadoMultiplicar = multiplicando1 * multiplicando2;
        return resultadoMultiplicar;
    }
    
    
}
