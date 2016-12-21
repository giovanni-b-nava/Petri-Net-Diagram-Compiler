package myComponents;

public class State extends Component {

	private String position;
	private String nameRef;
	private String name;
	private String label;
	private String tokens;

	public State()
	{

	}

	public State(String position, String nameRef, String name, String label, String tokens) {
		this.setPosition(position);
		this.setNameRef(nameRef);
		this.setName(name);
		this.setLabel(label);
		this.setTokens(tokens);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNameRef() {
		return nameRef;
	}

	public void setNameRef(String nameRef) {
		this.nameRef = nameRef;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTokens() {
		return tokens;
	}

	public void setTokens(String tokens) {
		if(tokens.equals(""))
			tokens = "0";
		this.tokens = tokens;
	}

}
