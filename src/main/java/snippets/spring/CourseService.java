package snippets.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseService {

    private CourseDAO courseDAO;

    @Autowired
    public void setCourseDAO (CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    public CourseDAO getCourseDAO() {
        return courseDAO;
    }
}
