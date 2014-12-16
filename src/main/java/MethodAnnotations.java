import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

public class MethodAnnotations {
    private final Method method;

    public MethodAnnotations(Method method) {
        this.method = method;
    }

    public String getUrl() {
        return method.getAnnotationsByType(RequestMapping.class)[0].value()[0];
    }
}
