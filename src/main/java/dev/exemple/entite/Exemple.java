/**
 * 
 */
package dev.exemple.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Alexis Darcy
 *
 */
@Entity
@Table(name = "EXEMPLE")
public class Exemple {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "CHAMP_1")
	private String champ1;
	@Column(name = "CHAMP_2")
	private String champ2;

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the champ1
	 */
	public String getChamp1() {
		return champ1;
	}

	/**
	 * Setter
	 * 
	 * @param champ1
	 *            the champ1 to set
	 */
	public void setChamp1(String champ1) {
		this.champ1 = champ1;
	}

	/**
	 * Getter
	 * 
	 * @return the champ2
	 */
	public String getChamp2() {
		return champ2;
	}

	/**
	 * Setter
	 * 
	 * @param champ2
	 *            the champ2 to set
	 */
	public void setChamp2(String champ2) {
		this.champ2 = champ2;
	}

}