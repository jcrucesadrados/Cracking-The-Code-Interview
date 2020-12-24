# 4.1 Route Between Nodes / Rutas entre nodos:


## English

### Description
Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

### Hints

- **127:** Two well-known algorithms can do this. What are the tradeoffs between them?

### How to proceed
As we are fetching (searching) inside a graph, there are two possible algorithms: DFS or BFS. For the paths search, the best option is use BFS (breadth-first search).

That means that we are going to fetch the graph by levels. First we need to visit the first level and get their child, but we are not going to visit them now, se we need to sotre them 
in an ordered list, where we can make FiFo operations, that is a Queue or something that operates like a queue, for example a LinkedList. 

As we are starting with a start node we can consider it unique in its level, so we can enqueue it and later start fetching the queue. For each node of the queue, we need to check
if it has been visited in the past (remember that we are working with a **graph** so this is an option). If we haven't visited it yet, we need to visit it child nodes, having two options:
- If the node is the end node, then finish the execution and return true (we only need to know if there is any route but not the concrete route).
- If the node isn't the end node, then we need to enqueue it for a future review (in the next level).

If the queue (the LinkedList) gets empty, then and we haven't aborted the algorithm, then there is not a route between the two nodes (return false).

## Español
Dado un grafo directo (graph direct), diseñar un algoritmo para determinar si existe una ruta entre dos nodos.

### Pistas

- **127:** Hay dos algoritmos bien conocidos que pueden hacer esto. ¿Cuáles son las diferencias entre ellos?

### Cómo proceder
Dado que estamos recorriendo (buscando) dentro de un grafo, existen dos posibles algoritmos con los que se puede proceder: DFS o BFS. Para la búsqueda de rutas o caminos la opción es
emplar BFS.

Esto quiere decir que amos a recorrer el grafo por niveles. Primero necesitams visitar el primer nivel y obtener sus hijos, pero en un primer momento no queremos evaluar los hijos (visitarlo)
por lo que necesitamos almacenarlos en una lista ordenada que nos permita realizar operaciones FiFO, esto es una cola (Queue) o algo que funcione de manera similar, como por ejemplo las listas enlazadas (LinkedList).

Dado que empezaremos por el nodo inicial podemos considerar que será único en su nivel, con lo que se puede encolar directamente y luego ir revisando la cola. Para cada nodo que se tiene en la cola
es necesario verificar si ya se ha revisado (ten en cuenta que estams trabajando con un **grafo** y por lo tanto es una opción). Si no se ha visitado el nodo aún entonces tenemos que recoger sus nodos hijos, habiendo dos opciones:
- Si el nodo hijo es el nodo final, entonces finalizamos la ejecución y devolvemos true (solo necesitamos saber si existe una ruta pero no obtener la ruta concreta).
- Si el nodo hijo no es el nodo final, entonces lo encolaremos para revisarlo en el futuro (en el siguiente nivel).

Si la cola (la lista enlazada) se queda vacía, quiere decir que no hemos abortado el algoritmo antes, luego no existe una ruta entre los dos nodos (devolvemos falso)
