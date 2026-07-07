# 🏧 ATM System

A console-based ATM simulation built using **Java**, **Maven**, and **Object-Oriented Programming (OOP)** principles. This project demonstrates clean architecture, exception handling, unit testing, and modular design while simulating basic ATM operations.

![Java](https://img.shields.io/badge/Java-24-orange)
![Maven](https://img.shields.io/badge/Maven-3.9+-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-success)
![Mockito](https://img.shields.io/badge/Mockito-5-green)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

# 📖 About

This project is part of my **Java Backend Development** learning journey.

The goal is to build an ATM application step by step while following industry-standard Java practices including:

- Object-Oriented Programming
- Exception Handling
- Clean Code
- Maven Project Structure
- Unit Testing
- Modular Design
- Git & GitHub Workflow

---

# ✨ Features

### Current Features

- 🔐 Secure 4-digit PIN Authentication
- 💰 Balance Inquiry
- 💵 Cash Deposit
- 💸 Cash Withdrawal
- ⚠️ Input Validation
- ❌ Custom Exception Handling
- 🧹 Clean Package Structure
- 🧪 Unit Testing with JUnit 5
- 🎭 Mockito-based Testing
- 📦 Maven Project

---

# 🛠 Tech Stack

| Technology | Version |
|------------|----------|
| Java | 24 |
| Maven | Latest |
| JUnit | 5 |
| Mockito | 5 |
| IntelliJ IDEA | 2025 |
| Git | Latest |

---

# 📂 Project Structure

```text
ATM-System
│
├── pom.xml
├── README.md
├── .gitignore
│
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── saumya
    │               ├── Main.java
    │               │
    │               ├── exception
    │               │   ├── InvalidAmountException.java
    │               │   ├── InvalidPinException.java
    │               │   └── InsufficientBalanceException.java
    │               │
    │               ├── model
    │               │   └── BankAccount.java
    │               │
    │               ├── service
    │               │   └── ATM.java
    │               │
    │               ├── ui
    │               │   └── Menu.java
    │               │
    │               └── util
    │                   └── InputHandler.java
    │
    └── test
        └── java
            └── com
                └── saumya
                    ├── model
                    │   └── BankAccountTest.java
                    └── service
                        └── ATMTest.java
```

---

# 🚀 Getting Started

## Clone Repository

```bash
git clone https://github.com/Saumya-Codes02/ATM-System.git
```

---

## Navigate to Project

```bash
cd ATM-System
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Tests

```bash
mvn test
```

---

## Run Application

Execute:

```
Main.java
```

or

```bash
mvn exec:java
```

---

# 🧪 Testing

This project includes automated tests using **JUnit 5** and **Mockito**.

### Test Coverage

- ✅ Deposit
- ✅ Withdrawal
- ✅ Invalid Deposit
- ✅ Invalid Withdrawal
- ✅ Insufficient Balance
- ✅ Account Initialization
- ✅ ATM Object Creation
- ✅ Mock-based Input Testing

Current Test Results

```
Tests Run : 21
Failures  : 0
Errors    : 0
Skipped   : 0

BUILD SUCCESS
```

---

# 📋 Current Functionality

- PIN Authentication
- Balance Inquiry
- Deposit Money
- Withdraw Money
- Exception Handling
- Input Validation
- Unit Testing

---

# 🚀 Future Improvements

- 📜 Transaction History
- 💾 File Handling
- 🗂 Account Persistence
- 👥 Multiple Accounts
- 🔑 Change PIN
- 🧾 Mini Statement
- 📊 Admin Dashboard
- 🗃 Database Integration (MySQL)
- 🌐 Spring Boot REST API

---

# 📈 Version Roadmap

| Version | Status | Description |
|----------|--------|-------------|
| ✅ v1.0.0 | Completed | Project Setup |
| ✅ v1.1.0 | Completed | PIN Authentication |
| ✅ v1.2.0 | Completed | Deposit, Withdraw & Balance Inquiry |
| ✅ v1.3.0 | Completed | Input Validation & Exception Handling |
| ✅ v1.4.0 | Completed | JUnit & Mockito Testing |
| ⏳ v2.0.0 | Planned | Transaction History |
| ⏳ v3.0.0 | Planned | File Handling |
| ⏳ v4.0.0 | Planned | Multiple Accounts |
| ⏳ v5.0.0 | Planned | Spring Boot REST API |

---

# 🤝 Contributing

Contributions, suggestions, and improvements are welcome.

Feel free to fork the repository and submit a pull request.

---

# 📄 License

This project is licensed under the **MIT License**.

---

# 👨‍💻 Author

**Saumya Shukla**

GitHub: https://github.com/Saumya-Codes02

---

⭐ If you found this project helpful, consider giving it a star.
