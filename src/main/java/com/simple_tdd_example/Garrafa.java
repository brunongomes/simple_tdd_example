package com.simple_tdd_example;

public class Garrafa {

   private int capacidade;
   private int volume;

   public Garrafa(int capacidade, int volume) {
      if (capacidade <= 0) {
         throw new IllegalArgumentException("A capacidade não pode ser negativa ou zero.");
      }

      if (volume <= 0) {
         throw new IllegalArgumentException("O volume não pode ser negativo ou zero.");
      }

      this.capacidade = capacidade;
      this.volume = volume;
   }

   public int getCapacidade() {
      return capacidade;
   }

   public int getVolume() {
      return volume;
   }
}
