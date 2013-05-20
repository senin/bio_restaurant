package ua.bionic.sen.db;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 *
 */
@Entity
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @OneToMany(mappedBy = "order")
  @Column(name = "dish_id")
  private List<Dish> dishes;
  private float total;
  private Date date;
  private boolean completed;

  public Order() {

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

  public float getTotal() {
    return total;
  }

  public void setTotal(float total) {
    this.total = total;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", dishes=" + dishes +
        ", total=" + total +
        ", date=" + date +
        ", completed=" + completed +
        '}';
  }
}
