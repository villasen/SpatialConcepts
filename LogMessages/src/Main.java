public class Main {
    public static void main(String[] args) {
        System.out.println("LogMessages Project");

        // messages
        String message1 = "CLIENT3:security alert – repeated login failures";
        String message2 = "Webserver:disk offline";
        String message3 = "SERVER1:file not found";
        String message4 = "SERVER2:read error on disk DSK1";
        String message5 = "SERVER1:write error on disk DSK2 ";
        String message6 = "Webserver:error on /dev/disk ";

        LogMessage log1 = new LogMessage(message1);
        LogMessage log2 = new LogMessage(message2);

        SystemLog message_logs = new SystemLog(log1);

        message_logs.removeMessages("disk");


        System.out.println(log1.getMachineId());
        System.out.println(log1.getDescription());

        System.out.println(log2.getMachineId());
        System.out.println(log2.getDescription());

        if(log2.containsWord("disk")){
            System.out.println("returning true");
        }

    }
}