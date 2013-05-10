package ua.bionic.sen.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
@Entity
public class Dish {

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  private int id;

  private String title;
  private int price;
  private String[] ingredients;
  private List<DishCategory> dishCategories;

  private boolean kitchenMade;

  public Dish() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String[] getIngredients() {
    return ingredients;
  }

  public void setIngredients(String[] ingredients) {
    this.ingredients = ingredients;
  }

  public List<DishCategory> getDishCategories() {
    return dishCategories;
  }

  public void setDishCategories(List<DishCategory> dishCategories) {
    this.dishCategories = dishCategories;
  }

  public boolean isKitchenMade() {
    return kitchenMade;
  }

  public void setKitchenMade(boolean kitchenMade) {
    this.kitchenMade = kitchenMade;
  }

  @Override
  public String toString() {
    return "Dish{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", price=" + price +
        ", ingredients=" + Arrays.toString(ingredients) +
        ", dishCategories=" + dishCategories +
        ", kitchenMade=" + kitchenMade +
        '}';
  }
}
