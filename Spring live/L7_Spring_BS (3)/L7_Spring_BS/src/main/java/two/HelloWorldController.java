package two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "hey")
//RestController = controller + responce body
//im telling my application hey this perticular controller wants responce body which has in json format
public class HelloWorldController {

    //resquest mapping is early use implemaentation now we use get mapping
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }


    




}
