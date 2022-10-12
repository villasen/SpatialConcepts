import java.util.*;

public class SystemLog {

        private List<LogMessage> messageList;


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
