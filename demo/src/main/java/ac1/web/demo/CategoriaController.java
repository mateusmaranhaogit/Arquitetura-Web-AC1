package ac1.web.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaProdutoRepository categoriaProdutoRepository;

    @PostMapping("/inserir")
    public Categoria inserir(@RequestBody Categoria categoria) {
        return categoriaProdutoRepository.inserir(categoria);
    }

    @GetMapping("/mostrarTodos")
    public List<Categoria> mostrarTodos() {
        return categoriaProdutoRepository.obterTodos();
    }
}
