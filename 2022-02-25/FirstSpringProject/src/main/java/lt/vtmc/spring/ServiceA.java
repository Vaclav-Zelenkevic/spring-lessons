package lt.vtmc.spring;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {
	private String message;
	//private ServiceB serviceB;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
