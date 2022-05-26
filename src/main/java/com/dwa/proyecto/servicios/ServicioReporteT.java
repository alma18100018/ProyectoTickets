package com.dwa.proyecto.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.proyecto.modelo.Reporte;

@Service
public class ServicioReporteT implements IproyectoService{
	
	@Autowired
	private RepoReporte repoReporte;
	
	private String Mensaje;

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public boolean agregar(Reporte reporte) {
		try {
			repoReporte.save(reporte);
			this.Mensaje = "Proyecto registrado con exito.";
			return true;
		}catch(Exception e) {
			this.Mensaje = "Error al registrar el Proyecto";
			return false;
		}
	}

	@Override
	public List<Reporte> listar() {
		
		return (List<Reporte>)repoReporte.findAll();
	}

	@Override
	public Optional<Reporte> listarId(int id) {
		
		return repoReporte.findById(id);
	}

	@Override
	public int save(Reporte p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
