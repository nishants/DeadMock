import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ControllerAnnotations {
    private Map<String, Method> requestMap = new HashMap<String, Method>();

    public ControllerAnnotations(Class claz){
        parseUrls(claz);
    }

    private void parseUrls(Class claz) {
        for(Method method : claz.getDeclaredMethods()){
            MethodAnnotations methodAnnotations = new MethodAnnotations(method);
            requestMap.put(methodAnnotations.getUrl(), method);
        }
    }

    public Method methodFor(String url){
        return requestMap.get(url);
    }
}

