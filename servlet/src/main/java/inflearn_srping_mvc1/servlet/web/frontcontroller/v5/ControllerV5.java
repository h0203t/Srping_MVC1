package inflearn_srping_mvc1.servlet.web.frontcontroller.v5;

import java.util.Map;

public interface ControllerV5 {

    /**
     *
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
