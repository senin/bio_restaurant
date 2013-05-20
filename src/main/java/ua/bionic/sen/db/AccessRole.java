package ua.bionic.sen.db;

import javax.persistence.*;
import java.util.List;

/**
 *
 */
@Entity
public class AccessRole {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToMany
  private List<User> users;

  private String title;
  private String description;

  public AccessRole() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  @Override
  public String toString() {
    return "AccessRole{" +
        "id=" + id +
        ", users=" + users +
        '}';
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
