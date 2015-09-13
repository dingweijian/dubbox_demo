package dwj.dubbo.demo.api;

import javax.validation.constraints.Min;

public interface UserRestService {
	
	User getUser(@Min(value = 1L, message = "User ID must be greater than 1") Long id);
	
}
