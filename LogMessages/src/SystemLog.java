import java.util.*;

public class SystemLog {

   private String message1 = "CLIENT3:security alert – repeated login failures";
   private String message2 = "Webserver:disk offline";
   private String message3 = "SERVER1:file not found";
   private String message4 = "SERVER2:read error on disk DSK1";
   private String message5 = "SERVER1:write error on disk DSK2 ";
   private String message6 = "Webserver:error on /dev/disk ";


   private List<LogMessage> messageList;

    LogMessage log1 = new LogMessage(message1);
    LogMessage log2 = new LogMessage(message2);


    // default constructor
    public SystemLog(){
        String message1 = "CLIENT3:security alert – repeated login failures";
        String message2 = "Webserver:disk offline";
        String message3 = "SERVER1:file not found";
        String message4 = "SERVER2:read error on disk DSK1";
        String message5 = "SERVER1:write error on disk DSK2 ";
        String message6 = "Webserver:error on /dev/disk ";
    }
    // constructor with parameter
    public SystemLog(LogMessage log){
           messageList.add(log);
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
