package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//instancia do simple date format para usar no to string com o string builder 
	private Date moment;

	private String title;

	private String content;

	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		// String builder é usada para pegar strings menores e transformar em um amior
		// SEM usar concatenação
		StringBuilder sb = new StringBuilder();
		// O string builder possibilita concatenar usando o método append append
		// significa acrescentar no final
		sb.append(title + "\n");
		
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) +"\n");
		sb.append(content +"\n");
		sb.append("Comments:\n");
		
		//criar um ciclo for para printar os comentarios 
		
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		//faz a chamada do to string na hora do retorno para converter 
		return sb.toString();
	}

}
