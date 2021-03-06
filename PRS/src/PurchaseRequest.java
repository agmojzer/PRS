
public class PurchaseRequest {
	private int id;
	private int userID;
	private String description;
	private String justification;
	private String deliveryMode;
	private int status;
	private double total;
	
	public PurchaseRequest() {
		id = 0;
		userID=0;
		description = "";
		justification = "";
		deliveryMode = "";
		status = 0;
		total = 0.0;
	}
	
	public PurchaseRequest(int id, int userID, String description, String justification, String deliveryMode,
			int status, double total) {
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
