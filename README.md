# CSCI-605 Recitation - week 14

Here you will find a couple of code snippets as well
as some notes used in RIT course CSCI605's recitation
sessions.

---
### Reminders
- As always, the link to these files is available on your 605 mycourses page
, header Schedule.
- This is our last recitation for this course. Next week are finals
, so be sure to manage you time to allow enough time to review all subjects
 of the course.
- Get some rest, eat well, drink water, review your schedule, study. Repeat.
- If you still did not, please fill the course evaluation for all courses
 you are enrolled.

### Synchronizing RMI Clients
- Hello*, rmi.sh
- Let's recap https://cs.rit.edu/~hpb/Lectures/2211/605/605-337.html
- Now lets say you want that your clients proceed only after 3 clients
 connect to the server. How could we do that?
- Try to change only these files: {HelloImplementationAlternative, HellowServer
 }.java 

### A Semaphore-based Consumer/Producer example
- PC.java
- This is an example of an implementation of a consumer/producer problem
 using the Semaphore class, with strict consumer/producer thread ordering. 
- https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/concurrent/Semaphore.html
- https://www.geeksforgeeks.org/producer-consumer-solution-using-semaphores-java/
- What if we allow more than one item in the store?
- PC2.java


### 2019 Fall's Final exam
- https://www.cs.rit.edu/~hpb/Lectures/2191/605/605-521.html#44.%20Final
  %20Exam%20—%20Dec/16/2019%20-%20version2f
- Questions?
- 
### HW13.1: Multi Producer Consumer problem
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-486.html

### HW13.2: Hangman over the network
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-486.html

### HW13.3: Hangman with Datagrams
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-486.html

### HW14.1: RMI Hangman game
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-490.html



---

Please let me know if you have any questions. You can
always use MyCourses discussion forum (good idea) or
email me or Professor Bischof. I will reply the questions
either to the discussion forum or will email everyone so
every student can benefit from the answers provided.

Cheers,
eduardo.lima at mail.rit.edu