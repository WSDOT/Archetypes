package gov.wa.wsdot.apps.mgwt.shared;

import java.io.Serializable;

public class Topic implements Serializable {

	private static final long serialVersionUID = -134211444131752658L;
	private String name;

	public Topic() {
	}

	public Topic(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
