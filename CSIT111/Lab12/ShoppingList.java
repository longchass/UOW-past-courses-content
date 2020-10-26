import java.util.*;
import java.util.List; 
import java.util.ArrayList; 
public class ShoppingList {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("input any items, type None to finish");

	ArrayList<String> Shoppinglist = new ArrayList<String>();
	
	while (input.hasNextLine()) {
		String i = input.nextLine();
		Shoppinglist.add(i);
		if (i.equals("None")){
		Shoppinglist.remove(i);
		break;
		}
	}     
	for (int i = 0; i < Shoppinglist.size(); i++) {
         System.out.println(Shoppinglist.get(i)); // printing each array element

      
      }
}
}
