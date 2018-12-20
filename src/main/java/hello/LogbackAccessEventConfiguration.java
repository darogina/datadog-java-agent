package hello;

import ch.qos.logback.access.tomcat.LogbackValve;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class LogbackAccessEventConfiguration {

//	@Bean
	public WebServerFactoryCustomizer containerCustomizer() {

		return (WebServerFactoryCustomizer<TomcatServletWebServerFactory>) factory ->
				factory.addContextCustomizers((TomcatContextCustomizer) context -> {
					LogbackValve logbackValve = new LogbackValve();
					logbackValve.setFilename("logback-access.xml");
					context.getPipeline().addValve(logbackValve);
				});
	}

}
