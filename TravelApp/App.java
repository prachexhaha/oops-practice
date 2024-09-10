package TravelApp;
//the package statement has to be at the top of a Java file. this indicates the directory structure where the file is located. 
import java.util.ArrayList;
import java.util.Random;

public class App 
{
    private ArrayList<Flight> flights; 
    private ArrayList<Hotel> hotels;

    private int generateConfNumber()
    {
        Random rand = new Random();
        return rand.nextInt(900000)+100000;
    }

    public App()
    {
        this.flights= new ArrayList<>();
        this.hotels = new ArrayList<>();
    }

    //search function
    public void searchFlights(String origin, String destination, String date, int num)
    {
        System.out.println("Searching for flights from "+ origin+ " to "+destination+" for "+num+" guests.");
    }

    //flight booking
    public void flightBooking(int flightnum, String passengerName, String origin, String destination, String date, int num, double price)
    {
        Flight flight = new Flight(flightnum, passengerName, origin, destination, date, num, price);
        int confNumber= generateConfNumber();
        flight.setConfNumber(confNumber);
        this.flights.add(flight);
        System.out.println("Flight booked! Confirmation number: "+confNumber);
    }

    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price)
    {
        Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests,price);
        int confNumber= generateConfNumber();
        hotel.setConfNumber(confNumber);
        this.hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number: "+ confNumber);
    }

    public void cancelReservation(int confNumber)
    {
        for(Flight flight: this.flights)
        {
            if(flight.getConfNumber()==confNumber)
            {
                System.out.println("Flight reservation with confirmation number "+confNumber+" is cancelled");
                return;
            }
        }
        for(Hotel hotel : this.hotels)
        {
            if(hotel.getConfNumber()==confNumber)
            {
                this.hotels.remove(hotel);
                System.out.println("Hotel reservations with confirmation number "+confNumber+ " is cancelled");
                return;
            }
        }

        System.out.println("No reservation found with confirmation number "+ confNumber);
    }
    
}

