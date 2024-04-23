package Two.Controller;
import Two.entity.Student;
import Two.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;


@RestController
@RequestMapping("/re")
public class REController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/test")
    public String test() {
        return "Works My API RE";
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {


        Map<String, Object> map = new LinkedHashMap<>();

        if (id < 0) {
            map.put("Status", 0);
            map.put("message", "ID should be greater than 0.");
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        } else {
            try {
                Student student = studentService.getById(id);
                if (student != null) {
                    map.put("status", 1);
                    map.put("message", "Success");
                    map.put("data", student);
                    return new ResponseEntity<>(map, HttpStatus.OK);
                } else {
                    map.put("status", 0);
                    map.put("message", "Student not found for ID: " + id);
                    return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
                }
            } catch (Exception e) {
                map.put("status", 0);
                map.put("message", "An error occurred while fetching student data.");
                map.put("error", e.getMessage());
                return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
        //else {
//            try {
//                Student s = studentService.getById(id);
//
//                    map.put("status", 1);
//                    map.put("message", "success");
//                    map.put("data", s);
//                    return new ResponseEntity<>(map, HttpStatus.OK);
//
//            }catch (Exception e){
//                map.put("status", 0);
//                map.put("message","The id is not present "+id);
//                map.put("error", e.getMessage());
//                return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
//            }
//        }
//
//    }
//    }
//
//
//
