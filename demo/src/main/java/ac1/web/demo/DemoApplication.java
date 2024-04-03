package ac1.web.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        CategoriaProdutoRepository categoriaProdutoRepository = context.getBean(CategoriaProdutoRepository.class);
        ProdutoRepository produtoRepository = context.getBean(ProdutoRepository.class);

        // Criar e inserir duas categorias
        Categoria categoria1 = new Categoria(1, "Categoria 1", "Descrição da Categoria 1");
        Categoria categoria2 = new Categoria(2, "Categoria 2", "Descrição da Categoria 2");
        categoriaProdutoRepository.inserir(categoria1);
        categoriaProdutoRepository.inserir(categoria2);

        // Criar e inserir dois produtos
        Produto produto1 = new Produto(1, "Produto 1", 10, categoria1);
        Produto produto2 = new Produto(2, "Produto 2", 20, categoria2);
        produtoRepository.inserir(produto1);
        produtoRepository.inserir(produto2);

        // Exibir todas as categorias
        System.out.println("Categorias:");
        List<Categoria> categorias = categoriaProdutoRepository.obterTodos();
        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }

        // Exibir todos os produtos
        System.out.println("Produtos:");
        List<Produto> produtos = produtoRepository.obterTodos();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
