package Not;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Not_vid100_timeApi {
    public static void main(String[] args) {
LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime DT = LocalDateTime.now();
        System.out.println(DT);
    }
}
