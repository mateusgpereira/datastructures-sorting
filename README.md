# Data Structures & Sorting
> Implementation of most common data structures and sorting algorithms.

I was taking some time to practice and learn more about data structures and sorting algos.  
Then I decide to create this repo with some notes, examples and short explanations.

## Data Structures

Comming soon ...

## Sort

We almost never would have to implement our own sorting algorithms.  
Most of them are already builtin in the languages or libraries that we use.  
But it's important to understand how to use and which one to use according   
to the problem we are trying to solve.

### Bubble Sort
Consists and comparing a pair of values and swaping them if the first is greater than the second.

Is not very efficient, I don't see it been using in real projects, only for learning purposes.

Time complexity  **O(n²)**  
Space complexity  **O(1)**

*Examples:*  
[Java](sort/java/src/main/java/BubbleSort.java)  
[Tests](sort/java/src/test/java/BubbleSortTest.java)
```bash
cd sort/java/
mvn -Dtest=BubbleSortTest test
```  
<br>

[JavaScript](sort/js/bubble-sort.js)  
[Tests](sort/js/bubble-sort.test.js)
```bash
cd sort/js/
yarn test -- bubble-sort.test.js
``` 