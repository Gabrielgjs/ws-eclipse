package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program1 {

	public static void main(String[] args) {
		//somando unidade de tempo
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//define hora
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		// instancia calendario para somar e manipular a variável d com o horario
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		// soma hora 
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
	
	}

}
