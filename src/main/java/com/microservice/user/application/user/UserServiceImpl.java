package com.microservice.user.application.user;
import com.microservice.user.domain.model.user.User;
import com.microservice.user.domain.model.user.UserId;
import com.microservice.user.domain.model.user.UserRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // 依存性の注入（Springの場合はDIコンテナがアプリ起動時にinterfaceの変数、引数にインスタンスを代入）
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){ // コンストラクタインジェクション
        this.userRepository = userRepository;
    }

    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs = new ArrayList<>();
        for(User user: users){
            userDTOs.add(convertDTO(user));
        }
        return userDTOs;
    }

    public UserDTO findById(UserId id) {
        return convertDTO(userRepository.findById(id));
    }

    public UserDTO add(User user) {
        userRepository.add(user);
        return this.findById(user.id());
    }

    public UserDTO update(User user) {
        userRepository.update(user);
        return this.findById(user.id());
    }

    public void delete(UserId id) {
        userRepository.delete(id);
    }

    private UserDTO convertDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setId(user.id().value());
        dto.setName(user.name().value());
        dto.setPassword(user.password().value());
        return dto;
    }
}
