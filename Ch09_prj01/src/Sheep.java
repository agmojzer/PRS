
public class Sheep extends Animal implements Cloneable {
	private String name;


	public Sheep() {
		name = "";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Object clone(String name)throws CloneNotSupportedException  {  
		this.name = name;
		return (Sheep)super.clone();
	}


	@Override
	public String getCountString() {
		return getCount() + " " + getName();
	}
}
