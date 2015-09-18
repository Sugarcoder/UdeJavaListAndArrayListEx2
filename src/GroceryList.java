import java.util.ArrayList;

/**
 * Created by Sugarcoder on 9/15/2015.
 */


public class GroceryList {

    // public int[] myNumbers = new int[50];

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItems(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }


    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }




    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }


    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position>=0) {
            removeGroceryItem(position);
        }
    }


    /*
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        // Milk
        // cheese
        // Bread
    }
    */


    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }


    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position>=0) {
            return true;
        } else {
            return false;
        }
    }


    /*
    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);   // will go through the list and find the item, less code than a for loop
        if(exists) {
            int position = groceryList.indexOf(searchItem);
            return groceryList.get(position);
        }
        return null;    // the item wasn't found
    }
    */

}
