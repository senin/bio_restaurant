package ua.bionic.sen.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 *
 */
@Entity
public class Menu {

  @Id
  @GeneratedValue
  private int id;

  private List<DishCategory> dishCategories;

  public Menu() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<DishCategory> getDishCategories() {
    return dishCategories;
  }

  public void setDishCategories(List<DishCategory> dishCategories) {
    this.dishCategories = dishCategories;
  }

  @Override
  public String toString() {
    return "Menu{" +
        "id=" + id +
        ", dishCategories=" + dishCategories +
        '}';
  }
}
