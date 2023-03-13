@dbQuery
Feature: Database Query

  Background:
    Given user connects to the database

    Scenario: user verified number of student table rows
      When user connects to the student table
      Then print the total row count and verify

    Scenario: user verified first row in student table
      When user connects to the student table
      Then print first student name and verify

    Scenario: user verified last row in student table
      When user connects to the student table
      Then print last student name and verify

    Scenario: user verified spesific row in student table
      When user connects to the student table
      Then print spesific student name and verify