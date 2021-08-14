package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import entidades.Comentarios;
import entidades.Post;

public class Paincipal {
	
  public static void main(String[] args) {
	

	Date data = new Date();
	String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

	

	Post p = new Post(data, "java", "java-web", 10);
	Comentarios c1 = new Comentarios("java e uma bosta");
	Comentarios c = new Comentarios("java e uma linguagem muto boa porem tem muitas frescuras");
	p.adicionarComentario(c);
	p.adicionarComentario(c1);
	
	
	System.out.println(p);
	p.removerComentario(c);
	System.out.println("----------------------");
	System.out.println(p);
	
	
  }
}
