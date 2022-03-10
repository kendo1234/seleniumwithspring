# Selenium with Spring and Cucumber

Using Spring annotations to wire together a selenium suite. Taken from this tutorial - https://www.swtestacademy.com/selenium-spring-boot-cucumber-junit5-project/

## Usage

```bash
mvn clean install -Dcucumber.glue="org.example.seleniumcucumberspring.cucumber.steps" -Dcucumber.plugin="com/swtestacademy/springbootselenium/cucumber/features"
