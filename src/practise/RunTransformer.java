package practise;

import java.lang.reflect.Constructor;

import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.IAnnotationTransformer;

public class RunTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Constructor constructor, Method method, Class testclass) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
