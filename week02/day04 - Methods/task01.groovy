/*
1  Scope
Look at the following code (with line numbers for clarity) and say where each of the following variables is visible:
i, j, newSize, size.

01  class UnitMatrix {
02    int size;
03
04    void setSize(int size) {
05      this.size = size;
06    }
07
08    void print() {
09      for (int i = 0; i < size; i++) {
10        for (int j = 0; j < size; j++) {
11          if (i == j) {
12            println("1 ");
13          } else {
14            println("0 ");
15          }
16        }
17        println ""
18      }
19    }
20  }

i is visible inside the first and second for loops (loop scope)
j is visible inside the second for loop only (loop scope)
newSize is visible inside of the method 'setSize' only (method scope)
size is visible within the whole class and all contained methods (class scope)

*/