package michaelchursin.spring.PP_3_2_1_spring_boot.DAO;

import michaelchursin.spring.PP_3_2_1_spring_boot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void update(int id, User user);
    void delete(int id);
}
