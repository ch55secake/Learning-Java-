import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class HelloWorld {

    public static void main(String[] args) {
        
        final ZoneId London = ZoneId.of("Australia/Sydney");
        final ZonedDateTime now = ZonedDateTime.now(London);
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a E, dd MMMM uuuu");
        System.out.println("It is currently: " + formatter.format(now) + " in Sydney, Australia");
    }

}
