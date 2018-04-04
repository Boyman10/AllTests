import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Tools.MyTools;

//http://logging.apache.org/log4j/2.x/download.html
//https://joeldauncey.wordpress.com/2015/07/29/log4j2-basic-logging-for-java-development-eclipse/

//1. Window preferences
//2. Java Build path / user librairies -> add new -> name it
//3. Add external JARs
//4. pick up log4j2-api et core - dernières versions
// CLASSPATH .
//5. Click right  on project
//6. click add library
//7. select user library & next
//8. select log4 lib and click finish

// CONF FILE 
// 1. new folder inside project root - could share the same for all projects
// 2. create file into it : log4j2.xml --- bien le nommer !!
// 3. use a name (Logger name matching your package name or class name)

// right click on Main
// run config.
// classpath -> user entries
// advanced
// add folders (selection du dossier où se trouve le fichier de conf.)
// select and apply

public class Main {

	static final Logger logger = LogManager.getLogger("com");
	static Logger logger1 = LogManager.getRootLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing log4j2");
		
	/*	logger.trace("msg de trace"); // E/S methods
		logger.debug("msg de debogage"); // Display values of datas
		logger.info("msg d'information"); //loading of conf file, beg/end long process
		logger.warn("msg d'avertissement"); // error login, invalid data
		logger.error("msg d'erreur"); // all throwned exceptions
		logger.fatal("msg d'erreur fatale");  // error DB, exceptions which stop the program
		
		
		logger1.trace("msg de trace"); // E/S methods
		logger1.debug("msg de debogage"); // Display values of datas
		logger1.info("msg d'information"); //loading of conf file, beg/end long process
		logger1.warn("msg d'avertissement"); // error login, invalid data
		logger1.error("msg d'erreur"); // all throwned exceptions
		logger1.fatal("msg d'erreur fatale");  // error DB, exceptions which stop the program	}

		logger.trace("Configuration File Defined To Be :: "+System.getProperty("log4j2.xml"));
		*/
		
		MyTools mTools = new MyTools();
		mTools.generateArray(4, 6);
		
		
	}
}