/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.regiao.model;


public enum RegiaoBrasil {
   NORTE("Região Norte"),
   NORDESTE("Região Nordeste"),
   CENTRO_OESTE("Região Centro-Oeste"),
   SUDESTE("Região Sudeste"),
   SUL("Região Sul");
  
   private final String descricao;
   // Construtor
   RegiaoBrasil(String descricao) {
       this.descricao = descricao;
   }
   // Getter
   public String getDescricao() {
       return descricao;
   }
} 

