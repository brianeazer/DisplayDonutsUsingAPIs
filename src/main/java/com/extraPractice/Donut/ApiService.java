package com.extraPractice.Donut;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.extraPractice.Donut.model.Donut;
import com.extraPractice.Donut.model.DonutDetails;
import com.extraPractice.Donut.model.Response;

@Component
public class ApiService {

	private RestTemplate restTemplateWithUserAgent;
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	public List<Donut> getDonutResults() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		Response response = restTemplateWithUserAgent.getForObject(url, Response.class);
		return response.getResults();
	}
	public DonutDetails getDonutDetails(Long id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DonutDetails donutDetails = restTemplateWithUserAgent.getForObject(url, DonutDetails.class);
		return donutDetails;
	}

}
