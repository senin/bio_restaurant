package ua.bionic.sen.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 *
 */
@Entity
public class AccessRole {

  @Id
  @GeneratedValue
  private int id;

  private List<User> users;

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
}
