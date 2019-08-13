package co.grandcircus.DonutApi.model;


public class Result {
	
	private Long id;
	private String ref; //grand circus photo source
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", ref=" + ref + ", name=" + name + "]";
	}
	
	

}
