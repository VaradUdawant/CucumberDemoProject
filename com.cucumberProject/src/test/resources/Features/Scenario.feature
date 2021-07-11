Feature: Testing my Cucumber Framework

  Background: To launch the application and User Login
    Given User is launching the application
    When User login the module using username is "admin@tecdiary.com" and password is "12345678"
    And User click on Login button

  Scenario: To Check User able to add product
    Given User Click on Products
    When Select Add Products from drop down list
    And User Select Type is "Service" BarCode is "Code25" Category is "General" TaxMathod is "Inclusive" Using DropDwnSelect Menu
    And User Enter Name is "Desktop" Product code is "13" Price is "25000" ProductTax is "7" Details is "Assembled Desktop" AddFile is "C:\Users\Dell\Pictures\desktop1.jpg" Info Using SendKeysMethod
    And User Click on AddProducts button
    Then User logout the application

  Scenario: To check User able to add sales
    Given User click on Sales
    When Select add sales from sales
    Then user logout the application
