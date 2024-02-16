import java.util.*;

public class RandomizedSet {
    private static Map<Integer, Integer> map; // Map to store mapping between elements and their indices
    private static List<Integer> list; // List to store elements

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // If the element already exists, return false
        }
        map.put(val, list.size()); // Add the element to the map with its index in the list
        list.add(val); // Add the element to the end of the list
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // If the element does not exist, return false
        }
        int index = map.get(val); // Get the index of the element in the list
        int lastElement = list.getLast(); // Get the last element in the list
        list.set(index, lastElement); // Replace the element to be removed with the last element
        map.put(lastElement, index); // Update the mapping for the last element
        list.removeLast(); // Remove the last element from the list
        map.remove(val); // Remove the element from the map
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(list.size()); // Generate a random index within the size of the list
        return list.get(index); // Return the element at the random index
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.print(randomizedSet.insert(1) + " "); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        System.out.print(randomizedSet.remove(2) + " "); // Returns false as 2 does not exist in the set.
        System.out.print(randomizedSet.insert(2) + " "); // Inserts 2 to the set, returns true. Set now contains [1,2].
        System.out.print(randomizedSet.getRandom() + " "); // getRandom() should return either 1 or 2 randomly.
        System.out.print(randomizedSet.remove(1) + " "); // Removes 1 from the set, returns true. Set now contains [2].
        System.out.print(randomizedSet.insert(2) + " "); // 2 was already in the set, so return false.
        System.out.print(randomizedSet.getRandom()); // Since 2 is the only number in the set, getRandom() will always return 2.
    }
}
