package com.example.demo.Controller;
import com.example.demo.Model.Model;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
@RestController
public class Controller {
    private List<Model> userList = new ArrayList<>();
    @GetMapping("/")
    public List<Model> Get_All_Users()
    {
        return userList;
    }
   @PostMapping("/post")
public Model Add_User(@RequestBody Model s) {
    userList.add(s);
    return s;
}
@GetMapping("/{id}")
public ResponseEntity<?> GetById(@PathVariable int id)
{
    for(Model m:userList)
    {
        if(m.getId()==id)
         return ResponseEntity.ok(m);
    }
   return ResponseEntity.status(HttpStatus.NOT_FOUND)
                         .body("Not Found"); 
}
@GetMapping("/delete/{id}")
public ResponseEntity<?> DeleteById(@PathVariable int id)
{
     for(Model m:userList)
    {
        if(m.getId()==id)
        {
            userList.remove(m);
            return ResponseEntity.ok(userList);
        }
    }
   return ResponseEntity.ok("Id not found");
}
}
