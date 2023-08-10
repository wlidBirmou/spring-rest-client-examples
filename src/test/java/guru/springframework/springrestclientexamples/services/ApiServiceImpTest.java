package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApiServiceImpTest extends TestCase {

    @Autowired
    private ApiService apiService;

    @Test
    public void testGetUsers()throws Exception {
        List<User> users=apiService.getUsers();
        Assert.assertNotEquals(0,users.size());
    }

}