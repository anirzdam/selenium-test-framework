# Selenium Test Framework

This is a Selenium-based test automation framework using Java and Maven, designed to run in GitHub Actions.

## Features
- Fully automated execution in GitHub Actions.
- Uses TestNG for test case management.
- Configurable through `config.properties`.

## Prerequisites
- No local setup required. Everything runs in GitHub Actions.

## How to Use
1. Clone the repository to your GitHub account.
2. Push changes to the `main` branch or create a pull request to trigger the tests.
3. View the test results in the "Actions" tab on GitHub.

## Project Structure
- `.github/workflows/selenium-tests.yml`: GitHub Actions workflow.
- `src/main/java`: Core framework logic.
- `src/test/java`: Test cases.
- `src/test/resources`: Configuration files.
