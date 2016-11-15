package introspectionpnarbel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AbstractFigure {

	private void reflexiveIntersect(AbstractFigure f)
			throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		// MULTISELECTION (real types in both sides)
		Class<?> thisClass = this.getClass();
		Class<?> fClass = f.getClass();
		Method method = thisClass.getMethod("intersect", fClass);
		method.invoke(this, f);
	}

	public void intersect(AbstractFigure f) {
		try {
			reflexiveIntersect(f);
		} catch (Exception e1) {
			try { // COMMUTATIVITY  with an explicit swap 
				f.reflexiveIntersect(this);
			} catch (Exception e2) {
				throw new RuntimeException(e2);
			}
		}
	}

}