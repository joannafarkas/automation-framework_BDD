@contact-us

Feature: WebDriver University - Contact Us Page

Background:
 Given I access the webdriver university contact us page

  Scenario Outline: Validate Successful Submission - Unique Data  
    When I enter a unique <firstname> first name
    And I enter a unique <lastname> last name
    And I enter a unique <email> address
    And I enter a unique <comment> description
    And I click on the submit button
    Then I should be presented with a successful contact us submission message
    
    Examples: 
      | firstname     | lastname     | email              |comment     |          
      | Joanna        | Nowak        | email@wp.com       |comment one | 
      | Barbrara      | Kowalska     | email@gmail.com    |comment two |
  
  Scenario: Validate Successful Submission - Specific Data
    When I enter a specific first name Joanna
    And I enter a specific last name Kowalska
    And I enter a specific email address j.kowalska@test.com
    And I enter a specific comment "Hi! How are you?"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message
