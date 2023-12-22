import { TestBed } from '@angular/core/testing';

import { PokeapiServiceService } from './pokeapi-service.service';

describe('PokeapiServiceService', () => {
  let service: PokeapiServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PokeapiServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
