package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class utils {
 
	static NumberFormat numberFormat = new DecimalFormat("R$ #,##0.00",
	        new DecimalFormatSymbols(new Locale("pt", "BR")));
	
	public static String DoubleToString(double value) {
	    return numberFormat.format(value);	
	}
	
}
