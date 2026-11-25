# 🏦 Smart Banking Management System (Core Java)

A console-based Banking Management System built in **Core Java** to demonstrate Object-Oriented Programming (OOPs) concepts, clean package structure, and real-world banking workflows.

## ✨ Features
- Support for **Savings Account** (Minimum balance rule: Rs. 500) and **Current Account** (Overdraft limit: Rs. 5000).
- Create a new bank account with holder name, account number, and initial deposit.
- Deposit and withdraw money with account-specific validation rules.
- Check current balance and view full account details.
- Interactive menu-driven console interface.

## 🧠 Java & OOPs Concepts Used
- **Abstraction:** `BankAccount` implemented as an `abstract` class with an abstract `withdraw()` method.
- **Inheritance:** `SavingsAccount` and `CurrentAccount` extend `BankAccount`.
- **Polymorphism:** Method Overriding for account-specific withdrawal rules and runtime polymorphism in `Main`.
- **Encapsulation:** Private and protected data members with controlled access via methods.
- **Packages & Control Flow:** Organized under `com.bank` using `do-while` loop and `switch-case`.

## 🛠️ Tech Stack
- **Language:** Java (Core Java)
- **IDE:** Eclipse IDE

## 🚀 Future Enhancements
- [ ] Custom Exception Handling (`InsufficientBalanceException`) & multiple accounts support.
- [ ] File Handling (`transactions.txt`) for saving passbook history.
