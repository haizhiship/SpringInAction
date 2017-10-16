package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spitter;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/16.
 */
@Repository
public class JdbcSpittleRepository implements SpittleRepository{

    public List<Spittle> findSpittles(long max, int count){
        List<Spittle> spittleList = new ArrayList<Spittle>();

        spittleList.add(new Spittle(
                123L,
               "message",
                null,
                2.3,
               2.5));
        return spittleList;
    }

    public Spittle findOne(long id) {
        return new Spittle(
                123L,
                "message",
                null,
                2.3,
                2.5);
    }
}
