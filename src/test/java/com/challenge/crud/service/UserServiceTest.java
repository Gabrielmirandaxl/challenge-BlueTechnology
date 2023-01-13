package com.challenge.crud.service;

import com.challenge.crud.model.UserModel;
import com.challenge.crud.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    @DisplayName("Create user")
    void createUser() {

        UserModel user = new UserModel(1L, "thiago", "thiago@gmail.com", "(81) 98402-1703");

       when(userRepository.save(user)).thenReturn(user);

       UserModel result = this.userService.createUser(user);

       assertEquals("thiago", result.getName());
       assertEquals("thiago@gmail.com", result.getEmail());
       assertEquals("(81) 98402-1703", result.getPhone());

    }


    @Test
    @DisplayName("Get user all")
    void readUser() {

        when(userRepository.findAll()).thenReturn(
                List.of(
                        new UserModel(1L, "gabriel", "gabriel@gmail.com", "(81) 98434-2637"),
                        new UserModel(2L, "pedro", "pedro@gmail.com", "(81) 98764-2343")
                )
        );

        List<UserModel> result = this.userService.readUser();

        assertEquals(2, result.size());
        assertEquals("gabriel", result.get(0).getName());
        assertEquals("pedro", result.get(1).getName());
        assertEquals("gabriel@gmail.com", result.get(0).getEmail());
        assertEquals("pedro@gmail.com", result.get(1).getEmail());
        assertEquals("(81) 98434-2637", result.get(0).getPhone());
        assertEquals("(81) 98764-2343", result.get(1).getPhone());

    }

    @Test
    @DisplayName("User not found")
    void ErroNotFound(){

        when(userRepository.findById(10000L));
        assertThrows(RuntimeException.class, () -> this.userService.findUser(10000L));
    }

    @Test
    @DisplayName("Get one user")
    void findUser() {

      UserModel user = new UserModel(1L, "gabriel", "gabriel@gmail.com", "(81) 98402-1703");

      when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));

      UserModel result = this.userService.findUser(user.getId());

      assertEquals("gabriel", result.getName());

    }

    @Test
    @DisplayName("Delete one user")
    void deleteUser() {

        UserModel user = new UserModel(1L, "gabriel", "gabriel@gmail.com", "(81) 98402-1703");

        when(userRepository.existsById(1L)).thenReturn(true);
        this.userService.deleteUser(user.getId());
        verify(userRepository).deleteById(user.getId());

    }

    @Test
    @DisplayName("Update one user")
    void updateUser() {
        UserModel user = new UserModel(1L, "gabriel", "gabriel@gmail.com", "(81) 984021703");

        when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
        when(userRepository.save(user)).thenReturn(user);

        UserModel result = this.userService.updateUser(1l, user);

        assertEquals("gabriel", result.getName());

    }
}