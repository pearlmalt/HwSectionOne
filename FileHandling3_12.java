package ep1;
import java.io.*;
import java.util.*;

public class FileHandling3_12 {

	Configurator () {
		try {
			File configFile = new File("program.properties");
			FileInputStream inStream = new FileInputStream(configFile);
			Properties config = new Properties();
			config.load(inStream);
			Date current = new Date();
			config.setProperty("runtime", current.toString());
			FileOutputStream outStream = new FileOutputStream(configFile);
			config.store(outStream, "Properties settings");
			inStream.close();
			config.close();
			config.list(System.out);
		} catch (IOException ioe) {
			System.out.println("IO error " + ioe.getMessage());
		}
	}
	
	public static void main(String[] args) {
			Configurator con = new Configurator();
	}
}
