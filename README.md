
# S3.02 - Patterns 2

This repository contains a collection of Java exercises designed to help you understand and practice the most important software design patterns. Each level focuses on a different pattern and includes a practical, fully working example with clear code structure and explanations.

## Project Structure

```
src/main/java/
│
├── level1/   # Builder Pattern (Pizza Order System)
├── level2/   # Observer Pattern (Stock Market System)
├── level3/   # Callback Pattern (Payment Gateway for Shoe Store)
└── README.md
```

## Levels Overview

### Level 1: Builder Pattern – Pizza Order System

- **Goal:** Learn how to construct complex objects step by step using the Builder pattern.
- **What you’ll find:**
    - A flexible pizza builder that lets you choose size, dough, and toppings.
    - Concrete builders for Hawaiian and Veggie pizzas.
    - A "MestrePizzer" (Director) class to orchestrate the building process.
    - A `Main` class that demonstrates how to build and print different pizzas.

### Level 2: Observer Pattern – Stock Market Notifications

- **Goal:** Understand how one object (the observable) can notify multiple observers about changes.
- **What you’ll find:**
    - An `StockAgent` (Stock Agent) class that acts as the observable.
    - Several `StockAgency` (Stock Agency) classes that receive notifications when the market goes up or down.
    - A `Main` class that simulates market changes and shows how all agencies are notified.

### Level 3: Callback Pattern – Payment Gateway for Shoe Store

- **Goal:** Discover how to decouple the execution of an action (payment) from its implementation using callbacks.
- **What you’ll find:**
    - A `PaymentMethod` interface and several payment implementations (Credit Card, PayPal, Bank Debit).
    - A `PaymentGateway` that processes any payment method without knowing its details.
    - A `ShoeShop` class that sells shoes and uses the payment gateway.
    - A `Main` class that demonstrates selling shoes with different payment methods.

## How to Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/mxg952/S3.02-Patterns_2.git
   ```

2. **Open the project in IntelliJ IDEA** (or any Java IDE).

3. **Each level has its own `Main.java` class.**
    - Navigate to the desired level (e.g., `level1/main/Main.java`).
    - Right-click and select **Run 'Main.main()'** to see the example in action.

4. **If you use Gradle:**
    - Open a terminal in the project root.
    - Run:
      ```sh
      ./gradlew run
      ```
    - Make sure your `build.gradle` is configured to point to the correct `mainClass`.

## How to Contribute

- Fork the repository.
- Create a new branch for your feature or improvement.
- Commit your changes with clear messages.
- Open a Pull Request describing your contribution.

**Ideas for contributions:**
- Add more patterns (e.g., Singleton, Abstract Factory, Command, etc.).
- Add more tests or usage examples.
- Improve documentation or code comments.

## Learning Goals

- Understand and implement the Builder, Observer, and Callback patterns in Java.
- Learn how to organize a Java project using packages and directories.
- Practice clean code and separation of responsibilities.

## License

This project is for educational purposes.  
Feel free to use, modify, and share it!
