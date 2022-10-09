public class LogMessage {

    private String machineId;
    private String description;

    // constructor
    public LogMessage(String message){

        int colon = message.indexOf(":");
        machineId = message.substring(0, colon);
        description = message.substring(colon + 1);

    }

    public  String getMachineId(){
        return machineId;
    }

    public String getDescription(){
        return description;
    }

    public boolean containsWord(String keyword) {

        if ( keyword.equals(description)){
            return true;
        }
        return false;
    }

}
