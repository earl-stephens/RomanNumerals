# Roman Numerals

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Sonarlint](https://img.shields.io/badge/SonarLint-CB2029?style=for-the-badge&logo=sonarlint&logoColor=white)
![Maven](https://badgen.net/badge/icon/maven?icon=maven&label)
![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)


## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)  
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Coverage](#coverage)  
- [Authors](#authors)  

## Introduction

This project was a LeetCode challenge.  The concept is to take a string of Roman numerals and convert them into string of digits. 

There were several things I wanted to use in this challenge for my own practice.  One was the use of an enum class.  Since the values of the Roman numerals (like X, V, M) are constant, I created a Numeral enum class with these numerals.  I also assigned them their respective values and created a `getIntValue()` method.

There are only certain letters used for Roman numerals.  I added a try/catch block for an IllegalArgumentException to catch any letters that were not Roman numerals.  I also wanted to practice setting up and running a unit test to check for the exception being thrown.

Converting Roman numerals can be tricky because in some case, such as IV, the letters act as a pair.  So, the program has to check not only individual values of the letters, but also check for these pairs.  I initially tried to do this using arrays, but could not find a viable way to make it work.  Instead, I used a series of if statements to search for these specific pairs.  Once the pairs were dealt with, I then iterated through the remaining letters and grabbed their integer value (from the enum method). 

## Installation

Clone this repo from Github and install it on your machine

## Getting Started   

Once the repo has been cloned, perform a Maven install (from the CLI: `mvn install`).  Next, run the JUnit tests to verify there are no failures.  This program does not have a main method to run.

## Further Improvements

I would like to find a way to make the search for each of the letter pairs more elegant than just having a series of if statements.

## Built With

OpenJDK 17.0.6

JUnit 5  

Eclipse 2020-06  

## Coverage

## Authors

[Earl Stephens](https://github.com/earl-stephens)
