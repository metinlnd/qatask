@test
Feature: Solution for the QA Task
  Scenario: Creating a ToDo list
    Given the user navigates to the "landingPage"
    And clicks the "JavaScript" tab
    And selects the framework as "Polymer"
    When the user adds 2 ToDo items
    And edits the item 2