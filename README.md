Midterm Exam Tasks
This midterm consists of three design pattern implementation tasks. Students must accumulate 100 points total out of the available 200 points (100 + 60 + 40). Depending on each student’s preferred approach, they can:

Complete the single advanced task (Smart Home Control System) worth 100 points, OR
Combine the Online Payment Gateway (60 points) with the Coffee Shop Simulator (40 points) to total 100 points, OR
Mix & Match further if your instructor allows partial completion or additional features for extra credit.
You only need 100 points to fulfill the midterm requirement.

Table of Contents
Smart Home Control System (Advanced – 100 points)
Online Payment Gateway (Intermediate – 60 points)
Coffee Shop Simulator (Easy – 40 points)
General Guidelines
Scoring Suggestions
Smart Home Control System (Advanced – 100 points)
Design Patterns to Apply:

Composite
Decorator
Abstract Factory
Facade
Adapter
Task Overview
Implement a Smart Home Control System simulating how various smart devices (e.g., lights, thermostats, security cameras) are managed and controlled. This project aims to demonstrate a complex interaction of multiple components using the mentioned design patterns.

Requirements Breakdown
Composite Pattern

Organize individual devices (leaf nodes) and groups of devices (composite nodes) such as rooms or floors.
A composite node can contain multiple devices (e.g., multiple lights and a thermostat in a single room).
Decorator Pattern

Dynamically add or modify a device’s functionality (e.g., adding logging, scheduling, or a power-saving mode).
Example: Decorate a Light device with a ScheduledOperationDecorator to turn it on/off at set times.
Abstract Factory Pattern

Create families of related devices. For example:
BasicSmartHomeFactory to produce standard devices.
AdvancedSmartHomeFactory for high-end devices with extra features (AI-based thermostats, advanced sensors, etc.).
Ensures consistent interfaces when creating multiple device types at once.
Facade Pattern

Provide a simplified interface (e.g., SmartHomeController) to manage all devices. For example:
turnAllLightsOn(), setGlobalTemperature(), getSystemStatusReport()
Clients interact with the Facade without needing to understand the underlying complexities.
Adapter Pattern

Integrate at least one external or legacy system. For example:
A legacy door lock system, or a third-party weather API for the thermostat.
The Adapter ensures the external system’s interface aligns with the rest of your smart home design.
Deliverables
Source Code demonstrating each pattern:
Composite structure for the device hierarchy.
Decorator classes for extended functionality.
At least two factories (basic vs. advanced).
A single Facade for central control.
An Adapter for a third-party or legacy system.
Short Demo (CLI or basic GUI) that shows:
Adding devices to composite structures.
Decorating devices with extra behaviors (logging, scheduling, etc.).
Using the Facade to issue commands.
Integrating the adapted component.
Point Allocation (Example)
Implementation & correctness of patterns (50 points)
Quality & clarity of the Facade and composite structure (20 points)
Proper use of factories (10 points)
Proper use of decorators (10 points)
Adapter integration (10 points)
Online Payment Gateway (Intermediate – 60 points)
Design Patterns to Apply:

Factory Method
Adapter
Task Overview
Create a Payment Platform that supports multiple payment methods (e.g., credit card, PayPal, cryptocurrency). This system should handle basic transactions and integrate at least one external or legacy API.

Requirements Breakdown
Factory Method Pattern

Encapsulate the creation of different payment method objects, such as CreditCardPayment, PayPalPayment, and CryptoPayment.
Each payment class implements a common interface, e.g., PaymentMethod with processPayment(amount).
Show how a PaymentFactory (or multiple factories) instantiates the correct payment class based on user selection or configuration.
Adapter Pattern

Integrate at least one external or mock API. For example:
A payment validation library for credit cards.
A simplified test service representing PayPal’s API calls.
The Adapter ensures external API calls conform to the internal PaymentMethod interface.
Additional Complexity or Features (to justify 60 points instead of 40):

Include transaction status (pending, completed, failed).
Maintain a transaction history or log.
Provide minimal error handling or exceptions (e.g., insufficient funds, invalid credentials).
(Optional) Implement partial or staged payments if appropriate.
Deliverables
Source Code:
Payment classes for each method, created via the Factory Method.
An Adapter class to communicate with at least one external/mock payment service.
Additional features such as transaction logging or error handling.
Demo Application:
A console or minimal GUI where users can:
Select the payment type.
Enter payment details (e.g., fake credit card info, PayPal account).
Process a transaction (simulate success/failure).
Possibly view a transaction history and statuses.
Point Allocation (Example)
Correct Factory Method implementation (25 points)
Adapter integration with an external or mock API (20 points)
Transaction management, logging, or error-handling features (15 points)
Coffee Shop Simulator (Easy – 40 points)
Design Patterns to Apply:

Factory Method
Decorator
Task Overview
Build a Coffee Ordering System where customers can choose different coffee drinks and dynamically add extra ingredients or toppings.

Requirements Breakdown
Factory Method Pattern

A CoffeeFactory that creates different coffee objects (e.g., Espresso, Cappuccino, Latte, Americano).
Each coffee type implements a common Coffee interface (e.g., getCost(), getDescription()).
Decorator Pattern

Add ingredients (milk, caramel syrup, whipped cream, chocolate syrup) dynamically.
Decorators wrap the Coffee object to modify cost and description.
Example: ChocolateDecorator adds “Chocolate Syrup” to getDescription() and increases the cost accordingly.
Deliverables
Source Code:
Classes for each coffee type.
Decorator classes for toppings.
Demo Application:
A console or lightweight GUI where users:
Select a coffee base from the factory.
Choose multiple toppings/ingredients.
Displays final cost and description of the customized coffee.
Point Allocation (Example)
Correct Factory Method for coffee types (20 points)
Correct Decorator implementation for toppings (10 points)
Clarity of the final solution & demonstration (10 points)
General Guidelines
Programming Language/Framework

Feel free to use Java, C#, Python, or any language you prefer, unless otherwise specified by your instructor.
Documentation

Ensure your code is well-commented, highlighting how and where each design pattern is applied.
Provide a brief overview (in a README or doc comments) describing your system’s architecture.
Collaboration

Students may work individually or in small teams (2–3), based on instructor policy.
Testing

Include basic tests or demonstrations to show how each feature works.
Scoring Suggestions
Total Available Points: 200

Smart Home Control System (100 points)
Online Payment Gateway (60 points)
Coffee Shop Simulator (40 points)
You Need 100 Points:

Option A: Do the Smart Home Control System alone for a full 100 points.
Option B: Combine Online Payment Gateway (60 points) + Coffee Shop Simulator (40 points) = 100 points exactly.
Option C: If you complete more than 100 points worth of tasks or add extra features, that is up to you—only 100 is required for the midterm.
