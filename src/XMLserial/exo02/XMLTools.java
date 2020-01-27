package XMLserial.exo02;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XMLTools {

	public static void encodeToFile(Object object, String fileName) throws FileNotFoundException, IntrospectionException {

		XMLEncoder encoder = new XMLEncoder(new FileOutputStream(fileName));
		try {
			// remove password from serialisation
			BeanInfo info = Introspector.getBeanInfo(object.getClass());
			PropertyDescriptor[] propDesc = info.getPropertyDescriptors();
			
			for (PropertyDescriptor descriptor : propDesc)
				if (descriptor.getName().equals("password")) 
					descriptor.setValue("transient", Boolean.TRUE);

			encoder.writeObject(object);
			encoder.flush();
		} finally {
			encoder.close();
		}

	}

	public static Object decodeFromFile(String fileName) throws FileNotFoundException {

		Object object = null;
		
		XMLDecoder decoder = new XMLDecoder(new FileInputStream(fileName));
		try {
			object = decoder.readObject();
		} finally {
			decoder.close();
		}

		return object;
	}

}
