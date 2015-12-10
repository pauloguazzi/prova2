/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author a907413
 */

@Entity
@Table(name = "minicurso")
@NamedQueries({
    @NamedQuery(name = "Minicurso.findAll", query = "SELECT c FROM Minicurso c")})
public class Minicurso implements Serializable {
    @Id
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Long codigo;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descricao")
    private String descricao;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ministrante")
    private String ministrante;
    
        
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "vagas")
    private Integer vagas;
    
        
    public Minicurso(long codigo, String descricao, String ministrante, Integer vagas) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ministrante = ministrante;
        this.vagas = vagas;
    }
        
    
}
