package pojos;

import javax.persistence.*;
/*
 * Association between Tutorial n Comment
 * Comment : many , child , owning (since has to contain FK)
 */
@Entity
@Table(name = "comments", uniqueConstraints = @UniqueConstraint(columnNames = { "tut_id", "cust_id" }))
public class Comment extends BaseEntity {
	@Column(name = "comment_text")
	private String commentText;
	// bi dir relationship between Tutorial 1<----* Comment
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tut_id", nullable = false)
	private Tutorial tutorial;
	// uni dir relationship between User 1<----* Comment
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cust_id", nullable = false)
	private User customer;

	public Comment() {
		// TODO Auto-generated constructor stub
	}
	

	public Comment(String commentText) {
		super();
		this.commentText = commentText;
	}


	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public Tutorial getTutorial() {
		return tutorial;
	}

	public void setTutorial(Tutorial tutorial) {
		this.tutorial = tutorial;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	// NEVER add relationship fields in toString
	@Override
	public String toString() {
		return "Comment ID " + getId() + " [commentText=" + commentText + "]";
	}

}
