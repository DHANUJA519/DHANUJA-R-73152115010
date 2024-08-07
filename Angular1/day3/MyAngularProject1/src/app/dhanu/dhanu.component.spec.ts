import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DhanuComponent } from './dhanu.component';

describe('DhanuComponent', () => {
  let component: DhanuComponent;
  let fixture: ComponentFixture<DhanuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DhanuComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DhanuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
