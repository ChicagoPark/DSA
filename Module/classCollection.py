class Node:
    def __init__(self, value=None):
        self.value = value
        self.next  = None
    def __str__(self):
        return str(self.value)

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
    def __iter__(self):
        node = self.head
        while node != None:
            yield node
            node = node.next
class Queue:
    def __init__(self):
        self.linkedList = LinkedList()
    
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
