import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: m
 *
 */

//  probando 

@Entity

public class m implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_sequence")
	private Long id;
	public m() {
		super();
	}
   
}
