package concurrency;


public class Consumer extends  Thread {

	   private PIPE pipe;
	   
	   public Consumer(PIPE pipe){
		   this.pipe = pipe;
	   }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i =0; i<5;i++){
			
			String Val = null;
			try {
				Val = pipe.retriveEntity(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Consumed "+ Val);
			

		}
		
	}
}
