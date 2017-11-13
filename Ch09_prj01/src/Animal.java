
public abstract class Animal implements Countable {
	private int count;
	
	public Animal() {
		count = 0;
	}


	@Override
	public void incrementCount() {
		// TODO Auto-generated method stub
		count ++;
	}


	@Override
	public void resetCount() {
		// TODO Auto-generated method stub
		count = 0;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}


	@Override
	public String getCountString() {
		// TODO Auto-generated method stub
		return String.valueOf(count);

	}
}





		
	

	
	

