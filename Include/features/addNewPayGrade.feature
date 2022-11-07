#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@PayGrade
Feature: Successfully add new pay grade
  As a user, I would like to login into OrangeHRM and be able to add a new pay grade

  @AddNewPayGrade
  Scenario Outline: Add New Pay Grade in Admin Page
    Given I successfully navigate to Pay Grades Page
    When I click Add button on Pay Grades page to add a new pay grade
    And I enter a new pay grade name <gradeName>
    And I click Save button to save the pay grade name
    Then I successfully add a new pay grade name and bring to edit pay grade page
    When I click Add button on the currencies section to add a new currency for the pay grade
    And I choose MYR - Malaysian Ringgit for the currency of the pay grade
    And I enter minimum salary <minSalary> for the pay grade and I enter maximum salary <maxSalary> for the pay grade
    And I click Save button to save the currency for the pay grade
    Then I successfully added the new currency and verify the currency <verifyCurrency> in the currency records
    When I click Cancel button on the edit pay grade section
    Then I verify the new pay grade name <gradeName> on the pay grade records

    Examples: 
      | gradeName | minSalary | maxSalary | verifyCurrency    |
      | Marhaen   |      1000 |      2000 | Malaysian Ringgit |
