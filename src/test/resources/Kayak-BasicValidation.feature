Feature: Kayak Basic Validation
  ##Background runs before each scenario
  Background:Navigates to Kayak Homepage
    Given User is on "kayak.com" homepage

  Scenario: Title and URL verification
    Then User should see the URL "https://www.kayak.com/"
    And User should see the title "Search Flights, Hotels & Rental Cars | KAYAK"

    Scenario: Negative testing for the empty search field
      When User click the search button without entering anything
      Then Verify "Please pick a pick-up location." error message is displayed

    Scenario: Enter the destination, dates and click the search button
      When User enters destination as "New York, NY"
      And User enters pick up date and drop off date
      And User clicks the search button
      Then User will be redirected to the result page
