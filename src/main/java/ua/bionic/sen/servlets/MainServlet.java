package ua.bionic.sen.servlets;

import ua.bionic.sen.db.Dish;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 */
@WebServlet(urlPatterns = "/main")
public class MainServlet extends HttpServlet {

  private static EntityManager em;

  @Override
  public void init() throws ServletException {
    super.init();
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bionic_restaurant");
    Dish dish = new Dish();
    dish.setTitle("dish1");
    em = emf.createEntityManager();
    em.persist(dish);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getWriter().println(em.find(Dish.class,1));
  }
}
