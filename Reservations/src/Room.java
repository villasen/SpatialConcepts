public class Room {

    private String   bedType;
    private double   price;

    private int      guestNumber;
    private String   guestType;
    private int      KidAge;


    public Room(){
           bedType = "single";
           price = 0;
           guestNumber = 0;
           guestType = "adult";
           KidAge = 1;
    }

    public String getBedType(){
        return bedType;
    }

    public void setBedType(String bed){
        bedType = bed;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double thePrice){
        price = thePrice;
    }


    public int getGuests(){
        return guestNumber;
    }

    public void setGuest(int guest){
        guestNumber = guest;
    }

    public String getGuestType(){
        return guestType;
    }

    public void setGuestType( String guest){
        guestType = guest;
    }

    public int getKidAge(){
        return KidAge;
    }

    public void setKidAge( int age){
        if( age > 0 && age < 18){
            KidAge = age;
        }
        else{
            System.out.println("Wrong age");
        }

    }

}
