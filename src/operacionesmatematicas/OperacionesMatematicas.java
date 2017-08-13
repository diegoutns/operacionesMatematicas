package operacionesmatematicas;

/**
 *
 * @author DiegoB
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Sumar 1 mas 3 = " + calc.Sumar(1, 3));
        System.out.println("Restarle a 2 el numero 3 = " + calc.Restar(2, 3));
        try{
            System.out.println("Dividir 1 por 3 = " + calc.Dividir(1, 3));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
