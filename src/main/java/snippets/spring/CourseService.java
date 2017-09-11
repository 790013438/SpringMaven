package snippets.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;

    public CourseDAO getCourseDAO() {
        return courseDAO;
    }
}
