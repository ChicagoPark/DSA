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
