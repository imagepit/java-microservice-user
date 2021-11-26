package com.microservice.user.domain.model.user;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {
    @Test
    public void testEquals(){
        User user1 = new User(new UserId("user1@example.com"),new Name("user1"),new Password("user1password"));
        User user2 = new User(new UserId("user2@example.com"),new Name("user2"),new Password("user2password"));
        User user3 = new User(new UserId("user1@example.com"),new Name("user3"),new Password("user3password"));
        assertNotEquals(user2, user1);
        assertEquals(user3, user1);
    }
}