package agile.wars.hackathon.Service;

import agile.wars.hackathon.data.User;
import agile.wars.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements agile.wars.hackathon.Service.UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User getUserById(long id) {
        List <User> users = userRepository.findAll();
        return userRepository.getOne(id);
    }
}
