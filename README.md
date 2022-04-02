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
> * [1] It helps `break down big problems` into smaller ones and easier to use.
> * [2] The prominent usage of recursion in data structures like `trees and graphs`.
> * [3] It is used in many algorithms (divide and conquer, greedy and dynamic programming).

> When to choose recursion?
> * [1] When we can easily breakdown a problem into similar subproblem.
> * [2] When we are fine with extra overhead (both time and space) that comes with it.
> * [3] When we need a quick working solution instead of efficient one.
> * [4] When traverse a tree


> When to avoid recursion?
> * If time and space complexity matter for us.
> Recursion uses more memory. If we use embedded memory.
> Recursion can delay the process.

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

            When we analyze list recursively, len(LIST) should be the first stopping criterion

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

* Singly: the last node with NULL reference is important to figure out the end of the linked list
 
* Circular: the last node with HEAD reference is important to figure out the end of the linked list

### [8-1] Types of Linked Lists

> `Singly Linked List`: Connect through the next reference
> 
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230009-97e44c4b-ccf6-4ae7-98d6-71037f910f31.png">


> `Circular Singly Linked List`: the reference of last node is not the NULL, but it has the address of starting node.
> 
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230010-772a8ca1-52dc-416d-996b-fefdc43db1a5.png">
> 
> Application of this list: we can use it in the game rotation.

> `Doubly Linked List`: Each node has two references
> 
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230104-aad374b4-f943-44e0-8613-3d7411e95c0c.png">
> 
> Application of this list: Music Application(previous song and next song)

> `Circular Doubly Linked List`: the reference of last node is not the NULL, but it has the address of starting node.
> 
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230167-2f8db1b3-29a4-4e76-83c7-30d44d51a7fb.png">
> 
> Application: Inside of the Finder on Mac

### [8-2] Linked List in Memory

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230470-76f05ede-ab30-4715-836a-7fd2943a67e3.png">

### [8-3] Creation of Singly Linked List

* [1] Create Head and Tail nodes, initalized with None

* [2] Create a blank Node Class and assign a value to it and reference to NULL

* [3] Link Head and Tail with these Node

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230952-b37175f5-1afc-4f87-8de1-15edda567ddd.png">

### [8-4] Delete the node in Singly Linked List

`focus on previous node's reference variable of the deleting node`

##### [Three cases]
> 1. delete the first node (there is two cases (1. there is just one node in the list(self.head == self.tail)|| (2. normal linked list))
> 
> 2. delete the last node
> 
> 3. delete the middle node

> `Delete entire Singly Linked list`: set the Head and Tail as a None


### [8-5] `Important Intuition in Linked List`
> `We need to perceive deeply what is the `instance variable(self.head etc) in a linked list class` which is strong criteria in all algorithms.`
> 
> Insertion: Process the subsidiary trait of main instance variable(self.head, self.tail) first such as `self.head.next` or `self.tail.next`.
> 
> Deletion: We need to control surrounding nodes of target node. We need to `remove all` the `incoming direction connection` to the target node.
> 
> The `tip parts of Circular Linked List` are `not NULL`.

#### (1) Singly Linked List

##### 1. self.head and self.tail get the `node` of first and last node
##### 2. process the `inputing node first` and next one is the `existing list` then `the head and tail`.
##### 3. In the link list, `head is important criteria` to determine `whether link list is existing` or `where is the beginning` to loop inside.
##### 4. we need to have an `index variable` when we loop inside.
##### 5. when we `insert or delete some node from the singly linked list, we need to check `whether self.head == self.tail` after checking self.head != None

#### (2) Circular Singly Linked List

##### 1. how we know that is end of the list?: if node.next == self.head

##### 2. CSLL has the same three cases in insertion operation

            1. Insert at the beginning of linked list
                        * First: INSERTING_NODE.next = self.head
                        * Second: self.head = INSERTING_NODE
                        * Third: self.last_node.node = self.head
                        
            2. Insert at the last location of linked list
                        * First: INSERTING_NODE.next = self.tail.next
                        * Second: self.tail.next = INSERTING_NODE
                        * Third: self.tail = INSERTING_NODE
            
            3. Insert at the specified location of linked list
                        * Same as Singly Linked List


##### 4. CSLL has the same three cases in deletion operation: focus on just previous node
> In CSLL, when we delete the entire list, we need to set self.tail.next as None because of CSLL structure.

                        self.head = None
                        self.tail.next = None
                        self.tail = None


#### (3) Doubly Linked Lists

##### 1. Node class has `self.next` and `self.prev`
########### 2. (Organize it again)connect the node through ADDED_NODE.next, NEXT_NODE.prev, PREV_NODE.next = ADDED_NODE, NEXT_NODE.prev = ADDED_NODE
##### 3. `When we delete entire list, we need to make nodes do not be referenced by anything.` That's why we need to loop inside and make ALL_NODE.prev = None (From the node which is not referenced by other nodes, linked list is started to be eliminated.)



### [8-5] Time complexity: Array vs Linked List

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160237823-0190bbac-c47c-497c-9e4b-c64c12da889d.png">

> Delete at last position: O(n): Singly linked list / O(1): Doubly linked list

> Delete of array/linked list: O(n): Doubly linked list / O(1): Singly linked list

### [8-6] Difference between Linked Lists vs Arrays
* Elements of linked list are `independent objects`.
* Variable size - the size of a linked list is `not predefined`.
* `Insertation and removals` in linked list are `very efficient`.
* Random access - accessing an element is very efficient in arrays. `However, linked list cannot directly access to specific value.` Should start from the head sequentially.


## [9] Stack
> Stores items in a Last-in/First-Out manner
> 
> Application of Stack:Web-browsing order(back and next)
> 
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160870120-59517d30-9f4f-495a-aa71-2ef94a224319.png">

### [9-1] Stack Operations
> push()
> 
> pop()
> 
> peek(): Check the TOP element without remove that element
> 
> isEmpty(): Check the list is empty or not
> 
> delete(): Delete entire stack

### [9-2] Stack Creation
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160872083-62c3f8c9-7d88-4577-9395-63930b6e3b79.png">

### [9-3] Sorts of Stack
> Stack without size limit: just Python list
>
> Stack with size limit: use Python list with self.maxSize argument in the class
> 
> Stack using linked list: self.head direct the LAST_NODE
> 
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160958083-66a4c365-077a-4188-b986-c81d2b00ed34.png">
> 
> ```python
> # [1] isEmpty() Method
> if self.head is None:
>           return True
> ```

### [9-4] When to use / avoid Stack
##### [Use]
            LastIn/FirstOut functionality
            The chance of data corruption is minimum(we cannot insert the value at the middle position)
##### [Avoid]         
            Random access is not possible
            
            

## [10] Queue
> stores items in a `First-In/First-Out` manner.
> 
> Application of Queue: Call center phone systems

### [9-1] Queue Operations
> enqueue(): Put the value in a queue
> 
> dequeue(): remove the FIRST value in a queue
> 
> peek(): Check the FIRST element without remove that element
> 
> isEmpty(): Check the list is empty or not
> 
> isFull()
> 
> deleteQueue()

## [##] Recursion Realization
1. Think about the flow (n, n-1)
2. According to the `necessity of additional operaiton` in the final result, we need to `determine whether add '+' operation` at the return statement in else condition. 
3. When we cover `list` extension task, we can put `return` at the last `outside of the conditional statement` because all the elements should be collected.

## [##] Chicago Realization
1. local variable can be used from the belonged function whether we initialize the value from the conditional argument.

## [Coding Method] Python Map Lambda
### [1] lambda: a way of creating a little function inline, without all the syntax of a def

> lambda is perfect where you have a `short computation` to write inline

#### [`Soul Mate-1`] map: map() function runs a lambda function over the list [1, 2, 3, 4, 5], building a list-like collection of the results

> To work with map(), `the lambda` should have `one parameter in`, representing `one element from the source list`.
>
> Choose a `suitable name` for the parameter, like n for a list of numbers, s for a list of strings.
> 
> Map is often used with lambda, but it works with a def too.

```python
num = [1,2,3,4,5]
list(map(lambda n: 2*n, nums))
# [2, 4, 6, 8, 10]

list(map(lambda n:2**n, numbs))
# [2, 4, 8, 16, 32]

strs = ['Summer', 'is', 'coming']
list(map(lambda s:s.upper()+'!'), strs)
# ['SUMMER!', 'IS!', 'COMING!']

# Map with def
def double(n):
    return n**2
list(map(double, nums))
# [2, 4, 6, 8, 10]
```

#### [`Soul Mate-2`] filter: takes a function and a list, and returns a subsetted list of the elements where the function returns true.

```python
strs = ['apple', 'and', 'a', 'donut']

list(filter(lambda s: len(s)>3, strs))
# ['apple', 'donut']

nums = [5, 3, 6, 1, 7, 2]
list(filter(lambda n:n%2==1, nums))
# [5, 3, 1, 7]
```


<!--
[3-2-1] Add VS Multiply

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159120259-06f6bc06-2a11-4c1c-8d47-233e439a6dc3.png">

-->
