package com.simple_tdd_example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class GarrafaTest {

   private Garrafa garrafa;

   @Test
   public void capacidadeEVolumeInicialTest() {
      int capacidade = 1000;
      int volume = 700;
      garrafa = new Garrafa(capacidade, volume);

      assertEquals(capacidade, garrafa.getCapacidade());
      assertEquals(volume, garrafa.getVolume());
   }

   @Test
   public void capacidadeEVolumeInicial2Test() {
      int capacidade = 900;
      int volume = 200;
      garrafa = new Garrafa(capacidade, volume);

      assertEquals(capacidade, garrafa.getCapacidade());
      assertEquals(volume, garrafa.getVolume());
   }

   @Test(expected = IllegalArgumentException.class)
   public void tentaConstuirGarrafaComCapacidadeNegativaTest() {
      int capacidadeNegativa = -750;
      int volume = 150;

      garrafa = new Garrafa(capacidadeNegativa, volume);
      fail("Você não pode criar uma garrafa com capacidade negativa.");
   }

   @Test(expected = IllegalArgumentException.class)
   public void tentaConstuirGarrafaComCapacidadeZeroTest() {
      int capacidadeZero = 0;
      int volume = 150;

      garrafa = new Garrafa(capacidadeZero, volume);
      fail("Você não pode criar uma garrafa com capacidade zero.");
   }

    //Teste para tentar inserir um volume negativo
    @Test(expected = IllegalArgumentException.class)
    public void tentaConstruirGarrafaComVolumeNegativoTest() {
        int capacidade = 1000;
        int volumeNegativo = -150;

        Garrafa garrafa = new Garrafa(capacidade, volumeNegativo);
        fail("Você não pode criar uma garrafa com volume negativo.");
    }
}
