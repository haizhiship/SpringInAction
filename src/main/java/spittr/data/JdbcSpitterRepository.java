package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spitter;

/**
 * Created by Administrator on 2017/10/16.
 */

@Repository
public class JdbcSpitterRepository implements SpitterRepository{

    public Spitter save(Spitter spitter) {
        return spitter;
    }
    public Spitter findByUsername(String username) {
        return new Spitter(
                1234L,
               "username",
                null,
                "first_name",
                "last_name",
                "email");
    }

    }

