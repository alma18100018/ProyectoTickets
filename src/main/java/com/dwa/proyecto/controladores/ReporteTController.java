package com.dwa.proyecto.controladores;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dwa.proyecto.modelo.Reporte;
import com.dwa.proyecto.modelo.Usuario;
import com.dwa.proyecto.servicios.IproyectoService;
import com.dwa.proyecto.servicios.ServicioReporteT;
import com.dwa.proyecto.servicios.ServicioUsuario;

@Controller
public class ReporteTController {
	@Autowired
	ServicioUsuario servicioUsuario;
	@Autowired
	ServicioReporteT servicioTicket;
	
	
	
	@GetMapping("/inicioindex/inicio")
	public String inicio() {
		return "inicioindex/inicio";
	}
	
	@GetMapping("/reporte/agregar")
	public String agregar(Model modelo) {
		modelo.addAttribute("reporte", new Reporte());
		return "reporte/agregar";
	}
	
	
	
	@PostMapping("/reporte/agregar")
	public String agregar(Model modelo, @ModelAttribute Reporte reporte, HttpSession sesion) {
		int iduser = Integer.parseInt(sesion.getAttribute("iduser").toString());
		Usuario autor = servicioUsuario.buscar(iduser);
		if(autor == null || autor.getId() == 0) 
			modelo.addAttribute("error", servicioUsuario.getMensaje());
		else {
			reporte.setUsuario(autor);
			if(!servicioTicket.agregar(reporte));
				modelo.addAttribute("error", servicioTicket.getMensaje());
		}
		return "reporte/agregar";
	}
	
	
	
	

@Autowired
	private IproyectoService service;
	@GetMapping("/ticket/listar")
	public String listar(Model model) {
		List<Reporte>reportes=service.listar();
		model.addAttribute("reporte", reportes);
		return "ticket/listar";
	}

}
