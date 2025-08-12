package p1;

public class Product {
	int id;
	String name;
	public Product() {
		super();
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + "]";
	}
	
	

}
