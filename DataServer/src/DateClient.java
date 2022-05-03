import java.util.ArrayList;

/**
 * A command line client for the date server. Requires the IP address of the
 * server as the sole argument. Exits after printing the response.
 */
public class DateClient {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        for(Integer num : numbers){
            System.out.println(num);
        }

        ArrayList<String> words = new ArrayList<>();
        words.add("hahah");
        words.add("hehehe");

        for(String word : words){
            System.out.println(word);
        }

//        if (args.length != 1) {
//            System.err.println("Pass the server IP as the sole command line argument");
//            return;
//        }
//        var socket = new Socket(args[0], 59090);
//        var in = new Scanner(socket.getInputStream());
//        System.out.println("Server response: " + in.nextLine());
    }
}