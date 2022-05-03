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
>
> All the recursion can be replaced by iteration(`One for loop`). 

> Why Recursion?
> * [1] It helps `break down big problems` into smaller ones and easier to use.
> * [2] The prominent usage of recursion in data structures like `trees and graphs`.
> * [3] It is used in many algorithms (divide and conquer, greedy and dynamic programming).

> When to choose recursion?
> * [1] When we `can easily breakdown a problem` into similar subproblem.
> * [2] When we are `fine with extra overhead` (both time and space) that comes with it.
> * [3] When we `need a quick` working solution instead of efficient one.
> * [4] When `traverse a tree`


> `When to avoid recursion?`
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
>   * When we need `mathematic operations`

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

<!--
### [8-3] Creation of Singly Linked List

* [1] Create Head and Tail nodes, initalized with None

* [2] Create a blank Node Class and assign a value to it and reference to NULL

* [3] Link Head and Tail with these Node

> <img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/160230952-b37175f5-1afc-4f87-8de1-15edda567ddd.png">
-->



### [8-3] `Important Intuition in Linked List`
> We need to perceive deeply what is the `instance variable(self.head etc)` in a linked list class `which is strong criteria in all algorithms.`
> 
> process the `inputing node first` and next one is the `existing list` then `the head and tail`.
> 
> Insertion: Process the subsidiary trait of main instance variable(self.head, self.tail) first such as `self.head.next` or `self.tail.next`.
> 
> Deletion: We need to control surrounding nodes of target node. We need to `remove all` the `incoming direction connection` to the target node.
> 
> The `tip parts of Circular Linked List` are `not NULL`.
> 
> `When we delete entire list, we need to make nodes do not be referenced by anything.` That's why we need to loop inside and make ALL_NODE.prev = None (From the node which is not referenced by other nodes, linked list is started to be eliminated.)
> 
> When we delete entire One-way list, we can set `self.head = None, self.tail = None`. Otherwise, when we delete Two-way list, we need to loop inside and make sure there is node which is referenced by some node.
> 
> Check the existance of linked list through 2 steps. (1) self.head != None, (2) self.head == self.tail

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

### [8-4] Time complexity: Array vs Linked List

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
> * (1. creation), (2. insertation), (3. deletion), (4. search), (5. traverse), (6. deletion)
> 
> #### (operation 1) insertation
> 	> * `don't put` nodeVariable `at the left side of the insertation function` call.
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
> Find the minimum or maximum number among a set of numbers in logN time. And also we want to make sure that inserting additional numbers does not take more than O(logN) time
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
> 	> [Pros]: Hash table never gets full
> 	> [Cons]: Huge linked list causes performance leaks (Time complexity for search operation becomes O(n).)


> * (2) `Open Addressing`: Create 2X size of current Hash Table and recall hasing for current keys.
> 	> [Pros]: Easy Implementation
> 	> [Cons]: When Hash Table is full, creation of new Hash table affects performance (Time complexity for search operation becomes O(n))
>
> [Selection 1]: If the input size is known, we always use "Open addressing"
> 
> [Selection 2]: If we perform deletion operation frequently we use "Direct Chaining" (Open addressing will stop searching when it encounter empty cell)

### [Hashing - Practical Use of Hashing]
> 1. Password verification: Change user information to hash value and keep it
> 
> 2. File system: File path is mapped to physical location on disk through Hashing



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


### [Sort - Bubble Sort]
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166395889-5c3cba74-d1da-4dd2-8ced-277473c6d0ae.png">
>
> We repeatedly compare each pair of adjacent items and swap them if they are in the wrong order. (Put the biggest item at the right side accumulatively)
>
> #### When to use Bubble Sort?
> 
> > When the input is already sorted
> > 
> > Space is a concern
> > 
> > Easy to implement
> 
> #### When to avoid Bubble Sort?
> 
> > Average time complexity is poor

### [Sort - Selection Sort] (fill from index 0)
> <img width="350" alt="IMG" src="https://user-images.githubusercontent.com/73331241/166398706-b3f6a429-4b27-4038-b0cc-146b9f0ecd65.png">
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
1. `local variable can be used` from the belonged function `whether we initialize` the value `from the conditional argument`. (Before the function is returned?)
2. `Efficiently check the duplicates`: Put the visited values in the list and use `in`! (Without temporal variable such as list, we should use two loops to compare)
3. [`Linked list`]When we assign a data to the node at the left side of the code, the node is updated.



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
