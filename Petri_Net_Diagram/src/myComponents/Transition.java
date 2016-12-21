package myComponents;

public class Transition extends Component {

	private String position;
	private String nameRef;
	private String name;
	private String label;

	public Transition()
	{

	}

	public Transition(String position, String nameRef, String name, String label) {
		this.setPosition(position);
		this.setNameRef(nameRef);
		this.setName(name);
		this.setLabel(label);
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

}
