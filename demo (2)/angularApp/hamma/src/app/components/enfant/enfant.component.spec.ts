import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnfantComponent } from './enfant.component';

describe('EnfantComponent', () => {
  let component: EnfantComponent;
  let fixture: ComponentFixture<EnfantComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EnfantComponent]
    });
    fixture = TestBed.createComponent(EnfantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
