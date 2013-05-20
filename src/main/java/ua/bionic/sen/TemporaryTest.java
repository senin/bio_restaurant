package ua.bionic.sen;

import ua.bionic.sen.db.AccessRole;
import ua.bionic.sen.db.Dish;
import ua.bionic.sen.db.DishCategory;
import ua.bionic.sen.db.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.LinkedList;

/**
 * This class is used only for testing code and statements
 */
public class TemporaryTest {


  private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bionicRestaurant");
  private static EntityManager em = emf.createEntityManager();

  public static void main(String[] args) {



    //Add AccessRoles
    AccessRole role = new AccessRole();
    role.setTitle("admin");
    role.setDescription("no restrictions");
    save(role);

    role = new AccessRole();
    role.setTitle("kitchen");
    role.setDescription("users see ordered dishes to cook");
    save(role);

    role = new AccessRole();
    role.setTitle("customer");
    role.setDescription("users see ordered dishes to cook");
    save(role);

    //Add users
    User user = new User();
    user.setEmail("dmitry@sen.org.ua");
    user.setPassword("password");
//    user.setRoles((new LinkedList<AccessRole>()).add(em.find(AccessRole.class, role)));
    save(user);


    //Add dish categories
    DishCategory dishCategory = new DishCategory();
    dishCategory.setTitle("Cold appetisers from fish");
    save(dishCategory);

    dishCategory = em.find(DishCategory.class, dishCategory);

    Dish dish = new Dish();
    dish.setDishCategory(dishCategory);
    dish.setTitle("Nelma and Muksun of cold smoking");
    dish.setDescription("with fried white mushrooms");
    dish.setKitchenMade(true);
    dish.setPrice(600);
    dish.setReady(false);
    save(dish);


  }

  private static void save(Object object) {

    em.getTransaction().begin();
    em.persist(object);
    em.getTransaction().commit();

//    em.close();

  }



}
