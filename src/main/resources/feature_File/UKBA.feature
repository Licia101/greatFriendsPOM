@UKBA

Feature: UKBA


  @UKBA1
  Scenario Outline: Nationalities coming to Uk for Study that do not require visa
    Given I am on the UKBA website
    When I choose "<CountryName>" nationality
    And I press on Continue button
    And I select "<Reason>" as for coming to the Uk
    And I press on Continue button
    And I choose option of Longer than 6 months
    And I press on Continue button
    Then I should be informed that "<Message>"
    Examples:
      | CountryName | Reason | Message                               |
      | Russia      | Study  | You’ll need a visa to study in the UK |
      | Morocco     | Study  | You’ll need a visa to study in the UK |
      | Ukraine     | Study  | You’ll need a visa to study in the UK |




#  @UKBA2
#  Scenario Outline: Nationalities coming to Uk for Tourism do not require visa
#    Given I am on the UKBA website
#    When I choose "<CountryName>" nationality
#    And I press on Continue button
#    And I select "<Reason>" as for coming to the Uk
#    And I press on Continue button
#    And I choose option of Longer than 6 months
#    And I submit the form
#    Then I should be informed that "<Message>"
#    Examples:
#      | CountryName | Reason  | Message                                    |
#      | Japan       | tourism | You will not need a visa to come to the UK |
#      | Canada      | tourism | You will not need a visa to come to the UK |
#      | Australia   | tourism | You will not need a visa to come to the UK |
#
#
#
#
#  @UKBA3
#  Scenario Outline: 4_Country and Study with Examples
#    Given I am on the UKBA website
#    And I provide a nationality of "<CountryName>"
#    When I click on Continue button
#    And I select the "<reason>"
#    And I click on Continue button
#    And I state that I intend to stay for more than 6 months
#    And I click on Continue button
#    Then I should be informed that "<Message>"
#    Examples:
#      | CountryName | reason | Message                               |
#      | Japan       | Study  | You'll need a visa to study in the UK |
#      | Australia   | Study  | You'll need a visa to study in the UK |
#      | Canada      | Study  | You'll need a visa to study in the UK |
#      | USA         | Study  | You'll need a visa to study in the UK |