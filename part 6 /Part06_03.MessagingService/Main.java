
public class Main {

    public static void main(String[] args) {

       MessagingService m = new MessagingService();
       Message message = new Message("sender","content123");
       m.add(message);
        System.out.println(m.getMessages());
    }
}
