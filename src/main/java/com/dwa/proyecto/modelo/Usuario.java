// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="usuario")
public class Usuario implements Serializable {

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
    @Column(nullable=false, length=40)
    private String nombre;
    @Column(nullable=false, length=40)
    private String apellidop;
    @Column(nullable=false, length=50)
    private String apellidom;
    @Column(nullable=false, length=60)
    private String correo;
    @Column(nullable=false, length=60)
    private String tipousuario;
    @Column(nullable=false, length=20)
    private byte[] claveacceso;
    @OneToMany(mappedBy="usuario")
    private Set<Reporte> reporte;

    /** Default constructor. */
    public Usuario() {
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
     * Access method for apellidop.
     *
     * @return the current value of apellidop
     */
    public String getApellidop() {
        return apellidop;
    }

    /**
     * Setter method for apellidop.
     *
     * @param aApellidop the new value for apellidop
     */
    public void setApellidop(String aApellidop) {
        apellidop = aApellidop;
    }

    /**
     * Access method for apellidom.
     *
     * @return the current value of apellidom
     */
    public String getApellidom() {
        return apellidom;
    }

    /**
     * Setter method for apellidom.
     *
     * @param aApellidom the new value for apellidom
     */
    public void setApellidom(String aApellidom) {
        apellidom = aApellidom;
    }

    /**
     * Access method for correo.
     *
     * @return the current value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Setter method for correo.
     *
     * @param aCorreo the new value for correo
     */
    public void setCorreo(String aCorreo) {
        correo = aCorreo;
    }

    /**
     * Access method for tipousuario.
     *
     * @return the current value of tipousuario
     */
    public String getTipousuario() {
        return tipousuario;
    }

    /**
     * Setter method for tipousuario.
     *
     * @param aTipousuario the new value for tipousuario
     */
    public void setTipousuario(String aTipousuario) {
        tipousuario = aTipousuario;
    }

    /**
     * Access method for claveacceso.
     *
     * @return the current value of claveacceso
     */
    public byte[] getClaveacceso() {
        return claveacceso;
    }

    /**
     * Setter method for claveacceso.
     *
     * @param aClaveacceso the new value for claveacceso
     */
    public void setClaveacceso(byte[] aClaveacceso) {
        claveacceso = aClaveacceso;
    }

    /**
     * Access method for reporte.
     *
     * @return the current value of reporte
     */
    public Set<Reporte> getReporte() {
        return reporte;
    }

    /**
     * Setter method for reporte.
     *
     * @param aReporte the new value for reporte
     */
    public void setReporte(Set<Reporte> aReporte) {
        reporte = aReporte;
    }

    /**
     * Compares the key for this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Usuario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Usuario)) {
            return false;
        }
        Usuario that = (Usuario) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Usuario)) return false;
        return this.equalKeys(other) && ((Usuario)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Usuario |");
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
