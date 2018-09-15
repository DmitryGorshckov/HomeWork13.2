import ru.gorshckov.child.Child;
import ru.gorshckov.exception.DisLikeEatException;
import ru.gorshckov.food.AlcocolDrink;
import ru.gorshckov.food.Food;
import ru.gorshckov.food.FoodCake;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        Food food = new FoodCake();
        Food food1 = new AlcocolDrink();
        //food.name("кекс");
        food1.name("vodka");

        try {
            child.eat(food1);
            System.out.println("mm, как вкусно!");
        } catch (DisLikeEatException ex) {
            System.out.println("еда не подошла.ребенок не может это есть.поменяйте еду");
        }
        finally {
            System.out.println(child.kisMother("спасибо") + " мама " );
        }
    }
}