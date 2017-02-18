package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

import spark.ResponseTransformer;


public class JsonTransformer implements ResponseTransformer {

	private static final Logger logger = LoggerFactory.getLogger(JsonTransformer.class);
	
	@Override
	public String render(Object model) throws Exception {
		logger.info(String.format("transform class %s to JSON", model.getClass().getName()));
		return JSON.toJSONString(model);
	}

}
