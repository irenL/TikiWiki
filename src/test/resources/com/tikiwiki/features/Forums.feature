#Author: ilyas
@forums
Feature: Create and Delete Forums

  Background: Given I login to TikiWiki

  @create_forums
  Scenario Outline: Creating new forums by reading from the tables
    When I click to forums menu
    And I see the menu options for forums:
      | List Forums  |
      | Admin Forums |
    And I create new forums
      | Name    | Description | Mod Grp1  |
      | Forum1  | Desc1       | Mod Grp1  |
      | Forum2  | Desc2       | Mod Grp2  |
      | Forum3  | Desc3       | Mod Grp3  |
      | Forum4  | Desc4       | Mod Grp4  |
      | Forum5  | Desc5       | Mod Grp5  |
      | Forum6  | Desc6       | Mod Grp6  |
      | Forum7  | Desc7       | Mod Grp7  |
      | Forum8  | Desc8       | Mod Grp8  |
      | Forum9  | Desc9       | Mod Grp9  |
      | Forum10 | Desc10      | Mod Grp10 |
    Then I must be able to see them in the forums list table
    Then I logout

  @delete_forums
  Scenario: Deleting forums from the
    When I click to forums menu
    And I see the menu options for forums:
      | List Forums  |
      | Admin Forums |
    When I delete forums
    Then I verify forums are not in the List
