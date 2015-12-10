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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "inscricao")
@NamedQueries({
    @NamedQuery(name = "Inscricao.findAll", query = "SELECT c FROM Inscricao c")})
public class Inscricao implements Serializable {
    @Id
    private Long ID;
    private static final long serialVersionUID = 1L;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private Long numero;
    
        
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cpf")
    private Long cpf;
    
        
    @Basic(optional = false)
    @NotNull
    @Column(name = "categoria")
    private int categoria;
    
        
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "complemento_categoria")
    private String complemento_categoria;
    
   
    @Basic(optional = true)
    @Size(min = 1, max = 100)
    @Column(name = "atuacao_empresa")
    private String atuacao_empresa;
    
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    
    @Size(max = 20)
    @Column(name = "fone")
    private String fone;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "email")
    private String email;
    
        
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "endereco")
    private String endereco;
    
    
    @Size(max = 50)
    @Column(name = "bairro")
    private String bairro;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "complemento")
    private String complemento;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cidade")
    private String cidade;
    
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estado")
    private String estado;
    
    
    @Column(name = "cep")
    private Integer cep;
    
    @Size(max = 20)
    @Column(name = "celular")
    private String celular;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "datahora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahora;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "situacao")
    private int situacao;
    
    
    
    public Inscricao() {
    }

    public Inscricao(Long cpf) {
        this.cpf = cpf;
    }

    

    public Inscricao(long numero, Long cpf, int categoria, String complemento_categoria, String atuacao_empresa, 
            String nome, String fone, String email, String endereco, String complemento, String bairro, String cidade,
            String estado, int cep, Date datahora, int situacao) {
        this.numero = numero;
        this.cpf = cpf;
        this.categoria = categoria;
        this.complemento_categoria = complemento_categoria;
        this.atuacao_empresa = atuacao_empresa;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.datahora = datahora;
        this.situacao = situacao;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

   

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

   

    @Override
    public String toString() {
        return "inscricao.persistence.entity.Inscricao[ cpf=" + cpf + " ]";
    }
}
