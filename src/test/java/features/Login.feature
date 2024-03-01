@login
Feature: Login is successfully executed

  Scenario Outline: As a user I want to check if login and password are working correcty
    Given I open login page
    When I enter a <login> and <password>
    And I press login button
    Then I should see <loginValidationMessage> 

    Examples: 
      | login     | password     | loginValidationMessage |              
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver1   | validation failed      |
