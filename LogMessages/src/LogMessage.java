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
        // keyword at the beginning
        if ( keyword.indexOf(description + " ") == 0){
            return true;
        } // keyword preceded by space or followed by a space
        if ( keyword.indexOf(" " + keyword + " ") != -1){
            return true;
        }// keyword is at the end of the description
        // example: "error on disk"
        if (description.length() > keyword.length()){
            if( description.substring( description.length() - keyword.length() -1).
                    equals(" " + keyword)) {
                return true;
            }


        }
        return false;
    }

    public String toString(){
        String str;
        str = machineId + ':' + description;
        return str;
    }
}
