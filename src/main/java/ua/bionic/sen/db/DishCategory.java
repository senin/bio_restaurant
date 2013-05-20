package ua.bionic.sen.db;

import javax.persistence.*;
import java.util.List;

/**
 *
 */
@Entity
public class DishCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @OneToMany(mappedBy = "dishCategory")
  private List<Dish> dishes;

  private String title;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

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
