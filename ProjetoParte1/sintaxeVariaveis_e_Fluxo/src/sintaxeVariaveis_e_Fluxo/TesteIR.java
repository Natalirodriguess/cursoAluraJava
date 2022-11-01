package sintaxeVariaveis_e_Fluxo;

public class TesteIR {


	    public static void main(String[] args) {

	        double salario = 3300.0;
	        
	        if (salario>= 1900 && salario<= 2800.0) {
	        	System.out.println("Sua aliquota é de 7.5%");
	        	System.out.println("e pode deduzir na sua declação o valor de R$142,00");
	        } else if(salario >= 2800.01  && salario <= 3751.0) {
	        	System.out.println("Sua aliquota é de 15%");
	        	System.out.println("e pode deduzir na sua declação o valor de R$350");
	        } else if (salario>= 3751.01 && salario <= 4664.0) {
	        	System.out.println("Sua aliquota é de 22.5%");
	        	System.out.println("e pode deduzir na sua declação o valor de R$636");
	        }
	    }    
}
