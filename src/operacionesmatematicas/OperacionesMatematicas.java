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
        String tipo="Docente";
        String mail="juan@gmail.com";
        String pass="abc123";
        
        AccesoAlPrograma ap1=new AccesoAlPrograma();
        ap1.LoguearUsuario(tipo, mail, pass);
        IngresoCalculadora ing=new IngresoCalculadora();
        //Calculadora calc = new Calculadora();
        Calculadora calc=ing.abrirCalcuadora(tipo, 0);
        
        System.out.println("Sumar 1 mas 3 = " + calc.Sumar(1, 3));
        System.out.println("Restarle a 2 el numero 3 = " + calc.Restar(2, 3));
        try{
            System.out.println("Dividir 1 por 3 = " + calc.Dividir(1, 3));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println("Dividir 3 por 0 = " + calc.Dividir(3, 0));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Sumar 1.4 mas 3.5 = " + calc.Sumar((int)1.4, (int)3.5));
    }
    
}
