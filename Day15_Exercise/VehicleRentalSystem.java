package Day15_Exercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        int choice = 0;

        try {
            while (choice != 5) {
                System.out.println("""
                        \n----------------------
                        Vehicle Rental System
                        1. Rent a Car
                        2. Rent a Bike
                        3. Rent a Truck
                        4. View Rented Vehicles
                        5. Exit
                        Please enter your choice:""");

                choice = s.nextInt();
                s.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Please enter Car Model: ");
                        String model = s.nextLine();

                        System.out.println("Please enter Rental Days: ");
                        int days = s.nextInt();

                        Car car = new Car(model, days);
                        rentedVehicles.add(car);
                        car.displayDetails();
                        break;
                    case 2:
                        System.out.println("Please enter Bike Brand: ");
                        String brand = s.nextLine();

                        System.out.println("Please enter Rental hours: ");
                        int hours = s.nextInt();

                        Bike bike = new Bike(brand, hours);
                        rentedVehicles.add(bike);
                        bike.displayDetails();
                        break;
                    case 3:
                        System.out.println("Please enter Truck Type: ");
                        String type = s.nextLine();
                        System.out.println("Please enter Rental Weeks: ");
                        int weeks = s.nextInt();
                        Truck truck = new Truck(type, weeks);
                        rentedVehicles.add(truck);
                        truck.displayDetails();
                        break;
                    case 4:
                        if(rentedVehicles.isEmpty()){
                            System.out.println("You didn't rent a vehicle");

                        } else {
                            System.out.println("\nVehicles: ");
                            for(Vehicle v : rentedVehicles){
                                v.displayDetails();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using the Vehicle Rental System! ");
                        choice = 5;
                        break;
                    default:
                        System.out.println("Invalid input! Please enter an integer between (1-5)");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
