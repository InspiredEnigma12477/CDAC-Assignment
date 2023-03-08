package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//id | name        | author | publish_date | visits | contents                                  | topic_id
@Entity
@Table(name="tutorials")
public class Tutorial extends BaseEntity {
	@Column(length = 100,unique = true)
	private String title;
//	private String author; : replaced by the Author entity ref.
	@Column(name="pub_date")
	private LocalDate publishDate;
	private int visits;
	@Column(length = 400)
	private String contents;
	// Many to One relationship between 2 entities
	@ManyToOne(fetch = FetchType.LAZY) //MANDATORY --o.w will get org.hib.MappingExc
	@JoinColumn(name="selected_topic_id",nullable = false) //optional to specify FK column name n constraints
	private Topic topic;
	//Many to One , uni dir asso between Tutorial  *-----> 1 User
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="author_id", nullable = false)
	private User author;
	//bi dir relationship between Tutorial ----> Comment
	@OneToMany(mappedBy = "tutorial" ,cascade = CascadeType.ALL ) //mandatory : o.w mapping exc
	private List<Comment> comments=new ArrayList<>();

	public Tutorial() {
		// TODO Auto-generated constructor stub
	}
	

	public Tutorial(String title, LocalDate publishDate, String contents) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.contents = contents;
	}
	//for constructor expression in JPQL
	public Tutorial(String title, LocalDate publishDate) {
		super();
		this.title = title;
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	

	

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	//project tip : DO NOT ADD any relationship field/s in the toString

	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Tutorial "+getId()+" [title=" + title + " , publishDate=" + publishDate + ", visits=" + visits
				+ ", contents=" + contents + "]";
	}
	
	

}
