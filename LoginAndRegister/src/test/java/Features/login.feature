@Test
Feature: PomPractise

  Scenario Outline: Login
    Given Open the Homepage
    When Send the UsernameAndPassword "<userName>" and "<password>"
    Then LogoutOfApp

    Examples:
      | userName      |  | password |
      | Fatma Karakus |  | 12345    |


  Scenario Outline: Register
    Given Open the Homepage
    When Send the UsernameAndPassword "<userName>" and "<password>"
    Then Select the Country
    Then Give the Adress "<adress>"
    Then Give the email "<email>"
    Then Give the Phone "<phone>"
    Then Click the Save Button
    Then Click the Logout Button

    Examples:
      | userName      | password | adress     | email          | phone      |
      | Fatma Karakus | 12345    | Test Adres | test@gmail.com | 5415414141 |



