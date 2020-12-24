# 4.1 Minimal Tree / Árbol Mínimo:


## English

### Description
Given a **sorted** (increasing order) array with unique integer elements, write an algorithm to create a binary search tree with minimal height.

### Hints

- **19:** A minimal binary tree has about the same number of nodes on the left of each node as on the right. Let focus on just the root for now. How would you 
ensure that about the same number of nodes are on the left of the root as on the right?
- **73:** You could implement this by finding the "ideal" next element to add and repeatedly calling insertValue. This will be a bit inefficient, as you would have 
to repeatedly traverse the tree. Try recursion instead. Can you divide this problem into subproblems?
- **116:** Imagine we had a createMinimal Tree method that returns a minimal tree for a given array (but for some strange reason doesn't operate on the root of the tree). 
Could you use this to operate on the root of the tree? Could you write the base case for the function? Great! Then that's basically the entire function.

### How to proceed
A Binary Search Tree (BST) is a binary tree where, given a node, the child node of the left is always lower than the right one. So, if we have a sorted array (increasing order) like the next \[1,2,3,4,5,6,7,8,9,10,11\] we can set the root node as the median (the centre position). At the side branches we need to append both sides of the array. Then, once we have selected the middle node (6 in this case), there will be a root node and then, the the two halves of the array must hang from the parent node.

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/0.PNG "1st step")

\[1,2,3,4,5\]  \[7,8,9,10,11\]
 
Next, we need to repeat the process with the two branches: Select the middle node and append the sides:

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/1.PNG "2nd step")

\[1,2\]  \[4,5\]   \[7,8\] \[10,11\]

And again for each new array:

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/2.PNG "Title")

\[1,2\]  \[4,5\]   \[7,8\] \[10,11\]

Finally 

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/3.PNG "Title")

As we can see, this is an iterative process (recursive) so we need to implement a method that select the middle position, create a node and then repeat with the
two sides arrays.

## Español
Dado un array **ordenado** (orden ascendente) de números únicos y enteros, escriba un algoritmo para crear un árbol de búsqueda binario con la altura mínima

### Pistas

- **19:** Un árbol binario mínimo tiene el mismo número de nodos en la rama de la izquierda y en la rama de la derecha. Centrémonos solo en el nodo de origen por ahora. ¿Cómo asegurarías 
que hay el mismo número de nodos a la derecha que a la izquierda del nodo principal? 
- **73:** ¿Puedes implementarlo encontrando el "próximo elemento ideal" y añadirlo repetidamente llamando a inserValue? Esto será un poco ineficiente, dado que tendrás que atravesar repetidamente
el árbol. Prueba en su lugar la recursión. ¿Puedes dividir este problema en subproblemas?
- **116:** Imagine que tenemos un método createMinimal Árbol que devuelve un árbol mínimo para un array dado (pero por alguna extraña razón no opera con el nodo root del árbol). 
¿Puedes usar este para operar con la raíz del árbol? ¿Puedes escribir un caso base para la función? ¡Genial! Esto es básicamente la función entera.

### Cómo proceder

Un árbol de búsqueda binario (BST) es un árbol binario donde, dado un nodo, el nodo hijo de la izquierda siempre es menor que el de la derecha. De esta forma, si se tiene un array ordenado (en orden ascendente) como el siguiente \[1,2,3,4,5,6,7,8,9,10,11\] podemos obtener el nodo raíz como la mediana (la posición central). En las ramas laterales será necesario añadir las dos partes del array así que una vez que se ha seleccionado el nodo central (6  en este caso), habrá un nodo raíz y entonces las dos mitades del array deberán colgar del nodo padre.

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/0.PNG "1st step")

\[1,2,3,4,5\]  \[7,8,9,10,11\]
 
Después, será necesario repetir el proceso con las dos ramas: Seleccionar el nodo de enmedio y colgar las dos partes:

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/1.PNG "2nd step")

\[1,2\]  \[4,5\]   \[7,8\] \[10,11\]

Y de nuevo, para cada uno de los arrays..

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/2.PNG "Title")

\[1,2\]  \[4,5\]   \[7,8\] \[10,11\]

Finalmente 

![Alt text](https://github.com/jcrucesadrados/Cracking-The-Code-Interview/blob/master/chapter4TreesAndGraphs/readme_resources/ch4/4.2/3.PNG "Title")

Como se puede observar, se trata de un proceso iterativo (recursivo) así que necesitamos implementar un método que seleccione la posición central, crear el nodo y entonces repetir con los dos lados del array.
