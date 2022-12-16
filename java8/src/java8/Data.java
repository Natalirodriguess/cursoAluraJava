package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now(); //data sem o tempo
	
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2023, Month.AUGUST, 16);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
		
		String valor = proximasOlimpiadas.format(formatador);
		
		System.out.println(valor);
		
		//LocalDateTime agora = LocalDateTime.now(); //data com o tempo
	 
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
	
		
		agora.toLocalDate();
		
		LocalTime intervalo = LocalTime.of(15,30);
		System.out.println(intervalo);
		
		
		
		
	}
}
