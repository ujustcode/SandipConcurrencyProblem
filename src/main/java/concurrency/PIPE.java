package concurrency;


import java.util.HashMap;
import java.util.Map;

public class PIPE {
	
	private static PIPE instance =null;

	private PIPE(){
	  System.out.println("Pipe construtor");	
	}
	
	public static PIPE getInstance(){
	
		if (instance == null) {
			instance = new PIPE();
			
		}
		
		return instance;
		
	}
	
	private final  Map<Integer , String> entities = new HashMap<Integer , String>();
	
	public synchronized  void storeEntity (Integer id , String Choclate) throws InterruptedException {
		 Thread.sleep(300);
        entities.put(id, Choclate);
		
		
		
	}
	
	public synchronized String retriveEntity(Integer id) throws InterruptedException{
		
		boolean entityFound = false;
		String temp = null ;
		
		while (entityFound == false){
				
				
				if (entities.get(id) != null){
					
					temp = entities.get(id);
					entities.remove(id);
					entityFound = true;
				}
				
		    Thread.sleep(200);
		}
		return temp;
	}
}
