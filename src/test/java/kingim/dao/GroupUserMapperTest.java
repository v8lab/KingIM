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
@ContextConfiguration(locations = {"classpath*:spring.xml" })
public class GroupUserMapperTest {
    @Autowired
    GroupUserMapper mapper;

    public Gson gson = new Gson();
    public void print(Object obj) {
        System.out.println(gson.toJson(obj));
    }

    @Test
    public void getByUserId(){
        print(mapper.getByUserId(1));
    }

    @Test
    public void getByGroupId(){
        print(mapper.getByGroupId(3));
    }

}
