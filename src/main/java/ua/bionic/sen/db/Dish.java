package ua.bionic.sen.db;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
@Entity
public class Dish {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String title;
  private int price;
  private String description;
  private boolean ready;

  @ManyToOne
  @JoinColumn(name = "dish_id")
  private Order order;

  @ManyToOne
  @JoinColumn(name = "dish")
  private DishCategory dishCategory;

  private boolean kitchenMade;

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
      ", ready=" + ready +
      ", dishCategory=" + dishCategory +
      ", kitchenMade=" + kitchenMade +
      '}';
  }

  public DishCategory getDishCategory() {
    return dishCategory;
  }

  public void setDishCategory(DishCategory dishCategory) {
    this.dishCategory = dishCategory;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
