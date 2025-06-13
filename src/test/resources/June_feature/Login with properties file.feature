Feature: Login feature

  Scenario: login with properties file
    Given open application "test_env_url"
    When Enter username label "userName" as "username"
    And Enter password label "password" as "password"
    Then Click on button "login"
