Feature: Login Feature

  Scenario: Test login with valid credentials
    Given User Navigates to Qlue Dashboard login page
    When User enters email as "prodtest@mailinator.com"
    And User enters password as "zv7tNTLfY0SaJ855zYDWHw=="
    And Click on Log in button
    Then User navigated to homepage
