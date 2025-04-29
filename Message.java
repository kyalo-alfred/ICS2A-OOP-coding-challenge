//displays message on screen
public class Message {
    void message(){
        System.out.println("This is my Message to you");
    }

    public static void main(String[] args) {
        new Message().message();  // removed extra '('
    }
}
