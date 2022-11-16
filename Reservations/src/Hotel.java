public class Hotel {

    private String location;
    private int    numberRoomsAvailable;
    private int    numberRoomsBooked;
    private boolean pool;
    private boolean breakfast;
    private int     numberOfNights;

    public Hotel(){
          location = "";
          numberRoomsAvailable = 500;
          numberRoomsBooked = 0;
          pool = false;
          breakfast = false;
          numberOfNights = 0;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String theLocation){
        location = theLocation;
    }

    public int getNumberRoomsAvailable(){
        return numberRoomsAvailable;
    }

    public void setRoomNumber( int rooms){
        numberRoomsBooked = rooms;
    }

    public boolean getBreakfast(){
        return breakfast;
    }

    public void setBreakfast(boolean theBreakfast){
        breakfast = theBreakfast;
    }

    public boolean getPool(){
        return breakfast;
    }

    public void setPool(boolean wantPool){
        pool = wantPool;
    }

    public int getNumberOfNights(){
        return numberOfNights;
    }

    public void setNumberOfNights(int nights){
        numberOfNights = nights;
    }
}
