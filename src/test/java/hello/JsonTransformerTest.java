package hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class JsonTransformerTest {

	@Test
	public void testRender() throws Exception {
		Health tm = new Health(1L, "test-status");
		assertThat(1L).isEqualTo(tm.statusCode);

		JsonTransformer jt = new JsonTransformer();

		String json = jt.render(tm);
		
		assertThat(json).contains("{\"description\":\"test-status\",\"statusCode\":1}");
	}

}
