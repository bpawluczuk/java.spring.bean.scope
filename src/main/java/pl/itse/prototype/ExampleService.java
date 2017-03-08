package pl.itse.prototype;


import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleService implements IExampleService {

	@Override
	public void name() {
		System.out.println("Scope prototype: " + hashCode());		
	}

}
