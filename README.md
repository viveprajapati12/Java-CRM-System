# 🗂️ Java CRM System

A console-based **Customer Relationship Management** system built in Java — inspired by real-world CRM platforms like [Xeno](https://www.getxeno.com/).

Built this to understand how data management works under the hood, before frameworks do the heavy lifting.

---

## ✨ What it does

- ➕ Add new customers with name, email, phone & plan
- 📋 List all customers in a formatted view
- 🔍 Search customers by name (case-insensitive)
- 🗑️ Delete customers instantly by ID
- 📊 View live stats — plan-wise breakdown

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java | Core language |
| ArrayList | Ordered customer storage |
| HashMap | O(1) lookup by customer ID |
| OOP | Encapsulation, Abstraction |
| Scanner | Console input handling |

---

## 📁 Project Structure

```
Java-CRM-System/
├── Customer.java      # Data model — stores customer info
├── CRMSystem.java     # Business logic — add, search, delete, stats
└── Main.java          # Entry point — menu loop & user input
```

Each file has one clear responsibility — same principle used in real-world software design.

---

## 🚀 How to Run

Make sure you have **JDK 17+** installed.

```bash
# Step 1 — Compile
javac *.java

# Step 2 — Run
java Main
```

You'll see this menu:

```
===== CRM SYSTEM =====
1. Add Customer
2. List All Customers
3. Search Customer
4. Delete Customer
5. Show Stats
6. Exit
```

---

## 💡 Key Concepts Used

**Why both ArrayList AND HashMap?**

```java
// ArrayList — to list customers in order
for (Customer c : customers) { c.display(); }

// HashMap — to find/delete by ID instantly (O(1))
Customer c = customerMap.get(id);
```

Using only ArrayList would mean O(n) search every time.
HashMap gives us O(1) — a small but real performance decision.

---

## 📌 Sample Output

```
  [ID: 1] Aditya Birla         | aditya@birla.com            | 9999999999  | Plan: Enterprise
  [ID: 2] Taco Bell India      | contact@tacobell.in         | 8888888888  | Plan: Premium
  [ID: 3] FabIndia             | info@fabindia.com           | 7777777777  | Plan: Premium

Total Customers: 3
```

---

## 🔮 What I'd add next

- [ ] File storage — save customers to `.csv` so data persists
- [ ] Input validation — check email format, phone length
- [ ] Update customer details
- [ ] Spring Boot REST API version

---

## 🐛 Open Issues

- [Add file storage to persist customer data](https://github.com/viveprajapati12/Java-CRM-System/issues)
- [Add input validation for email and phone](https://github.com/viveprajapati12/Java-CRM-System/issues)
- [Add update/edit customer feature](https://github.com/viveprajapati12/Java-CRM-System/issues)

---

## 🌐 Web Version

Also built a live web version of this project using HTML, CSS and JavaScript:

🔗 **[CRM Web App →](https://viveprajapati12.github.io/CRM-Web-App/)**

Same logic, different syntax — intentionally built both to understand the translation between Java and JavaScript.

---

## 👨‍💻 Author

**Vivek Prajapati**
B.Tech ECE | Java & DSA Enthusiast

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=flat&logo=linkedin)](https://linkedin.com/in/vivek-prajapati-bba6802a5)
[![LeetCode](https://img.shields.io/badge/LeetCode-Profile-orange?style=flat&logo=leetcode)](https://leetcode.com/u/prajapativivek/)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black?style=flat&logo=github)](https://github.com/viveprajapati12)