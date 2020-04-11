@tagF
Feature: Working Title

  @tag1 @reg
  Scenario: Verify Home Page Loaded
    Given I open my Home Page
    Then Check the home page title is correct

  @tag2 @reg
  Scenario: Verify Home Page Loaded2
    Given I open my Home Page
    Then Check the home page title is correct2

  @tag3 @reg
  Scenario: Verify Home Page Loaded3
    Given I open my Home Page
    Then Check that the home page title is Welcome to iBusiness

  @tag4 @reg @smoke
  Scenario Outline: Verify Home Page Loaded4
    Given I open my Home Page
    Then Check that the home page title is <pageTitle>

    Examples:
    | pageTitle             |
    | Welcome to iBusiness  |
    | Welcome to iBusiness2 |

# you can do this but you want to keep test independent and concise ( Dont do this ) unless it is an end to end test
#
#  Scenario Outline: Verify Home Page Loaded4
#    Given I open my Home Page
#    Then Check that the home page title is <pageTitle>
#    When Click on button
#    Then Check that the login page title is <loginTitle>
#    When I enter username <username> and password <password>
#
#    Examples:
#      | pageTitle             | loginTitle  | username | password |
#      | Welcome to iBusiness  | login1      | us1      | pass1    |
#      | Welcome to iBusiness2 | login2      | us2      | pass2    |
