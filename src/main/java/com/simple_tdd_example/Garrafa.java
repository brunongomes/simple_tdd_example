package com.simple_tdd_example;

public class Garrafa {

   private int capacidade;
   private int volume;

   public Garrafa(int capacidade, int volume) {
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
