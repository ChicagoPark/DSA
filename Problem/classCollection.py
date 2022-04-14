from random import randint
class Node:
    def __init__(self,value = None):
        self.value = value
        self.next = None
        self.prev = None
    def __str__(self):
        return str(self.value)

class linkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        
    def __iter__(self):
        tempNode = self.head
        while tempNode:
            yield tempNode
            tempNode = tempNode.next
            
    def __str__(self):
        values = [str(x.value) for x in self]
        return ' -> '.join(values)
    
    def __len__(self):
        result = 0
        tempNode = self.head
        while tempNode:
            result+=1
            tempNode = tempNode.next
        return result
    
    def add(self, value):
        if self.head == None:
            newNode = Node(value)
            self.head = newNode
            self.tail = newNode
        else:
            newNode = Node(value)
            self.tail.next= newNode
            self.tail = self.tail.next
        return self.tail
    # generate random linked list
    def generate(self, n, min_value, max_value):
        self.head = None
        self.tail = None
        for i in range(n):
            self.add(randint(min_value, max_value))
        return self
    
class Queue:
    def __init__(self):
        self.linkedList = linkedList()
    
    def __str__(self):
        values = [str(x) for x in self.linkedList]
        return ' '.join(values)
    
    def enqueue(self, value):
        newNode = Node(value)
        if self.linkedList.head == None:
            self.linkedList.head = newNode
            self.linkedList.tail = newNode
        else:
            self.linkedList.tail.next = newNode
            self.linkedList.tail = newNode
    
    def isEmpty(self):
        if self.linkedList.head == None:
            return True
        else:
            return False
    
    def dequeue(self):
        if self.isEmpty() == True:
            return "There is not any node in the Queue"
        else:
            tempNode = self.linkedList.head
            if self.linkedList.head == self.linkedList.tail:
                self.linkedList.head = None
                self.linkedList.tail = None
            else:    
                self.linkedList.head = self.linkedList.head.next
            return tempNode
                
    
    def peek(self):
        if self.isEmpty() == True:
            return "There is not any node in the Queue"
        else:
            return self.linkedList.head.value
        
    def delete(self):
        if self.isEmpty() == True:
            return "There is not any node in the Queue"
        else:
            self.linkedList.head = None
            self.linkedList.tail = None

