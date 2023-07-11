Feature: Normal Search

  Scenario: Search Nintendo Switch
    Given User is in Home Page
    And User search a "nintendo switch" in search box
    When User select first option
    Then Validate item title should contain "Nintendo Switch"