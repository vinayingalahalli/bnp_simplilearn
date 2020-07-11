import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayeraddComponent } from './playeradd.component';

describe('PlayeraddComponent', () => {
  let component: PlayeraddComponent;
  let fixture: ComponentFixture<PlayeraddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlayeraddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlayeraddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
