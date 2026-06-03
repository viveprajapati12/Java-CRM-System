// =============================================
// Main.java — Program yahan se start hota hai
// Menu loop + user input handle karta hai
// =============================================

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CRMSystem crm = new CRMSystem();
        Scanner sc    = new Scanner(System.in);

        // ── Sample Data (demo ke liye) ───────────────
        crm.addCustomer("Aditya Birla",   "aditya@birla.com",      "9999999999", "Enterprise");
        crm.addCustomer("Taco Bell India","contact@tacobell.in",    "8888888888", "Premium");
        crm.addCustomer("FabIndia",       "info@fabindia.com",      "7777777777", "Premium");
        crm.addCustomer("Rahul Sharma",   "rahul@startup.com",      "9876543210", "Basic");
        crm.addCustomer("Priya Mehta",    "priya@techcorp.com",     "9123456780", "Enterprise");

        // ── Main Menu Loop ───────────────────────────
        // while(true) = jab tak user "Exit" na choose kare, loop chalti rahe
        while (true) {
            System.out.println("\n  ╔═══════════════════════════╗");
            System.out.println("  ║    XENO CRM SYSTEM  v1.0  ║");
            System.out.println("  ╠═══════════════════════════╣");
            System.out.println("  ║  1. Add Customer          ║");
            System.out.println("  ║  2. List All Customers    ║");
            System.out.println("  ║  3. Search Customer       ║");
            System.out.println("  ║  4. Delete Customer       ║");
            System.out.println("  ║  5. Show Stats            ║");
            System.out.println("  ║  6. Exit                  ║");
            System.out.println("  ╚═══════════════════════════╝");
            System.out.print("  Choose option (1-6): ");

            // Invalid input handle karna (agar number nahi diya)
            if (!sc.hasNextInt()) {
                System.out.println("  ✗ Please enter a number (1-6)");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Enter key ka leftover clear karo

            switch (choice) {

                case 1: // ── Add Customer ──
                    System.out.print("\n  Name  : ");
                    String name = sc.nextLine();
                    System.out.print("  Email : ");
                    String email = sc.nextLine();
                    System.out.print("  Phone : ");
                    String phone = sc.nextLine();
                    System.out.print("  Plan  (Basic / Premium / Enterprise): ");
                    String plan = sc.nextLine();
                    crm.addCustomer(name, email, phone, plan);
                    break;

                case 2: // ── List All ──
                    crm.listAllCustomers();
                    break;

                case 3: // ── Search ──
                    System.out.print("\n  Enter name to search: ");
                    String query = sc.nextLine();
                    crm.searchByName(query);
                    break;

                case 4: // ── Delete ──
                    System.out.print("\n  Enter Customer ID to delete: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("  ✗ Invalid ID");
                        sc.next();
                        break;
                    }
                    int id = sc.nextInt();
                    crm.deleteCustomer(id);
                    break;

                case 5: // ── Stats ──
                    crm.showStats();
                    break;

                case 6: // ── Exit ──
                    System.out.println("\n  Goodbye! Thank you for using Xeno CRM.\n");
                    sc.close();
                    return;

                default:
                    System.out.println("  ✗ Invalid option. Please choose 1-6.");
            }
        }
    }
}
