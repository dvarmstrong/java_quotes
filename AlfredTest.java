public class AlfredTest {
    
    /*
     *This main method will always be the launch point for a Java App
    */

    public  static void main(String[] args) {
        // MAke an instance of AlfredQuotes to access all the methods 
        AlfredQuotes  alfredBot = new AlfredQuotes();

        // Make some test greeting, providing any necessary data 

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Joe");
        String testDate = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis(
            "Alexis play some music !"
        );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "Dumb paper weight , that is not music !"
        );

        String testLocal = alfredBot.guestGreeting("Batman", "Moring, local");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDate);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(testLocal);
        
    }
}
