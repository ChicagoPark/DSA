# DSA
Data Structure &amp; Algorithm in Python

# Content

## [1] Different Types

### [1-1] Types of Data Structures

<img width="950" alt="IMG" src="https://user-images.githubusercontent.com/73331241/158809021-70c1957d-a0fb-4337-af40-af869136e25e.png">


### [1-2] Types of Algorithms

> Simple Recursive Algorithms
> 
> Divide and Conquer Algorithms
> 
> Dynamic Programming Algorithms
> 
> Greedy Algorithms
> 
> Brute Force Algorithms
> 
> Randomized Algorithms


## [2] Recursion

> Recursion: A way of solving a problem by having a function calling itself.

> Why Recursion?
> * [1] It helps break down big problems into smaller ones and easier to use.
> * [2] The prominent usage of recursion in data structures like trees and graphs.
> * [3] It is used in many algorithms (divide and conquer, greedy and dynamic programming).

> When to choose recursion?
> * [1] When we can easily breakdown a problem into similar subproblem.
> * [2] When we are fine with extra overhead (both time and space) that comes with it.
> * [3] When we need a quick working solution instead of efficient one.
> * [4] When traverse a tree
> * Design an algorithm to compute n th
> * Write code to list the n ...
> * Implement a method to compute all.
> * Practice

> When to avoid recursion?
> * If time and space complexity matters for us.
> * Recursion uses more memory. If we use embedded memory.
> * Recursion can be slow.

### [2-1] Property of Recursion

> 1. Performing the same operation multiple times with different inputs
> 2. In every step we try smaller inputs to make the problem smaller.
> 3. `Base condition` is needed to stop the recursion, otherwise infinite loop will occur.
> 4. All the recursive algorithms can be implemented through `iterative solutions`

### [2-2] How Recursion works?

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159006058-43a3a05e-3c2b-4b54-9f59-90d5b24bf2dc.png">

> 1. A method calls itself
> 2. Exit from infinite loop

### [2-3] Recursive vs Iterative?

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159007306-8b25f583-609b-449b-8e1f-c53d109c774e.png">

`We usually implement in the cases we know that a problem can be divided into similar sub problems.`

### [2-4] `How to write recursion in 3 steps?`

#### Step 1: Recursive case - the flow
```bash
e.g) n! = n * (n-1)!
=> return n * factorial(n-1)

and use it for a method calls part
```

#### Step 2: Base case - the stopping criterion
```bash
#1! = 1
```

#### Step 3: Unintentional case - the constraint


```python
def factorial(n):
    assert n >=0 and int(n) == n, 'The number must be postitive integer only!'
    if n == 1:
        return 1
    else:
        return n* factorial(n-1)
```

## [3] Big O
> Big O is the language and metric we use to describe the efficiency of algorithms.

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159118600-aae6d54c-c041-47b1-b74d-7ac5e41371a6.png">

### [3-1] Algorithm run time complexities

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159118671-933b8eb1-3fd7-47d2-8059-ccec38eb4452.png">

O(logN): When we look some value in sorted array, we can select one value and compare with target number, and we can reduce the considering area by two.

### [3-2] Space Complexity
> Space Complexity is necessary `extra` area.

* Space complexity: O(n)

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159119580-0b113d38-6001-420d-9b39-90e5afce7ba2.png">

* Space complexity: O(1)

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159119581-61aed1ae-2916-4fed-ae6c-3dd10d4bd945.png">


### [3-3] Measure the Big O

* Basic Measurement

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159121173-98d8b2d4-16e4-4bcc-b9f2-1c9aa11c2c36.png">

* Measure the single resursive code

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159121730-b131e64e-1680-45e5-add0-08598e7516a8.png">


* Measure the multiple resursive code

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159121731-ea47551b-e819-4d80-9b21-176736b51ab8.png">

## [4] Arrays
<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159123723-5dc342e8-1c0d-4e4e-ab09-ec7d2c627f8d.png">

> * In computer science, an array is a data structure consisting of a `collection of elements which have same type`, each identified by at least one array index or key. An array is stored such that the position of each element can be computed from its index by a mathematical formula.

> * When do we need an Array?
>   * To store multiple variables of same data type

> * When to avoid using an Array?
>   * When we need to use different types of data.
>   * When the memory area is matter.


### [4-1] Array in Python

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159124283-c99bacf5-84c0-49b2-b386-e227f4fbbe64.png">

### [4-#] Question about Array
* When we need bigger array, what we need to do?
    * Make a bigger array and then copy from the smaller array to the bigger one.

## [5] Tuple
> A tuple is an `immutable sequence` of Python objects
> 
> Tuples are also comparable and hashable

## [6] Lists
> A mutable, or changeable, ordered sequence of element

`Array VS List`
> * Array
> 
>       Stronger in the arithmetic operations (e.g. Numpy)
> * List
> 
>       List is flexible in 'data types'

```python
# * operation
print(list)   # [1,2,3]
print(list*4) # [1,2,3,1,2,3,1,2,3,1,2,3]

# + operation: possible to be operated between list to concatenate
```

## [7] Dictionary
> A dictionary is a collection which is unordered, changeable, and indexed.

### [7-1] Useful methods in dictionary
* pop(key, default_value) and popitem()
   * pop the 'Key', but if there is no key in the dictionary, it would return 'Default_value'
   * popitem(): pop the last element

* keys() and values()
   * return the list of keys and values

* .update(Another_Dictionary)
   * concatenate two dictionaries
   
> When we use the 'pop' function in dictionary, we can decide among 'popitem()' and 'pop' according to our purpose.



## [8] Linked List
> A form of a sequential collection and it does not have to be in order. A linked list is make up of independent nodes that may contain any type of data
> and each node has a reference to the next node in the link

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160218756-76a460aa-2402-4c1c-86b4-fd94615cb3d8.png">

* the last node with NULL reference is important to figure out the end of the linked list

### [8-1] Difference between Linked Lists vs Arrays
* Elements of linked list are `independent objects`.
* Variable size - the size of a linked list is `not predefined`/
* `Insertation and removals` in linked list are `very efficient`.
* Random access - accessing an element is very efficient in arrays. `However, linked list cannot access specific value directly.` Should start from the head sequentially.

## [##] Recursion Realization
1. Think about the flow (n, n-1)
2. 최종결과에 flow 이외에 추가적으로 더해져야할 연산이 있는지.=> else 의 return 문에서 + 연산자를 추가할지말지 결정하게 된다.

## [##] Chicago Realization
1. local variable can be used from the belonged function whether we initialize the value from the conditional argument.

<!--
[3-2-1] Add VS Multiply

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159120259-06f6bc06-2a11-4c1c-8d47-233e439a6dc3.png">

-->
