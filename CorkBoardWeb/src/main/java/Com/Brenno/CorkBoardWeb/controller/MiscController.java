package Com.Brenno.CorkBoardWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import java.util.ArrayList;

@Controller
public class MiscController {
    @GetMapping("/Principal") 
    public String mostrarPrincipal(){ 
        return "Principal"; 
    } 
    
    @GetMapping("/Login") 
    public String mostrarLogin(){ 
        return "Login"; 
    } 
    
    @GetMapping("/Editar") 
    public String mostrarEditar(){ 
        return "Editar"; 
    } 
}
