package challenge;

import javax.persistence.*;

@Entity
@Table(name = "scripts")
public class Quote {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "actor")
	private String actor;

	@Column(name = "detail", nullable = false)
	private String detail;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return this.detail;
	}

	public void setQuote(String quote) {
		this.detail = quote;
	}

}
