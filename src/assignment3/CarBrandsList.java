package assignment3;

/**
 * Importing the needed classes that are utilized in methods
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Purpose: The purpose of this class is to make methods to operate on linkedlist elements and call on them
 * in the main method. Methods include sorting list, removing duplicates, displaying list, removing indexes and more.
 * @author Rehman
 * @since JavaSE-17
 *
 */
public class CarBrandsList {
	
	/**
	 * 
	 * @param args main method
	 */
	
public static void main(String[] args) { 
	
	/**
	 * Initializing objects to linkedlist String type.
	 */
	
	LinkedList<String> list1 = new LinkedList<>();
    LinkedList<String> list2 = new LinkedList<>();
   
    /**
     * Regular String arrays 
     */
   String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
   String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
   
   /**
    * Making collection String type object which stores the rides array
    */
	Collection <String> collectionList = Arrays.asList(rides);	
	/**
	    * Storing collectionList element into list1 using linkedlist constructor
	    */
	list1 = new LinkedList<>(collectionList);
	/**
	    * Reconfiguring collectionList to now store the rides2 array
	    */
	collectionList=Arrays.asList(rides2);
	/**
	    * Storing collectionList element into list2 using linkedlist constructor
	    */
	list2 = new LinkedList<>(collectionList);
/**
    * we use the addAll method to add all of the elements from the list2 to list1.
    */
   list1.addAll(list2);
   
   /**
    * calling on method to operate on list1 and list2 to match the desired output.
    */
   
   printList(list1, list2);
   listToUpperCase(list1);
   removeFiveToSeven(list1);
   printCurrentList(list1);
   printReverseList(list1);
   sortedList(list1);
   printNonDuplicates(list1);


   
} 


/**
 * we use the for-each loop to iterate over the elements in the list and print each element individually. 
 * This will print the elements of the linked list, one per line, without the square brackets.
 * @param firstListPassed LinkedList List Passed to be displayed
 * @param secondListPassed  LinkedList List Passed to be cleared
 */
	public static void printList(LinkedList<String> firstListPassed,LinkedList<String> secondListPassed) {
		System.out.println();
		System.out.println("List is: ");
		for(String s : firstListPassed) {
			System.out.print(s + " ");
		}
		System.out.println();
		secondListPassed.clear();
		
	}

 // locate String objects and convert to uppercase
	/**we use the replaceAll method to apply the toUpperCase method to each element in the list.
	 * This will convert all of the elements to uppercase. 
	 * Finally, we use a for-each loop to print the elements of the linked list. 
	 * @param stringPassed  LinkedList List Passed to turn uppercase
	 */
	public static void listToUpperCase(LinkedList<String> listPassed) {
		System.out.println();
		// Convert the elements of the linked list to uppercase
		listPassed.replaceAll(String::toUpperCase);
		System.out.println("This is showing the Car Brands in uppercase letters...");
		System.out.println("List is: ");
		// Print the linked list without the square brackets
		for (String s : listPassed) {
		  System.out.print(s+ " ");
		}
		System.out.println();
	}

 
	/**Purpose: obtain sublist and use clear method to delete sublist items.
	 * we use the subList method to get a sublist that contains the elements at index 5 to 7. 
	 * We use the clear method to remove all of the elements from the sublist, which will also remove them from the original list. 
	 * Finally, we use a for-each loop to print the elements of the linked list.
	 * @param listPassed LinkedList List Passed to remove 5-7th elements
	 */
	public static void removeFiveToSeven(LinkedList<String> listPassed) {
		System.out.println();

		// Remove the elements at index 5 to 7
		listPassed.subList(5, 8).clear();
		System.out.println("Deleting the car brands 5 to 7...");
		System.out.println("List is: ");
		// Print the linked list
		for (String s : listPassed) {
		  System.out.print(s+ " ");
		}
		System.out.println();
	}

	
/**Purpose: Print the current list of type LinkedList.
 * we use the for-each loop to iterate over the elements in the list and print each element individually so brackets won't show.
 * @param listPassed LinkedList List Passed to get current elements
 */
	public static void printCurrentList(LinkedList<String> listPassed) {
		System.out.println();
		System.out.println("Here is the current list of car brands...");
		System.out.println("List is:");
		for (String s : listPassed) {
			  System.out.print(s+ " ");
			}
		System.out.println();
	}

	
	/**Purpose: print the list in reverse order
	 * we use the Collections.reverse method to reverse the elements of the linked list. 
	 * This will change the order of the elements in the list so that they are in the reverse order in which they were added. 
	 * Finally, we use a for-each loop to print the elements of the linked list.
	 * @param listPassed LinkedList List Passed to reverse
	 */
	
	public static void printReverseList(LinkedList<String> listPassed) {
		System.out.println();
		// Reverse the elements of the linked list
		Collections.reverse(listPassed);
		System.out.println("Reversed List:");
		// Print the linked list in reverse order without the square brackets
		for (String s : listPassed) {
		  System.out.print(s+ " ");
		}
		System.out.println();
	}
	
	/**
	 * we use the Collections.sort method to sort the elements of the linked list in ascending order. 
	 * Finally, we use a for-each loop to print the elements of the linked list.
	 * @param listPassed LinkedList List Passed to sort
	 */
	public static void sortedList(LinkedList<String> listPassed) {
		System.out.println();
		// Sort the linked list
		Collections.sort(listPassed);
		System.out.println("Sorted car brands in an alphabetical order...");
		System.out.println("List is:");
		// Print the linked list without the square brackets
		for (String s : listPassed) {
		  System.out.print(s+ " ");
		}
		System.out.println();
	}
	
	
	/**Purpose: locate String objects and eliminate duplicates.
	 * This code will eliminate all duplicated elements from the list and 
	 * then print the list without duplicates and without brackets.
	 * @param listPassed LinkedList List Passed to remove duplicates
	 */
	public static void printNonDuplicates(LinkedList<String> listPassed) {
		System.out.println();
		// Use a Set to keep track of the elements that have already been added
	    Set<String> set = new HashSet<>();

	    // Iterate over the list and add each element to the set if it is not already present
	    for (String element : listPassed) {
	      if (!set.contains(element)) {
	        set.add(element);
	      }
	    }

	    // Clear the original list and add all the elements from the set
	    listPassed.clear();
	    listPassed.addAll(set);
	    
	    System.out.println("Removing duplicate car brands...");
	    // Print the list without brackets using a for-each loop
	    for (String element : listPassed) {
	      System.out.print(element + " ");
	    }
	    System.out.println();
	}








}
	
	
   


