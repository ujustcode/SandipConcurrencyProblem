package concurrency;


public class Producer extends Thread {
	
   private PIPE pipe;
   
   public Producer(PIPE pipe){
	   this.pipe = pipe;
   }

	@Override
	public void run() {
		
		for (int i =0 ; i<5;i++){
			
			String val = "Choclate"+i;
			
			
			
			try {
				pipe.storeEntity(i,val);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
           
			
			System.out.println(val);

			
			
		}
		
	}
   

}
