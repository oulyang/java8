package m2d32;

public class Room {

	private int no;
	private String type;
	private boolean status;
	
	
	public Room() {
		super();
	}
	public Room(int no, String type, boolean status) {
		super();
		this.no = no;
		this.type = type;
		this.status = status;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "[" + no + "," + type + ","+(status? "ø’œ–":"’º”√")+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (no != other.no)
			return false;
		return true;
	}
	
	
	
}
