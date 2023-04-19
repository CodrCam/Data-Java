# Problem Domain:

The problem domain is focused on two array manipulation tasks: inserting an element at the middle index of an array and removing the middle element of an array, shifting the other elements to fill the gaps.

Visual:

![wb1](/content/wb1.png)

![wb2](/content/wb2.png)

Code:

[insertArray](/src/Main.java)

Test:
For insertShiftArray:
Input: [2, 4, 6, -8], 5
Output: [2, 4, 5, 6, -8]
Input: [42, 8, 15, 23, 42], 16
Output: [42, 8, 15, 16, 23, 42]
For removeShiftArray:
Input: [2, 4, 5, 6, -8]
Output: [2, 4, 6, -8]
Input: [42, 8, 15, 16, 23, 42]
Output: [42, 8, 15, 23, 42]