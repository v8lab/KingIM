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
@ContextConfiguration(locations = {"classpath*:spring.xml","classpath*:spring-mybatis.xml" })
public class FriendMessageMapperTest {
    @Autowired
    FriendMessageMapper mapper;
    @Autowired
    FriendMapper friendMapper;

    public Gson gson = new Gson();
    public void print(Object obj) {
        System.out.println(gson.toJson(obj));
    }

    @Test
    public void getHistoryMessage(){
        print(mapper.getHistoryMessage(1,2));
    }

    @Test
    public void search(){
        print(friendMapper.searchFriends("u"));
    }

}
