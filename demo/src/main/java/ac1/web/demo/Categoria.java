package ac1.web.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;

    @Column(name = "cat_nome", nullable = false)
    private String cat_nome;

    @Column(name = "cat_descricao", nullable = false)
    private String cat_descricao;

    public Categoria(int id, String nome, String cat_descricao) {
        this.id_categoria = id;
        this.cat_nome = nome;
        this.cat_descricao = cat_descricao;
    }
    
    public Categoria() {

    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCat_nome() {
        return cat_nome;
    }

    public void setCat_nome(String cat_nome) {
        this.cat_nome = cat_nome;
    }

    public String getCat_descricao() {
        return cat_descricao;
    }

    public void setCat_descricao(String cat_descricao) {
        this.cat_descricao = cat_descricao;
    }

    @Override
    public String toString() {
        return "Categoria [id_categoria=" + id_categoria + ", cat_nome=" + cat_nome + ", cat_descricao=" + cat_descricao
                + "]";
    }
}
