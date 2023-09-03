package calorie_counter_project;
import java.util.HashMap;
import java.util.Map;

public class CalorieCounter {

    private Map<String, Integer> foodLog;
    public CalorieCounter() {
        foodLog = new HashMap<>();
    }
    public void addFoodItem(FoodItem item, int quantity) {
        foodLog.put(item.getName(), foodLog.getOrDefault(item.getName(), 0) + quantity);
    }

    /**
     * Counting calories
     * @return correct sum of calories
     */
    public int getTotalCalories() {
        int totalCalories = 0;
        for (Map.Entry<String, Integer> entry : foodLog.entrySet()) {
            String foodName = entry.getKey();
            int quantity = entry.getValue();
            totalCalories += quantity * findFoodItemByName(foodName).getCalories();
        }
        return totalCalories;
    }

    /**
     * fetching food items from a database or list
     * creating a few hardcoded food items here.
     * @param name
     * @return
     */
    public FoodItem findFoodItemByName(String name) {
        // You can
        // For simplicity, we'll
        switch (name.toLowerCase()) {
            case "apple":
                return new FoodItem("Apple", 52);
            case "banana":
                return new FoodItem("Banana", 105);
            case "chocolate":
                return new FoodItem("Chocolate", 210);
            default:
                return null;
        }
    }
    public void addFoodItem(FoodItem foodItem1) {
    }
}
