package fi.vamk.e2000606.userprofile;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return repository.findAll();
    }
    
    @PostMapping("/user")
    public User save(@RequestBody User user){
        return repository.save(user);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user){
        return repository.save(user);
    }

    @DeleteMapping("/user")
    public void delete(@RequestBody User user){
        repository.delete(user);
    }
    
}