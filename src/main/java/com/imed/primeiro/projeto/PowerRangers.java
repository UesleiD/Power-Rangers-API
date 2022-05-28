package com.imed.primeiro.projeto;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class PowerRangers {

  private @Id @GeneratedValue Long id;
  private String nome;
  private String cor;

  PowerRangers() {}

  PowerRangers(String nome, String cor) {

    this.nome = nome;
    this.cor = cor;
  }

  public Long getId() {
    return this.id;
  }

  public String getnome() {
    return this.nome;
  }

  public String getcor() {
    return this.cor;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setnome(String nome) {
    this.nome = nome;
  }

  public void setcor(String cor) {
    this.cor = cor;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof PowerRangers))
      return false;
    PowerRangers powerrangers = (PowerRangers) o;
    return Objects.equals(this.id, powerrangers.id) && Objects.equals(this.nome, powerrangers.nome)
        && Objects.equals(this.cor, powerrangers.cor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.nome, this.cor);
  }

  @Override
  public String toString() {
    return "PowerRangers{" + "id=" + this.id + ", Nome='" + this.nome + '\'' + ", Cor='" + this.cor + '\'' + '}';
  }
}
