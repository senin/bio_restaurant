package ua.bionic.sen.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 *
 */
@Entity
public class User {

  @Id
  @GeneratedValue
  private int id;

  private String email; //as login
  private String password;

  private List<AccessRole> roles;
  private List<Order> orders;

  public User() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<AccessRole> getRoles() {
    return roles;
  }

  public void setRoles(List<AccessRole> roles) {
    this.roles = roles;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", roles=" + roles +
        ", orders=" + orders +
        '}';
  }
}
