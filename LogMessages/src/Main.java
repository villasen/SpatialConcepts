public class Main {
    public static void main(String[] args) {
        System.out.println("LogMessages Project");

        // messages
        String message1 = "CLIENT3:security alert – repeated login failures";


        LogMessage log1 = new LogMessage(message1);

        System.out.println(log1.getMachineId());



    }
}