# Vending Machine Simulator 🥤🍫

A simple Java-based console application that simulates a vending machine. Users can insert money, view available items, purchase items, and receive change.


## 🚀 Features

- Add items to the vending machine
- Display available items
- Insert money and track balance
- Purchase items and reduce quantity
- Refund remaining balance

## 📦 Classes

### `Item`
Represents an item in the vending machine.

- Fields: `code`, `name`, `price`, `quantity`
- Methods: Getters, Setters

### `VendingMachine`
Handles the vending machine logic.

- `addItem(Item item)`
- `insertMoney(int amount)`
- `displayItems()`
- `purchase(String code)`
- `refund()`
- (Optionally add) `restock(String code, int quantity)`

### `Main`
Runs the vending machine with user interaction.

## 🛠 How to Run

1. Clone the repo:

git clone https://github.com/JyothiNallabilli/VendingMachineApp.git

Compile:

javac model/Item.java service/VendingMachine.java Main.java

Run:

java Main
