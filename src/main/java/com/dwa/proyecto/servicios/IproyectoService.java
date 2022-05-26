package com.dwa.proyecto.servicios;

import java.util.List;
import java.util.Optional;

import com.dwa.proyecto.modelo.Reporte;

public interface IproyectoService {
	public List<Reporte>listar();
	public Optional<Reporte>listarId(int id);
	public int save(Reporte p);

}
