package hello;

class Health {
	Long statusCode;
	String description;

	public Health(Long statusCode, String description) {
		super();
		this.statusCode = statusCode;
		this.description = description;
	}

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

}