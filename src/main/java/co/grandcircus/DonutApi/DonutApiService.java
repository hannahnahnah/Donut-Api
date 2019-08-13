package co.grandcircus.DonutApi;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.DonutApi.model.DonutResponse;
import co.grandcircus.DonutApi.model.DonutResponseTwo;

@Component
public class DonutApiService {
	
	private RestTemplate restTemplate;
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public DonutResponse getDonutById(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);
		return response;
	}
	
	public DonutResponseTwo getDonuts2() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponseTwo response = restTemplate.getForObject(url, DonutResponseTwo.class);
		return response;
	}
	
	

}
