# Count The Digits
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
The CountTheDigits is a recursive Java program that calculates the number of digits in an integer. The program repeatedly divides the input number by 10 to count how many digits it contains. It returns 1 for single-digit numbers and recursively counts the digits for multi-digit numbers.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/CountTheDigits.git 
```

- Navigate to the project directory: 
```Java
- cd CountTheDigits 
```
- Compile the CountTheDigits.java file: 
```Java
- javac CountTheDigits.java 
```
- Run the program: 
```Java
- java CountTheDigits
```

## Application Usage
The program expects a single integer input and outputs the number of digits in that integer.  Example: 

```Java
Input: 12345 
```
```Java
Output: 5 
```
For the input 12345, the program will return 5 because the number contains 5 digits.  

Input: 
```Java
0 
```

Output: 

```Java
1 
```

For the input 0, the program returns 1 because 0 is considered a single-digit number.

## Contributions
Eric Keeton

## Test Commands
To test the program, provide different integer inputs (both positive and negative) and verify that the correct number of digits is output.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)