package myComponents;

public class Start extends Component
{

	private String name;
	private String label;
	private String tokens;

	public Start()
	{

	}

	public Start(String name, String label, String tokens)
	{
		this.setName(name);
		this.setLabel(label);
		this.setTokens(tokens);
	}

	public String getTokens() {
		return tokens;
	}

	public void setTokens(String tokens) {
		if(tokens.equals(""))
			tokens = "0";
		this.tokens = tokens;
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

}
