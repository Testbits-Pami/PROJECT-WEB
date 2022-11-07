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
@ExistingPayGrade
Feature: Add an existing pay grade name
  As a Tester, I would like to verify the behaviour if user try to add an existing pay grade name into OrangeHRM

  @AddExistingPayGrade
  Scenario Outline: Title of your scenario outline
    Given I navigate to Admin Add Pay Grade page
    When I click Add button to add an existing pay grade
    And I enter the existing pay grade name <gradeName>
    And I try to save the existing pay grade name
    Then I verify the <invalidPayGradeNameMsg> message on the input and verify the input error attributes

    Examples: 
      | gradeName | invalidPayGradeNameMsg |
      | marhaen   | Already exists         |
