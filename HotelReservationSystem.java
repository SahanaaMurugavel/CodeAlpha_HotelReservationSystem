import java.util.Scanner;

public class HotelReservationSystem {

    static boolean roomAvailable = true;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Hotel Reservation System");
        System.out.println("1. Book Room");
        System.out.println("2. Cancel Booking");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            if (roomAvailable) {
                roomAvailable = false;
                System.out.println("Room booked successfully.");
            } else {
                System.out.println("Room not available.");
            }
        } 
        else if (choice == 2) {
            roomAvailable = true;
            System.out.println("Booking cancelled.");
        } 
        else {
            System.out.println("Invalid option.");
        }

        sc.close();
    }
}
