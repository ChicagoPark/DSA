# DSA
Data Structure &amp; Algorithm in Python


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

----

## [2] Recursion

### `[Recur-1] Basic Understanding`

----
* Idea Key: `Functionalized Stack`. An upstairs component in a stack can give its work to the downstairs component. Imagine upstairs component popped out to the downstairs.

* Structural Key: Composed with `Base case` and `Recursive Call`

* Be careful: 
----


#### `[Understand] Base case and Recursive call`

Base case  	     				     |      Recursive call
:--------------------------------------------------: | :-------------:
When is the `appropriate moment` to stop algorithm?  | What is the `smallest unit of work` I can do to contribute to the goal?
						     | How to `interact (contribute) with` the next connection.

#`Recursion in Programming: 23:00/1:51:35`


#### `[Understand] Recursive Operation`

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/174976316-fa6a6908-0208-409a-9cb7-7973bd41b91e.png">

> (1) the `whole code line` of the recursive call is located in the stack.
> 
> (2) Above return value popped into the below layer.

#### `[Understand] Pros and Cons`

Pros  	      |      Cons
:--------------------------------------------------: | :-------------:
helps `break down big problems` into smaller ones  | Slowness due to `CPU overhead`
`Reduce the needs` for `complex loops` and auxiliary data structures  | can encounter `memory errors` / `Stack overflow` exceptions
Works well with recursive structures such as `trees and graphs`  | 

* Recursive vs Iterative?
<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159007306-8b25f583-609b-449b-8e1f-c53d109c774e.png">


Stack up: Stacked in the point of recursive call.
Return down: if there is more necessary operation under the recursive call, we need to calculate until the return statement.



<!--

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
-->

## [3] Big O
> Big O is the language and metric we use to describe the efficiency of algorithms.

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159118600-aae6d54c-c041-47b1-b74d-7ac5e41371a6.png">

### [BigO-1] Algorithm run time complexities

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172275182-9ca8e079-7be3-4702-989a-e1542081115c.png">

O(logN): When we look some value in sorted array, we can select one value and compare with target number, and we can reduce the considering area by two.

### [BigO-2] Space Complexity
> Space Complexity is necessary `extra` area.

* Space complexity: O(n)

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159119580-0b113d38-6001-420d-9b39-90e5afce7ba2.png">

* Space complexity: O(1)

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159119581-61aed1ae-2916-4fed-ae6c-3dd10d4bd945.png">


### [BigO-3] Measure the Big O

* Basic Measurement

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159121173-98d8b2d4-16e4-4bcc-b9f2-1c9aa11c2c36.png">

* Measure the single resursive code

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159121730-b131e64e-1680-45e5-add0-08598e7516a8.png">

* Measure the multiple resursive code

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159121731-ea47551b-e819-4d80-9b21-176736b51ab8.png">


## Array / Tuple / List / Dictionary

### [DSA - Array] Question about Array

---
* Key: (1) Array is the `collection of elements which have same type`, (2) Array is used for `mathematic operations`

* Be careful: (1) Avoid when using `different types of data` is necessary, (2) Avoid when `memory area` is matter, (3) When we need `bigger array`, we should copy to the bigger one.
----

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159123723-5dc342e8-1c0d-4e4e-ab09-ec7d2c627f8d.png">


<!--
### [Arr-1] Array in Python

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159124283-c99bacf5-84c0-49b2-b386-e227f4fbbe64.png">

-->

### [DSA - Tuple]

---
* Key: (1) A tuple is an `immutable sequence` of Python objects, (2) Tuples are also `comparable and hashable`
----

### [DSA - List]

---
* Key: A `mutable and ordered` sequence of element which is also `flexible in data types`
----

#### `[List] Python Operation (+, *)`

```python
# * operation
print(list)   # [1,2,3]
print(list*4) # [1,2,3,1,2,3,1,2,3,1,2,3]

# + operation: possible to be operated between list to concatenate
```

### [DSA - Dictionary]

---
* Key: A dictionary is a collection which is `unordered, changeable, and indexed`.

* Be careful: (1) Avoid when using `different types of data` is necessary, (2) Avoid when `memory area` is matter, (3) When we need `bigger array`, we should copy to the bigger one.
----

#### `[Dict] Python Operation (pop / keys / values / update)`

> pop(key, default_value) and popitem()
   * pop the 'Key', but if there is no key in the dictionary, it would return 'Default_value'
   * popitem(): pop the last element

> keys() and values()
   * return the list of keys and values

> .update(Another_Dictionary)
   * concatenate two dictionaries
   
> When we use the 'pop' function in dictionary, we can decide among 'popitem()' and 'pop' according to our purpose.


----

## Linked List

### `[Linked List] Basic Understanding`

----
* Key: A form of a `sequential collection` and it does not have to be in order. A linked list is `make up of independent nodes` that may contain `any type` of data and `each node has a reference to the next node` in the link

* Be careful: (1) `instance variable(self.head etc)` in a linked list is `the strong criteria` in algorithms., (2) process the `inputing node first`, then process `existing list` and `the head and tail`.


<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160218756-76a460aa-2402-4c1c-86b4-fd94615cb3d8.png"><img width="450" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230470-76f05ede-ab30-4715-836a-7fd2943a67e3.png">

----

### `[Linked List] Linked List Terminology`

> Node: An object containing data and pointer(s)
> 
> Head: The first node in a linked list
> 
> Tail: The last node in a linked list
>
> Pointer: Reference to another node




[Caption Text]

### `[Linked List] Types of Linked List`

* Singly: the last node with NULL reference is important to figure out the end of the linked list
 
* Circular: the last node with HEAD reference is important to figure out the end of the linked list

Singly Linked List  	      |      Circular Singly Linked List
:---------------: | :-------------:
Connect through the next reference  | the reference of last node is not the NULL, but it has the address of starting node.
<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230009-97e44c4b-ccf6-4ae7-98d6-71037f910f31.png">  | <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230009-97e44c4b-ccf6-4ae7-98d6-71037f910f31.png">

Doubly Linked List  	      |      Circular Doubly Linked List
:---------------: | :-------------:
Each node has two references  | the reference of tip node is not the NULL, but it has the address of another-side node.
<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230104-aad374b4-f943-44e0-8613-3d7411e95c0c.png">  | <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230167-2f8db1b3-29a4-4e76-83c7-30d44d51a7fb.png">

<!--
### `[Linked List] Types of Linked List`

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

-->


<!--
### [8-3] Creation of Singly Linked List

* [1] Create Head and Tail nodes, initalized with None

* [2] Create a blank Node Class and assign a value to it and reference to NULL

* [3] Link Head and Tail with these Node

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230952-b37175f5-1afc-4f87-8de1-15edda567ddd.png">
-->





<!--

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

-->

### `[Linked List] Operation`
 
> Insertion: Process the subsidiary trait of main instance variable(self.head, self.tail) first such as `self.head.next` or `self.tail.next`.
> 
> Deletion: We need to control surrounding nodes of target node. We need to `remove all` the `incoming direction connection` to the target node.
> 
> Deletion All: `When we delete entire list, we need to make nodes do not be referenced by anything.` That's why we need to loop inside and make ALL_NODE.prev = None (From the node which is not referenced by other nodes, linked list is started to be eliminated.)
> 
> `Delete entire One-way list`: we can set `self.head = None, self.tail = None`. Otherwise, when we delete Two-way list, we need to loop inside and make sure there is node which is referenced by some node.
> 
> Check the existance of linked list through 2 steps. (1) self.head != None, (2) self.head == self.tail


### `[Linked List] Time complexity: Array vs Linked List`

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160237823-0190bbac-c47c-497c-9e4b-c64c12da889d.png">

> Delete at last position: O(n): Singly linked list / O(1): Doubly linked list

> Delete of array/linked list: O(n): Doubly linked list / O(1): Singly linked list

### `[Linked List] Difference between Linked Lists vs Arrays`

* Elements of linked list are `independent objects`.
* Variable size - the size of a linked list is `not predefined`.
* `Insertion and removals` in linked list are `very efficient`.
* Random access - accessing an element is very efficient in arrays. `However, linked list cannot directly access to specific value.` Should start from the head sequentially.


## [9] Stack
> Stores items in a Last-in/First-Out manner
> 
> Application of Stack: Web-browsing order(back and next)
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

* Stack using List
	
	* Easy to implement
	* Speed problem when it grows

* Stack using Linked List

	* Fast performance
	* Implementation is not easy

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

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/161659107-de4588e4-89e1-488c-a974-bc46f1391155.jpeg">
> 
> stores items in a `First-In/First-Out` manner.
> 
> Application of Queue: Call center phone systems

### [10-1] Queue Operations
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

### [10-2] Sorts of Queue
> Queue without capacity limit: just Python list
>
> Queue with capacity limit: use Python list with self.maxSize argument in the class
> 
> Queue using linked list: self.head direct the LAST_NODE


### [10-3] Queue using Circular Queue
* Special property
    
    * self.top, self.start
     
    * `self.top is moved when some value is enqueued / self.start is moved when some value is dequeued`
     
    * self.peek: return the value in self.start
    
    > ```python
    > def isFull(self):
    > 	if self.top +1 == self.start:
    > 		return True
    > 	elif self.start = 0 and self.top + 1 = self.maxSize:
    > 		return True
    > 	else:
    > 		return False
    > ```


### [10-4] Queue using Linked List

* Special property

    * class Node, class LinkedList, class Queue
    
    * `self.head, self.tail`

> enqueue: add value in the linked list and change the `tail`
> 
> dequeue: change the `head` to the second element
> 
> peek: return `head.value`
> 
> isEmpty: `if head == None:`
>
> delete: `head = None`, `tail = None`

### [10-5] Time and Space complexity Queue: List vs Linked List

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/161657383-fdc7b834-e04b-4cef-84d4-5b9a14185618.png">
> 
> If we need to care about time and space complexity, `linked list` could be the best option.
> 
> If we have less elements to use, `List no capacity limit` could be the best option.

### [10-6] Python Collections Deque Module

	Method
	-append()
	-popleft()
	-clear()
	
```python
from collections import deque
customQueue = deque(maxlen=3)
```

### [10-7] Python Collections Queue Module

	Method
	-qsize(): check the number of element inside of the queue
	-empty(): check is queue empty or not 
	-full(): check is queue full or not
	-put(): enqueue
	-get(): dequeue
	-task_done()
	-join()
	
```python
from collections import deque
customQueue = deque(maxlen=3)
```

## [11] Tree / Binary Tree

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162096745-6ea3395f-3d69-42f3-b377-7311db02af24.png">
>
> A tree is a nonlinear data structure with hierarchical relationships between its elements without having any cycle, it is basically reversed from a real life tree.
>
> [Property1]: represent hierarchical data
> 
> [Property2]: each node has two components: data and a link to its sub category
>   
> [Property3]: base category and sub categories under it
> 
> ### `Why a Tree?`
>	> * (1) `Quicker and easier access` to the data (reason: structure is non-linear)
>	> 
>	> * (2) Store hierarchical data, like folder structure, organization structure
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162097303-4352c4ae-340d-4ed3-9a75-a4f9e7722053.png">
>	> 
>	> * (3) There are many different types of data structures which performs better in various situations
>	>	> Binary Search Tree (faster in inserting or deleting `in sorted data`), AVL, Red Black Tree, Trie 
>
> ### `Tree Terminology`
>	> <img width="250" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162098290-21f546c9-2a99-4c83-9f3e-3dd6dec4f047.png">
>	> 
>	> `Root`: top node without parent
>	> 
>	> `Edge`: a link between parent and child
>	> 
>	> `Leaf`: a node which does not have children
>	> 
>	> `Sibling`: children of same parent
>	> 
>	> `Ancestor`: parent, grandparent, great grandparent of a node (e.g. ancestors of N7 is that N4, N2, and N1)
>	> 
>	> `Depth of node`: a length of the path `from root` to node
>	> 
>	> `Height of node`: a length of the path `from deepest node` `to the node` (e.g. height of N3 = 1)
>	> 
>	> `Depth of tree`: depth of root node is ZERO
>	> 
>	> `Height of tree`: height of root node (e.g. in this example: 3)
>
> ### `Binary Tree`
>	> Binary trees are the data structures in which each node has `at most two children`, often referred to as the left and right children.
>	>
>	> Binary tree is a familiy of data structrue `(BST, Heap tree, AVL, red black trees, Syntax tree)`
>	> 
>	> Binary trees are a `prerequisite for more advanced trees` like BST, AVL, Red Black Trees
>	>   
>	> Huffman coding problem, heap priority problem and expression parsing problems can be solved efficiently using binary trees.
>
> #### Types of Binary Tree
>	> (1) `Full Binary Tree`: each node has two children or ZERO children
>	>
>	> (2) `Perfect Binary Tree`: all leaf nodes are located in the same level. Additionally, all nodes have two children.
>	> 
>	> (3) `Complete Binary Tree`: fill the node from the left side
>	> 
>	> (4) `Balanced Binary Tree`: all the leaf nodes are located in the same distance from the root node.
>	>
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162341885-f294059d-7892-4a35-9380-f113374da28b.png">
>
> #### Binary Tree Representation
>	> * Represent through linked list
>	> 
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162210899-f9d727e4-ab18-4478-bdbc-9a00171e108e.png">
>	> 
>	> Sorts of operation: (1) creation, (2) insertion, (3) deletion of the node, (4) search, (5) traverse, (6) deletion of the tree
>	> 
>	> * Represent through python list
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162213404-02b238fd-4647-4029-8637-266a16cbfa52.png">
>	> 
>	> (1) We don't use the zero index to do mathematic calculation easily. (e.g. `the index of root is 1`)
>
> ### `(linked list) Traversal Binary Tree`
> 
> PreOrder: visit the root node at first / InOrder: visit the root node at second / PostOrder: visit the root node at the last
> 
>
> #### (Traversal-1) (linked list) PreOrder Traversal of Binary Tree
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162221760-44bedf40-2bc5-4ea2-9bc6-f42542bf086e.png">
>	> 
>	> ```python
>	>def preorderTraversal(rootNode):
>	>    if rootNode is None:
>	>        return
>	>    
>	>    else:
>	>        print(rootNode.data)
>	>        preorderTraversal(rootNode.leftChild)
>	>        preorderTraversal(rootNode.rightChild)
>	> ```
>
>	#### (Traversal-2) (linked list) InOrder Traversal of Binary Tree
>
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162225149-b5509016-f7df-42e5-8414-6b8335ab6657.png">
>
>
>	#### (Traversal-3) (linked list) PostOrder Traversal of Binary Tree
>
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162227155-a4fe1423-4174-4eee-ba78-db700fa10a3f.png">
>
>
>	#### (Traversal-4) (linked list) LevelOrder Traversal of Binary Tree
>
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162345682-dcbedcc8-c1b6-44af-8c33-730da9e82dfa.png">
>
>	> ```python
>	>from Module.classCollection import Queue
>	>def levelorderTraversal(rootNode):
>	>    if not rootNode:
>	>        return
>	>    else:
>	>        customQueue = Queue()
>	>        customQueue.enqueue(rootNode)
>	>        while not(customQueue.isEmpty()):
>	>            root = customQueue.dequeue()
>	>            print(root.value.data)
>	>            if root.value.leftChild:
>	>                customQueue.enqueue(root.value.leftChild)
>	>            if root.value.rightChild:
>	>                customQueue.enqueue(root.value.rightChild)
>	> ```
>
> #### (operation 1) `(linked list) Search for a node in Binary Tree`
>
>	> * compare the value in `level order traversal`
>
>#### (operation 2) `(linked list) Insert a node in Binary Tree`
>
>	> * look for a first vacant place from `level order traversal`
>
>
>#### (operation 3) `(linked list) Delete a node in Binary Tree`
>
>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162598450-be6e1f8d-7500-410f-ad91-2727c6695eb4.png">
>	>
>	>  * delete a node and `replace the node` with a node at `the deepest index` through `level order traversal`
>	>
>	>  1. get the deepest node
>	>  2. delete the deepest node
>	>  3. delete the target node by replacing with deepest node
>
>
>#### (operation 4) `(linked list) Delete entire Binary Tree`
>
>	> ```python
>	> rootNode.leftChild = None
>	> rootNode.rightChild = None
>	> rootNode = None
>	> ```

### `(python list)` Attributes of Binary Tree 
>
> [`Why we need self.lastUsedIndex?`]: when we remove the node at the middle of the list, we will change that value with lastnode and replace lastnode with None 
>
>	> ```python
>	> class BinaryTree:
>	> 	def __init__(self, size):
>	> 		self.customList = size*[None]
>	> 		self.lastUsedIndex = 0
>	> 		self.maxSize = size
>	> ```
>
>	#### (operation 1) (python list) Insert a node in Binary Tree
>
>	> * (1) check the binary tree is full or not
>	> * (2) put the value into a first vacant place
>
>	#### (operation 2) (python list) Search for a node in Binary Tree
>
>	> * (1) loop inside of the list and then compare the value with the input value.


#### Binary Tree using python list vs linked list
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/162973622-0d1a2e8e-5ef2-4802-9e60-60ba1ebd4693.png">


## [12] Binary Search Tree
> * `using Linked List`
> 
> `Important advice`: when check the tree is empty or not, do not check `rootNode.data is None` do check `rootNode is None`. Except for the `insertion`. Otherwise it generates the error.
> 
> `[What is a Binary Search Tree]`
> * (1) In the left subtree the value of a node is less than or equal to its parent node's value.
> * (2) In the right subtree the value of a node is greater than its parent node's value.
> 
> `[Why do we need Binary Search Tree]`
> * It performs faster than Binary Tree when `inserting and deleting` nodes.
> 
> `[What kinds of operation do Binary Search Tree has]`
> * (1. creation), (2. insertion), (3. deletion), (4. search), (5. traverse), (6. deletion)
> 
> #### (operation 1) insertion
> 	> * `don't put` nodeVariable `at the left side of the insertion function` call unless we find `None` location.
> 	
> 	> * compare the value with node and then insert the node once classified branch is empty
>
> #### (operation 2) search
>	> * compare the value with node and then go down the tree resursively. Once the value is found, return the message
>	
> #### (operation 3) deletion
>	> * (Case 1) The node to be deleted is a leaf node: `delete straight away`
>	
>	> * (Case 2) The node to be deleted has a one child node: assign one child node as a deleted root node's location
>	
>	> * (Case 3) The node to be deleted has two children: assign successor from the right subtree and then use it to replace root node
>	>	> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163088164-7ca55dc6-0c89-462a-8504-d2799bff757e.png">
>	>	
>	>	> We need to code the `minimum function` to `find the successor from right branch`
>	>```python
>	>def minValuenode(bstNode):
>	>    current = bstNode
>	>    while (current.leftChild is not None):
>	>		current = current.leftChild
>	>    return current
>	>
>	>def deleteNode(rootNode, nodeValue):
>	>    if rootNode is None:
>	>		return rootNode
>	>    if nodeValue < rootNode.data:
>	>		rootNode.leftChild = deleteNode(rootNode.leftChild, nodeValue)
>	>    elif nodeValue > rootNode.data:
>	>		rootNode.rightChild = deleteNode(rootNode.rightChild, nodeValue)
>	>    else: # in case we find the node
>	>		if rootNode.leftChild is None:
>	>	    		temp = rootNode.rightChild
>	>	    		rootNode = None
>	>	    		return temp				# connect with the above recursive statement
>	>		if rootNode.rightChild is None:
>	>	    		temp = rootNode.leftChild
>	>	    		rootNode = None
>	>	    		return temp 				# connect with the above recursive statement
>	>
>	>		temp = minValuenode(rootNode.rightChild)
>	>		rootNode.data = temp.data
>	>		rootNode.rightChild = deleteNode(rootNode.rightChild, temp.data)
>	>   return rootNode
>	>```
> `[Time and Space complexity of Binary Search Tree]`
> 
> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163185757-22f2f68d-946a-49b5-88e6-d60514f84020.png">


## [13] AVL Tree
> `[What is AVL Trees?]`: self-balancing `Binary Search Tree (BST)` where the `difference between heights` of left and right subtrees `cannot be more than one` for all nodes.
> 
> `[Why AVL Trees?]`: According to the inserting value to the BST, we can have O(n) time complexity in searching. To `reduce the searching time to O(logN)`, we can implement AVL Tree.
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163353005-9b8a8082-bc56-41ea-9373-4c13e07aa59e.png"><img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163353030-45fd6834-ba18-48ff-a104-1b63c9712171.png">
> 
> `[How to balance the tree]`: `rotation` is done using the height variable and compare between left root's height and right root's height
> 
> 
> `[Common Operations on AVL]`: (1) creation of AVL tree, (2) search for a node, (3) traverse, (4) insert a node, (5) delete a node, (6) delete the entire tree
> 
> (1) creation of AVL tree, (2) search for a node, (3) traverse are the `same as BST`

### `[13-0] Rotation`

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163359326-17f7009b-3215-402b-ba8b-9db319c397a8.png"><img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163359334-0f7f3c55-7d1d-4c69-aae8-4a9f868739d7.png">
>
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163360996-b4c1cbc2-866a-4519-a2ca-a228473239e8.png"><img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/163361004-61706aae-2b17-4f0a-9d6d-2643e79a0837.png">
>
> Understand 'LL' mean: `left left side node of the unbalanced root node is the cause of unbalancing`
>
>	### `Rotation Condition`
>	> 		LL: Right rotation
>	>		LR: i) Left rotation, ii) Right rotation
>	>		RR: Left rotation
>	>		RL: i) Right rotation, ii) Left rotation
>	
>	### `Rotation Code`
>	```python
>	def rightRotate(disbalanceNode):
>    	  newRoot = disbalanceNode.leftChild
>    	  disbalanceNode.leftChild = disbalanceNode.leftChild.rightChild
>    	  newRoot.rightChild = disbalanceNode
>    	  disbalanceNode.height = 1 + max(getHeight(disbalanceNode.leftChild), getHeight(disbalanceNode.rightChild))
>    	  newRoot.height = 1 + max(getHeight(newRoot.leftChild), getHeight(newRoot.rightChild))
>    	  return newRoot
>	```
> 	### `Rotation Intuition`
>	> 	LR Process: Do the leftRotation() from the perspective of UnB node's leftChild. Then, do rightRotation() from the perspective of rootNode.
>	>
>	>	RL Process: Do the rightRotation() from the perspective of UnB node's rightChild. Then, do leftRotation() from the perspective of rootNode.


### `[13-1] Insert a node in AVL Tree`
> (1) Put the value when we find out "rootNode == None", (2) balancing: `if balance > 1 and nodeValue < rootNode.leftChild.data:`
>
> `Necessary Helper Function`: (1) getHeight Helper function, (2) getBalance Helper function
> 
> We can divide the cases: CASE i) rotation is not required: `same as BST`, CASE ii) `rotation` is required.
>
>
>	#### `Rotation Process Understanding`: We can think that the process is going up from newRoot
>	> (1) identify unbalanced node
>	> 
>	> (2) select the grandchild node which has higher node (at this time we can know whether LL, LR, RR, RL)
>	>
>	> (3) `Rotation process`
>	>
>	> #### `Important Note: (1) and (2) are done with one conditional statement`
>	> e.g. if balance > 1 and nodeValue < rootNode.leftChild.data:
>
> ### `CASE ii`) `rotation` is required.
> ```python
>    # LL
>    if balance > 1 and nodeValue < rootNode.leftChild.data:
>        return rightRotate(rootNode)
>    # LR
>    if balance > 1 and nodeValue > rootNode.leftChild.data:
>        rootNode.leftChild = leftRotate(rootNode.leftChild)
>        return rightRotate(rootNode)
>    # RR
>    if balance < -1 and nodeValue > rootNode.rightChild.data:
>        return leftRotate(rootNode)
>    # RL
>    if balance < -1 and nodeValue < rootNode.rightChild.data:
>        rootNode.rightChild = rightRotate(rootNode.rightChild)
>        return leftRotate(rootNode)
>```


### `[13-2] Delete a node in AVL Tree`
> (1) balancing: `if balance > 1 and getBalance(rootNode.leftChild) > 0:`
> (Case 1) - The tree does not exist
> (Case 2) - Rotation is not required
> (Case 3) - Rotation is required (LL, LR, RR, RL)
> 
> `Check the balance when deleted node has two child nodes`


## [14] Binary Heap
> Implement through Python List
> 
> * A Binary Heap is either `Min Heap` or `Max Heap`. In a Min Binary Heap, `the key at root must be minimum among all keys present in Binary Heap`. The same property must be recursively true for all nodes in Binary Tree.
> 
> * It's a complete tree (All levels are completely filled except possibly the last level and the last level has `all keys as left as possible`). This property of Binary Heap makes them suitable to be stored in an array.

### [Binary Heap- Why a Binary Heap?]
> `Find the minimum or maximum number` among a set of numbers in logN time. And also we want to make sure that inserting additional numbers does not take more than O(logN) time
>
> `[Practical Use]`
> * Prim's Algorithm
> 
> * Heap Sort
> 
> * Priority Queue
> 
> 
> #### `[Types of Binary Heap]`
> 
> <img width="650" alt="IMG" src="https://user-images.githubusercontent.com/73331241/164250567-bb80a76a-8299-4a0b-b103-e67a24cb9731.png">

<!--

### [Binary Heap- Common operations on Binary Heap]
> (1) Creation
> (2) Peak top
> (3) Extract Min / Extract Max: `Going Down`
> (4) Traversal
> (5) size
> (6) Insertion: `Going up`
> (7) Deletion
>
> #### [Binary Heap - `Insertion`]
> 	> * (1) insert at the `last index` of the list
> 	>
> 	> * (2) `compare with the parents node` until it finds proper position.
> 	
> ##### [Insertion] `(1) insertNode() method`: insert at the `last index` of the list
> ```python
> def insertNode(rootNode, nodeValue, heapType):
> 	if rootNode.heapSize + 1 == rootNode.maxSize:
>     		return "The Binary Heap is Full"
> 	rootNode.customList[rootNode.heapSize + 1] = nodeValue
> 	rootNode.heapSize += 1
> 	heapify_tree_insert(rootNode, rootNode.heapSize, heapType)
> 	return "The node has been successfully inserted"
> ```
>
> ##### [Insertion] `(2) heapify_tree_insert() method`: `compare with the parents node` until it finds proper position.
>```python
>def heapify_tree_insert(rootNode, index, heapType):
>	parentIndex = int(index/2)
>	if index <= 1:
>		return
>	if heapType == "Min":
>		if rootNode.customList[index] < rootNode.customList[parentIndex]:
>			rootNode.customList[index], rootNode.customList[parentIndex] = rootNode.customList[parentIndex], rootNode.customList[index]
>		heapify_tree_insert(rootNode, parentIndex, heapType)
>	else:
>		if rootNode.customList[index] > rootNode.customList[parentIndex]:
>			rootNode.customList[index], rootNode.customList[parentIndex] = rootNode.customList[parentIndex], rootNode.customList[index]
>		heapify_tree_insert(rootNode, parentIndex, heapType)
>```
>
> #### [Binary Heap - `Extraction`]
> * Goal: We `extract the root node`
> 
> * Process: (1) Put `last node` at `root node` position, (2) find the proper location of replaced root node
>
>
> #### [Binary Heap - `Deletion`]
```python
customList = None
```

### [Binary Heap - Time and Space complexity of Binary Heap]

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/164625682-c3738794-691a-48e6-b6eb-c74290882104.png">

-->

----


## [] Priority Queues

#### [Priority Queues - Background Story]
> (a) Tickets Booking
> 
> > Once the seats are getting full, the waiting list would be activated. However, airline could have a senior-first policy to consider waiting list. In this case, priority can be assigned to waiting list.


#### [Priority Queues - Properties]
> (A) Collection of prioritized Objects
>
> (B) Insertion Method: the same as an ordinary queue
> 
> (C) Removal: Based on the priority of the objects
> 
> (D) Key is associated when element is inserted in the priority queue
> 
> (E) Element with minimum key will be next element to be removed.


----

## [] Heaps

#### [Heaps - Properties]
> (A) More efficient utilization of Priority Queue (Can insert and delete in more efficient way)
> 
> (B) Also called as `Binary Heap`. It is a collection of objects or elements stored as a binary tree.
> 
> (C) Relational Property: Key in each node of the binary tree is greater than or equal to those in its children
> 
> (D) Structural Property: Binary tree should be a `complete binary tree`
> 
> (E) Kinds: Max Heap and Min Heap

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/173597080-bc3b9519-75a2-4564-a72a-c29c46fd97f9.png">


#### [Heaps Operations - Insertion]
* (1) `Structural Property`: New node is inserted `after the last node`

	* Implement it through array which is `starting from index 1`.

* (2) `Relational Property`: Perform up-heap bubbling

`Psudocode`
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/173869717-bec6fa25-8439-4469-bf39-cca857ad2862.png">

#### [Heaps Operations - Deletion]
* (1) `Structural Property`: `Root is replaced by` the `last node`

* (2) `Relational Property`: Perform down-heap bubbling

`Psudocode`
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/173973114-12083c23-2fd9-4581-b602-8f38385467ee.png">


#### [Heaps Application - Heap Sort]

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/174748702-9c41e37f-6f51-473b-8336-b7f73a36aeda.png">


----

## [15] Trie

> A Trie is a tree-based data structure that organizes information in a hierarchy.

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/164627529-5b634748-7b62-42d3-b627-903c6fdc6383.png">
>
> Meaning: This Trie contains AIR, AIT, BAR, BIL, BM
>
> #### [Trie - Why we need Trie?] 
> * To solve many standard problems in efficient way (e.g. Spelling checker, `Auto completion`)

### [Trie- Common operations on Trie]
> (1) Creation, (2) Insertion, (3) Search for a string, (4) Deletion
>
> #### [Trie- Insertion]
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/164629756-0dc4f42e-90b2-4c57-a77b-3dc1aad94828.png">
> 
> {'character': 'next node'}
> 
> 
> #### [Trie- Deletion]
>
> > (Case 1): Some other prefix of string is same as the one that we want to delete. (`API, APPLE`)
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/164672071-3f0b8a62-ef70-4c8c-ae6a-a4fc053ea28b.png">
> 
> > (Case 2): The string is a prefix of another string. (`API, APIS`)
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/164673612-8d8f57d7-ed66-490e-97bf-fccb2fd2d341.png">
> 
> > (Case 3):
> Go to tip of the Trie and delete the node step by step

----


## Hashing

### `[Hashing] Basic Understand`

----
* Key in usage: Hashing is a technique used for `searching, inserting, deleting elements` from a collection.

* Be careful: Inefficient Hashing algorithm can take lots of memory.
----

#### `[HS Understand] Necessary Terminologies`

> Keys: `input data` by a user

> Hash Function: Map keys to corresponding indices(Hash Value) in Hash Table
> 
> Hash Table: It is a data structure which implements an `associative array` abstract data type, a structure that can `map keys to values`.
>
> Collision: Occur when more than one key maps to the same index in hash table


### `[Hashing] Collision Handling`

----
* Key: Two types of collision handling schemes: Chaining, Open Addressing(Linear Probing, Quadratic Probing, annd Double Hashing)

* Be careful: 
----

#### `[HS Collision] Chaining`

> (1) Chaining uses `Linked lists` inside of the Hash Table

> (2) It's the simplest and efficient way of handing collisions

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/175193601-78056266-af59-4b0f-ae5b-f5c6a2067cba.png">


#### `[HS Collision] Linear Probing & Quadratic Probing`

----
* Key: Linear Probing & Quadratic Probing are the same except for collision function.

* Be careful: The number of elements cannot be more than hashtable size.

`Hashtable size should have doubled size than the number of elements` (Maintain `L.F` < 0.5)

----

> (1) We need hash function and collision function

> (2) In search function, we just implement the same operation with collision function without calling collision function.

<!--

#### `[HS Collision] Double Hashing`

----
* Key: Linear Probing & Quadratic Probing are the same except for collision function.

* Be careful: The number of elements cannot be more than hashtable size.

`Hashtable size should have doubled size than the number of elements` (Maintain `L.F` < 0.5)

-->

----

> (1) We need hash function and collision function

> (2) In search function, we just implement the same operation with collision function without calling collision function.



## [16] Hashing
> * Hashing is a `method of sorting and indexing data`. The idea behind hashing is to allow large amounts of data to be indexed using keys commonly created by formulas.
> 
> * [Pros of Hashing] On an average insertion/Deletion/Search operations take O(1) time.
> 
> * [Cons of Hashing] When Hash funciton is not good enough Insertion/Deletion/Search operations take O(n) time
> 
> #### `[Why Hashing?]`
> * It is time efficient in case of `SEARCH Operation`
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/164712543-60fbd5d5-90fd-459a-a01f-b20f0bd085b8.png">

### [Hashing - Hashing Terminology]
> * Hash function: It is a function that can be used to map of arbitrary size to data of fixed size.
> 
> * Key: `input data` by a user
> 
> * `Hash value`: A value that is `returned by Hash Function`
> 
> * `Hash Table`: It is a data structure which implements an `associative array` abstract data type, a structure that can `map keys to values`.
> 
> * `Collision`: A collision occurs when `two different keys` to a hash function produce the `same output`.

### [Hashing - Hash Functions]
> #### Properties of good Hash function
> 
> * (1) It distributes hash values `uniformly` across hash tables
> 
> * (2) It has to use all the input data

### [Hashing - Collision Resolution Techniques]

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/165201477-fbea8243-7d82-49d0-9243-c95aa314f2be.png"> 

> * (1) `Direct Chaining`: Implements the buckets as linked list. Colliding elements are stored in this lists.
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/165202121-fb72f421-2118-467a-8c6d-c83773bfa0fc.png"> 

> * (2) `Open Addressing`: Colliding elements are stored in other vacant buckets. During storage and lookup these are found through so called probing.
> 	> `Linear probing`: It places new key into closest following empty cell.
> 	> 	> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/165204194-54bf43b7-dec5-4686-a690-fc87d4a1a4ba.png"> 
> 	> `Quadratic probing`: Adding arbitrary quadratic polynomial to the index until an empty cell is found.
> 	>	> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/165204197-8090c541-3254-40a8-86c0-864fcdb85202.png"> 
> 	> `Double Hashing`: Interval between probes is computed by another hash function.
> 	>	> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/165204199-3d8fc43a-0555-4283-87ce-f14bba11cf41.png"> 


### [Hashing - Hash Table is Full]

> * (1) `Direct Chaining`: Since we have linked list, this situation will never arise.
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/165204898-96e1e640-4db2-44f7-a2ab-5fe21ea0a8b3.png"> 


> * (2) `Open Addressing`: Create 2X size of current Hash Table and recall hasing for current keys.
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/165204895-b6143a87-09cf-4c0d-8709-006793649ee6.png"> 

### [Hashing - Pros and Cons of Collision resolution techniques]

> * (1) `Direct Chaining`
> 	> [Pros]: Hash table `never gets full`
> 	
> 	> [Cons]: `Huge` linked list causes `performance` leaks (Time complexity for search operation becomes O(n).)


> * (2) `Open Addressing`: Create 2X size of current Hash Table and recall hasing for current keys.
> 	> [Pros]: Easy Implementation
> 	
> 	> [Cons]: When Hash Table is full, creation of new Hash table affects performance (Time complexity for search operation becomes O(n))
>
> [Selection 1]: If the input size is known, we always use "Open addressing"
> 
> [Selection 2]: If we perform deletion operation frequently we use "Direct Chaining" (Open addressing will stop searching when it encounter empty cell)

### [Hashing - Practical Use of Hashing]
> 1. Password verification: Change user information to hash value and keep it
> 
> 2. File system: File path is mapped to physical location on disk through Hashing

----

## [17] Sort Algorithms
> #### (i) What is Sorting?
> 
>   > arranging data in a particular format: either ascending or descending
>  
> #### (ii)Types of Sort Algorithms
> 
>   * Choose according to the stability needs or space efficiency needs or time efficiency needs
>   
>   > Bubble Sort, Selection Sort, Insertion Sort, Bucket Sort, Merge Sort, Quick Sort, Heap Sort
> 
> #### (iii) Practical Use of Sorting
> 
>   > MS Excel(Built in functionality to sort data), Online Stores(sorting by price, review, ratings)

### [Sort - Type]
><img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172279714-10b93772-4251-4a30-b593-37915767a101.png"> 

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166394521-e774b31e-eedd-4d1a-a24e-e810ba025142.png"> 
> 
> #### [Space used]
> `In place sorting`: Sorting algorithms which does not require any extra space for sorting
> 
> 	> Example: Bubble Sort
> 
> `Out place sorting`: Sorting algorithms which requires an extra space for sorting
> 
> 	> Example: Merge Sort

> #### [Stability]
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166395203-6d01cb1a-d9e8-454c-b4b6-7ee81e1c51b2.png"> 
> 
> `Stable sorting`: If a sorting algorithm after sorting the contents does not change the sequence of similar content in which they appear, then this sorting is called stable sorting.
> 
> 	> Example: Insertion Sort
> 
> `Unstable sorting`: If sequence of similar content is changed.
> 
> 	> Example: Merge Sort

### [Sort - Terminology]
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166395422-908c83ec-481b-4689-869b-55a494034268.png"> 


----

### [Sort - Bubble Sort]
`Frequency of switching`: over and over again to compare

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166395889-5c3cba74-d1da-4dd2-8ced-277473c6d0ae.png">
>
> We repeatedly compare each pair of adjacent items and swap them if they are in the wrong order. (Put the biggest item at the right side accumulatively)
>
> #### When to use Bubble Sort?
> 
> > When the input is `already sorted`
> > 
> > Space is a concern
> > 
> > Easy to implement
> 
> #### When to avoid Bubble Sort?
> 
> > Average time complexity is poor

----

### [Sort - Selection Sort] (fill from index 0)
* HOW?: Select the `minimum element` and place in `just the right-side` of sorted section

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166398706-b3f6a429-4b27-4038-b0cc-146b9f0ecd65.png">
> 
> Chicago's realization: `Select the minimum index from right side of the criteria`, then `put it in front` of the list.
> 
> We repeatedly find the minimum element and move it to the sorted part of array to make unsorted part empty.
>
> #### When to `use` Selection Sort?
> 
> > When we have `insufficient memory`
> > 
> > Easy to `implement`
> 
> #### When to `avoid` Selection Sort?
> 
> > When time is matter

----

### [Sort - Insertion Sort]
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166623144-88d52738-7c9e-4960-b07d-e3556b7d2cd1.png">
> 
> Chicago's realization: `Move criteria index gradually`, then put that criteria in to the organized left side of the criteria.
> 
> * Divide the given array into two part
> [First part]: `loop from i=1 to len(arr)`
> 
> [Second part]: set j as a start point of organized part. Then, compare (j+1)=i with j, then going down gradually to find a proper index
> 
> * `[Repetition]` Take first element from unsorted array and find its correct position in sorted array (Repeat until unsorted array is empty)
>
> #### When to `use` Insertion Sort?
> 
> > When we have `insufficient memory`
> > 
> > Easy to `implement`
> > 
> > When we have continuous inflow of numbers and we want to keep them sorted
> 
> #### When to `avoid` Insertion Sort?
> 
> > When time is matter

[Sort - Insertion Sort] Key method: compare and put the large value at the j+1 sequentially


----

### [Sort - Shell Sort]
> Move and compare the value with the gap index unit. Start from the gap as `n/2` and compare it with previous index and switch.

initial gap: n/2

gap in next iteration: (initial gap)/2

Once gap is zero, the sorting prcess is done.

```java
public static void shellSort(int a[]) {
	int n = a.length;

	// Until: gap > 0
	// way: compare next element at the next gap.
	// After swapping compare with previous element in the left gap

	for (int gap = n / 2; gap > 0; gap /= 2) {
		for (int i = gap; i < n; i++) {
			int temp = a[i];
			int previous = i - gap;
			while (previous >= 0 && a[previous] > temp) {
				a[previous+gap] = a[previous];
				previous = previous - gap;
			}
			a[previous+gap] = temp;
		}
	}
	}
```

----

### [Sort - Bucket Sort]
> * (1) Create buckets and distribute elements of array into buckets.
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166625054-7db26d7f-5d03-40fc-969b-a166328020a8.png">
>
> * (2) Sort buckets individually
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166625117-3c5a0d35-0198-4b31-b89a-4f4491312f1c.png">
>
> * (3) Merge buckets after sorting
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166625189-1c929f6d-699b-463a-b866-600297af07cb.png">
> 
> #### When to `use` Bucket Sort?
> 
> > When input uniformly distributed over range.
> > 
> > Good (1,2,4,5,3,8,7,9) / Bad (1,2,4,91,93,95)
> > 
> #### When to `avoid` Bucket Sort?
> 
> > When space is matter

[Sort - Bucket Sort] Key method:

----

### [Sort - Merge Sort]
> Merge sort is a `divide and conquer` algorithm

<!--

> Divide the input array in two halves and we keep halving recursively `until they become too small` that cannot be broken further
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166701115-e5a62df2-12e1-491a-b42a-fe9d675f553c.png">
> 
> Merge halves by sorting them.
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166701122-9ece4b27-5e47-4e8d-ba22-6ccbe7467782.png">
> 
> 
> 
> #### When to `use` Merge Sort?
> 
> > When we need stable sort.
> > 
> > When average expected time is O(NlogN)
> > 
> 
> #### When to `avoid` Merge Sort?
> 
> > When space is matter

-->

#####  (1) Divide part
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172510104-c0987240-c047-411e-9c81-83580b7182ed.png">

#####  () Conquer part(Merging Process)
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172510212-d32574d8-b071-4d2e-b0d2-e379e99bc45e.png">



[Divide part Algorithm]

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172511426-ca7b1479-928b-4c7d-ab6c-828b68202ffd.png"><img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172511408-31a80e3c-ad5f-41de-a51a-1532fc2c9b13.png">


[Conquer part Algorithm]

<img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/172512940-fc218aa6-7412-4b12-a43a-926cc36bba33.png">


----


### [Sort - Quick Sort]
> Quick sort is a `divide and conquer` algorithm
> 
> Find `pivot number` and make sure smaller numbers located at the `left` of pivot and bigger numbers are located at the `right` of the pivot.
> 
> * `Pivot number is normally chosen at random.`
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167277671-71f24119-edfd-492f-bb47-bace5cfc2f41.png">
> 
> Unlike merge sort, extra space is not required.
> 

* Psudocode
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/173557552-8443395e-5a25-454d-90ca-5fb97494bba8.png">



After switching, we have to consider at the left side of the pivot and the at the right side of the pivot recursively.

<!--
> #### When to `use` Quick Sort?
> 
> > When average expected time is O(NlogN)
>  
> #### When to `avoid` Quick Sort?
> 
> > When space is matter
> > 
> > When you need stable sort
-->

##### `Process in detail`
Necessary elements: `P`, `L`, `R`

When L and R on the same index, switch that element with Pivot element



### [Sort - Heap Sort]
> ##### Step 1: Insert data to Binary Heap Tree
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167278507-a49bd38c-f03d-481d-8ae9-cab49e3ee2e1.png">
>
> ##### Step 2: Extract `Root Node` data from Binary Heap
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167278534-077af1de-eb31-42ab-9420-0115e76c7a4f.png">

----

### [Sort Algorithms Comparison]
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167278739-68daee0b-0c07-47ac-8243-fe674cc95893.png">

----

## [18] Searching Algorithms

### [Searching- Types of searcing algorithms]

> ##### Linear Search
> 
> searching and comparing one by one.
> 
> [Pro: Good in unsorted array] / [Con: In sorted array, it would be better to use other searching algorithms.]
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167327544-b10c612e-a033-41de-a864-6c01cd2efca3.png">
> 

> ##### Binary Search
> (0) Binary Search `only works for sorted arrays`.
> 
> (1) Binary Search is faster than Linear Search
> 
> (2) Half of the remaining elements can be eliminated at a time, instead of eliminating them one by one.
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167328332-b16467bd-7c40-4078-8532-1b73d2dac9fa.png">

* Binary Search Pseudocode
> Create function with two parameters which are a sorted array and a value
> 
> Create two pointers: a left pointer at the start of the array and a right pointer at the end of the array.
> 
> Based on left and right pointers calculate middle pointer
> 
> While middle is not equal to the value and start<=end loop:
> 
> 	> if the middle is greater than the value move the right pointer down
> 	
> 	> if the middle is less than the value move the left pointer up
> 	
> If the value is never found return -1
> 
> * Binary Search Time Complexity
> 
> Wost and Average Case: O(log n)

----

## [19] Graph
> Graph consists of a finite set of `Vertices(or nodes)` and a set of `Edges` which connect a pair of nodes.


### `[Graph] Abstract Data Type in Java`

> (1) create(n): creates graph with n vertices and no edges
> 
> (2) insert_edge(u, v, w = 1): creates edge from u to v, storing weight w (by default 1)
>
> (3) remove_edge(u, v): deletes edge from u to v
>
> (4) exist_edge(u, v): returns true if edge exists between u and v, else false 
> 
> (5) vertex_count(): returns number of vertices in the graph
> 
> (6) edge_count(): returns number of edges in the graph
> 
> (7) vertices(): returns all the vertices of the graph
> 
> (8) edges(): returns all the edges of the graph
> 
> (9) degree(u): returns the degree of the vertex u
> 
> (10) indegree(u): returns the indegree of the vertex u
> 
> (11) outdegree(u): returns the outdegree of the vertex u

----
* Key: 

* Be careful: 
----



### [Graph- Terminology]
> Vertices(vertex): the nodes of the graph
> 
> Edge: The edge is the line that connects pairs of vertices
> 
> Degree of Vertex - deg(v): number of edges
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/175761849-bcde2bcd-d420-4a85-8798-d79c23d10f5e.png">
> > 
> > In-degree - indeg(v): number of incoming edges [<-> Out-degree - outdeg(v)]
> 
> Unweighted graph: A graph which does not have a weight associated with any edge
> 
> Weighted graph: A graph which has a weight associated with any edge
> 
> Undirected graph: In case the edges of the graph do not have a direction associated with them
>
> Directed graph: If the edges in a graph have a direction associated with them
> 
> Cycle: Path that starts and ends at the same vertex
> 
> Cyclic graph: A graph which has at least one loop
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167546919-50823970-41b1-4442-964f-b0b40f8ea12c.png">
> 
> Acyclic graph: A graph with no loop
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167546921-934acd35-f4c9-450e-bd02-4fa6039bf2fa.png">
> 
> Tree: It is a special case of directed acyclic graphs

### [Graph- Types]


> Negative graph: Unless there is an negative edge, we call it as a negetive graph
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167552196-340abe10-2330-4c49-81ae-b6fe206b507b.png">



### [Graph- Representation]
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167557649-8004f1fa-ae5b-499b-af07-6ff5e0471473.png">

> ##### `(1) Adjacency Matrix`
> 
> > an adjacency matrix is a square matrix or you can say it is a 2D array. And the elements of the matrix indicate whether pairs of vertices are adjacent or not in the graph.

> ##### `(2) Adjacency List`
>
> > an adjacency list is a collection of unordered list used to represent a graph. Each list describes the set of neighbors of a vertex in the graph.
> 
> > `Implementation: Python Dictionary`
> > 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167558420-ccebf391-e078-40ed-8b31-fed889dd4b32.png">

### [Graph-basic code]
```python
class Graph:
    def __init__(self, gdict=None):
        if gdict is None:
            gdict = {}
        self.gdict = gdict
    
    def addEdge(self, vertex, edge):
        self.gdict[vertex].append(edge)
	
	
customDict = {"a": ['b','c'],
             "b": ['a','d','e'],
             "c": ['a','e'],
             "d": ['b','e','f'],
             "e": ['d','f'],
             "f": ['d','e']}
	     
graph = Graph(customDict)
graph.addEdge('c', 'z')
print(graph.gdict)
# {'a': ['b', 'c'], 'b': ['a', 'd', 'e'], 'c': ['a', 'e', 'z'], 'd': ['b', 'e', 'f'], 'e': ['d', 'f'], 'f': ['d', 'e']}
```


### [Graph - Traversal]
> (1) Breadth First Search (`pop`), (2) Depth First Search (`dequeue`)
> 
> ##### (1) Breadth First Search(BFS)
> It starts at some arbitrary node(set by user) of a graph and explores the neighbor nodes (which are at current level) first, before moving to the next level neighbors.
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167775498-31956c5d-d9a2-452f-944a-048507be93f2.png">
> 
> [Psudo Code]
> ```python
> enqueue any starting vertex
> while queue is not empty:
> 	p = dequeue()
> 	if p is unvisitied:
> 		mark it visitied
> 		enqueue all adjacent
> 		unvisited vertices of p
> ```


> ##### (2) Depth First Search(DFS)
> It starts selecting some arbitrary node and explores as far as possible along each edge before backtracking.
>
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167779587-1095681d-df92-4db5-90bf-1631aa580b95.png">

> ##### (3) BFS vs DFS
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167782070-f4fe17cb-ff09-4e50-9f4a-903945d06861.png">



### [Graph - Topological Sort]
> <img width="150" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167992819-2598cc52-f39d-44f5-949d-82b5605b2970.png">
>
> Sorts given actions in such a way that if there is a dependency of one action on another, then the dependent action always comes layer than its parent action.
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/167993896-6efacddb-d4e8-403f-b739-295cafe1d3b4.png">

`Psudo Code`
```python
if there is a vertex depends on currentVertex:
	Go to that vertex and then come back to currentVertex
else:
	Push currentVertex to Stack.
```

```python
from collections import defaultdict

class Graph:
    def __init__(self, numberofVertices):
        self.graph = defaultdict(list)
        self.numberofVertices = numberofVertices
    
    def addEdge(self, vertex, edge):
        self.graph[vertex].append(edge)
    
    def topologicalSortUtil(self, v, visited, stack):
        visited.append(v)
        
        # loop the dependent node of v node
        for i in self.graph[v]:
            if i not in visited:
                self.topologicalSortUtil(i, visited, stack)

        stack.insert(0,v)
    
    def topologicalSort(self):
        visited = []
        stack = []
        
        # loop all the graph node
        for k in list(self.graph):
            if k not in visited:
                self.topologicalSortUtil(k, visited, stack)
        
        print(stack)
```

Used function1: topologicalSortUtil: Loop inside of visited node (push to visited list and stack)
Used function2: topologicalSort: Loop all the graph dictionary



### [Graph - Single Source Shortest Path Problem]
> A single source problem is about `finding a path` between a given vertex (called source) to all other vertices in a graph such that the `total distance between them (source and destination) is minimum`.
> 
> `The example of problem:`
> > (1) Five offices in different cities
> > 
> > (2) Travel costs between these cities are known
> > 
> > (3) Find the cheapest way from head office to branches in different cities

##### [Graph - Single Source Shortest Path Problem - BFS]
> When we enqueue adjacent unvisited vertices, we can update the parent of added adjacent vertices to curVertex. We can find the shortest path by following the parent node from destination node
>  
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168417464-95715eb9-edbb-4d63-a956-846f10beec58.png">

> ##### Usage of BFS for SSSP
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168419281-91c3de4a-d377-46c3-a056-43309aab3de2.png">

> Why does DFS not work with SSSP?
> > DFS has the tendency to go "as far as possible" from source, hence it can never find "Shortest Path"


### [Graph - Dijkstra's Algorithm for SSSP]
> `Dijkstra's Algorithm`
> Each node has (1) `accumulative distance from starting point`, (2) `previous node`
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168419569-98c91413-1a1f-4c47-925e-eb70b253a969.png">


----


----

## [20] Greedy Algorithm
> It is an algorithmic paradigm that `builds the solution piece by piece` by `selecting best local solution`.
> 
> In each step it chooses the piece that offers `most obvious and immediate benefit`.
> 
> It fits perfectly for those solutions in which local optimal solutions lead to global solution.
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168452143-c2de6924-fc48-49a0-87d1-fb6d4dd9a559.png">
>
> ##### `Possible Application`
> Insertion Sort, Selection Sort, Topological Sort, Prim's Algorithm, Kruskal Algorithm
> 
> Activity Selection Problem, Coin Change Problem, Fractional Knapsack Problem.
>
> ##### `Understanding`
> Insertion Algorithm: Find the best location of inserted node, and then overall solution reaches to global solution.

### [Greedy Algorithm - Activity Selection Problem]
> Given N numbers of activities with their start and end times. We need to `select the maximum number of activities`(this is why we sort using end time) that can be `performed by a single person`, assuming that `a person can only work` on a single activity `at a time`.
> 
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168452545-5eb5a90e-d3e0-4839-a5a8-66c9ce41e317.png">
> 
> `Algorithm`
> ```python
>def printMaxActivities(activities):
>    # sort the array using end time
>    activities.sort(key=lambda x:x[2])
>    i = 0
>    firstA = activities[i][0]
>    print(firstA)
>    for j in range(len(activities)):
>        # find the upcoming activity
>        if activities[j][1] > activities[i][2]:
>            print(activities[j][0])
>            i = j
>            
>activities = [["A1", 0, 6],
>              ["A2", 3, 4],
>              ["A3", 1, 2],
>              ["A4", 5, 8],
>              ["A5", 5, 7],
>              ["A6", 8, 9]]            
>
>printMaxActivities(activities)
> ```


### [Greedy Algorithm - Coin Change Problem]
> You are given coins of different denominations and total amount of money. Find the `minimum number of coins` that you need to make up the given amount.
> 
> > <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168453001-7cb3d04b-b0fd-4f78-99c0-286fdc4bc565.png">
>  
> `Algorithm`
> ```python
> def coinChange(totalPrice, coins):
>    # [1] data processing
>    N = totalPrice
>    coins.sort()
>    
>    # [2] get the most expensive coins
>    index = len(coins)-1
>    while True:
>        coinValue = coins[index]
>        if N >= coinValue:
>            print(coinValue)
>            N = N - coinValue
>        if N < coinValue:
>            index -= 1
>            
>        if N == 0:
>            break
>            
>coins = [1, 2, 5, 20, 50, 100]
>coinChange(201, coins)
> ```


### [Greedy Algorithm - Fractional Knapsack Problem]
> Given a set of items, each with a weight and a value, determin the number of each item to include in a collection so that the `total weight is less than or equal to a given limit` and the `total value is as large` as possible.

> We need to find out which one has the maximum density. (Density: Value / Weight)

`Algorithm`
```python
class Item:
    def __init__(self, weight, value):
        self.weight = weight
        self.value = value
        self.density = value/weight
    
def knapsackMethod(items, capacity):
    items.sort(key=lambda x: x.density, reverse= True)
    usedCapacity = 0
    totalValue = 0

    for i in items:
        if usedCapacity + i.weight <= capacity:
            usedCapacity += i.weight
            totalValue += i.value
        
        else: # spare area is filled by cutting the box
            unusedWeight = capacity - usedCapacity
            value = i.density * unusedWeight
            usedCapacity += unusedWeight
            totalValue += value

        if usedCapacity == capacity:
            break

    print("Total value obtained: "+str(totalValue))
                
item1 = Item(20,100)
item2 = Item(30,120)
item3 = Item(10,60)
cList = [item1, item2, item3]

knapsackMethod(cList, 50)
```

## [21] Divide and Conquer Algorithm
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168503725-98c534a6-8a77-4d2f-a305-f0d7db88b01e.png">

> works by recursively breaking down a problem into `subprblems of simliar` type,until these become simple enough
> to be solved directly. The solutions to the `subproblems are then combined` to give a solution to the original problem.

> ##### `Optimal Subtructure`
> > If any problem's overall optimal solution can be constructed from the optimal solutions of its subproblem then this problem has optimal substructure. (e.g. fibonacci)

### [Divide and Conquer Algorithm - Fibonacci Series]
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168504620-758a0ad5-6bc6-44fa-8f3a-4c0c98a37947.png">

> A series of numbers in which each number is the sum of the two preceding numbers. First two numbers by definition are 0 and 1.
> 
> Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

### [Divide and Conquer Algorithm - Number Factor]
> ##### `Problem Statement`: 
> Given N, find the number of ways to express N as a sum of `1, 3 and 4`.

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168505438-a94b2c2e-dd28-4067-99a1-087107eae8a1.png">

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168506095-ce9cd15e-5dfb-409f-badf-6f1344ed7a38.png">

> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/168506204-c076f92f-05da-4581-848d-ac4a00919b37.png">

```python
def numberFactor(n):
    if n in (0,1,2):
        return 1
    elif n == 3:
        return 2
    else:
        subP1 = numberFactor(n-1)
        subP2 = numberFactor(n-3)
        subP3 = numberFactor(n-4)
        return subP1+subP2+subP3

print(numberFactor(5))
```

--------



## [00] A Recipe for Problem Solving

* Algorithm: is a set of steps to accomplish a certain task

> ### `3 Steps for problem solving`
> 
> * (1) `Understand the problem`
> 	> 1. Can we `restate` the problem in our own words? (with adjective and noun)
> 	> 2. What are the `inputs` that go into the problem? (Integer? Float?)
> 	> 3. What are the `outputs` that come from the problem? (Integer? Float?)
> 	> 4. Can the outputs be determined from the inputs? In other words, do we have enough information to solve this problem? (Yes)
> 	> 5. What should I label the important piece of data that are the part of a problem? (add, sum)
> 
> * (2) `Explore examples`
> 
> 	> 1. Start with `simple examples` (Write an `expected output` result about `simple` code line.)
> 	> 2. Progress to `more complex examples` (Write an `expected output` result about `complex code` line.)
> 	> 3. Explore examples with `empty input`
> 	> 4. Identify the examples with `invalid inputs`
> 	
> * (3) `Break it down`
> 
> 	> 1. Write out the steps that you need to take (e.g. do SOMETHING, return SOMETHING => fill in the SOMETHING)
> 
>	```python
>	def charCount(str):
>		# declare an object(e.g. dictionary) to return at the end
>		# loop over the string
>			# if the char is letter and it is in out object add one to the value
>			# if the char is letter and it is not in our object add that char to our object with the value of one
>		# return an object
>	```
>	> 2. Think about the exceptional occasion




## [##] Recursion Realization
1. Consider recursion is another method to express `for loop`
2. `In recursion, extend is same as append for list processing`
3. According to the `necessity of additional operaiton` in the final result, we need to `determine whether add '+' operation` at the return statement in else condition. 
4. When we cover `list` extension task, we can put `return` at the last `outside of the conditional statement` because all the elements should be collected.
5. `Recursion can do one thing such as loop the list or getting inside of the multi-layer list(e.g. [[[1]], 2, [3]]).`
6. Think about the flow (n, n-1)
7. If we design the conditional statement which has escapable condition from that bunch, we can use it similar to the loop.
8. We can consider the conditional statement except for containing end condition is ONE FOR LOOP. Importantly, each statement has `i++-like statement` and next calling



## [##] Chicago Realization
1. `Efficiently check the duplicates`: Put the visited values in the list and use `in`! (Without temporal variable such as list, we should use two loops to compare)
2. [`Linked list`]When we assign a data to the node at the left side of the code, the node is updated.



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

list(map(lambda n:2**n, nums))
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
