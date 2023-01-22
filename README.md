# Lingoda_QATask

This test automation framework is created as a solution for the `QA task` of `Lingoda`. Test scenarios are written in `Gherkin language` according to the task. The codes are written in `Java` programming language with the implementations of `object-oriented-programming (OOP)` concepts. `Page object model (POM)` design pattern is also implemented in the framework.

## Application under test
http://todomvc.com/

## Info about the framework

Codes are written as dynamic as possible to increase the `readability`, `re-usability` and `maintainability` of the framework. For example;

* `Google Chrome` is default browser for now but it can be easily changed by updating `configuration.properties` file,
* The website to navigate can be updated through `Todo.feature` file (`src/test/resources/features/ToDo.feature`) or `configuration.properties` file,
* User can decide on the `tab` dynamically through `Todo.feature` file,
* User can select `any framework` to navigate by only changing its name on `Todo.feature` file,
* It is asked to create `2` to-do items, but user can decide on the number of items by only changing corresponding int value in `Todo.feature` file,
* It is asked to edit `2nd item` as a bonus, but now user can edit any item that s/he wants,
* To-do items are generated by `Java Faker` library, but it can be also retrieved from `configuration.properties` file. Edit option is done like this as an example.

## What can be done as the next step?

* To-do items can be retrieved from an excel sheet with the help of `Apache_POI` library,
* Screenshot can be generated for each step,
* GitHub Actions can be integrated to the framework.

## Reporting

Reports are generated by `Cucumber` automatically under `/target/default-html-reports` package. Beside that simple reporting, more detailed and fancy reporting is also used in the framework by adding `maven-cucumber-reporting` plug-in inside the `pom.xml` file. Those reports can be reached under `/target/cucumber-html-reports`. To able to get those fancy reports, the code should be executed through maven lifecyle or from the terminal with the command of `mvn verify`. In the case of test failures, a screen-shot of the related page is embedded into the report.

## Prequisites

* `Java 18 SDK` should be installed
* `IntelliJ IDE` (any IDE is fine) 
* `Maven` as buid management tool
* Browser drivers are fetching automatically from `bonigarcia` dependency, so no need to identify the browser version



## How to execute

* https://github.com/ratilgan/Lingoda_QATask/
* Use the following command to clone the project `git clone https://github.com/ratilgan/Lingoda_QATask/`
* Use the following command to run the project ` mvn verify -D"cucumber.options"="--tags @test"`

## Tech stack

* Java 18
* Maven
* Cucumber 7.1.0
* JUnit 7.1.0
* Selenium Webdriver 4.1.3
* IntelliJ
* GitHub



