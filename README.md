# Intgiral
#Author Jafeer
This is RestAssured based api testing sample project for testing intigral popcorn API's.
popcorn-api-rs-7.9.10
Steps:
Build:
Clone project : git clone https://github.com/jafsit/intigral-promotions.git

Import as maven project into IntelliJ IDE.
Navigate to project directory and Build project by running following command in terminal : mvn clean install.
install allure reporter for reporting

Execution:
1.To run test class : Right click on test class name or within test class and select Run ClassName.
src/test/java/com/restassured/intigral/tests/retrievepromotions/RetrievePromotionTest.java
2.To run individual test : Right click on test case name and select Run TestName  -Test Name:RetrieveUserTest
3.To run from command line -input command -"mvn clean test"

Generate Reports:
Run following command to view allure reports: allure serve.
