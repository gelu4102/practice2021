Feature: as a user i should only be select only one check box

  Scenario: user is able to click only one check box
    Given user is on the landing page
    When user click on the second check box
    Then user should be able to see only the second check box is selected