// =============================================
// CRMSystem.java — Saari logic yahan hai
// Add / List / Search / Delete / Stats
// =============================================

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
public class CRMSystem {

    // ArrayList  — order mein sab customers store karta hai
    // HashMap    — ID se directly customer dhundhta hai (O(1) speed) bilkul fast
    private ArrayList<customers> customers;
    private HashMap<Integer, customers> customerMap;
    private int nextId;

    // Jab CRMSystem banta hai — empty lists ready ho jaati hain
    public CRMSystem() {
        customers   = new ArrayList<>();
        customerMap = new HashMap<>();
        nextId      = 1;
    }

    // ── 1. CUSTOMER ADD ──────────────────────────────
    public void addCustomer(String name, String email,
                            String phone, String plan) {
        customers c = new customers(nextId, name, email, phone, plan);
        customers.add(c);           // list mein daalo
        customerMap.put(nextId, c); // map mein bhi daalo (fast search ke liye)
        System.out.println("\n  ✓ Customer added! Assigned ID: " + nextId);
        nextId++;
    }

    // ── 2. ALL CUSTOMERS LIST ────────────────────────
    public void listAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("\n  No customers found.");
            return;
        }
        System.out.println("\n  ─────────────────────────────────────────────────────────");
        System.out.println("   ID   Name                 Email                        Phone         Plan");
        System.out.println("  ─────────────────────────────────────────────────────────");
        for (customers c : customers) {
            c.display();
        }
        System.out.println("  ─────────────────────────────────────────────────────────");
        System.out.println("  Total Customers: " + customers.size());
    }

    // ── 3. SEARCH BY NAME ───────────────────────────
    // .toLowerCase() — case insensitive search (ADITYA = aditya = Aditya)
    public void searchByName(String name) {
        System.out.println("\n  ── Search Results for: \"" + name + "\" ──");
        boolean found = false;
        for (customers c : customers) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                c.display();
                found = true;
            }
        }
        if (!found) System.out.println("  No customer found with name: " + name);
    }

    // ── 4. DELETE BY ID ─────────────────────────────
    // HashMap se O(1) mein milta hai — loop nahi lagta
    public void deleteCustomer(int id) {
        customers c = customerMap.get(id);
        if (c != null) {
            customers.remove(c);
            customerMap.remove(id);
            System.out.println("\n  ✓ Deleted: " + c.getName() + " (ID: " + id + ")");
        } else {
            System.out.println("\n  ✗ No customer found with ID: " + id);
        }
    }

    // ── 5. STATS ────────────────────────────────────
    public void showStats() {
        int basic = 0, premium = 0, enterprise = 0;
        for (customers c : customers) {
            switch (c.getPlan().toLowerCase()) {
                case "basic":      basic++;      break;
                case "premium":    premium++;    break;
                case "enterprise": enterprise++; break;
            }
        }
        System.out.println("\n  ╔══════════════════════════╗");
        System.out.println("  ║      CRM STATS           ║");
        System.out.println("  ╠══════════════════════════╣");
        System.out.printf ("  ║  Total Customers : %-5d  ║%n", customers.size());
        System.out.printf ("  ║  Basic Plan      : %-5d  ║%n", basic);
        System.out.printf ("  ║  Premium Plan    : %-5d  ║%n", premium);
        System.out.printf ("  ║  Enterprise Plan : %-5d  ║%n", enterprise);
        System.out.println("  ╚══════════════════════════╝");
    }
}