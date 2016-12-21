package myComponents;

public abstract class Connector extends Component {
	
	private String nameStart;
	private String nameEnd;
	
	public Connector()
	{
		
	}
	
	public Connector(String nameStart, String nameEnd) {
		this.nameStart = nameStart;
		this.nameEnd = nameEnd;
	}
	
	public String getNameStart() {
		return nameStart;
	}
	public void setNameStart(String nameStart) {
		this.nameStart = nameStart;
	}
	
	public String getNameEnd() {
		return nameEnd;
	}
	public void setNameEnd(String nameEnd) {
		this.nameEnd = nameEnd;
	}
	
}
