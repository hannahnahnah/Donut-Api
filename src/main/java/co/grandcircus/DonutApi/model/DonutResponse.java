package co.grandcircus.DonutApi.model;

import java.util.List;


public class DonutResponse {

	private Long id;
	private String ref; //json reference uri
	private String name;
	private Integer calories;
	private List<String> extras;
	private String photo; //photo housed by grand circus
	private String photo_attribution; //photo og source
	
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
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhoto_attribution() {
		return photo_attribution;
	}
	public void setPhoto_attribution(String photo_attribution) {
		this.photo_attribution = photo_attribution;
	}
	@Override
	public String toString() {
		return "DonutResponse [id=" + id + ", ref=" + ref + ", name=" + name + ", calories=" + calories + ", extras="
				+ extras + ", photo=" + photo + ", photo_attribution=" + photo_attribution + "]";
	}
	
	
	
}
