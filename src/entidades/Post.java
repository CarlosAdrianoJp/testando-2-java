package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	
	private List <Comentarios> comentarios = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	public Post(Date momento, String titulo, String conteudo, Integer likes) {
	
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}
	
	
	public Post() {
		super();
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	

	
	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	
	public void adicionarComentario(Comentarios coment) {
		comentarios.add(coment);
	}
	
	public void removerComentario(Comentarios coment) {
		comentarios.remove(coment);
	}


	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("data da publicação: " + sdf.format(momento) + "\n");
		sb.append("titulo: " + this.titulo + "\n");
		sb.append("conteudo: " + this.conteudo + "\n");
		sb.append("likes: " + this.likes + "\n");
		for(Comentarios c : comentarios) {
			sb.append("comentario: " + c.getTexto() + "\n");
		}
		return sb.toString();
		
	}
	
	
	
}
