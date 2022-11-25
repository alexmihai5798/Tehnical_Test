Feature: Youtube Player
  These tests will verify the functionality of the player

  Scenario: Valid pause button functionality
    Given I am on the player
    When I press the pause button
    Then The video should be paused

  Scenario: Valid fullscreen button functionality
    Given I am on the player
    When I press the fullscreen button
    Then The video should get on fullscreen

  Scenario: Valid mute button functionailty
    Given I am on the player
    When I press the volume button
    Then The video should get muted