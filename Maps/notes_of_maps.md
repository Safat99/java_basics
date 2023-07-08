## Map

[geeks for geeks](https://www.geeksforgeeks.org/hashtable-in-java/)

The hierarchy
```
Map_interface
   ├── HashMap
   ├── hashtable
   ├── LinkedHashMap
   └── SortedMap
       └── TreeMap
```

*  Map is just a set of key value pair. <br>
*  **Map** is the interface, We have to use **HashMap** for the implementation.
* Map doesn't care about the order.
* HashMap accepts null element.
* TreeMap doesn't accept null element.
* TreeMap maintains the order, hashmap doesn't.


### Basic functions of HashMap

* put() --> for add and update new key-value pair.
* get() --> for getting the value.
* containsKey("...") --> return boolean true if present.
* containsValue("...") --> return boolean true if value present.
* replace() --> normally updates, but in the case of not present the key, replace do nothing.
* putIfAbsent() --> insert new element if not present, otherwise do nothing.

### Features of Hash Table

* Synchronized / Thread safe. This can also result in slower performance compare to other implementations of Map interface. 
* To store and retrieve objects from hashtable, objects as key and values must implement the **hashCode method** and equals method.
* usage of hash table is discouraged. Instead HashMap and ConcurrentHashMap should be used.
* default capacity of HashTable class in java is 11 and the **load factor** is 0.75.
* not allows null key:value pairs.


### Difference between Hash Map and Hash Table
<br>

---
| HashMap | HashTable |
| ---   | ---   |
| 1. Non synchronized | 1. Synchronized/Thread Safe |
| 2. Allows one null key, multiple null values | 2. Not allow any null key : values | 
| 3. Fast | 3. Slow
| 4. Has to traverse by Iterator | 4. Has to traverse by Iterator and Enumerator | 
| 5. Iteration in Hash Map is **fail fast** iterator. | 5. **Fail safe** iterator
| 6. Inherits AbstractMap class. | 6. Inherits Dictionary class 