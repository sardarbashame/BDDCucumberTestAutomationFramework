Feature: create opportunity in sales console with different stages and validate


Scenario: Create Prospecting Stage Opportunity
Given create new opportunity with stage prospecting
Then verify opportunity details for stage prospecting

Scenario: Create Qualification Stage Opportunity
Given create new opportunity with stage qualification
Then verify opportunity details for stage qualification

@smoketest
Scenario: Create Needs Analysis Stage Opportunity
Given create new opportunity with stage needs analysis
Then verify opportunity details for stage needs analysis

Scenario: Create Value Preposition Stage Opportunity
Given create new opportunity with stage value proposition
Then verify opportunity details for stage value proposition

@regressiontest
Scenario: Create Perception Analysis Stage Opportunity
Given create new opportunity with stage perception analysis
Then verify opportunity details for stage perception analysis
