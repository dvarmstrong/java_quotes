import java.time.LocalDateTime;
import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you ? ";
    }

    public String guestGreeting(String name) {
        return "Hello " + name + " how is your day ";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Today is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // conversation = "It appears that counter stick might be intelligent";
        return  conversation;
    }

    public String guestGreeting(String name, String dayPeriod) {
        LocalDateTime local = LocalDateTime.now() ; // Create a local date object
        return "The local time is: " + dayPeriod + local ;

    }

}
