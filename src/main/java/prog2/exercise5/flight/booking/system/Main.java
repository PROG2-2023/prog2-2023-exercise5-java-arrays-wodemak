package prog2.exercise5.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String sdepart = "2023-04-12";
        LocalDate departingDate = LocalDate.parse(sdepart);

        String sreturn = "2023-05-12";
        LocalDate returnDate = LocalDate.parse(sreturn);

        System.out.println("Please enter the number of tickets:");
        int size = input.nextInt();

        FlightBooking fb = new FlightBooking(size);

        for(int i = 0; i < size; ++i){
            System.out.println("Please enter the passenger name:");
            String [] fullName = new String[size];
            fullName[i] = input.nextLine();
            fb.setPassengerFullName(i, fullName[i]);
        }

        for(int i = 0; i < size; ++i){
            System.out.println("Please enter the passenger gender:");
            String [] gender = new String[size];
            gender[i] = input.nextLine();
            fb.setPassengerGender(i, gender[i]);
        }

        for(int i = 0; i < size; ++i){
            System.out.println("Please enter the passenger age:");
            int [] age = new int[size];
            age[i] = input.nextInt();
            fb.setPassengerAge(i, age[i]);
        }

        System.out.println("Please enter the depature date");
        String departingDate1 = input.nextLine();
        departingDate = LocalDate.parse(departingDate1 , DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Please enter the return date:");
        String returnDate1 = input.nextLine();
        returnDate = LocalDate.parse(returnDate1 , DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        System.out.println("Please enter the booking class:");
        String bookingclass = input.nextLine();

        System.out.println("Please enter the trip type:");
        String triptype = input.nextLine();

        System.out.println("Please enter the trip source:");
        String tripsource = input.nextLine();

        System.out.println("Please enter the trip destination:");
        String tripdestination = input.nextLine();

        System.out.println("Please enter the total number of adultpassenger:");
        int adultpassenger = input.nextInt();

        System.out.println("Please enter the total number of childpassenger:");
        int childpassenger = input.nextInt();

        
        fb.setDepartureDate(departingDate);
        fb.setReturnDate(returnDate);
        fb.setBookingClass(bookingclass);
        fb.setTripType(triptype);
        fb.setTripSource(tripsource);
        fb.setTripDestination(tripsource, tripdestination);
        fb.setDepartingTicketPrice(childpassenger, adultpassenger);
        fb.setReturnTicketPrice();

        fb.setTotalTicketPrice();
        
        fb.toString();

        input.close();
    }
}