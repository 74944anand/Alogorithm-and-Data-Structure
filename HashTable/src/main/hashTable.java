package main;

import java.util.LinkedList;

class hashTable {

	class pair {
		private int key;
		private String name;

		public pair() {
			key = 0;
			name = "";
		}

		public pair(int key, String name) {
			this.key = key;
			this.name = name;
		}

		@Override
		public String toString() {
			return "hash [key=" + key + ", name=" + name + "]";
		}
	}

	private final int SLOTS = 10;
	private LinkedList<pair> table[];

	public hashTable() {
		table = new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++) {
			table[i] = new LinkedList<>();
		}
	}
	
	public int hash(int key) {
		return key%SLOTS;
	}
	public void put(int key, String name) {
		int slot=hash(key);
		LinkedList<pair> bucket=table[slot];
		for(pair p: bucket) {
			if(key==p.key) {
				p.name=name;
				return;
			}
		}
		pair p=new pair(key,name);
		bucket.add(p);
		System.out.println("Added: "+ p);
	}

	public String getValue(int key) {
		int slot=hash(key);
		LinkedList<pair> bucket=table[slot];
		for(pair p: bucket) {
			if(key==p.key) {
				return p.name;
			}
		}
		return null;
	}
	
}

