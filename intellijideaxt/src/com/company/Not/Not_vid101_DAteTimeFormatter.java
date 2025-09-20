package Not;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Not_vid101_DAteTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();  //This is the DAte
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a"); //This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); //Creating date String using date and formatter

//        System.out.println(df);
        System.out.println(myDate);
    }
}
