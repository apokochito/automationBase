@GET
  Feature: This is a basic get feature file

    Background:
      Given I am working in "TEST" environment
      And I am targeting "ApiName" secured service

      ################ HAPPY PATH #####################

    @HAPPY-PATH @REGRESSION @s1
    Scenario: Get valid resource with uppercase
      Given I need a valid random resource
      And The resource path must be updated using uppercase
      When I send a request to retrieve a valid resource
      Then The response status code should be 200
      And The response should be validated

    @HAPPY-PATH @REGRESSION @s2
    Scenario: Get valid resource with lowercase
      Given I need a valid random resource
      And The resource path must be updated using lowercase
      When I send a request to retrieve a valid resource
      Then The response status code should be 200
      And The response should be validated

    @HAPPY-PATH @REGRESSION @s3
    Scenario: Get valid resource with a number value
      Given I need a valid random resource with a number value
      And The resource path must be updated with a number value
      When I send a request to retrieve a valid resource
      Then The response status code should be 200
      And The response should be validated

    @HAPPY-PATH @REGRESSION @s4
    Scenario: Get valid resource with two characters
      Given I need a valid random resource with two characters
      And The resource path must be updated with two characters
      When I send a request to retrieve a valid resource
      Then The response status code should be 200
      And The response should be validated

    @HAPPY-PATH @REGRESSION @s5
    Scenario: Get all valid resources
      Given I need all resources
      And The resource path must be updated to get all resources
      When I send a request to retrieve all resources
      Then The response status code should be 200
      And The response should be validated

      ################ BAD PATH #####################

    @BAD-PATH @REGRESSION @s6
    Scenario: Get invalid resource with special characters
      Given I need a valid random resource
      And The resource path must be updated using a special character
      When I send a request to retrieve a response
      Then The response status code should be "Not Found"

    @BAD-PATH @REGRESSION @s7
    Scenario: Get invalid resource that database does not contain it
      Given I need a valid random resource
      And The resource path must be updated using a non exist resource
      When I send a request to retrieve a response
      Then The response status code should be "Not Found"

    @BAD-PATH @REGRESSION @s8
    Scenario: Get invalid resource with a blank space
      Given I need a valid random resource
      And The resource path must be updated with a blank space
      When I send a request to retrieve a response
      Then The response status code should be "Bad Request"

    @BAD-PATH @REGRESSION @s9
    Scenario: Get invalid resource with a long String
      Given I need a valid random resource
      And The resource path must be updated with a long String
      When I send a request to retrieve a response
      Then The response status code should be "Not Found"

    @BAD-PATH @REGRESSION @s6
    Scenario: Get invalid resource with two words
      Given I need a valid random resource
      And The resource path must be updated with two words
      When I send a request to retrieve a response
      Then The response status code should be "Not Found"