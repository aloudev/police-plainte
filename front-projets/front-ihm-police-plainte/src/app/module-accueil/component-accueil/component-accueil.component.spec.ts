import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponentAccueilComponent } from './component-accueil.component';

describe('ComponentAccueilComponent', () => {
  let component: ComponentAccueilComponent;
  let fixture: ComponentFixture<ComponentAccueilComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComponentAccueilComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComponentAccueilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
