package main;

public interface ICircularQueue {
	boolean add(String element);
	String remove();
	int size();
	String toString();
}
