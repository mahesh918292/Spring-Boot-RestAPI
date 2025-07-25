package com.example.demo.Controller;
import com.example.demo.Model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
@RestController
public class Controller {
    @GetMapping("/")
    public Map<String,Object> add()
    {
        Map<String,Object> response=new HashMap<>();
        response.put("name","mahesh");
        return response;
    }
   @PostMapping("/post")
public Map<String, Object> sub(@RequestBody Model s) {
    Map<String, Object> response = new HashMap<>();
    System.out.println(s);
    response.put("status", "success");
    response.put("id",s.getId());
    response.put("name",s.getName());
    response.put("gender",s.getGender());
    return response;
}
@GetMapping("/{type}/{id}")
public String getEntity(@PathVariable String type, @PathVariable int id) {
    return "Type: " + type + ", ID: " + id;
}
}
