package co.grandcircus.DonutApi.model;

import java.util.List;


public class DonutResponseTwo {
	
	private Integer count;
	private List<Result> results;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "DonutResponseTwo [count=" + count + ", results=" + results + "]";
	}
	
	
	

}
