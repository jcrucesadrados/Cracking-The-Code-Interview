# 4.3 List of Depths / Listas de profundidad

## English

### Description
Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth (e.g., if you have a tree with depth D, you 'll have D linked lists).

### Hints

- **107:** Try modifying a graph search algorithm to track the depth from the root.
- **123:** A hash table or array that maps from level number to nodes at that level might also be useful.
- **135:** You should be able to come up with an algorithm involving both depth-first search and breadth-first search.

### How to proceed
Although the exercise specifies that we are working with a binary tree, that allows us to make some assumptions, we are to consider the case of a general tree (remember that a binary tree is a tree with a maximum of two children for each node).

We are looking for a data structure that contains the lists with all the nodes who belongs to a specific level. So, if the depth of the tree is 3, then we will have 3 lists (one for each level).
As we need to fetch the tree and group the different nodes of the level in the same list, the process must store all the nodes of the level and then, review the children nodes. For each child node, we are going to iterate the lists so it is a mix of BFS and DFS and we need to keep some order in the level lists. That’s why we are going to make coincide the level (layer) with the position in the lists of list levels so we need to contain all the lists inside an other structure that allows to keep the order numbered by position: an Array List. 

## Español
Dado un arbol binario, diseñar un algoritmo que cree una lista enlazada (linkedList) de todos los nodos a esa profundidad (por ejemplo, si tienes un árbol con una profundidad D, tendrás D listas enlazadas)

### Pistas

- **107:** Prueba a modificar un algoritmo de búsqueda de grafos para trazar la profundidad desde la raíz
- **123:** Un Hash Table o un array que mapee para un nivel los nodos de ese nivel puede resultar útil
- **135:** Debes de ser capaz de proceder con un algoritmo que implique tanto depth-first search como breadth-first search

### Cómo proceder

Aunque el ejercicio especifica que estamos trabajando con árboles binarios, lo que permite realizar ciertas asunciones, consideraremos el caso de un arbol genérico (recuerda que un árbol binario es un árbol con un máximo de dos hijos para cada nodo).

Buscamos un tipo de estructura de datos que contenga las listas con todos los nodos que pertenecen a un nivel específico. De esta forma, si la profundidad del árbol es 3, entonces habrá tres listas (una para cada nivel).
Dado que se necesita recorrer el árbol y agrupar los diferentes nodos de un nivel en la misma lista, el proceso deberá guardar todos los nodos de un mismo nivel y, después, revisar os nodos hijos. Para cada nodo hijo, vamos a iterar las listas con lo que esto será una mezcla de BFS y DFS y necesitaremos mantener algún orden respecto a las listas de cada nivel. Por este motivo haremos coincidir el nivel con la posición en la lista de listas de niveles, con lo que necesitaremos contener la lista dentro de alguna estructura que permita guardar el orden numerado por posición: un Array List.
