package quarkAcademySOLIDPatrones.AbiertoCerrado;

import quarkAcademySOLIDPatrones.AbiertoCerrado.abstraction.IAPie;
import quarkAcademySOLIDPatrones.AbiertoCerrado.abstraction.IEnAuto;
import quarkAcademySOLIDPatrones.AbiertoCerrado.abstraction.IEnAvion;

public class Viajero implements IEnAuto, IAPie, IEnAvion {

	private long id;
	private String nombre;
	private String viajaEn;

	public Viajero(long id, String nombre, String viajaEn) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.viajaEn = viajaEn;
	}

	public Viajero() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getViajaEn() {
		return viajaEn;
	}

	@Override
	public void setViajaEn(String vehiculo) {
		// TODO Auto-generated method stub
		this.viajaEn = vehiculo;

	}

}
