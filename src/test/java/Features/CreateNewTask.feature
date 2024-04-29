Feature: create task in sales console with different status and validate

@smoketest
Scenario: Create New Task
Given create new task with stage not started
Then verify task details for status not started