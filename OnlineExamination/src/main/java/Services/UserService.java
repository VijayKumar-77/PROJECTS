package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.OnlineExamination.ResourceNotFoundException;

import Models.User;
import Repositories.UserRepository;

//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User getUserById(Long id) {
//        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
//    }
//
//    public User registerUser(User user) {
//    	
//        return userRepository.save(user);
//    }
//
//    public User updateUser(Long id, User userDetails) {
//        User user = getUserById(id);
//        user.setUsername(userDetails.getUsername());
//        user.setEmail(userDetails.getEmail());
//        user.setPassword(userDetails.getPassword());
//        
//        return userRepository.save(user);
//    }
//
//    public void deleteUser(Long id) {
//        userRepository.deleteById(id);
//    }
//}

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepo;

	public User registerUser (User user) {
		return userrepo.save(user);
	}
	
	 public boolean getUserWithAccounts(String phno) {
	    return userrepo.findByEmail(phno)!= null;
	 }
}