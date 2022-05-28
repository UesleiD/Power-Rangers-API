package com.imed.primeiro.projeto;



import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PowerRangersController {

  private final PowerRangersRepository repository;

  PowerRangersController(PowerRangersRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/PowerRangers")
  List<PowerRangers> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/PowerRangers")
  PowerRangers newPowerRangers(@RequestBody PowerRangers newPowerRangers) {
    return repository.save(newPowerRangers);
  }

  // Single item
  
  @GetMapping("/PowerRangers/{id}")
  PowerRangers one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new PowerRangersNotFoundException(id));
  }

  @PutMapping("/PowerRangers/{id}")
  PowerRangers replaceEmployee(@RequestBody PowerRangers newPowerRangers, @PathVariable Long id) {
    
    return repository.findById(id)
      .map(PowerRangers -> {
    	PowerRangers.setnome(newPowerRangers.getnome());
    	PowerRangers.setcor(newPowerRangers.getcor());
        return repository.save(PowerRangers);
      })
      .orElseGet(() -> {
        newPowerRangers.setId(id);
        return repository.save(newPowerRangers);
      });
  }

  @DeleteMapping("/PowerRangers/{id}")
  void deletePowerRangers(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
