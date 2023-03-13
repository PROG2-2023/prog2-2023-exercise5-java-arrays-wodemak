package prog2.exercise5.flight.booking.system;

import java.lang.runtime.SwitchBootstraps;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.swing.text.AbstractDocument.BranchElement;

import prog2.exercise5.flight.booking.system.FlightBooking.BookingClass;
import prog2.exercise5.flight.booking.system.FlightBooking.TripDestination;
import prog2.exercise5.flight.booking.system.FlightBooking.TripSource;
import prog2.exercise5.flight.booking.system.FlightBooking.TripType;

public class FlightBooking {
    private String passengerFullName;
    private String flightCompany;
    private TripSource tripSource;
    private String sourceAirport ;
    private TripDestination tripDestination ;
    private String destinationAirport;
    private String ticketNumber = "11FASDFDOM";
    private int childrenPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private Double departingTicketPrice;
    private Double returnTicketPrice;
    private Double totalTicketPrice;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private BookingClass bookingClass;
    private TripType tripType;
    private int passengerAge;
    private String passengerGender;
    private int size;
    private String [] fullName;
    private String [] gender;
    private int [] age;
    
    public FlightBooking(int size) {
        fullName = new String[size];
        gender = new String[size];
        age = new int[size];
    }

    public void setPassengerFullName(int i, String fullName) {
            this.fullName[i] = fullName;
    }

    public String getPassengerFullName(int j) {
        return fullName[j];
    }

    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }

    public String getFlightCompany() {
        return flightCompany;
    }

    public void setTripSource(String tripSource) {
       switch(tripSource){
        case "1":
        this.tripSource = TripSource.NANJING;
        break;

        case "2":
        this.tripSource = TripSource.BEIJING;
        break;

        case "3":
        this.tripSource = TripSource.OULU;
        break;

        case "4":
        this.tripSource = TripSource.HELSINKI;
        break;
       }
    }

    public TripSource getTripSource() {
        return tripSource;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setTripDestination(String tripSource, String tripDestination) {
        switch(tripDestination){
        case "1":
        this.tripDestination = TripDestination.NANJING;
        break;

        case "2":
        this.tripDestination = TripDestination.BEIJING;
        break;

        case "3":
        this.tripDestination = TripDestination.OULU;
        break;

        case "4":
        this.tripDestination = TripDestination.HELSINKI;
        break;
        }
    }

    public TripDestination getTripDestination() {
        return tripDestination;
    }

    public void setDestinationAirport(String destinationAirport,String destinationAirport1) {
        this.destinationAirport = destinationAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setTicketNumber(int j) {
        String ticketNumber;
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<4; i++){
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        ticketNumber = sb.toString();


        if(tripType == TripType.ONEWAY){
            switch(tripSource){
                case BEIJING :
                switch(tripDestination){
                    case NANJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "DOM";
                        break;
                    }
                    case OULU :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }

                    case HELSINKI :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }
                }
                case NANJING :
                switch(tripDestination){
                    case BEIJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "DOM";
                        break;
                    }

                    case OULU :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }

                    case HELSINKI :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }
                }

                case OULU :
                switch(tripDestination){
                    case HELSINKI :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "DOM";
                        break;
                    }
                    case BEIJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }

                    case NANJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }
                }

                case HELSINKI :
                switch(tripDestination){
                    case OULU :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "DOM";
                        break;
                    }
                    case BEIJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }

                    case NANJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }
                }
            }
        }
        else if(tripType == TripType.RETURN){
            switch(tripSource){
                case BEIJING :
                switch(tripDestination){
                    case NANJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "22F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "22B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "22E" + ticketNumber + "DOM";
                        break;
                    }
                    case OULU :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "22F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "22B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "22E" + ticketNumber + "INT";
                        break;
                    }

                    case HELSINKI :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "22F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "22B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "22E" + ticketNumber + "INT";
                        break;
                    }
                }
                case NANJING :
                switch(tripDestination){
                    case BEIJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "22F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "22B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "22E" + ticketNumber + "DOM";
                        break;
                    }

                    case OULU :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "22F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "22B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "22E" + ticketNumber + "INT";
                        break;
                    }

                    case HELSINKI :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "22F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "22B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "22E" + ticketNumber + "INT";
                        break;
                    }
                }

                case OULU :
                switch(tripDestination){
                    case HELSINKI :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "DOM";
                        break;
                    }
                    case BEIJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }

                    case NANJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }
                }

                case HELSINKI :
                switch(tripDestination){
                    case OULU :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "DOM";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "DOM";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "DOM";
                        break;
                    }
                    case BEIJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }

                    case NANJING :
                    switch(bookingClass){
                        case FIRST :
                        this.ticketNumber = "11F" + ticketNumber + "INT";
                        break;
                        case BUSINESS :
                        this.ticketNumber = "11B" + ticketNumber + "INT";
                        break;
                        case ENCONOMIC :
                        this.ticketNumber = "11E" + ticketNumber + "INT";
                        break;
                    }
                }
            }

        }
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setChildrenPassengers(int childrenPassengers) {
        this.childrenPassengers = childrenPassengers;
    }

    public int getChildrenPassengers() {
        return childrenPassengers;
    }

    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public void setTotalPassengers() {
        this.totalPassengers = (childrenPassengers + adultPassengers);
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setDepartingTicketPrice(int child, int adults) {
        switch(tripSource){
            case BEIJING :
            switch(tripDestination){
                case NANJING :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300)) + 250) + (adults*(300 + (0.1*300) + (0.05*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300)) + 150) + (adults*(300 + (0.1*300) + (0.05*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300)) + 50) + (adults*(300 + (0.1*300) + (0.05*300) + 50))));
                    break;
                }
                break;

                case OULU :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300)) + 250) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300)) + 150) + (adults*(300 + (0.1*300) + (0.15*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300)) + 50) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;

                case HELSINKI :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300)) + 250) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300)) + 150) + (adults*(300 + (0.1*300) + (0.15*300) + 150))) );
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300)) + 50) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;
            }
            break;

            case NANJING :
            switch(tripDestination){
                case BEIJING :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 250)) + (adults*(300 + (0.1*300) + (0.05*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 150)) + (adults*(300 + (0.1*300) + (0.05*300) + 250))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 50)) + (adults*(300 + (0.1*300) + (0.05*300) + 50))));
                    break;
                }
                break;

                case OULU :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 250)) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 150)) + (adults*(300 + (0.1*300) + (0.15*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 50)) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;

                case HELSINKI :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 250)) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300+ (0.1*300) + (0.15*300) + 150)) + (adults*(300 + (0.1*300) + (0.15*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 50)) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;
            }
            break;

            case OULU :
            switch(tripDestination){
                case HELSINKI :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 250)) + (adults*(300 + (0.1*300) + (0.05*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 150)) + (adults*(300 + (0.1*300) + (0.05*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 50)) + (adults*(300 + (0.1*300) + (0.05*300) + 50))));
                    break;
                }
                break;

                case BEIJING :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 250)) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 150)) + (adults*(300 + (0.1*300) + (0.15*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 50)) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;

                case NANJING :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 250)) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 150)) + (adults*(300 + (0.1*300) + (0.15*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 50)) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;
            }
            break;

            case HELSINKI :
            switch(tripDestination){
                case OULU :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 250)) + (adults*(300 + (0.1*300) + (0.05*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 150)) + (adults*(300 + (0.1*300) + (0.05*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.05*300) + 50)) + (adults*(300 + (0.1*300) + (0.05*300) + 50))));
                    break;
                }
                break;

                case BEIJING :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 250)) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 150)) + (adults*(300 + (0.1*300) + (0.15*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 50)) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;

                case NANJING :
                switch(bookingClass){
                    case FIRST :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 250)) + (adults*(300 + (0.1*300) + (0.15*300) + 250))));
                    break;
                    case BUSINESS :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 150)) + (adults*(300 + (0.1*300) + (0.15*300) + 150))));
                    break;
                    case ENCONOMIC :
                    this.departingTicketPrice = (((child *(300 + (0.1*300) + (0.15*300) + 50)) + (adults*(300 + (0.1*300) + (0.15*300) + 50))));
                    break;
                }
                break;
            }
            break;
        }
    }

    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice() {
        this.returnTicketPrice = departingTicketPrice;
    }

    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = 2 * departingTicketPrice;
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setDepartureDate(LocalDate departingDate) {
        this.departureDate = departingDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        long betweenDays = ChronoUnit.DAYS.between(departureDate, returnDate);
        if(betweenDays < 2){
            returnDate = departureDate.plusDays(2);
        }

        this.returnDate = returnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void displayTripDetials(){
        long betweenDays = ChronoUnit.DAYS.between(departureDate, returnDate);
        String tripDetails;
        for(int i  = 0; i < size; ++i){
        if(betweenDays < 2){
            tripDetails = "Thank you for booking your flights with" + flightCompany + "\n" + 
            "You reserved a total of " + size +" tickets" + "\n" + 
            "Here are the trip details for Passenger No." + i +
            "Passenger's Ticket Number:" + ticketNumber + "\n" + 
            "Passenger's Full Name:" + passengerFullName + "\n" +
            "Passenger's Age:" + passengerAge + "\n" + 
            "Passenger's Gender:" + passengerGender + "\n" + 
            "From:" + tripSource + "(" + sourceAirport + ")" + "\n" + 
            "To:" + tripDestination + "(" + destinationAirport + ")" + "\n" + 
            "The flight departs on:" + departureDate + "\n" + 
            "And the return flight is on:" + returnDate + "(Changed from old " + returnDate + " to " + returnDate + "\n" + 
            "The total ticket price is:" + totalTicketPrice + "\n" + 
            "IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date";
            System.out.println(tripDetails);
        }
        else{
            tripDetails = "Thank you for booking your flights with" + flightCompany + "\n" + 
            "You reserved a total of " + size +" tickets" + "\n" + 
            "Here are the trip details for Passenger No." + i +
            "Passenger's Ticket Number:" + ticketNumber + "\n" + 
            "Passenger's Full Name:" + passengerFullName + "\n" +
            "Passenger's Age:" + passengerAge + "\n" + 
            "Passenger's Gender:" + passengerGender + "\n" + 
            "From:" + tripSource + "(" + sourceAirport + ")" + "\n" + 
            "To:" + tripDestination + "(" + destinationAirport + ")" + "\n" + 
            "The flight departs on:" + departureDate + "\n" + 
            "And the return flight is on:" + returnDate + "\n" + 
            "The total ticket price is:" + totalTicketPrice + "\n";
            System.out.println(tripDetails);
        }
    }
    }

    public void setBookingClass(String bookingClass){
        switch(bookingClass){
            case "1" :
            this.bookingClass = BookingClass.FIRST;
            break;

            case "2" :
            this.bookingClass = BookingClass.BUSINESS;
            break;

            case "3":
            this.bookingClass = BookingClass.ENCONOMIC;
            break;
        }
    }

    public BookingClass getBookingClass(){
        return bookingClass;
    }

    public void setTripType(String tripType){
        switch(tripType){
            case "1" :
            this.tripType = TripType.ONEWAY;
            break;

            case "2" :
            this.tripType = TripType.RETURN;
            break;
        }
    }

    public TripType getTripType(){
        return tripType;
    }

    public void setPassengerAge(int i, int age) {
        this.age[i] = age;
    }

    public int getPassengerAge(int j) {
        return age[j];
    }

    public void setPassengerGender(int i,String gender) {
        this.gender[i] = gender;
    }

    public String getPassengerGender(int j) {
        return gender[j];
    }

    enum BookingClass{
        FIRST,BUSINESS,ENCONOMIC
    }

   
    enum TripSource{
        NANJING,BEIJING,OULU,HELSINKI
    }

    enum TripDestination {
        NANJING,BEIJING,OULU,HELSINKI
    }

    enum TripType{
        ONEWAY,RETURN
    }

}


