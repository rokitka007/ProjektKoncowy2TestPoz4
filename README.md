# Automated test example in Java with Cucumber and Selenium WebDriver #

This project is an example of UI automated functional test for Google home page and search using Selenium and Cucumber.

Test scenarios are described in the feature files located here ./src/test/resources/com/automatedtest/sample.

For more info about this project, read the article ["UI automated test project example with Selenium, Cucumber and Java"](https://medium.com/@lucie.duchemin/ui-automated-test-project-example-with-selenium-cucumber-and-java-b33788bd11c4)

## Installation ##

You need to have [Java 8 JDK](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) installed along with [maven](https://maven.apache.org/).

To run the tests locally with Chrome, install ChromeDriver from [here](http://chromedriver.chromium.org) and add its location to your system PATH.

To run the tests locally with Firefox, install GeckoDriver from [here](https://github.com/mozilla/geckodriver/releases) and add its location to your system PATH.

To install all dependencies, run 

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```

By default, tests will run on Chrome. To change that, specify `-Dbrowser={browser}` where `{browser}` is either `chrome` or `firefox`

You can also select specific scenarios to execute using `-Dcucumber.options="--tags @your_tag"`. More info about tags and how to combine them [here](https://github.com/cucumber/cucumber/tree/master/tag-expressions).
