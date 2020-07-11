import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayerdeleteComponent } from './playerdelete.component';

describe('PlayerdeleteComponent', () => {
  let component: PlayerdeleteComponent;
  let fixture: ComponentFixture<PlayerdeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlayerdeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlayerdeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
