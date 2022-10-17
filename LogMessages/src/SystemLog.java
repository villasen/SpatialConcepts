import java.util.*;

public class SystemLog {

   private String message1 = "CLIENT3:security alert – repeated login failures";
   private String message2 = "Webserver:disk offline";
   private String message3 = "SERVER1:file not found";
   private String message4 = "SERVER2:read error on disk DSK1";
   private String message5 = "SERVER1:write error on disk DSK2 ";
   private String message6 = "Webserver:error on /dev/disk ";


    List<LogMessage> messageList = new ArrayList<LogMessage>();

    // default constructor
    public SystemLog(){
/*        LogMessage log1 = new LogMessage(message1);
        LogMessage log2 = new LogMessage(message2);
        LogMessage log3 = new LogMessage(message3);
        LogMessage log4 = new LogMessage(message4);
        LogMessage log5 = new LogMessage(message5);
        LogMessage log6 = new LogMessage(message6);*/
    }
    // constructor with parameter
    public SystemLog(LogMessage log){
           messageList.add(log);
        }

    public void addMessages(String message) {
        LogMessage log = new LogMessage(message);
        for (int i = 0; i <= messageList.size(); i++) {
            messageList.add(log);
        }
    }

    public List<LogMessage> displayMessages(){
        // create object to be returned by method
        List<LogMessage> displays = new ArrayList<LogMessage>();

        return  displays;
    }
   public List<LogMessage> removeMessages(String keyword){

        // create object to be returned by method
       List<LogMessage> removals = new ArrayList<LogMessage>();

        for( int i=0; i < messageList.size(); i++){

            if(messageList.get(i).containsWord(keyword)){
                removals.add(messageList.remove(i));
                i--;
            }
        }
        return  removals;

    }
}
