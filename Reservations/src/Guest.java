public class Guest {
   private String firstName;
   private String lastName;
   private String type;

    public Guest(){
        firstName = "First";
        lastName = "Last";
        type = "adult";
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String first){
        firstName = first;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String last){
        lastName = last;
    }

    public String getGuestType(){
        return type;
    }

    public void setGuestType(String theType){
        type = theType;
    }


}
