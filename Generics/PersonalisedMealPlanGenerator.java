interface MealPlan { String getPlanName(); }
class VegetarianMeal implements MealPlan { public String getPlanName(){ return "Vegetarian"; } }
class VeganMeal implements MealPlan { public String getPlanName(){ return "Vegan"; } }
class KetoMeal implements MealPlan { public String getPlanName(){ return "Keto"; } }

class Meal<T extends MealPlan> {
    private final T plan;
    public Meal(T plan){ this.plan = plan; }
    public void generate() { System.out.println("Generating meal plan: " + plan.getPlanName()); }
    public boolean validate() { return plan != null; }
}

public class PersonalisedMealPlanGenerator {
    public static <T extends MealPlan> Meal<T> createMealPlan(T plan) {
        Meal<T> meal = new Meal<>(plan);
        if (meal.validate()) {
            meal.generate();
            return meal;
        } else {
            throw new IllegalArgumentException("Invalid plan");
        }
    }

    public static void main(String[] args) {
        createMealPlan(new VegetarianMeal());
        createMealPlan(new KetoMeal());
    }
}
