/*
=====================================================
                Java: The Cuisines
=====================================================

Alex owns "Dine Out", a prominent franchise restaurant
that exclusively serves Chinese, Italian, Japanese,
and Mexican cuisines.

You are required to design the FoodFactory class and
other necessary classes to simulate the serving
process.

-----------------------------------------------------
METHODS TO IMPLEMENT (IN FoodFactory)
-----------------------------------------------------

1. public static FoodFactory getFactory()
   - Returns the instance of the FoodFactory class.

2. public void registerCuisine(String cuisineKey,
                               Cuisine cuisine)
   - Registers the given cuisine so that the food
     factory can serve it.

3. public Cuisine serveCuisine(String cuisineKey,
                               String dish)
   - Serves the given dish for the requested cuisine.
   - If the requested cuisine is NOT registered,
     throw UnservableCuisineRequestException with
     the exact message:
       "Unservable cuisine {cuisineKey} for dish {dish}"

-----------------------------------------------------
IMPORTANT
-----------------------------------------------------
- Cuisine is an abstract class provided.
- UnservableCuisineRequestException is provided.
- Main class is already implemented.
- Write code ONLY where mentioned.

=====================================================
input
-----------------------------------------------------
3
Italian Lasagne
Japanese Kamameshi
Polish Marjoram
-----------------------------------------------------
output
-----------------------------------------------------
Serving Lasagne(Italian)
Serving Kamameshi(Japanese)
Unservable cuisine Polish for dish Marjoram
=====================================================
*/
import java.util.*;

// --------- LOCKED / GIVEN CODE (DO NOT MODIFY) ---------

abstract class Cuisine {
    protected String dish;

    public void setDish(String dish) {
        this.dish = dish;
    }

    public abstract String getCuisineName();
}

class UnservableCuisineRequestException extends Exception {
    public UnservableCuisineRequestException(String message) {
        super(message);
    }
}

// --------- YOUR TASK STARTS HERE ---------

class FoodFactory {

    // YOUR CODE GOES HERE (declare variables)
	private static FoodFactory instance;
	Map<String,Cuisine> cusines;

    private FoodFactory() {
        // YOUR CODE GOES HERE
    	cusines = new HashMap<>();
    }

    public static FoodFactory getFactory() {
        // YOUR CODE GOES HERE
    	if(instance == null)instance = new FoodFactory();
        return instance;
    }

    public void registerCuisine(String cuisineKey, Cuisine cuisine) {
        // YOUR CODE GOES HERE
    	cusines.put(cuisineKey, cuisine);
    	
    }

    public Cuisine serveCuisine(String cuisineKey, String dish)
            throws UnservableCuisineRequestException {

        // YOUR CODE GOES HERE
    	if(!cusines.containsKey(cuisineKey)) {
    		throw new UnservableCuisineRequestException(
    				"Unservable cuisine "+cuisineKey+" for dish "+dish
    				);
    	}
        Cuisine c = cusines.get(cuisineKey);
        c.setDish(dish);
        return c;
    }
}

// --------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        FoodFactory factory = FoodFactory.getFactory();

        // Pre-registered cuisines
        factory.registerCuisine("Italian", new Cuisine() {
            public String getCuisineName() { return "Italian"; }
        });
        factory.registerCuisine("Japanese", new Cuisine() {
            public String getCuisineName() { return "Japanese"; }
        });
        factory.registerCuisine("Chinese", new Cuisine() {
            public String getCuisineName() { return "Chinese"; }
        });
        factory.registerCuisine("Mexican", new Cuisine() {
            public String getCuisineName() { return "Mexican"; }
        });

        for (int i = 0; i < n; i++) {
            String cuisineKey = sc.next();
            String dish = sc.next();

            try {
                Cuisine cuisine = factory.serveCuisine(cuisineKey, dish);
                System.out.println("Serving " + dish +
                        "(" + cuisine.getCuisineName() + ")");
            } catch (UnservableCuisineRequestException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}