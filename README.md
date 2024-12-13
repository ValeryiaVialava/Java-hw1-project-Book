#### **TASK**

Create two new classes: `Book` and `MyFirstProgram`.  

In the `Book` class, the following elements should be included:  
- A final field containing the name of the book (type `String`).  
- A final field containing the number of pages in the book.  
- A field containing information about whether the book has been read. Initially, every book is unread.  
- A field containing information about how many pages have been read. Initially, this value is `0`.  
- A constructor with parameters for the name and the number of pages.  
- A method that allows adding a specific number of pages to the read count (e.g., `addReadPages(int numberOfPages)`). If the number of read pages is greater than or equal to the total number of pages, the book is marked as read. (The `if` statement is written the same way as in C++.)  

In the `MyFirstProgram` class, the `main` method should implement the following scenario:  
- Create two books.  
- Print their names and the number of pages to the screen.  
- Print the number of pages read in the first and second books.  
- Print information on whether both books are read or unread.  
- Add enough pages to the first book so that it becomes read.  
- Add some pages to the second book so that it remains unread.  
- Print the number of pages read in the first and second books.  
- Print information on whether both books are read or unread.

---

```
First book: Learn C++, Pages: 427
Second book: Java for beginners, Pages: 328
0 pages read in the First book
0 pages read in the Second book
First book is not finished
Second book is not finished
---------------------------------
427 pages read in the First book
100 pages read in the Second book
First book is finished
Second book is not finished
```

