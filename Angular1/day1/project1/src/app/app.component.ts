import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.less'
})
export class AppComponent 
      {
        name:string;
        age:number;
        email:string;
        
        fname:string;
        constructor()
        {
          this.name="Dhanu";
          this.age=345;
          this.email="ghjkghfgvhgvfhjg";
          this.fname="";
        }
        changeName()
        {
            this.name="dhanush";
        }
        changeage()
        {
          this.age=21;
        }
        changeEmail()
        {
          this.email="jhgjhhf";
        }

        

    }