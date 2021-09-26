Feature: Urban Ladder

  Scenario: Testcase 1
    Given initialize browser
    And navigate to url
    And handle popup
    Then scroll untill stories is visible
    And close browser

  Scenario: Testcase 2
    Given initialize browser
    And navigate to url
    And handle popup
    Then click on stories button
    And click to view original source
    And close browser

  Scenario: Testcase 3
    Given initialize browser
    And navigate to url
    And handle popup
    Then click on stories button
    When user click on image
    Then display image and close image
    And close browser

  Scenario: Testcase 4
    Given initialize browser
    And navigate to url
    And handle popup
    Then click on stories button
    And user click on image
    Then user click on view product button
    And close browser

  Scenario: Testcase 5
    Given initialize browser
    And navigate to url
    And handle popup
    Then user click on search button
    And close browser

  Scenario: Testcase 6
    Given initialize browser
    And navigate to url
    And handle popup
    When user click on search button
    Then user enter data
    And close browser

  Scenario: Testcase 7
    Given initialize browser
    And navigate to url
    And handle popup
    When user click on search button
    And user enter data
    Then user checks if correct product is displayed
    And close browser

  Scenario: Testcase 8
    Given initialize browser
    And navigate to url
    And handle popup
    When user click on location button
    Then user opends new location window
    And close browser

  Scenario: Testcase 9
    Given initialize browser
    And navigate to url
    And handle popup
    When user click on sofa button
    And selects wooden sofa
    Then user selects filter options
    And close browser

  Scenario: Testcase 10
    Given initialize browser
    And navigate to url
    And handle popup
    When user search and select item
    And User adds items to compare
    Then add item to cart
    And close browser

  Scenario: Testcase 11
    Given initialize browser
    And navigate to url
    And handle popup
    When user selects study table
    Then add item to wishlist
    And close browser

  Scenario: Testcase 12
    Given initialize browser
    And navigate to url
    And handle popup
    When user click on order status
    Then user enter login details
    And close browser
  Scenario: Testcase 13
    Given initialize browser
    And navigate to url
    And handle popup
    When user click on gift card option
    And user select house warming option
    Then user enter price and click next
    And close browser




