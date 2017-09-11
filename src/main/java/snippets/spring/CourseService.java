package snippets.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;

    public CourseDAO getCourseDAO() {
        return courseDAO;
    }
}
