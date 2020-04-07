package kingim.dao;

import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jinkai on 2018-05-03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class FriendApplyMapperTest {
    @Autowired
    FriendApplyMapper mapper;

    public Gson gson = new Gson();
    public void print(Object obj) {
        System.out.println(gson.toJson(obj));
    }

    @Test
    public void getByFromUserId(){
        print(mapper.getByFromUserId(3,-1));
    }


}