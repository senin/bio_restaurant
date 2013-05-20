package ua.bionic.sen.db;

import javax.persistence.*;
import java.util.List;

/**
 *
 */
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String email;
  private String password;

  @ManyToMany
  private List<AccessRole> roles;
  @OneToMany
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
