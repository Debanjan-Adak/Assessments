package dateTime;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;

public class DateTImeImplementation {
	public static void main(String[] args) {
//		LocalDateTime today = LocalDateTime.now();
//		LocalDateTime futureDate = today.plusDays(10);
//		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-mm-y hh:MM:SS");
//		System.out.println("Formatted Date : " + today.format(dTF));
		double a = 0.1;
		double b = 0.2;
		System.out.println("Double result : "+ (a+b) );
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		System.out.println();
		
		Currency inr = Currency.getInstance("INR");
		Currency usd = Currency.getInstance("USD");
		System.out.println("INR Code : "+inr.getCurrencyCode());
		System.out.println("INR Symbol : "+inr.getSymbol());
		System.out.println("USD Code : "+usd.getCurrencyCode());
		System.out.println("USD Symbol : "+usd.getSymbol());
	}
}
