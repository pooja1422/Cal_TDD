# String Calculator TDD Kata

This project is an implementation of the String Calculator TDD Kata in Java. The goal is to create a simple string calculator that can handle various delimiters, new lines, and throw exceptions for negative numbers using Test-Driven Development (TDD) practices.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

To build the project and run the tests, use the following Maven command:
mvn clean install

### Usage
The StringCalculator class provides a single static method add which takes a string of numbers and returns their sum.

### Features
Empty String: Returns 0

Input: ""
Output: 0
Single Number: Returns the number itself

Input: "1"
Output: 1
Two Numbers: Returns the sum of the numbers

Input: "1,2"
Output: 3
Multiple Numbers: Returns the sum of all numbers

Input: "1,2,3,4"
Output: 10
New Line Delimiters: Handles new lines between numbers

Input: "1\n2,3"
Output: 6
Custom Delimiters: Supports different delimiters specified in the format //[delimiter]\n[numbers...]

Input: "//;\n1;2"
Output: 3
Negative Numbers: Throws an exception with a message listing all negative numbers

Input: "1,-2,3,-4"
Output: Exception with message "negative numbers not allowed: -2, -4"
