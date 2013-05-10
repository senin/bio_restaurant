package ua.bionic.sen.dao;

import ua.bionic.sen.db.Dish;

import java.util.List;

/**
 *
 */
public interface IDishDAO {
  public void save(Dish dish);
  public void update(Dish dish);
  public Dish find(int id);
  public List<Dish> findAll();
  public void delete(Dish dish);
}
