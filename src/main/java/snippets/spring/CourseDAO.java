package snippets.spring;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("coursseDAO")
public class CourseDAO implements ICourseDAO {

}
