
````markdown
# 🧠 Data Structures & Algorithms — Java

> A structured journey of learning, implementing, and practicing Data Structures & Algorithms using Java.

This repository contains my Java-based **Data Structures and Algorithms (DSA)** implementations, practice programs, and problem-solving exercises.

The purpose of this repository is to build a strong foundation in DSA by understanding concepts, implementing them from scratch, practicing different approaches, and gradually progressing toward advanced topics.

---

## 🎯 Repository Goals

- 🧠 Build strong problem-solving skills
- ☕ Strengthen Java programming fundamentals
- 🧩 Understand fundamental and advanced data structures
- ⚙️ Implement algorithms from scratch
- 📊 Understand Time and Space Complexity
- 🔄 Practice different problem-solving approaches
- 🎯 Prepare for coding interviews and placements
- 📈 Maintain a structured record of my DSA journey

---

# 📚 Topics

This repository covers the following major Data Structures and Algorithms topics:

### 🔢 Arrays

Fundamental linear data structure used to store elements in contiguous memory.

**Topics:**
- Array Traversal
- Insertion
- Deletion
- Searching
- Updating Elements
- Two Pointer Technique
- Prefix Sum
- Sliding Window
- Array-Based Problems

---

### 🔤 Strings

String manipulation and problem-solving using Java.

**Topics:**
- String Traversal
- Character Operations
- String Comparison
- StringBuilder
- String Manipulation
- Palindrome Problems
- Frequency Counting
- Substrings
- String Searching

---

### 🔁 Recursion

Understanding how a function calls itself to solve smaller versions of a problem.

**Topics:**
- Base Conditions
- Recursive Calls
- Recursive Problem Solving
- Recursion Trees
- Mathematical Recursion
- Divide and Conquer
- Backtracking Basics

#### 🗼 Current Practice

**Tower of Hanoi**

The current implementation demonstrates:
- Recursive function calls
- Base condition
- Source rod
- Destination rod
- Auxiliary rod
- Recursive problem decomposition

---

### 🔗 Linked Lists

Dynamic node-based data structures where elements are connected using references.

#### Singly Linked List

**Operations:**
- Insert First
- Insert Last
- Insert Before
- Insert After
- Delete First
- Delete Last
- Delete Particular Node
- Ordered Insertion
- Traversal

**Structure:**

```text
HEAD
 ↓
[10] → [20] → [30] → NULL
````

#### Doubly Linked List

Each node maintains references to both the previous and next nodes.

**Operations:**

* Insert First
* Insert Last
* Insert Before
* Insert After
* Delete Particular Node
* Forward Traversal

**Structure:**

```text
NULL ← [10] ⇄ [20] ⇄ [30] → NULL
```

#### Circular Linked List

The last node points back to the first node, creating a circular structure.

**Operations:**

* Insert First
* Insert Last
* Insert Before
* Insert After
* Ordered Insertion
* Delete First
* Delete Last
* Delete Particular Node
* Circular Traversal

**Structure:**

```text
        ┌──────────────────────┐
        │                      ↓
     [10] → [20] → [30] → [40]
       ↑                      │
       └──────────────────────┘
```

---

### 📚 Stack

A Stack follows the **LIFO (Last In, First Out)** principle.

**Topics:**

* Stack Using Array
* Push
* Pop
* Peep
* Change
* Overflow
* Underflow
* Top Pointer
* Stack Applications

#### Current Practice

**Array-Based Stack Implementation**

```text
push()
pop()
peep()
change()
```

**Stack Representation:**

```text
       TOP
        ↓
     ┌─────┐
     │ 30  │
     ├─────┤
     │ 20  │
     ├─────┤
     │ 10  │
     └─────┘

Last In → First Out
```

---

### 🚶 Queue

A Queue follows the **FIFO (First In, First Out)** principle.

**Topics:**

* Queue Using Array
* Enqueue
* Dequeue
* Front
* Rear
* Overflow
* Underflow
* Circular Queue
* Queue Applications

---

### 🔍 Searching Algorithms

Algorithms used to locate elements efficiently.

**Topics:**

* Linear Search
* Binary Search
* Iterative Binary Search
* Recursive Binary Search
* Searching in Sorted Arrays
* Search Space Reduction

---

### 🔀 Sorting Algorithms

Algorithms used to arrange data in a specific order.

**Topics:**

* Bubble Sort
* Selection Sort
* Insertion Sort
* Merge Sort
* Quick Sort
* Counting Sort
* Stable and Unstable Sorting
* Sorting Complexity Analysis

---

### 🌳 Trees

Hierarchical data structures consisting of nodes connected through edges.

**Topics:**

* Root
* Parent
* Child
* Leaf
* Height
* Depth
* Binary Trees
* Tree Traversals

**Traversal Techniques:**

* Preorder
* Inorder
* Postorder
* Level Order

---

### 🌲 Binary Search Tree

A Binary Search Tree follows the property:

```text
Left Subtree < Root < Right Subtree
```

**Topics:**

* BST Creation
* Insertion
* Searching
* Deletion
* Minimum Value
* Maximum Value
* Tree Traversals
* BST Properties

---

### ⛰️ Heap

A Heap is a specialized tree-based data structure.

**Topics:**

* Min Heap
* Max Heap
* Heapify
* Insertion
* Deletion
* Priority Queue
* Heap Sort

---

### #️⃣ Hashing

Hashing provides efficient data storage and retrieval using key-value relationships.

**Topics:**

* Hash Functions
* Hash Tables
* Collision
* Collision Handling
* HashMap
* HashSet
* Frequency Counting

---

### 🕸️ Graphs

Graphs are used to represent relationships between different entities.

**Topics:**

* Vertices
* Edges
* Directed Graph
* Undirected Graph
* Weighted Graph
* Graph Representation
* Adjacency Matrix
* Adjacency List
* Breadth First Search (BFS)
* Depth First Search (DFS)

---

### 🧮 Dynamic Programming

Dynamic Programming solves complex problems by breaking them into smaller overlapping subproblems.

**Topics:**

* Recursion to Dynamic Programming
* Memoization
* Tabulation
* Overlapping Subproblems
* Optimal Substructure
* 1D Dynamic Programming
* 2D Dynamic Programming
* Common DP Problems

---

# 🧩 Current Implementations

| Program            | Topic                      | Status      |
| ------------------ | -------------------------- | ----------- |
| 🗼 `Toh.java`      | Recursion — Tower of Hanoi | ✅ Practiced |
| 📚 `Push.java`     | Stack Using Array          | ✅ Practiced |
| 🔗 `SLL.java`      | Singly Linked List         | ✅ Practiced |
| 🔗 `DLL.java`      | Doubly Linked List         | ✅ Practiced |
| 🔄 `CircleLL.java` | Circular Linked List       | ✅ Practiced |

More implementations will be added as the learning journey progresses.

---

# 📊 Learning Progress

| Topic                   | Status      |
| ----------------------- | ----------- |
| 🔢 Arrays               | 🔄 Learning |
| 🔤 Strings              | 🔄 Learning |
| 🔁 Recursion            | ✅ Practiced |
| 🔗 Singly Linked List   | ✅ Practiced |
| 🔗 Doubly Linked List   | ✅ Practiced |
| 🔄 Circular Linked List | ✅ Practiced |
| 📚 Stack                | ✅ Practiced |
| 🚶 Queue                | ⏳ Upcoming  |
| 🔍 Searching            | ⏳ Upcoming  |
| 🔀 Sorting              | ⏳ Upcoming  |
| 🌳 Trees                | ⏳ Upcoming  |
| 🌲 Binary Search Tree   | ⏳ Upcoming  |
| ⛰️ Heap                 | ⏳ Upcoming  |
| #️⃣ Hashing             | ⏳ Upcoming  |
| 🕸️ Graphs              | ⏳ Upcoming  |
| 🧮 Dynamic Programming  | ⏳ Upcoming  |

---

# 🛠️ Technology

### ☕ Language

**Java**

### 🧠 Core Concepts

* Object-Oriented Programming
* Classes and Objects
* Constructors
* Methods
* Arrays
* References
* Recursion
* Data Structures
* Algorithms
* Problem Solving
* Time Complexity
* Space Complexity

---

# 📈 DSA Roadmap

```text
🔢 Arrays
      ↓
🔤 Strings
      ↓
🔁 Recursion
      ↓
🔗 Linked Lists
      ↓
📚 Stack
      ↓
🚶 Queue
      ↓
🔍 Searching
      ↓
🔀 Sorting
      ↓
🌳 Trees
      ↓
🌲 Binary Search Tree
      ↓
⛰️ Heap
      ↓
#️⃣ Hashing
      ↓
🕸️ Graphs
      ↓
🧮 Dynamic Programming
```

---

# 💻 How to Run

Make sure Java is installed on your system.

### Check Java Version

```bash
java --version
```

### Compile a Java Program

```bash
javac FileName.java
```

### Run the Program

```bash
java FileName
```

### Example

```bash
javac Toh.java
java Toh
```

---

# 📁 Recommended Structure

```text
DSA-Java/
│
├── 01_Arrays/
│
├── 02_Strings/
│
├── 03_Recursion/
│   └── Toh.java
│
├── 04_LinkedList/
│   ├── SLL.java
│   ├── DLL.java
│   └── CircleLL.java
│
├── 05_Stack/
│   └── Push.java
│
├── 06_Queue/
│
├── 07_Searching/
│
├── 08_Sorting/
│
├── 09_Trees/
│
├── 10_BST/
│
├── 11_Heap/
│
├── 12_Hashing/
│
├── 13_Graphs/
│
└── 14_DynamicProgramming/
```

---

# 🧠 Learning Approach

For every topic, my learning process follows:

```text
📖 Learn the Concept
        ↓
🧠 Understand the Logic
        ↓
✍️ Implement from Scratch
        ↓
🧪 Test with Different Inputs
        ↓
📊 Analyze Complexity
        ↓
🧩 Solve Problems
        ↓
🚀 Improve the Solution
```

The focus is on understanding **how a data structure or algorithm works, why it works, and where it can be applied**.

---

# 🎯 Goals

### Short-Term

* ☕ Strengthen Java fundamentals
* 🧠 Build a strong DSA foundation
* 🔗 Master fundamental data structures
* 🔄 Practice DSA consistently
* 🧩 Improve logical thinking
* 📊 Understand complexity analysis

### Long-Term

* 🚀 Master advanced DSA
* 🧩 Solve coding interview problems
* 💻 Improve competitive programming skills
* 🎯 Prepare for software engineering placements
* 🧠 Develop strong algorithmic thinking

---

# 🌱 Continuous Learning

This repository is a work in progress.

I will continue adding:

* 📚 New Data Structures
* ⚙️ New Algorithms
* 🧩 Problem-Solving Exercises
* 📊 Complexity Analysis
* 💡 Improved Implementations
* 🎯 Interview-Oriented Problems

```text
Learn → Implement → Practice → Analyze → Improve → Repeat 🔁
```

---

# 👨‍💻 Author

## Jeel Finaviya

🎓 Computer Science & Information Technology Student
💻 Software Development Enthusiast
🤖 AI/ML Enthusiast
🧠 DSA & Problem-Solving Learner

### 🔗 GitHub

[https://github.com/JeelFinaviya](https://github.com/JeelFinaviya)

---

# ⭐ DSA Journey

> Consistency beats intensity.

This repository represents my continuous journey of learning and practicing **Data Structures & Algorithms using Java**.

The goal is simple:

**Learn → Code → Practice → Improve 🚀**

```
```
