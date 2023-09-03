package calorie_counter_project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Tests {

    @Test
    public void testFoodItem() {
        FoodItem foodItem = new FoodItem("Apple", 95);
        assertEquals("Apple", foodItem.getName());
        assertEquals(95, foodItem.getCalories());
    }

    @Test
    public void testAddFoodItem() {
        CalorieCounter calorieCounter = new CalorieCounter();
        FoodItem foodItem1 = new FoodItem("Apple", 95);
        FoodItem foodItem2 = new FoodItem("Banana", 105);
        calorieCounter.addFoodItem(foodItem1);
        calorieCounter.addFoodItem(foodItem2);
        assertEquals(0, calorieCounter.getTotalCalories());
    }

    @Test
    public void testGetTotalCalories() {
        CalorieCounter calorieCounter = new CalorieCounter();
        FoodItem foodItem1 = new FoodItem("Apple", 95);
        FoodItem foodItem2 = new FoodItem("Banana", 105);
        calorieCounter.addFoodItem(foodItem1);
        calorieCounter.addFoodItem(foodItem2);
        assertEquals(0, calorieCounter.getTotalCalories());
    }
}