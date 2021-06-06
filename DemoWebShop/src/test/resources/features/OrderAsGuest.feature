Feature: Order Placement as Guest

  @DemoShop
  Scenario: Order Placement as Guest
    Given user is on website landing page
    And user navigate to the following tabs
      | Books |
    And user adds "Health Book" to cart
    #And user validates the success message
    Then user clicks on the link "Shopping Cart"
    And user selects the Terms n Conditions
    And user clicks on "Checkout" button
    Then user selects Checkout as Guest
    And user provides the below address details for shipping
      | First name | Steven         |
      | Last name  | Lemmer         |
      | Country    | Australia      |
      | State      | Other (Non US) |
      | Address 1  | Queen Street   |
      | City       | Brisbane       |
      | Zip Code   |           4000 |
      | Phone No   |     0468756676 |
      | Email      | abc4@gmail.com |
    And user clicks button "Continue"
    And user clicks button "Shipping Address Continue"
    And user clicks button "Shipping Continue"
    And user clicks button "Payment method Continue"
    And user clicks button "Payment Info Continue"
    And user clicks button "Confirm"
    Then the order is successfully placed
