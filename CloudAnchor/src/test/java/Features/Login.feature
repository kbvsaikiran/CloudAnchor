Feature: Cloud Anchor Application Login Feature
  Scenario: To Check whether the user is able to login to the cloud anchor Application or not
    Given User should Open Cloud Anchor Application By using url "http://ec2-65-1-251-42.ap-south-1.compute.amazonaws.com:5010/#/auth/login"
    When User enter the "alpha@cognizant.com" and "pass@123"
    And User click on login button
    Then Cloud Anchor Application Home Page should opened
    And Close the Browser




