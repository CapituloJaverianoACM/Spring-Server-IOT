package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Session {
	
	
	@Id
	@GeneratedValue
	private Long id;
	private String socketid;
	private Date timestamp;
	private Boolean end;
	@ManyToOne
	private Board board;
	
	public Session() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSocketid() {
		return socketid;
	}

	public void setSocketid(String socketid) {
		this.socketid = socketid;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getEnd() {
		return end;
	}

	public void setEnd(Boolean end) {
		this.end = end;
	}
	
	
	
}
