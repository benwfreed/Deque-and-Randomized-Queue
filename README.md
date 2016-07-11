# deques
An Implementation of the Double-Ended Queue ADT

This project implements two generic data types. The first is a double-ended queue or deque. The second is a randomized queue.

The Deque.java file contains the deque API, which supports the following operations: 
(1) construct an empty deque;
(2) check if the deque is empty; 
(3) return the number of items on the deque; 
(4) insert an item at the front; 
(5) insert an item at the end; 
(6) delete and return the item at the front; 
(7) delete and return the item at the end; 
(8) return an iterator over items in order from front to end.

The deque implementation supports each deque operation (including construction) in constant worst-case time and uses space proportional to the number of items currently in the deque. The iterator implementation supports each operation (including construction) in constant worst-case time.

The RandomizedQueue.java file contains the randomized queue API, which supports the following operations: 

(1) construct an empty randomized queue;
(2) check if the queue empty;
(3) return the number of items on the queue;
(4) add an item;
(5) delete and return a random item;
(6) return (but do not delete) a random item;
(7) return an independent iterator over items in random order.

The randomized queue implementation supports each randomized queue operation (besides creating an iterator) in constant amortized time and uses space proportional to the number of items currently in the queue. That is, any sequence of M randomized queue operations (starting from an empty queue) takes at most cM steps in the worst case, for some constant c. The iterator implementation supports next() and hasNext() methods in constant worst-case time and construction in linear time.

The Subset.java file is a client that takes a command-line integer k; reads in a sequence of strings from standard input using StdIn.readString(); and prints out exactly k of them, uniformly at random. The running time is linear.

If you would like to run the client program as is, you can download the StdIn and StdOut packages it uses here: http://introcs.cs.princeton.edu/java/stdlib/
