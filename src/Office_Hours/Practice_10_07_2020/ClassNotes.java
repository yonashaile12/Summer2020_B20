package Office_Hours.Practice_10_07_2020;

public class ClassNotes {

    /*
    10/07/2020
Practice Topics: Collection:
							List Interface
							Set Interface
							Iterable Interface
Package name: Practice_10_07_2020
Collection: Interface, extended by List, Set, Queue
List vs Set: size is dynamic, only supports Objects
	List: accepts duplicated objects, has index number, size is dynamic
		ArrayList: Array Based
					retrieving object is faster ( get() )
		LinkedList: doubly linked (fastest)
					add & remove functions are faster ( add(), addAll(), remove(), removeAll(), retainAll(), removeIf() )
		Vector: is synchronized
				advantage: Thread-safe
		Stack: is synchronized
				pop(): Last in first out order
	Set: does not accepts duplicated objects, does not have index number, size is dynamic
		HashSet: changes the insertion order (order is random)
					accepts null
		LinkedHashSet: does not change the insertion order
		TreeSet: implements SortedSet interface, sorts the objects in ascending order
					does not accept null
synchronized :  Thread-safe
		advantage: Thread-safe
		disadvantage: slow
Thread: process of scheduling the object by the operating system
Thread-safety: in multiple threads, each thread gets executed one at a time
Iterable(I): allows us to access objects in collection type, also allows us to remove them
		if a class has IS A relation with Iterable, then we can apply Iterator (I)
		iterator(): return Iterator (I) after iterating the objects of the Collection
		hasNext(): checks if there is object can be iterated and accessible, return boolean
		next(): access to the object and returns it if hasNext() is true
		remove(): removes the correct objects that's accessed from collection
     */

}
