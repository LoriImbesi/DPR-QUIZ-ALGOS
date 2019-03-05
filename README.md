# DPR-QUIZ-ALGOS
Algorithm Quiz 1
 
<h4>Please answer the following questions by forking this project. Respond within the README file by editing it. Then submit your Github URL on Canvas</h4>
<ol>
 <li>What does sheevpalpatine.java do? You can copy the code from above and use a browser ide here... https://www.compilejava.net/</li>
  <li>Submit a binary search example by adding a file to this project after forking it. Be sure to explain how the example functions using comments or in this README.</li>
  <li>Is a selection sort or a bubble sort faster?</li>
 </ol>
 <h4>Quiz responses:</h4>
<ol>
 <li> The sheevpalpatine.java program checks to see if a string is a palindrome. If it is not, the program returns "false."</li>
 <li> Binary search is a half-interval search, aka, a "divide and conquer" algorithm. My binary search example is in a file.  </li>
 <li> A selection sort algorithm is slightly faster than bubble sort. The bubble sort compares adjacent pairs of values and swaps them if they are in the wrong order. As the list is sorted, the largest element "bubbles up" to the front, then the next largest element, and so on. This takes a long time because the largest numbers are moving up incrementally as adjacent numbers are repeatedly compared and their positions are, potentially, swapped until the list is in order. In Big O notation, which refers to space and time complexity, bubble sort is the poorest performing of the O(n<sup>2</sup>) algorithms.
  <p>A selection sort algorithm goes through an unsorted list of elements and compares values two at a time. It iterates through the entire list to find the smallest value and moves it to the front of the list. As it is sorting, the values fall into one of two lists - values that have been sorted and those that have not. The selection sort algorithm is outperformed by the insertion sort.</p>  </li>
