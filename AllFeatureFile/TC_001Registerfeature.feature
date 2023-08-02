@EndToEndTesting
Feature: Test Guru99 application

  Scenario: Test register page of guru99
    Given User open register page url on "chrome" browser
    Then User enter Firstname lastname phone email
      | Kaustubh | Kadu | 744788678| kaustubh@gmail.com |
    And user enters address city state pincode and country
      | pune | Pune | Maharashta | 111111 | INDIA |
    And User enter username and password and confirm password and click on submit button
      | Kaustubh123 | Kaustubh@123 | Kaustubh@123 |


