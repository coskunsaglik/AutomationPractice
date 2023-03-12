Feature: Movie suggestion feature
  As a user I should be able to get movies according to my preferences

  Scenario: Movies search
    Given I like "actions"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I go to homepage
    Then I should get right recommendation

  Scenario: Movie search datatable list
    Given I like {string}
      | actions   |
      | drama     |
      | cartoon   |
      | adventure |
    When I go to homepage
      Then I should get right recommendation

  Scenario: Movie search datatable map
    Given I like below favorite movie with certain type
      | actions | John Wick |
      | drama | Titanic |
      | cartoon | Tom&Jerry |
      | adventure | Tom Rider |
    When I go to homepage
    Then I should get right recommendation