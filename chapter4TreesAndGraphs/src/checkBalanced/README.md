# 4.1 Check Balanced / Comprobar balanceado:


## English

### Description

Implement a function to check if a **binary tree** is **balanced**. For the purposes of this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more than one.

### Hints

- **21:** Think about the definition of a balanced tree. Can you check that condition for a single node? Can you check it for every node?
- **33:** If you've developed a brute force solution, be careful about its runtime. If you are computing the height of the subtrees for each node, you could have a pretty inefficient algorithm.
- **49:** What if you could modify the binary tree node class to allow a node to store the height of its subtree?
- **105:** You don't need to modify the binary tree class to store the height of the subtree. Can your recursive function compute the height of each subtree while also checking if a node is balanced? Try having the function return multiple values. 
- **124:** Actually, you can just have a single checkHeight function that does both the height computation and the balance check. An integer return value can be used to indicate both.

### How to proceed
In order to solve this problem, the first thing that we have to do is analyse the definition of "balanced tree" and binary tree. A binary tree is those tree that, for each node, has a maximum of two child nodes. We say that a binary tree is balanced if, given a node, the height of the two branches differ at most by 1.
So, for each level, we need to get the height of the node and check if it is balanced, that is, if the height of the children nodes do not differ in more than one. 
To calculate the height of the node we need to calculate the height of the children nodes and add 1 to the highest one. 
We are going to do it with a recursive function for compute the hight. At the same time, we are going to check if it is balanced. As the height is a number, if the tree is unbalanced, we need to stablish a way to code it (we can not return a boolean value or an integer, so we are going to code it as the lowest integer possible).

## Español

Implementa una función para comprobar si un **árbol binario** está **balanceado**. Para el propósito de esta cuestión, un árbol binario se define como un árbol tal que las alturas de los dos subárboles de cada nodo nunca difieren en más de uno.

### Pistas

- **21:** Piensa sobre la definición de árbol binario. ¿Puedes comprobar la condición para un único nodo? ¿Puedes verificarla para todos los nodos?
- **33:** Si has desarrollado una solución por fuerza bruta, ten cuidado con el tiempo de ejecución. Si estás computando la altura de los subárboles para cada nodo, puedes tener un algoritmo bastante ineficiente.
- **49:** ¿Que ocurriría si puedieras modificar la clase nodo del arbol binario para poder almacenar la altura del subárbol? 
- **105:** No neceistas modifcar la clase del árbol binario para almacenar la altgura del subárbol. ¿Puede tu función recursiva computar la altura de cada subárbol a la vez que comprobar si un nodo está balanceado? Prueba haciendo a la función devolver múltiples valores
- **124:** Actualmente, simplemente puedes tener una única función checkHeight que puede computar la altura y verificar el balanceo. Un valor entero devuelto puede usarse para indicar ambas cosas.

### Cómo proceder

Con el fin de resolver este problema, lo primero que tenemos que hacer es analizar la definición de "árbol balanceado" y árbol binario. Un arbol binario y aquel que, para cada nodo, tiene un máximo de dos nodos hijos. Decimos que un árbol binario está balanceado si, dado un nodo, la altura de las dos ramas difiere como mucho en 1.
De esta forma, para cada nivel, necesitamos obtener la altura de cada nodo y comprobar si está balanceado, esto es, si la altura de los nodos hijos no difieren en más de uno.
Para calcular la altura de un nodo es necesario calcular la atura de cada uno de los nodos hijos y añadir 1 a la altura más alta.
Haremos esto en con una función recursiva para calcular la altura. A la misma vez vamos a comprobar si está balanceado. Dado que la altura es un número, si el árbol está desbalanceado necitamos establecer una forma de codificarlo (no podemos devolver a la vez un valor booleano o un entero, así que codificaremos esto como el menor entero posible). 