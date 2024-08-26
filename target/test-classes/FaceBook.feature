@Create
Feature: Create the Facebook Account

Background: User Launch the Application 
Given Launch the Facebook Application  "https://www.facebook.com/"
Then Validate the Launched Application  "https://www.facebook.com/"
When User Clicks on Create Account

@onedimlist
Scenario: User gives information
When User enters the information with one dim list
|Vignesh|Sundaresan|9445528929|vickyabi|31|Aug|1996|Male|
And User Clicks on Sign-up list

@onedimmap
Scenario: User gives information
When User enters the information with one dim map
|username     |Vignesh   |
|surname      |Sundaresan|
|mobilenumber |9445528929|
|passwd       |vickyabi  |
|date         |31        |
|month        |Aug       |
|year         |1996      |
|gender       |Male      |
And User Clicks on sign-Up map

@multipletimes
Scenario Outline: User enters information multiple times
When user enters information multiple times "<username>" "<surname>" "<mobilenumber>" "<passwd>" "<date>" "<month>" "<year>" "<gender>"
And user clicks signupoutline

Examples: 
|username |surname    |mobilenumber|passwd  |date  |month|year|gender  |
|Vignesh  |Sundaresan |9445528929  |vickyabi|31    |Aug  |1996|Male    |
