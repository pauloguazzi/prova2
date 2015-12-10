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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author a907413
 */
@Entity
@Table(name = "inscricao_minicurso")
@NamedQueries({
    @NamedQuery(name = "Inscricao_minicurso.findAll", query = "SELECT c FROM Inscricao_minicurso c")})
public class Inscricao_minicurso implements Serializable {
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
    @Column(name = "numero_inscricao")
    private Long numero;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "minicurso")
    private Integer minicurso;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "datahora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahora;
    
        
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "situcao")
    private Integer situacao;
    
    public Inscricao_minicurso(long numero, Integer minicurso, Date datahora, Integer situacao) {
        this.numero = numero;
        this.minicurso = minicurso;
        this.datahora = datahora;
        this.situacao = situacao;
    }
    
}
