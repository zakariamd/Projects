Feature: google search


  Scenario Outline: simple search
  
    Given I am on the google homepage
    When I enter seach "<term>"
    And I click on google seach button
    Then I receive related search results

    Examples: 
      | term             |
      | Quality Assurance| 
      | Software Testing |
