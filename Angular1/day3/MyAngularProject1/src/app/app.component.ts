import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  sum:number;
  sub:number;
  fact:number;
  constructor(private calc:CalculatorService){
    this.sum=calc.getAddition(10, 20);
    this.sub=calc.getSubtraction(10,20);
    this.fact=calc.fact(5);
  }
}
