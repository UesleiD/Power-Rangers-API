package com.imed.primeiro.projeto;

class PowerRangersNotFoundException extends RuntimeException {

  PowerRangersNotFoundException(Long id) {
    super("Could not find Power Rangers " + id);
  }
}