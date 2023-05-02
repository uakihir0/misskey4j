package misskey4j.entity;

import java.util.Date;
import java.util.List;

public class Webhook {
	private String id;
	private Date createdAt;
	private String userId;
	private String name;
	private List<String> on;
	private String url;
	private String secret;
	private Boolean active;
	private Date latestSentAt;
	private Long latestStatus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getOn() {
		return on;
	}
	public void setOn(List<String> on) {
		this.on = on;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Date getLatestSentAt() {
		return latestSentAt;
	}
	public void setLatestSentAt(Date latestSentAt) {
		this.latestSentAt = latestSentAt;
	}
	public Long getLatestStatus() {
		return latestStatus;
	}
	public void setLatestStatus(Long latestStatus) {
		this.latestStatus = latestStatus;
	}


}
