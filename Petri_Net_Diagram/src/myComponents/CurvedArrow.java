package myComponents;

public class CurvedArrow extends Connector {

	private String bend;

	public CurvedArrow()
	{

	}

	public CurvedArrow(String nameStart, String nameEnd, String bend)
	{
		super(nameStart, nameEnd);
		this.bend = bend;

	}

	public String getBend() {
		return bend;
	}


	public void setBend(String bend) {
		this.bend = bend;
	}

}
