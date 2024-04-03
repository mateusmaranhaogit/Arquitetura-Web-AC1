package ac1.web.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CategoriaProdutoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Categoria inserir(Categoria categoria) {
        entityManager.merge(categoria);
        return categoria;
    }

    public List<Categoria> obterTodos() {
        return entityManager.createQuery("from Categoria", Categoria.class).getResultList();
    }

    @Transactional
    public Categoria atualizar(Categoria categoria) {
        return entityManager.merge(categoria);
    }

    public void excluir(Integer id) {
        Categoria categoria = entityManager.find(Categoria.class, id);
        if (categoria != null) {
            entityManager.remove(categoria);
        }
    }

    public Categoria obterPorId(Integer id) {
        return entityManager.find(Categoria.class, id);
    }
}
