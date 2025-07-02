package Main;
import beans.buyers;
import DAO.flat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import util.DBconnection;

public class Main {

    public static void main(String[] args) {
        flat flat=new flat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Buy yourself a home of your dreams!!");
            while (true) {
                System.out.println("1. Show Available Flats");
                System.out.println("2. Register Buyer");
                System.out.println("3. Update Buyer");
                System.out.println("4. Delete Buyer");
                System.out.println("5. Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        flat.availableflats();
                        break;
                    case 2:
                        System.out.print("Enter Buyer ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Address: ");
                        String address = sc.nextLine();
                        System.out.print("contact_details: ");
                        String contact_details = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Flat ID: ");
                        int flatId = sc.nextInt();
                        flat.registerBuyer(id,name,address,contact_details,email,flatId);
                        break;
                    case 3:
                        char ch;

                            System.out.println("what do you want to update     " +
                                    "a. buyer_name     " +
                                    "b. address     " +
                                    "c. contactdetails     " +
                                    "d. email     " +
                                    "e. flatId");

                        ch=sc.next().charAt(0);
                        switch (ch) {

                            case 'a':

                                System.out.print("Enter Buyer ID to update: ");
                                int bid = sc.nextInt();
                                sc.nextLine();
                                System.out.print("New_name: ");
                                String new_name = sc.nextLine();
                                flat.updateBuyer(bid, new_name);
                                break;


                            case 'b':
                                System.out.print("Enter Buyer ID to update: ");
                                int bid2 = sc.nextInt();
                                sc.nextLine();
                                System.out.print("New address: ");
                                String newAddress = sc.nextLine();
                                flat.updateBuyer2(bid2, newAddress);
                                break;


                            case 'c':
                                System.out.print("Enter Buyer ID to update: ");
                                int bid3 = sc.nextInt();
                                sc.nextLine();
                                System.out.print("New contact_number: ");
                                String newcontact = sc.nextLine();
                                flat.updateBuyer3(bid3, newcontact);
                                break;


                            case 'd':
                                System.out.print("Enter Buyer ID to update: ");
                                int bid4 = sc.nextInt();
                                sc.nextLine();
                                System.out.print("New Email: ");
                                String newEmail = sc.nextLine();
                                flat.updateBuyer4(bid4, newEmail);
                                break;
                            case 'f':
                                System.out.print("Enter Buyer ID to update: ");
                                int bid5 = sc.nextInt();
                                sc.nextLine();
                                System.out.print("New flat_Id: ");
                                String newFlatid = sc.nextLine();
                                flat.updateBuyer5(bid5, newFlatid);
                                break;
                            default:
                                System.out.println("please enter a valid choice");

                        }
                        break;
                    case 4:
                        System.out.print("Enter Buyer ID to delete: ");
                        int delete_ID = sc.nextInt();
                        flat.deleteBuyer(delete_ID);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("please enter a valid input");

                }
            }
        }
    }


