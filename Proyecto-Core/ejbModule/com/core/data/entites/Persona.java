package com.core.data.entites;

import java.io.Serializable;

import javax.persistence.*;



@Entity
@SequenceGenerator(name = "persona_sequence",
sequenceName = "persona_id_seq",
initialValue=1,
allocationSize=1)
@NamedQueries({
	
	@NamedQuery(name = "Id.vs.Nick",
			query = "SELECT p.id " +
					"FROM Persona p " +
					"WHERE p.nick = :nickUsuario"
	),
	@NamedQuery(name = "Id.vs.Nick.Tipo",
	query = "SELECT p.id " +
			"FROM Persona p " +
			"WHERE p.nick = :nickUsuario"
	)
	
})

public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_sequence")
	private Long id;
	@Column(unique=true)
	private String nick;
	private String nombre;
	private String apellido;
	private String password;
	private String mail;
	@Column(length=512)
	private String pathFoto;
	
	
	public Persona() {
		super();
		this.nick = new String();
		this.nombre = new String();
		this.apellido = new String();
		this.password = new String();
		this.mail  = new String();
		this.pathFoto = new String();
		
	}

	
	/**
	 * @param nick
	 * @param nombre
	 * @param apellido
	 * @param password
	 * @param mail
	 * @param pathFoto
	 */
	public Persona(String nick, String nombre, String apellido,
			String password, String mail, String pathFoto) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.mail = mail;
		this.pathFoto = pathFoto;		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPathFoto() {
		return pathFoto;
	}


	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}
	

	
	
   
}
