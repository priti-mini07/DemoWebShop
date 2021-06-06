Feature: Demo Web page tab and link check

  @DemoShop 
  Scenario: Demo Web page tab and link validation
    Given user is on website landing page
    And user explores the tabs from the Categories section
      | Books             |
      | Computers         |
      | Electronics       |
      | Apparel & Shoes   |
      | Digital downloads |
      | Jewelry           |
      | Gift Cards        |
      | Tricentis         |
    And user navigate to the following tabs
      | Books             |
      | Computers         |
      | Electronics       |
      | Apparel & Shoes   |
      | Digital downloads |
      | Jewelry           |
      | Gift Cards        |
      | Register          |
      | Wishlist          |
      | Shopping cart     |
      | Log in            |
