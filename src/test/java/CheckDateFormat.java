import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import javax.swing.text.DateFormatter;

public class CheckDateFormat {

	public static void main(String[] args) {

		 	Date currentDate = new Date();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
	        String formattedDate = dateFormat.format(currentDate);

	        
		System.out.println(formattedDate);
            
       //Validate if current date is displayed and in expected format of dd mmm yyyy
	        
        if (formattedDate.matches("\\d{2} [A-Z]{1}[a-z]{2} \\d{4}")) {

            System.out.println("Current date is displayed in 'dd MMM yyyy' format"); 

        } else {

            System.out.println("Current date is not in 'dd MMM yy' format"); 

        }

    } 

}