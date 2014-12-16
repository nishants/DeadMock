import org.geeksaint.deadmock.MyController;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ControllerAnnotationsTest {

    private ControllerAnnotations controllerAnnotation;
    private Class<MyController> controllerClass;

    @Before
    public void setUp() throws Exception {
        controllerClass = MyController.class;
        this.controllerAnnotation = new ControllerAnnotations(controllerClass);
    }

    @Test
    public void testMethodFor() throws Exception {
        assertThat(controllerAnnotation.methodFor("/name"), is(controllerClass.getDeclaredMethod("show", String.class)));
    }
}