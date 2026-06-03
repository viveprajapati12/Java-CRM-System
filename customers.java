// =============================================
// Customer.java — Ek customer ka "blueprint"
// Jaise ek form hota hai jisme naam, email etc.
// =============================================

public class customers {

    // private = sirf is class ke andar use hoga (Encapsulation)
    private int id;
    private String name;
    private String email;
    private String phone;
    private String plan; // Basic / Premium / Enterprise

    // Constructor — naya customer banate waqt yeh chalta hai
    public customers(int id, String name, String email,
                    String phone, String plan) {
        this.id    = id;
        this.name  = name;
        this.email = email;
        this.phone = phone;
        this.plan  = plan;
    }

    // Getters — private data ko bahar dene ke liye encapsulation ka dusra part hai..
    public int    getId()    { return id; }
    public String getName()  { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getPlan()  { return plan; }

    // Ek customer ki info print karo — formatted
    public void display() {
        System.out.printf("  [ID: %d] %-20s | %-28s | %-12s | Plan: %s%n",
                id, name, email, phone, plan);
    }
}