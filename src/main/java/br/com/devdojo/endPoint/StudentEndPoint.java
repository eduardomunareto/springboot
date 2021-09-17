package br.com.devdojo.endPoint;

import br.com.devdojo.model.Student;
import br.com.devdojo.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by eduardomunareto on 13/09/21.
 */

@RestController
@RequestMapping("student")

public class StudentEndPoint {
@Autowired
private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET, path = "/list")

    public List<Student> listAll() {
        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList(new Student("Deku"), new Student("Todoroki"));
    }
}
