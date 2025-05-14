<h1><b>AbstractAssets Java Project</b></h1>

<h2><b>📄 Overview</b></h2>

AbstractAssets is a Java console application that expands on the AssetManager project to demonstrate abstraction in object-oriented programming. The project models different types of assets (e.g., House, Vehicle, Cash) using an abstract parent class and polymorphic behavior to calculate and display asset values.

<h2><b>📅 Technologies Used</b></h2>

<b><b>></b>IntelliJ IDEA

<b>></b>Java OOP principles:

<b>></b>Abstract classes and methods

<b>></b>Inheritance and constructor chaining

<b>></b>Polymorphism and downcasting

<b>></b>Encapsulation</b>


<h2><b>📆 Classes and Responsibilities

<h3><b>1. Asset.java (Abstract Class)</b></h3>

Fields: description, dateAcquired, originalCost

Declares abstract method getValue()

Cannot be instantiated directly

<h3><b>2. House.java</b></h3>

Extends Asset

Adds fields: address, condition, squareFoot, lotSize

Overrides getValue() to calculate based on condition and size

<h3><b>3. Vehicle.java</b></h3>

Extends Asset

Adds fields: makeModel, year, odometer

Overrides getValue() using depreciation formulas and mileage check

<h3><b>4. Cash.java</b></h3>

Extends Asset

No extra fields

Overrides getValue() to return the original cost (cash does not depreciate)

<h3><b>5. Main.java</b></h3>

Stores all assets in an ArrayList<Asset>

Loops through and prints info for each asset

Uses instanceof to handle Houses, Vehicles, and Cash separately

Demonstrates polymorphic method calls and formatted output

<h2><b>Sample Output![Screenshot 2025-05-14 141655](https://github.com/user-attachments/assets/53935659-5a04-4fa8-a220-f27f15f9d357)
![Screenshot 2025-05-14 141640](https://github.com/user-attachments/assets/d04a8d35-7eee-42f9-afff-9855bc3d04cb)
</b></h2>
