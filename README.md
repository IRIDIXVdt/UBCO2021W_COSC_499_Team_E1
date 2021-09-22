# COSC 499 Team Exercise 1

Welcome! This repository serves solely as part of an assignment for UBCO COSC 499 Team Exercise.
It consists of two classes:

  ## Main 
    We have code for running methods in the feature classes. This is where the main method locates.
  ## Feature 
```java
/*
Test Int Array: 50 5 19 4 14 45 31 12 53 19 
Test String Array: td mgDA wHsM gIggcMfADj mDGyh wurbu tgrlK BJANHxzBm prJkxAIr dNqwnN
/
```
  ### int arraySum(ArrayList<Integer> input):
    Given an ArrayList of intergers, we find the sum of it
```java
System.out.println("\nFeature 1 intArraySortDesc: "+Feature.intArraySortDesc(testIntArray));
  //outputs Feature 1 intArraySortDesc: [53, 50, 45, 31, 19, 19, 14, 12, 5, 4]
```
  ### long arrayProduct(ArrayList<Integer> input)
    Given an ArrayList of intergers, we find the product of it
```java
System.out.println("\nFeature 2 stringArraySortAsc: "+Feature.stringArraySortAsc(testStringArray)); 
  //outputs Feature 2 stringArraySortAsc: [BJANHxzBm, dNqwnN, gIggcMfADj, mDGyh, mgDA, prJkxAIr, td, tgrlK, wHsM, wurbu]
```
  ### ArrayList<Integer> intArraySortDesc(ArrayList<Integer> input)
    Given an ArrayList of intergers, we find sorted descending ArrayList of it
```java
System.out.println("\nFeature 3 arrayProduct: "+Feature.arrayProduct(testIntArray));    
  //outputs Feature 3 arrayProduct: 4484009880000
```
  ### ArrayList<String> stringArraySortAsc(ArrayList<String> input)
    Given an ArrayList of intergers, we find sorted ArrayList of it
```java
System.out.println("\nFeature 4 arraySum: "+Feature.arraySum(testIntArray));
  //outputs Feature 4 arraySum: 252
```
