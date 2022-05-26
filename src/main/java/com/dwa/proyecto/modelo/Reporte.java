// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="reporte")
public class Reporte implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=30)
    private String nombre;
    @Column(nullable=false, length=40)
    private String apellidos;
    @Column(nullable=false, length=30)
    private String correoinst;
    @Column(nullable=false, length=30)
    private String sistemareportado;
    @Column(nullable=false, length=30)
    private String correodestino;
    @Column(nullable=false, length=30)
    private String fechareporte;
    @Column(length=30)
    private String estatus;
    @ManyToOne(optional=false)
    @JoinColumn(name="idautor", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Reporte() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for apellidos.
     *
     * @return the current value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter method for apellidos.
     *
     * @param aApellidos the new value for apellidos
     */
    public void setApellidos(String aApellidos) {
        apellidos = aApellidos;
    }

    /**
     * Access method for correoinst.
     *
     * @return the current value of correoinst
     */
    public String getCorreoinst() {
        return correoinst;
    }

    /**
     * Setter method for correoinst.
     *
     * @param aCorreoinst the new value for correoinst
     */
    public void setCorreoinst(String aCorreoinst) {
        correoinst = aCorreoinst;
    }

    /**
     * Access method for sistemareportado.
     *
     * @return the current value of sistemareportado
     */
    public String getSistemareportado() {
        return sistemareportado;
    }

    /**
     * Setter method for sistemareportado.
     *
     * @param aSistemareportado the new value for sistemareportado
     */
    public void setSistemareportado(String aSistemareportado) {
        sistemareportado = aSistemareportado;
    }

    /**
     * Access method for correodestino.
     *
     * @return the current value of correodestino
     */
    public String getCorreodestino() {
        return correodestino;
    }

    /**
     * Setter method for correodestino.
     *
     * @param aCorreodestino the new value for correodestino
     */
    public void setCorreodestino(String aCorreodestino) {
        correodestino = aCorreodestino;
    }

    /**
     * Access method for fechareporte.
     *
     * @return the current value of fechareporte
     */
    public String getFechareporte() {
        return fechareporte;
    }

    /**
     * Setter method for fechareporte.
     *
     * @param aFechareporte the new value for fechareporte
     */
    public void setFechareporte(String aFechareporte) {
        fechareporte = aFechareporte;
    }

    /**
     * Access method for estatus.
     *
     * @return the current value of estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Setter method for estatus.
     *
     * @param aEstatus the new value for estatus
     */
    public void setEstatus(String aEstatus) {
        estatus = aEstatus;
    }

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(Usuario aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Compares the key for this instance with another Reporte.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Reporte and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Reporte)) {
            return false;
        }
        Reporte that = (Reporte) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Reporte.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Reporte)) return false;
        return this.equalKeys(other) && ((Reporte)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Reporte |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
