package concurrency;

public class ObeseKid {

	public static void main(String[] args) {

		PIPE pipeObj = PIPE.getInstance();
		Producer choclateMaker = new Producer(pipeObj);
		Consumer fatKid = new Consumer (pipeObj);
		
		choclateMaker.start();
		fatKid.start();

	}

}
