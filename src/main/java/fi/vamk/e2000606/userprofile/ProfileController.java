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
public class ProfileController {
    @Autowired
    private ProfileRepository repository;

    @GetMapping("/profile/{id}")
    public Optional<Profile> getProfile(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/profiles")
    public Iterable<Profile> getProfiles(){
        return repository.findAll();
    }

    @PostMapping("/profile")
    public Profile save(@RequestBody Profile profile){
        return repository.save(profile);
    }

    @PutMapping("/profile")
    public Profile update(@RequestBody Profile profile){
        return repository.save(profile);
    }

    @DeleteMapping("/profile")
    public void delete(@RequestBody Profile profile){
        repository.delete(profile);
    }
    
}