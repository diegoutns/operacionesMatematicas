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
    
    public int Operar(String operacion) {
        String operando1 = this.recorrerNumero(operacion);
        return this.recorrer(operacion.substring(operando1.length()), Integer.parseInt(operando1));
        /*        for (int i=0;i<operacion.length();i++) {
            if (Character.isDigit(operacion.charAt(i))) {
                operandos[0] += operacion.charAt(i);
            } else {
                
            }
        }*/
    }

    private int recorrer(String operacion, int operando1) {
        //for (int i=0;i<operacion.length();i++) {
        int resultado = 0;
        String operando2 = "";
//        char aux = operacion.charAt(0);
//        String aux1 = operacion.substring(1);
        
        if (operacion.length() > 0) {
            if (operacion.length() > 1) {
                if (operacion.charAt(1) != '(') {
                    operando2 = this.recorrerNumero(operacion.substring(1));
                } 
            } else {
                operando2 = this.recorrerNumero(operacion.substring(0));
            }
            switch (operacion.charAt(0)) {
                case '+':
                    if (operacion.length() > 1 && operacion.charAt(1) == '(') {
                        String operando = this.recorrerNumero(operacion.substring(2));
                        resultado = this.Sumar(this.recorrer(operacion.substring(operando.length() + operacion.indexOf(operando), operacion.lastIndexOf(')')), Integer.parseInt(operando)), operando1);
                    } else {
                        if (operacion.length() > operando2.length() + 1 && (operacion.charAt(1 + operando2.length()) == '*' || operacion.charAt(1 + operando2.length()) == '/')) {
                            resultado = this.Sumar(operando1, this.recorrer(operacion.substring(1 + operando2.length()), Integer.parseInt(operando2)));
                        } else {
                            resultado = this.Sumar(operando1, Integer.parseInt(operando2));
                        }
                    }
                    break;
                case '-':
                    if (operacion.length() > 1 && operacion.charAt(1) == '(') {
                        String operando = this.recorrerNumero(operacion.substring(2));
                        resultado = this.Restar(operando1, this.recorrer(operacion.substring(operando.length() + operacion.indexOf(operando), operacion.lastIndexOf(')')), Integer.parseInt(operando)));
                    } else {
                        if (operacion.length() > operando2.length() + 1 && (operacion.charAt(1 + operando2.length()) == '*' || operacion.charAt(1 + operando2.length()) == '/')) {
                            resultado = this.Restar(operando1, this.recorrer(operacion.substring(1 + operando2.length()), Integer.parseInt(operando2)));
                        } else {
                            resultado = this.Restar(operando1, Integer.parseInt(operando2));
                        }
                    }
                    break;
                case '*':

                    if (operacion.length() > 1 && operacion.charAt(1) == '(') {
                        String operando = this.recorrerNumero(operacion.substring(2));
                        resultado = this.Multiplicar(operando1, this.recorrer(operacion.substring(operando.length() + operacion.indexOf(operando), operacion.lastIndexOf(')')), Integer.parseInt(operando)));
                    } else {
                        resultado = this.Multiplicar(operando1, Integer.parseInt(operando2));
                    }
                    break;
                case '/':
                    if (operacion.length() > 1 && operacion.charAt(1) == '(') {
                        String operando = this.recorrerNumero(operacion.substring(2));
                        try {
                            resultado = this.Dividir(operando1, this.recorrer(operacion.substring(operando.length() + operacion.indexOf(operando), operacion.lastIndexOf(')')), Integer.parseInt(operando)));
                        } catch (Exception e) {

                        }
                    } else {
                        try {
                            resultado = this.Dividir(operando1, Integer.parseInt(operando2));
                        } catch (Exception e) {

                        }
                    }
                    break;
            }
        }
        return resultado;
        //}
    }

    private String recorrerNumero(String operacion) {
        String numero = operacion.substring(0, 1);
        if (operacion.length() > 1 && Character.isDigit(operacion.charAt(1))) {
            numero += this.recorrerNumero(operacion.substring(1));
        }
        return numero;
    }
    
}
