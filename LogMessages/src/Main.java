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


        SystemLog theLog = new SystemLog();

        theLog.addMessages(message1);
        theLog.addMessages(message2);
        theLog.addMessages(message3);
        theLog.addMessages(message4);
        theLog.addMessages(message5);
        theLog.addMessages(message6);


        //theLog.removeMessages(("done");


        //System.out.println(theLog..getMachineId());
       // System.out.println(log1.getDescription());

       // System.out.println(log2.getMachineId());
      //  System.out.println(log2.getDescription());

     //   if(log2.containsWord("disk")){
     //       System.out.println("returning true");
     //   }

    }
}