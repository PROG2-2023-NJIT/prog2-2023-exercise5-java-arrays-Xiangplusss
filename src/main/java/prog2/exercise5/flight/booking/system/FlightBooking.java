package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;

//import javax.print.attribute.standard.Destination;

public class FlightBooking {
    String flightCompany="Flights-of-Fancy";
    String flightID;
    FlightBooking.TripSource tripSource;
    String sourceAirport;
    FlightBooking.TripDestination tripDestination;
    String destinationAirport;
    LocalDate departureDate;
    LocalDate returnDate;
    int childPassengers;
    int adultPassengers;
    int totalPassengers;
    double departingTicketPrice;
    double returnTicketPrice;
    double totalTicketPrice;
    String bookingClass;
    String tripType;
    int size;
    String[] passengerFullName ;
    String[] passengerGender;
    int[] passengerAge;
    String[] ticketNumber;

    public FlightBooking(int size) {
        this.size = size;
        this.passengerFullName = new String[size];
        this.passengerGender = new String[size];
        this.passengerAge = new int[size];
        this.ticketNumber = new String[size];
       
    }
   

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    

    
    public String getPassengerFullName(int i)
    {
        return passengerFullName[i];
    }
    public void setPassengerFullName(int i, String fullName)
    {
            this.passengerFullName[i] = fullName; 
    }

    public String getTicketNumber(int i)
    {
        return ticketNumber[i];
    }
    public void setTicketNumber(int i, String ticketNumber)
    {
            this.ticketNumber[i] = ticketNumber;  
        
    }

    public int getPassengerAge(int i)
    {
        return passengerAge[i];
    }
    public void setPassengerAge(int i, int age)
    {
       
            this.passengerAge[i] = age;  
        
    }


    public String getPassengerGender(int i)
    {
        return passengerGender[i];
    }
    public void setPassengerGender(int i, String gender)
    {
       
            this.passengerGender[i] = gender;  
        
    }

    

    public void reserveTickets(){
        int i = 0;
        for (i=0;i<size;++i){
            this.passengerFullName[i] = passengerFullName[i];
            this.passengerGender[i] = passengerGender[i];
            this.passengerAge[i] = passengerAge[i];
            this.ticketNumber[i] = ticketNumber[i];
        }
    }

    public enum TripType {
        ONE_WAY(1),
        RETURN(2);
        public final int num;
        private TripType(int num){
        this.num = num;
     }
     public TripType valueof(int num){
        switch(num){
            case 1:
            return TripType.ONE_WAY;
            case 2:
            return TripType.RETURN;
            default:
            return null;
        }
     }
    }

    public String getTripType()
    {
        return tripType;
    }
    public void setTripType(String tripType )
    {
        this.tripType = tripType;
    }




    public enum BookingClass {
        FIRST(1),
        BUSINESS(2),
        ECONOMY(3);
        public final int num;
        private BookingClass(int num){
        this.num = num;
     }
     public BookingClass valueof(int num){
        switch(num){
            case 1:
            return BookingClass.FIRST;
            case 2:
            return BookingClass.BUSINESS;
            case 3:
            return BookingClass.ECONOMY;
            default:
            return null;
        }
     }
    }
    public String getBookingClass()
    {
        return bookingClass;
    }
    public void setBookingClass(String bookingClass )
    {
        this.bookingClass = bookingClass;
    }








    
    public String getFlightCompany()
    {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany )
    {
        this.flightCompany = flightCompany;
    }


    public String getFlightID()
    {
        return flightID;
    }
    public void setFlightID(String flightID )
    {
        this.flightID = flightID;
    }


    


   

    public enum SourceAirport {
        Nanjing_Lukou_International_Airport(1),
        Beijing_Capital_International_Airport(2),
        Shanghai_Pudong_International_Airport(3),
        Oulu_Airport(4),
        Helsinki_Airport(5),
        Paris_Charles_de_Gaulle_Airport(6) ;
        public final int num;
        private SourceAirport(int num){
        this.num = num;
     }
     public SourceAirport valueof(int num){
        switch(num){
            case 1:
            return SourceAirport.Nanjing_Lukou_International_Airport;
            case 2:
            return SourceAirport.Beijing_Capital_International_Airport;
            case 3:
            return SourceAirport.Shanghai_Pudong_International_Airport;
            case 4:
            return SourceAirport.Oulu_Airport;
            case 5:
            return SourceAirport.Helsinki_Airport;
            case 6:
            return SourceAirport.Paris_Charles_de_Gaulle_Airport;
            default:
            return null;
        }
     }
    }
    public String getSourceAirport()
    {
        return sourceAirport;
    }
    public void setSourceAirport(String sourceAirport )
    {
        this.sourceAirport = sourceAirport;
    }

    public enum TripSource {
        NANJING("1"),
        BEIJING("2"),
        SHANGHAI("3"),
        OULU("4"),
        HELSINKI("5"),
        PARIS("6") ;
        public final String num;
        private TripSource(String num){
        this.num = num;
     }
    }
     public void setTripSource (String num){
        switch(num){
            case "1":
            this.tripSource = FlightBooking.TripSource.NANJING;
            break;
            case "2":
            this.tripSource = FlightBooking.TripSource.BEIJING;
            break;
            case "3":
            this.tripSource = FlightBooking.TripSource.SHANGHAI;
            break;
            case "4":
            this.tripSource = FlightBooking.TripSource.OULU;
            break;
            case "5":
            this.tripSource = FlightBooking.TripSource.HELSINKI;
            break;
            case "6":
            this.tripSource = FlightBooking.TripSource.PARIS;
            break;
            default:
            
        }
     }
    
    public FlightBooking.TripSource getTripSource()
    {
        return tripSource;
    }
    

    public enum TripDestination {
        NANJING("1"),
        BEIJING("2"),
        SHANGHAI("3"),
        OULU("4"),
        HELSINKI("5"),
        PARIS("6") ;
        public final String num;
        private TripDestination(String num){
        this.num = num;
     }
    }
     public void setTripDestination (String num,String de){
        switch(num){
            case "1":
            this.tripDestination = FlightBooking.TripDestination.NANJING;
            break;
            case "2":
            this.tripDestination = FlightBooking.TripDestination.BEIJING;
            break;
            case "3":
            this.tripDestination = FlightBooking.TripDestination.SHANGHAI;
            break;
            case "4":
            this.tripDestination = FlightBooking.TripDestination.OULU;
            break;
            case "5":
            this.tripDestination= FlightBooking.TripDestination.HELSINKI;
            break;
            case "6":
            this.tripDestination= FlightBooking.TripDestination.PARIS;
            break;
            default:
            
        }
     }
    public FlightBooking.TripDestination getTripDestination()
    {
        return tripDestination;
    }


    public String getDestinationAirport()
    {
        return destinationAirport;
    }
    public void setDestinationAirport(String sourceAirport, String destinationAirport)
    {
        this.destinationAirport = destinationAirport;
    }


    public LocalDate getDepartureDate()
    {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate)
    {
        
            this.departureDate = departureDate;
       
    }


    public LocalDate getReturnDate()
    {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate )
    {
        if(returnDate.compareTo(departureDate)>=2){
            this.returnDate = returnDate; 
        }else{
            this.returnDate = departureDate.plusDays(2);
        }
    }


    public int getChildPassengers()
    {
        return childPassengers;
    }
    public void setChildPassengers(int childPassengers )
    {
        this.childPassengers = childPassengers;
    }


    public int getAdultPassengers()
    {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers )
    {
        this.adultPassengers = adultPassengers;
    }


    public int getTotalPassengers()
    {
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers, int adultPassengers )
    {
        this.totalPassengers = childPassengers + adultPassengers;
    }


    public double  getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int adultPassengers, int childPassengers )
    {
        if (tripSource == FlightBooking.TripSource.NANJING && tripDestination ==FlightBooking.TripDestination.BEIJING){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 300*0.1 + 300*0.15)*(adultPassengers + childPassengers) ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination ==  FlightBooking.TripDestination.SHANGHAI){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + (300*0.1) + 300*0.15)*(adultPassengers + childPassengers) ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.SHANGHAI){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers) ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.BEIJING && tripDestination == FlightBooking.TripDestination.SHANGHAI){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers) ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 300*0.1 + 300*0.05)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.OULU){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.HELSINKI){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.PARIS){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.NANJING){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.OULU){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.HELSINKI){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.PARIS){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.OULU){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.HELSINKI){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.PARIS){
            if (bookingClass == "FIRST"){
                departingTicketPrice = (300 + 250 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = (300 + 150 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
            else{
                departingTicketPrice = (300 + 50 + 0.15*300 + 300*0.1)*(adultPassengers + childPassengers);
            }
        }
    }


    public double  getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice( )
    {
       
    }


    public double  getTotalTicketPrice()
    {
        return 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
    }
    public void setTotalTicketPrice( )
    {
        
    }


    public String[]  getTicketNumber()
    {
        return ticketNumber;
    }
    public void setTicketNumber(int i)
    {
        if (tripType == "ONE_WAY"){
            if (bookingClass == "FIRST"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.BEIJING ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.SHANGHAI)||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == FlightBooking.TripDestination.BEIJING )||(tripSource ==FlightBooking.TripSource.OULU&&tripDestination == FlightBooking.TripDestination.HELSINKI)){
                    ticketNumber[i] = "11F1234DOM";
                }
                else{
                    ticketNumber[i] = "11F1234INT";
                }
            }
            else if (bookingClass == "BUSINESS"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.BEIJING ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.SHANGHAI)||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == FlightBooking.TripDestination.BEIJING )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == FlightBooking.TripDestination.HELSINKI)){
                    ticketNumber[i] = "11B1234DOM";
                }
                else{
                    ticketNumber[i] = "11B1234INT";
                }
            }
            else {
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.BEIJING ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.SHANGHAI)||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == FlightBooking.TripDestination.BEIJING )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == FlightBooking.TripDestination.HELSINKI)){
                    ticketNumber[i] = "11E1234DOM";
                }
                else{
                    ticketNumber[i] = "11E1234INT";
                }
            }
        }
        else {
            if (bookingClass == "FIRST"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.BEIJING ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.SHANGHAI)||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == FlightBooking.TripDestination.BEIJING )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == FlightBooking.TripDestination.HELSINKI)){
                    ticketNumber[i] = "22F1234DOM";
                }
                else{
                    ticketNumber[i] = "22F1234INT";
                }
            }
            else if (bookingClass == "BUSINESS"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.BEIJING ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.SHANGHAI)||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == FlightBooking.TripDestination.BEIJING )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == FlightBooking.TripDestination.HELSINKI)){
                    ticketNumber[i] = "22B1234DOM";
                }
                else{
                    ticketNumber[i] = "22B1234INT";
                }
            }
            else {
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.BEIJING ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == FlightBooking.TripDestination.SHANGHAI)||(tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == FlightBooking.TripDestination.BEIJING )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == FlightBooking.TripDestination.HELSINKI)){
                    ticketNumber[i] = "22E1234DOM";
                }
                else{
                    ticketNumber[i] = "22E1234INT";
                }
            }
        }
        
    }
    public String toString()
    {
        {
        return ("Thank you for booking your flights with FLIGHT_COMPANY. " +"\n"+ size +  "tickets." + "\n" +
       "Here are the trip details for Passenger No." + "\n" + 
        "Passenger's Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " +  returnDate + "\n" +
       "Total passengers: " + totalPassengers + "\n" +
       "Total ticket price in Euros: " + totalTicketPrice);
        }
    }
}
