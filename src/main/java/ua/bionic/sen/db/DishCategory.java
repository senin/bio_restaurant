package ua.bionic.sen.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 *
 */
@Entity
public class DishCategory {

  @Id
  @GeneratedValue
  private int id;

  private List<Dish> dishes;

  public DishCategory() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Dish> getDishes() {
    return dishes;
  }

  public void setDishes(List<Dish> dishes) {
    this.dishes = dishes;
  }

  @Override
  public String toString() {
    return "DishCategory{" +
        "id=" + id +
        ", dishes=" + dishes +
        '}';
  }
}
