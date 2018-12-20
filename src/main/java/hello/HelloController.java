package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import static net.logstash.logback.argument.StructuredArguments.*;


@RestController
public class HelloController {

    private static final Logger LOG =   LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index() {
        LOG.info("MY CUSTOM MESSAGE {}", keyValue("name", "value", "{0}=[{1}]"));
        return "Greetings from Spring Boot!";
    }
    
}
