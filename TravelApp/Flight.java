package TravelApp;

public class Flight 
{
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int num;
    private double price;
    private int confNumber;

    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int num,double price)
    {
        this.flightNumber=flightNumber;
        this.passengerName=passengerName;
        this.origin=origin;
        this.destination=destination;
        this.date=date;
        this.num=num;
        this.price=price;        
    }
    public int getFlightNumber() {
        return flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getNumPassengers() {
        return num;
    }

    public double getPrice() {
        return price;
    }

    public int getConfNumber() {
        return confNumber;
    }
    public void setConfNumber(int confNumber)
    {
        this.confNumber=confNumber;
    }
}
