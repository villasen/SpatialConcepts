import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("LogMessages Project");


        List<LogMessage> messageList = new ArrayList<LogMessage>();

        SystemLog theLog = new SystemLog();

        System.out.println("BEFORE");
        System.out.println(theLog.getMessageList());

        System.out.println("AFTER");
        System.out.println(theLog.removeMessages("error"));



    }
}