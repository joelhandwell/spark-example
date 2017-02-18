package hello;

import static spark.Spark.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HealthCheck {

	private static final Logger logger = LoggerFactory.getLogger(HealthCheck.class);
	
	public static void main(String args[]){
		
		get("/healthcheck", (req, res) -> {
			logger.info("health check called");
			return "spark app is running healthy";
		});
	}
}
