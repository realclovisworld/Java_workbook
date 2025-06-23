package question_5;
//custom exception class
class BookingException extends Exception{
    public BookingException(String message){
        super(message);
    }
}
public class FlightBookingSystem{
    public static void main(String[] args){
        int availableSeats = 5;  //Example available seats

        //Simulate user inputs
        int[] availableSeatsList = {3,0,6,2};

        for(int requestedSeats : availableSeatsList){
            System.out.println("Trying to book " + requestedSeats + " seats");
            try{
                bookSeats(availableSeats, requestedSeats);
                availableSeats -= requestedSeats;
                System.out.println("Seats booked successfully, Remaining seats:" + availableSeats);

            }
            catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());

            }
            catch(RuntimeException e){
                System.out.println("Error: " + e.getMessage());

            }
            catch (BookingException e) {
                System.out.println("Error: " + e.getMessage());
                break; // No more bookings allowed as the flight is fully booked
            }
            finally{
                System.out.println("Booking attempt finished.\n");
            }

    }
}
public static void bookSeats(int availableSeats, int requestedSeats) throws BookingException {
    if (requestedSeats <= 0) {
        throw new IllegalArgumentException("Requested seats must be greater than 0.");
    }
    if (availableSeats == 0) {
        throw new BookingException("Flight is fully booked.");
    }
    if (requestedSeats > availableSeats) {
        throw new RuntimeException("Not enough seats available.");
    }
    }
}

/*Questions 5
A travel agency provides an online booking system for customers
 to reserve seats on flights. Due to increasing demand, they need to ensure their booking system
  can handle errors gracefully and enforce business rules.
 * 
 * 
 * Here is the pseudocode for your flight booking system:

1. Define BookingException class (inherits from Exception):
    - Constructor takes a message and passes it to the parent Exception class

2. Define FlightBookingSystem class:
    - main method:
        - Set availableSeats to 5
        - Define availableSeatsList = [3, 0, 6, 2]
        - For each requestedSeats in availableSeatsList:
            - Print "Trying to book X seats"
            - Try:
                - Call bookSeats(availableSeats, requestedSeats)
                - Subtract requestedSeats from availableSeats
                - Print "Seats booked successfully, Remaining seats: Y"
            - Catch IllegalArgumentException:
                - Print error message
            - Catch RuntimeException:
                - Print error message
            - Catch BookingException:
                - Print error message
                - Break loop (no more bookings allowed)
            - Finally:
                - Print "Booking attempt finished."

    - bookSeats(availableSeats, requestedSeats) method:
        - If requestedSeats <= 0, throw IllegalArgumentException
        - If availableSeats == 0, throw BookingException ("Flight is fully booked")
        - If requestedSeats > availableSeats, throw RuntimeException ("Not enough seats available")

Let me know if you need the pseudocode in a different format or with more detail!
 */