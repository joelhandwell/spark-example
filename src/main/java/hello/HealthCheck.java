package hello;

import static spark.Spark.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HealthCheck {

	private static final Logger logger = LoggerFactory.getLogger(HealthCheck.class);
	
	public static void main(String args[]){
		
		get("/healthcheck", "application/json",  (req, res) -> {
			logger.info("health check called");
			return new Health(200L, "spark app is running healthy");
		}, new JsonTransformer());
	}
}
