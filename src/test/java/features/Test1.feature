Feature: Validating today deal on home page

  @Test1 @Regression
  Scenario: Successful Login and Logout
    Given Launch Google using Chrome browser and https://www.saucedemo.com/ url
    Then Input standard_user on Username inputbox
    Then Input secret_sauce on Password inputbox
    Then Click on LoginButton link
    Then Click on ThreeLink link
    Then Click on Logout link


  @Test2
  Scenario: Failed Login
    Given Launch Google using Chrome browser and https://www.saucedemo.com/ url
    Then Input locked_out_user on Username inputbox
    Then Input secret_sauce on Password inputbox
    Then Click on LoginButton link
    Then I validate error message is displayed
    Then Closed the driver

    @Test4
    Scenario: Error User
      Given Launch Google using Chrome browser and https://www.saucedemo.com/ url
      Then Input error_user on Username inputbox
      Then Input secret_sauce on Password inputbox
      Then Click on LoginButton link
      Then Click on SauceLabBikeLight link
      Then Click on AddToCart link
      Then Click on ShoppingCartContainer link
      Then Click on Checkout link
      Then Input Test1 on FirstName inputbox
      Then Input Last1 on LastName inputbox
      Then Input 65689 on ZipCode inputbox
      Then Click on Continue link
      Then Click on Finish link
      Then I validate checkout page is still displayed
      Then Closed the driver


  @Test5
  Scenario: Browser Refresh
    Given Launch Google using Chrome browser and https://www.saucedemo.com/ url
    Then Input standard_user on Username inputbox
    Then Input secret_sauce on Password inputbox
    Then Click on LoginButton link
    Then Click on SauceLabBoltTShirt link
    Then Click on AddToCart link
    Then Click on ThreeLink link
    Then Click on Reset link
    Then I refresh browser
    Then Click on SauceLabBoltTShirt link
    Then I validate Remove button is not displayed
    Then I validate AddToCart button is enabled
    Then I validate the Cart size is 0
    Then Closed the driver

  @Test6
  Scenario: Performance User
    Given Launch Google using Chrome browser and https://www.saucedemo.com/ url
    Then Input performance_glitch_user on Username inputbox
    Then Input secret_sauce on Password inputbox
    Then Click on LoginButton link
    Then Click on SauceLabBagPack link
    Then Click on AddToCart link
    Then Click on ShoppingCartContainer link
    Then Click on ThreeLink link
    Then Click on AllItem link
    Then Click on RemoveSauceLabBagPack link
    Then Click on ThreeLink link
    Then Click on Logout link

  @Test7
  Scenario: Bonus
    Given Launch Google using Chrome browser and https://www.saucedemo.com/ url
    Then Input performance_glitch_user on Username inputbox
    Then Input secret_sauce on Password inputbox
    Then Click on LoginButton link
    Then Click on Twitter link
    Then I switch back to main window
    Then Click on Facebook link
    Then I switch back to main window
    Then Click on LinkedIn link
    Then I switch back to main window
    Then I switch to Facebook tab and close it
    Then I switch back to main window
    Then I switch to Twitter tab and close it
    Then I switch back to main window
    Then Click on ThreeLink link
    Then Click on Logout link
    Then I switch to LinkedIn tab and close it





